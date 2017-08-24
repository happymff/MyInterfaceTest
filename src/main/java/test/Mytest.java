package test;

import org.testng.annotations.Test;
import util.HttpRequestUtil;
import util.TitleUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;


public class Mytest {
    Map<String, Object> postData = new HashMap<String, Object>();
    String totalUrl = "http://school.etiantian.com";
    String name = "爱学派FF";
    String pwd = "1111";
    String method = "login.do";

    @Test
    public void Logintest() throws Exception {
        String url =  totalUrl+"/aixuepadtios/login.do";
        System.out.println(url);
        String s = sign.getLoginSign(postData, name, pwd, method);
        postData.put("sign", s);
        postData.remove("method");
        System.out.println(postData);
        String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
        System.out.println("----返回结果-----" + json);
        RequestResult.getResult(json);
//        String schoolID = JsonResults.getJsonParam(json,"schoolId");
//        System.out.println("schoolID========"+schoolID);
//        String userName = JsonResults.getJsonParam(json,"userName");
//        System.out.println("userName======="+userName);
//        String jid = JsonResults.getJsonParam(json,"jid");
//        System.out.println("jid======="+jid);
        String regexSchoolId = "schoolId\":(.*),\"jid";
        String regexGradeId= "gradeId\":([0-9]+),\"classList";
        String regexSubjectId = "subjectId\":([0-9]+),\"classTag";
        String schoolID = JsonResults.getParamByRex(json,regexSchoolId);
        System.out.println("schoolID========"+schoolID);
        String gradeId = JsonResults.getParamByRex(json,regexGradeId);
        System.out.println("gradeId========"+gradeId);
        String subjectId = JsonResults.getParamByRex(json,regexSubjectId);
        System.out.println("subjectId========"+subjectId);

        postData.clear();
    }
}