package test;



/**
 * Created by mff on 2017/10/25.
 */

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import com.alibaba.fastjson.JSON;
//import com.ig.gapi.result.bbin.BBINResultApi;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.protocol.HttpClientContext;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.web.servlet.view.AbstractView.DEFAULT_CONTENT_TYPE;


public class CoreExecuteBBIN {
    private Logger logger = getLogger(CoreExecuteBBIN.class);


    final static ConcurrentMap<Class, Field[]> fieldsCache = new ConcurrentHashMap<Class, Field[]>();

    //组装参数发起Http请求API接口
    public static <T> T sendGet(Object parameter, Class<T> clazz, String url, int type) {
        try {
            //缓存参数
            Field[] fields = fieldsCache.get(parameter.getClass());

            if (fields == null) {
                fields = parameter.getClass().getFields();
                fieldsCache.put(clazz, fields);
            }
            for (int i = 0; i < fields.length; i++) {
                Field filed = fields[i];
                String filedName = filed.getName();
                Object value = null;
                try {
                    value = filed.get(parameter);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                if (value != null) {
                    url = url.replace("${" + filedName + "}", value.toString());
                }
            }
            url = url.replaceAll("&[^\\&]*=\\$\\{.*?\\}", "");
            Pattern pattern = Pattern.compile("\\?.*?\\$\\{.*?\\}");
            Matcher matcher = pattern.matcher(url);
            if (matcher.find()) {
                String matchUrl = matcher.group(0);
                url = url.replace(matchUrl.substring(1), "");
            }

            System.out.println("请求url: " + url);

            long startTime = System.currentTimeMillis();
            HttpEntity httpEntity = null;
            HttpEntityEnclosingRequestBase method = null;
            String responseBody = "";
            try {
                method = (HttpEntityEnclosingRequestBase) HttpClientPoolUtil.getRequest(url, HttpPost.METHOD_NAME, DEFAULT_CONTENT_TYPE, 0);
                method.addHeader("accept", "*/*");
                method.addHeader("connection", "Keep-Alive");
                method.addHeader("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");


                HttpContext context = HttpClientContext.create();
                CloseableHttpResponse httpResponse = HttpClientPoolUtil.httpClient.execute(method, context);
                httpEntity = httpResponse.getEntity();
                if (httpEntity != null) {
                    responseBody = EntityUtils.toString(httpEntity, "UTF-8");
                    Map<String, Object> mapp = JSON.parseObject(responseBody);
                    boolean returnFlag = Boolean.valueOf(mapp.get("result") + "");
                   // logger.info("接口调用结果：" + returnFlag);
                    if (returnFlag) {
                        return JSON.parseObject(responseBody, clazz);
                    } else {
                        mapp.put("result", "false");
                        if (type == 1) {
//                            BBINResultApi baseData = JSON.parseObject(responseBody, BBINResultApi.class);
//                            mapp.remove("data");
//                            mapp.put("baseData", baseData.getData());
                        }
                        return JSON.parseObject(JSON.toJSONString(mapp), clazz);
                    }

                }

            } catch (Exception e) {
                if (method != null) {
                    method.abort();
                }
                e.printStackTrace();
                System.out.println("execute post request exception, url:" + url + ", exception:" + e.toString() + ", cost time(ms):" + (System.currentTimeMillis() - startTime));
            } finally {
                if (httpEntity != null) {
                    try {
                        EntityUtils.consumeQuietly(httpEntity);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("close response exception, url:" + url + ", exception:" + e.toString() + ", cost time(ms):" + (System.currentTimeMillis() - startTime));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("请求URL异常" + e);
            e.printStackTrace();
        }
        return null;
    }

    //BBIN游戏调用封装请求连接方法
    public static String getPlayGameUrl(Object parameter, String url) {
        Field[] fields = fieldsCache.get(parameter.getClass());

        if (fields == null) {
            fields = parameter.getClass().getFields();
        }
        for (int i = 0; i < fields.length; i++) {
            Field filed = fields[i];
            String filedName = filed.getName();
            Object value = null;
            try {
                value = filed.get(parameter);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            if (value != null) {
                url = url.replace("${" + filedName + "}", value.toString());
            }
        }
        url = url.replaceAll("&[^\\&]*=\\$\\{.*?\\}", "");
        Pattern pattern = Pattern.compile("\\?.*?\\$\\{.*?\\}");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            String matchUrl = matcher.group(0);
            url = url.replace(matchUrl.substring(1), "");
        }
        return url;
    }
}