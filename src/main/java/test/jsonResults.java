package test;

import net.sf.json.JSONObject;

public class jsonResults {
	
	/**
	 * 返回json字符串result
	 */
	public static String getJsonResult(String json) {
//		System.out.println(json);
		JSONObject obj = JSONObject.fromObject(json);
		if(!(obj.get("result").toString()).isEmpty()){
			return obj.get("result").toString();
		}else{
			return null;
		}
		
	}

	/**
	 * 返回json字符串msg
	 */
	public static String getJsonMsg(String json) {
		JSONObject obj = JSONObject.fromObject(json);
		if(!(obj.get("msg")).toString().isEmpty()){
			return obj.get("msg").toString();
		}else{
			return null;
		}
		
	}
	
	/**
	 * 返回json字符串data
	 */
	public static String getJsonData(String json) {
		JSONObject obj = JSONObject.fromObject(json);
		if(!(obj.get("data")).toString().isEmpty()){
			return obj.get("data").toString();
		}else{
			return null;
		}
		
	}
	
}
