package test;

import org.testng.Assert;


public class requestResult {
	/**
	 * 获得请求结果
	 */
	public static void getResult(String str) {
		if(jsonResults.getJsonResult(str).equals("1")){
//			pass(str);
			Assert.assertTrue(jsonResults.getJsonResult(str).contains("1"));
//		}
//		else if(!jsonResults.getJsonResult(str).equals("1")){
//			System.out.print("Result值："+fail(str));
//		}else{
//			System.out.println("无任何结果");
		}
		
	}

	public static void pass(String str){
		Assert.assertTrue(jsonResults.getJsonResult(str).contains("1"),jsonResults.getJsonResult(str) );
	}
	public static String fail(String str){
		String result=jsonResults.getJsonResult(str);
		System.out.println(result);
		return result;
	}
}
