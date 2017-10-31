package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mengfeifei on 2017/10/28.
 */

public class JsonExtracter {

    public static void main(String[] args) {

        String s = "{\"error\":0,\"status\":\"success\",\"results\":[{\"currentCity\":\"青岛\",\"index\":[{\"title\":\"穿衣\",\"zs\":\"较冷\",\"tipt\":\"穿衣指数\",\"des\":\"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。\"},{\"title\":\"紫外线强度\",\"zs\":\"最弱\",\"tipt\":\"紫外线强度指数\",\"des\":\"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。\"}],}]}";


        JSONObject jsonObject = JSON.parseObject(s);

        //提取出error为 0
        int error = (int) jsonObject.get("error");
        System.out.println("error:" + error);

        //提取出status为 success
        String status = jsonObject.getString("status");
        System.out.println("status:" + status);

        //注意：results中的内容带有中括号[]，所以要转化为JSONArray类型的对象
        JSONArray result = jsonObject.getJSONArray("results");

        for (int i = 0; i < result.size(); i++) {
            //提取出currentCity为 青岛
            String currentCity = result.getJSONObject(i).getString("currentCity");
            System.out.println("currentCity:" + currentCity);

            //注意：index中的内容带有中括号[]，所以要转化为JSONArray类型的对象
            JSONArray index = result.getJSONObject(i).getJSONArray("index");

            for (int j = 0; j < index.size(); j++) {
                String title = index.getJSONObject(j).getString("title");
                System.out.println("title:" + title);
                String zs = index.getJSONObject(j).getString("zs");
                System.out.println("zs:" + zs);
                String tipt = index.getJSONObject(j).getString("tipt");
                System.out.println("tipt:" + tipt);
                String des = index.getJSONObject(j).getString("des");
                System.out.println("des:" + des);

            }
        }
//用map的方法提取json串的的内容
//        Gson gs = new  Gson();
//        Map<String,String> map = gs.fromJson(s, Map.class);
//        System.out.println(map.get("students"));
        //测试单写的方法可用
//        String jsonStr = "{\"name\":\"三班\",\"students\":[{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"露西\",\"score\":{\"网络协议\":98,\"JavaEE\":92,\"计算机基础\":93},\"weight\":51.3},{\"age\":26,\"gender\":\"male\",\"grades\":\"三班\",\"name\":\"杰克\",\"score\":{\"网络安全\":75,\"Linux操作系统\":81,\"计算机基础\":92},\"weight\":66.5},{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"莉莉\",\"score\":{\"网络安全\":95,\"Linux操作系统\":98,\"SQL数据库\":88,\"数据结构\":89},\"weight\":55}]}";
//        getJsonSomeString(jsonStr,"name");
//        getJSONArraySomeString(jsonStr,"students","age");

    }

    public static String getParamByRex(String json, String regex) {

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(json);
        String result = null;
        while (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }

    public static void getJsonSomeString(String jsonStr, String someString) {
        JSONObject jsonObject = JSON.parseObject(jsonStr);

        //提取出error为 0
        String someString1 = (String) jsonObject.get(someString);
        System.out.println(someString + someString1);
    }

    public static void getJSONArraySomeString(String jsonStr, String someStringToArray,String someString) {
        JSONObject jsonObject = JSON.parseObject(jsonStr);

        //注意：results中的内容带有中括号[]，所以要转化为JSONArray类型的对象
        JSONArray result = jsonObject.getJSONArray(someStringToArray);

        for (int i = 0; i < result.size(); i++) {
            //提取出currentCity为 青岛
            String currentCity = result.getJSONObject(i).getString(someString);
            System.out.println(someString + currentCity);
            if (25 == Integer.parseInt(currentCity))
            {
                String currentCity1 = result.getJSONObject(i).getString("name");
                System.out.println("name:" + currentCity1);
                System.out.println(jsonStr);
            }
        }
    }

}