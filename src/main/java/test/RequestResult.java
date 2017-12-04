package test;

import org.testng.Assert;


public class RequestResult {
	/**
	 * 获得请求结果
	 */
	public static void getResult(String str) {
		if("1".equals(JsonResults.getJsonResult(str))){
//			pass(str);
			Assert.assertTrue(JsonResults.getJsonResult(str).contains("1"));
//		}
//		else if(!jsonResults.getJsonResult(str).equals("1")){
//			System.out.print("Result值："+fail(str));
//		}else{
//			System.out.println("无任何结果");
		}
		
	}

	public static void pass(String str){
		Assert.assertTrue(JsonResults.getJsonResult(str).contains("1"),JsonResults.getJsonResult(str) );
	}
	public static String fail(String str){
		String result=JsonResults.getJsonResult(str);
		System.out.println(result);
		return result;
	}
}
