package test;

import util.HttpRequestUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import static data.DataRead_Write.readFromExcelDemo1;
import static data.DataRead_Write.writeToExcelByParam;
import static java.util.concurrent.Executors.newFixedThreadPool;


public class MytestMutliThread  implements Runnable{
    Map<String, Object> postData = new HashMap<String, Object>();
    String totalUrl = "http://school.etiantian.com";
    String name = "爱学派MFF";
    String pwd = "1111";
    String method = "login.do";

    @Override
    public void run(){
        String url =  "http://school.etiantian.com/aixuepadtios/login.do";
        //System.out.println(url);
        String s = null;
        try {
            s = sign.getLoginSign(postData, name, pwd, method);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(s);
        postData.put("sign", s);
        postData.remove("method");
        //System.out.println(postData.toString());
        String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
        System.out.println("----返回结果-----" + json);
       // RequestResult.getResult(json);
//        String schoolID = JsonResults.getJsonParam(json,"schoolId");
//        System.out.println("schoolID========"+schoolID);
//        String userName = JsonResults.getJsonParam(json,"userName");
//        System.out.println("userName======="+userName);
//        String jid = JsonResults.getJsonParam(json,"jid");
//        System.out.println("jid======="+jid);
        try {
            readFromExcelDemo1("outPut");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String regexSchoolId = "schoolId\":(.*),\"jid";
        String regexGradeId= "gradeId\":([0-9]+),\"classList";
        String regexSubjectId = "subjectId\":([0-9]+),\"classTag";
        String schoolID = JsonResults.getParamByRex(json,regexSchoolId);
        System.out.println("schoolID========"+schoolID);
        String gradeId = JsonResults.getParamByRex(json,regexGradeId);
        System.out.println("gradeId========"+gradeId);
        String subjectId = JsonResults.getParamByRex(json,regexSubjectId);
        System.out.println("subjectId========"+subjectId);

        try {
            writeToExcelByParam(schoolID,gradeId,subjectId,"loginResults2");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readFromExcelDemo1("loginResults");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ExecutorService service = newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(new MytestMutliThread());//并发50个用户
        }
         }
}