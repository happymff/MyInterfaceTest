package test;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.HttpRequestProxy;
import util.HttpRequestUtil;

public class modifySchoolInfo {
	HttpRequestProxy hrp = new HttpRequestProxy();
	HttpRequestUtil  hru = new HttpRequestUtil();
	Map<String, Object> postData=new HashMap<String, Object>();
	
	@Test(description="更新分校信息",dataProvider = "modifySchoolInfo", dataProviderClass = data.TestDataProvider.class)
	public void PostRequesttest(String userId,String schoolId,String schoolName,String relatePersonName,
			String phoneNum,String schoolPhoneNum,String address,String schoolType,String provinceId,
			String cityId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT9-V1.0 G2.2 更新分校信息");
		
		String url = "http://192.168.10.150:81/dayuwen-service/sm/modifySchoolInfo.do";
		String s = sign.modifySchoolInfoSign(postData, userId, schoolId, schoolName, relatePersonName, 
				phoneNum, schoolPhoneNum, address, schoolType, provinceId, cityId, method);
		postData.remove("method");
		postData.put("sign",s);
		String json=HttpRequestUtil.doPost(url, postData,"UTF-8");
		System.out.println("返回结果："+json);
		if(jsonResults.getJsonResult(json).equals("1")){
			Assert.assertTrue(jsonResults.getJsonMsg(json).contains("操作成功"), "创建失败");
		}else if(jsonResults.getJsonResult(json).equals("-1")){
			Assert.assertTrue(jsonResults.getJsonMsg(json).contains("操作成功"), "创建失败");
		}else{
			System.out.println("无任何结果");
		}

	}

}
