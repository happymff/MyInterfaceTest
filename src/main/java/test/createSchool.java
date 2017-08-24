package test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import util.HttpRequestProxy;
import util.HttpRequestUtil;

public class createSchool {
	HttpRequestProxy hrp = new HttpRequestProxy();
	HttpRequestUtil  hru = new HttpRequestUtil();
	Map<String, Object> postData=new HashMap<String, Object>();
	
	@Test(description="创建分校",dataProvider = "addSchool", dataProviderClass = data.TestDataProvider.class)
	public void PostRequesttest(String userId,String schoolName,String relatePersonName,String phoneNum,String schoolPhoneNum,String schoolCode,String address,String schoolType,String provinceId,String cityId,String adminLoginId,String isCheck,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT7-V1.0 G2.1 创建分校");
		
		String url = "http://192.168.10.150:81/dayuwen-service/sm/addSchoolInfo.do";
		String s = sign.createSchoolSign(postData, userId, schoolName, relatePersonName, phoneNum, schoolPhoneNum, schoolCode, address, schoolType, provinceId, cityId, adminLoginId, isCheck, method);
		postData.put("sign",s);
		postData.remove("method");
		String json=HttpRequestUtil.doPost(url, postData,"UTF-8");
		System.out.println("返回结果："+json);
		test.RequestResult.getResult(json);

	}


}
