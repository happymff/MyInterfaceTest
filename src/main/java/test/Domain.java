package test;

/**
 * Created by mengfeifei on 2017/10/28.
 */

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import java.util.Map;

public class Domain {

    public static void main(String[] args) {

        String jsonStr = "{\"name\":\"三班\",\"students\":[{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"露西\",\"score\":{\"网络协议\":98,\"JavaEE\":92,\"计算机基础\":93},\"weight\":51.3},{\"age\":26,\"gender\":\"male\",\"grades\":\"三班\",\"name\":\"杰克\",\"score\":{\"网络安全\":75,\"Linux操作系统\":81,\"计算机基础\":92},\"weight\":66.5},{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"莉莉\",\"score\":{\"网络安全\":95,\"Linux操作系统\":98,\"SQL数据库\":88,\"数据结构\":89},\"weight\":55}]}";


//        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
//
//        Grades grades = (Grades) JSONObject.toBean(jsonObject, Grades.class);
//        System.out.println(grades.getStudents());
//        System.out.println(grades.getName());
//        String s1 = CharReplace.getCharReplace(jsonStr);
//        System.out.println(s1);
//        System.out.println();
//        String name = "name:(.*),students";
//        String ss = getParamByRex(s1, name);
//        System.out.println(ss);
        // String regexSchoolId = "schoolId\":(.*),\"jid";
        // String schoolID = JsonResults.getParamByRex(json,regexSchoolId);

        String js = "{\"ent_name\":\"hhhhhhhhhhhhhhhhh\",\"ent_naming\":\"dd\",\"ent_naming_unit\":\"fff\",\"ent_escription\":\"赛事简介\"}";
        com.alibaba.fastjson.JSONObject jo = JSON.parseObject(jsonStr);
        System.out.println(jo.get("name"));
        System.out.println("students");
        System.out.println(jo.get("students.[0].[0].age"));

        Gson gs = new  Gson();
        Map<String,String> map = gs.fromJson(jsonStr, Map.class);
        System.out.println(map.get("students"));
    }


}