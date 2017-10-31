package test;

import util.HttpRequestUtil;
import util.times;

import java.util.Map;

public class sign {
	/**
	 * 返回时间戳
	 */
	public static String  getLoginSign(Map<String, Object> map,String name,String Pwd,String Method) throws Exception{

		String signurl ="http://school.etiantian.com/aixuepadtios/test/_manager/GenderCourseRecordSign.jsp";
		map.put("name",name);
		map.put("pwd",Pwd);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map, "UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  changepwdSign(Map<String, Object> map,String userId,String oldPwd ,String newPwd,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("oldPwd",oldPwd);
		map.put("newPwd",newPwd);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map, "UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}


	/**
	 * 返回时间戳
	 */
	public static String  getSchoolListSign(Map<String, Object> map,String userid,String schoolcode,String schoolname,String pagenum,String pageize,String method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userid);
		map.put("schoolCode",schoolcode);
		map.put("schoolName",schoolname);
		map.put("pageNum",pagenum);
		map.put("pageSize",pageize);
		map.put("time",times.getCurrentTime());
		map.put("method",method);
		System.out.println("-------生成sign请求--------");
//		String sign=hrp.doRequest(signurl, map, null,"UTF-8").trim();
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	/**
	 * 返回时间戳
	 */
	public static String  changeSchoolStatusSign(Map<String, Object> map,String userId,String schoolId,String type,String method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",method);
		System.out.println("-------生成sign请求--------");
//		String sign=hrp.doRequest(signurl, map, null,"UTF-8").trim();
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	/**
	 * 返回时间戳
	 */
	public static String  getProvinceCityListSign(Map<String, Object> map,String userId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	/**
	 * 返回时间戳
	 */
	public static String  getNewAccountSign(Map<String, Object> map,String userId,String schoolId,String type,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  createSchoolSign(Map<String, Object> map,String userId,String schoolName,String relatePersonName,String phoneNum,String schoolPhoneNum,String schoolCode,String address,String schoolType,String provinceId,String cityId,String adminLoginId,String isCheck,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolName",schoolName);
		map.put("relatePersonName",relatePersonName);
		map.put("phoneNum",phoneNum);
		map.put("schoolPhoneNum",schoolPhoneNum);
		map.put("schoolCode",schoolCode);
		map.put("address",address);
		map.put("schoolType",schoolType);
		map.put("provinceId",provinceId);
		map.put("cityId",cityId);
		map.put("adminLoginId",adminLoginId);
		map.put("isCheck",isCheck);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getSchoolInfoSign(Map<String, Object> map,String userId,String schoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doGet(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifySchoolInfoSign(Map<String, Object> map,String userId,String schoolId,String schoolName,String relatePersonName,String phoneNum,String schoolPhoneNum,String address,String schoolType,String provinceId,String cityId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("schoolName",schoolName);
		map.put("relatePersonName",relatePersonName);
		map.put("phoneNum",phoneNum);
		map.put("schoolPhoneNum",schoolPhoneNum);
		map.put("address",address);
		map.put("schoolType",schoolType);
		map.put("provinceId",provinceId);
		map.put("cityId",cityId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getTeacherListSign(Map<String, Object> map,String userId,String searchLoginId ,String searchUserName,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("searchLoginId",searchLoginId);
		map.put("searchUserName",searchUserName);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doGet(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addTeacherSign(Map<String, Object> map,String userId,String teacherName,String phoneNum,String idNum,String teacherCERTNum,String sex,String teacherLoginId,String teacherStatus,String schoolId,String subSchoolId,String teacherType,String address,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("teacherName",teacherName);
		map.put("phoneNum",phoneNum);
		map.put("idNum",idNum);
		map.put("teacherCERTNum",teacherCERTNum);
		map.put("sex",sex);
		map.put("teacherLoginId",teacherLoginId);
		map.put("teacherStatus",teacherStatus);
		map.put("schoolId",schoolId);
		map.put("subSchoolId",subSchoolId);
		map.put("teacherType",teacherType);
		map.put("address",address);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getSchoolAndSubListSign(Map<String, Object> map,String userId,String type,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doGet(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getTeacherInfoSign(Map<String, Object> map,String userId,String teacherId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//	String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("teacherId",teacherId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyTeacherInfoSign(Map<String, Object> map,String userId,String teacherUserId,String realName,String phoneNum,String idNum,String teacherCERTNum,String sex,String teacherStatus,String schoolId,String subSchoolId,String teacherType,String address,String isLecture,String isBaseSkill,String isBK,String workCertNum ,String workCertSignDate,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("teacherUserId",teacherUserId);
		map.put("realName",realName);
		map.put("phoneNum",phoneNum);
		map.put("idNum",idNum);
		map.put("teacherCERTNum",teacherCERTNum);
		map.put("sex",sex);
		map.put("teacherStatus",teacherStatus);
		map.put("schoolId",schoolId);
		map.put("subSchoolId",subSchoolId);
		map.put("teacherType",teacherType);
		map.put("address",address);
		map.put("isLecture",isLecture);
		map.put("isBaseSkill",isBaseSkill);
		map.put("isBK",isBK);
		map.put("workCertNum",workCertNum);
		map.put("workCertSignDate",workCertSignDate);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getCourseListSign(Map<String, Object> map,String userId,String courseId,String courseName,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courseId",courseId);
		map.put("courseName",courseName);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getApplyPhaseIdNameListSign(Map<String, Object> map,String userId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addCourseInfoSign(Map<String, Object> map,String userId,String courseName,String subject,String phaseId,String courseGoal,String resIds,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courseName",courseName);
		map.put("subject",subject);
		map.put("phaseId",phaseId);
		map.put("courseGoal",courseGoal);
		map.put("resIds",resIds);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

//	public static String  addResFileSign(Map<String, Object> map,String userId,String courseId,String sourceType,String resTitle,String file,String Method) throws Exception{
//
//		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
////		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
//		map.put("userId",userId);
//		map.put("courseId",courseId);
//		map.put("sourceType",sourceType);
//		map.put("resTitle",resTitle);
//		map.put("file",file);
//		map.put("time",times.getCurrentTime());
//		map.put("method",Method);
//		System.out.println("-------生成sign请求--------");
//		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
//		System.out.println("sign："+sign);
//		if(!sign.isEmpty()){
//			return sign;
//		}else{
//			System.out.println("-------生成sign失败--------");
//			return null;
//		}
//
//		}


	public static String  delResSign(Map<String, Object> map,String userId,String courseId,String sourceType,String resId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courseId",courseId);
		map.put("sourceType",sourceType);
		map.put("resId",resId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getCourseInfoSign(Map<String, Object> map,String userId,String courseId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courseId",courseId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyCourseInfoSign(Map<String, Object> map,String userId,String courseId,String courseName,String subject,String phaseId,String courseGoal,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courseId",courseId);
		map.put("courseName",courseName);
		map.put("subject",subject);
		map.put("phaseId",phaseId);
		map.put("courseGoal",courseGoal);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getCourselistListSign(Map<String, Object> map,String userId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getCourseListBySubjectPhaseSign(Map<String, Object> map,String userId,String subject,String phaseId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("subject",subject);
		map.put("phaseId",phaseId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addCourselistInfoSign(Map<String, Object> map,String userId,String courselistName,String subject,String phaseId,String courseIds,String schoolIds,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courselistName",courselistName);
		map.put("subject",subject);
		map.put("phaseId",phaseId);
		map.put("courseIds",courseIds);
		map.put("schoolIds",schoolIds);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getCourselistInfoSign(Map<String, Object> map,String userId,String courselistId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courselistId",courselistId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyCourselistInfoSign(Map<String, Object> map,String userId,String courselistId,String courselistName,String subject,String phaseId,String courseIds,String schoolIds,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courselistId",courselistId);
		map.put("courselistName",courselistName);
		map.put("subject",subject);
		map.put("phaseId",phaseId);
		map.put("courseIds",courseIds);
		map.put("schoolIds",schoolIds);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getPlessonListSign(Map<String, Object> map,String userId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getAllCourseIdNamwListSign(Map<String, Object> map,String userId,String useFor,String subject,String phaseId,String courseName,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("useFor",useFor);
		map.put("subject",subject);
		map.put("phaseId",phaseId);
		map.put("courseName",courseName);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addPlessonInfoSign(Map<String, Object> map, String userId, String courseId, String plessonDuration, String plessonCredits, String plessonDesc, String resIds, String liveList2, String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("courseId",courseId);
		map.put("plessonDuration",plessonDuration);
		map.put("plessonCredits",plessonCredits);
		map.put("plessonDesc",plessonDesc);
		map.put("resIds",resIds);
		map.put("liveList",liveList2);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getPlessonInfoSign(Map<String, Object> map,String userId,String plessonId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("plessonId",plessonId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyPlessonInfoSign(Map<String, Object> map, String userId, String plessonId, String courseId, String plessonDuration,
												String plessonCredits, String plessonDesc, String liveList2, String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";

		map.put("userId",userId);
		map.put("plessonId",plessonId);
		map.put("courseId",courseId);
		map.put("plessonDuration",plessonDuration);
		map.put("plessonCredits",plessonCredits);
		map.put("plessonDesc",plessonDesc);
		map.put("liveList",liveList2);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassListSign(Map<String, Object> map,String userId,String classId,String className,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("className",className);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  changeClassStatusSign(Map<String, Object> map,String userId,String classId,String type,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getCourselistIdNameCourseListSign(Map<String, Object> map,String userId,String phaseId,String schoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("phaseId",phaseId);
		map.put("schoolId",schoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getTeacherIdNameListSign(Map<String, Object> map,String userId,String schoolId,String subSchoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("subSchoolId",subSchoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassroomIdNameListSign(Map<String, Object> map,String userId,String schoolId,String subSchoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("subSchoolId",subSchoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addClassInfoSign(Map<String, Object> map,String userId,String className,String phaseId,String schoolId,String subSchoolId,String courselistId,String courseList3,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("className",className);
		map.put("phaseId",phaseId);
		map.put("schoolId",schoolId);
		map.put("subSchoolId",subSchoolId);
		map.put("courselistId",courselistId);
		map.put("courseList",courseList3);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassInfoSign(Map<String, Object> map,String userId,String classId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyClassInfoSign(Map<String, Object> map,String userId,String phaseId,String classId,String className,String courselistId,String courseList3,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("phaseId",phaseId);
		map.put("classId",classId);
		map.put("className",className);
		map.put("courselistId",courselistId);
		map.put("courseList",courseList3);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassmatelistSign(Map<String, Object> map,String userId,String classId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassModifyDetailSign(Map<String, Object> map,String userId,String classId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassCourselistListSign(Map<String, Object> map,String userId,String schoolId,String stuBirth,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("stuBirth",stuBirth);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassCourseListSign(Map<String, Object> map,String userId,String classIds,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classIds",classIds);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addEnrollInfoSign(Map<String, Object> map,String userId,String studentLoginId,String studentName,String studentBirth,String studentSex,
											String gradeId,String parentName,String phoneNum,String curSchoolName,String payAmount,
											String schoolId,String classIds,String ignorePhoneNum,String isTest,String audition,String prepay,String testScore,
											String testDesc,String auditionDesc,String communication,String timeId,String type,String Method) throws Exception {

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentLoginId",studentLoginId);
		map.put("studentName",studentName);
		map.put("studentBirth",studentBirth);
		map.put("studentSex",studentSex);
		map.put("gradeId",gradeId);
		map.put("parentName",parentName);
		map.put("phoneNum",phoneNum);
		map.put("curSchoolName",curSchoolName);
		map.put("payAmount",payAmount);
		map.put("schoolId",schoolId);
		map.put("classIds",classIds);
		map.put("ignorePhoneNum",ignorePhoneNum);
		map.put("isTest",isTest);
		map.put("audition",audition);
		map.put("prepay",prepay);
		map.put("testScore",testScore);
		map.put("testDesc",testDesc);
		map.put("auditionDesc",auditionDesc);
		map.put("communication",communication);
		map.put("timeId",timeId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getStudentListSign(Map<String, Object> map,String userId,String loginId,String pageNum,String pageSize,String name,String className,String schoolId,String gradeId,String campusId,String state,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("loginId",loginId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("name",name);
		map.put("className",className);
		map.put("schoolId",schoolId);
		map.put("gradeId",gradeId);
		map.put("campusId",campusId);
		map.put("state",state);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getStudentInfoSign(Map<String, Object> map,String userId,String studentId,String type,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getStudentChangeDetailSign(Map<String, Object> map,String userId,String studentId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyStudentInfoSign(Map<String, Object> map,String userId, String studentId, String studentName, String birthday, String sex,
												String gradeId, String parentName, String phoneNum, String curSchoolName, String classIds, String studentStatus, String ignorePhoneNum,String Method) throws Exception {

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";

		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("studentName",studentName);
		map.put("birthday",birthday);
		map.put("sex",sex);
		map.put("gradeId",gradeId);
		map.put("parentName",parentName);
		map.put("phoneNum",phoneNum);
		map.put("curSchoolName",curSchoolName);
		map.put("classIds",classIds);
		map.put("studentStatus",studentStatus);
		map.put("ignorePhoneNum",ignorePhoneNum);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  resetPwdSign(Map<String, Object> map,String userId,String targetUserId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("targetUserId",targetUserId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getNoticeListSign(Map<String, Object> map,String userId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getNoticeInfoSign(Map<String, Object> map,String userId,String noticeId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("noticeId",noticeId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}
	}

	public static String  addNoticeInfoSign(Map<String, Object> map,String userId,String message,String noticeTitle,String noticeImg,String noticeContent,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("message",message);
		map.put("noticeTitle",noticeTitle);
		map.put("noticeImg",noticeImg);
		map.put("noticeContent",noticeContent);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getAdminAndTeacherListSign(Map<String, Object> map,String userId,String loginId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("loginId",loginId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getRoleListSign(Map<String, Object> map,String userId,String schoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addAdminInfoSign(Map<String, Object> map,String userId,String schoolId,String loginId,String userName,String phoneNum,String roleId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("loginId",loginId);
		map.put("userName",userName);
		map.put("phoneNum",phoneNum);
		map.put("roleId",roleId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getPhaseListSign(Map<String, Object> map,String userId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addPhaseInfoSign(Map<String, Object> map,String userId,String phaseName,String phaseDesc,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("phaseName",phaseName);
		map.put("phaseDesc",phaseDesc);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getPhaseInfoSign(Map<String, Object> map,String userId,String phaseId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("phaseId",phaseId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyPhaseInfoSign(Map<String, Object> map,String userId,String phaseId,String phaseName,String phaseDesc,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("phaseId",phaseId);
		map.put("phaseName",phaseName);
		map.put("phaseDesc",phaseDesc);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassStudentCountListSign(Map<String, Object> map,String userId,String classId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyClassMaxCapacitySign(Map<String, Object> map,String userId,String classId,String classMaxCapacity,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("classMaxCapacity",classMaxCapacity);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getStudentScoreListSign(Map<String, Object> map,String userId,String loginId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("loginId",loginId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyStudentScoreSign(Map<String, Object> map,String userId,String studentId,String score,String reson,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("score",score);
		map.put("reson",reson);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassroomListSign(Map<String, Object> map,String userId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addClassroomSign(Map<String, Object> map,String userId,String schoolId,String subSchoolId,String classroomName,String classroomAddr,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("schoolId",schoolId);
		map.put("subSchoolId",subSchoolId);
		map.put("classroomName",classroomName);
		map.put("classroomAddr",classroomAddr);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getClassroomInfoSign(Map<String, Object> map,String userId,String classroomId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classroomId",classroomId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyClassroomSign(Map<String, Object> map,String userId,String classroomId,String schoolId,String subSchoolId,String classroomName,String classroomAddr,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classroomId",classroomId);
		map.put("schoolId",schoolId);
		map.put("classroomName",classroomName);
		map.put("classroomAddr",classroomAddr);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getSubSchoolListSign(Map<String, Object> map,String userId,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  addSubSchoolInfoSign(Map<String, Object> map,String userId,String subSchoolName,String relatePersonName,String phoneNum,String subSchoolPhoneNum,String address,String provinceId,String cityId,String adminLoginId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("subSchoolName",subSchoolName);
		map.put("relatePersonName",relatePersonName);
		map.put("phoneNum",phoneNum);
		map.put("subSchoolPhoneNum",subSchoolPhoneNum);
		map.put("address",address);
		map.put("provinceId",provinceId);
		map.put("cityId",cityId);
		map.put("adminLoginId",adminLoginId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getSubSchoolInfoSign(Map<String, Object> map,String userId,String subSchoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("subSchoolId",subSchoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifySubSchoolInfoSign(Map<String, Object> map,String userId,String subSchoolId,String subSchoolName,String relatePersonName,String phoneNum,String subSchoolPhoneNum,String address,String provinceId,String cityId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("subSchoolId",subSchoolId);
		map.put("subSchoolName",subSchoolName);
		map.put("relatePersonName",relatePersonName);
		map.put("phoneNum",phoneNum);
		map.put("subSchoolPhoneNum",subSchoolPhoneNum);
		map.put("address",address);
		map.put("provinceId",provinceId);
		map.put("cityId",cityId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  checkVersionSign(Map<String, Object> map,String versionCode,String appId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("versionCode",versionCode);
		map.put("appId",appId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}



	public static String  addRenewEnrollInfoSign(Map<String, Object> map,String userId, String studentId,String studentLoginId,String studentName,String studentBirth,String studentSex,
												 String curSchoolName,String gradeId,String parentName,String phoneNum ,String payAmount,String schoolId,String classIds,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("studentLoginId",studentLoginId);
		map.put("studentName",studentName);
		map.put("studentBirth",studentBirth);
		map.put("studentSex",studentSex);
		map.put("curSchoolName",curSchoolName);
		map.put("gradeId",gradeId);
		map.put("parentName",parentName);
		map.put("phoneNum",phoneNum);
		map.put("payAmount",payAmount);
		map.put("schoolId",schoolId);
		map.put("classIds",classIds);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getAllUserByTypeSign(Map<String, Object> map,String userId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}
	public static String  modifyAdminStatusSign(Map<String, Object> map,String userId,String targetUserId,String status,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("targetUserId",targetUserId);
		map.put("status",status);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  checkHasClassSign(Map<String, Object> map,String userId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  saveTokensSign(Map<String, Object> map,String userId,String deviceToken,String deviceType,String appId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("deviceToken",deviceToken);
		map.put("deviceType",deviceType);
		map.put("appId",appId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getUnreadCountSign(Map<String, Object> map,String userId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getPaperInfoSign(Map<String, Object> map,String userId,String paperId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("paperId",paperId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  approvePaperSign(Map<String, Object> map,String userId,String paperId,String pass,String Method) throws Exception {

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId", userId);
		map.put("paperId", paperId);
		map.put("pass", pass);
		map.put("time", times.getCurrentTime());
		map.put("method", Method);
		System.out.println("-------生成sign请求--------");
		String sign = HttpRequestUtil.doPost(signurl, map, "UTF-8").trim();
		System.out.println("sign：" + sign);
		if (!sign.isEmpty()) {
			return sign;
		} else {
			System.out.println("-------生成sign失败--------");
			return null;
		}
	}

	public static String  getExpListSign(Map<String, Object> map,String userId,String trainId,String markType,String pageNum,String pageSize,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("trainId",trainId);
		map.put("markType",markType);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  setCurrPhaseSign(Map<String, Object> map,String userId,String phaseId,String type,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("phaseId",phaseId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getUpClassInfoSign(Map<String, Object> map,String userId,String classId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("classId",classId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  upClassSign(Map<String, Object> map,String userId,String studentIds,String classId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentIds",studentIds);
		map.put("classId",classId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getPeriodSign(Map<String, Object> map,String userId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getInfoByNameSign(Map<String, Object> map,String userId,String studentName,String schoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentName",studentName);
		map.put("schoolId",schoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getInfoByPhoneSign(Map<String, Object> map,String userId,String phoneNum,String schoolId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("phoneNum",phoneNum);
		map.put("schoolId",schoolId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getInformalStudentListSign(Map<String, Object> map,String userId,String name,String pageNum,String pageSize,String phone,String schoolName,String schoolId,
													 String subSchoolId,String gradeId,String periodType,String test,String audition,String enrollTime,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("name",name);
		map.put("pageNum",pageNum);
		map.put("pageSize",pageSize);
		map.put("phone",phone);
		map.put("schoolName",schoolName);
		map.put("schoolId",schoolId);
		map.put("subSchoolId",subSchoolId);
		map.put("gradeId",gradeId);
		map.put("periodType",periodType);
		map.put("test",test);
		map.put("audition",audition);
		map.put("enrollTime",enrollTime);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getPeriodTypeSign(Map<String, Object> map,String userId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  modifyInformalStudentInfoSign(Map<String, Object> map,String userId,String studentId,String studentName,String studentBirth,String studentSex,String gradeId,String parentName,
														String phoneNum,String curSchoolName,String payAmount,String prepay,String schoolId,String classIds,String isTest,String audition,
														String testScore,String testDesc,String auditionDesc,String communication,String timeId,String type,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("studentName",studentName);
		map.put("studentBirth",studentBirth);
		map.put("studentSex",studentSex);
		map.put("gradeId",gradeId);
		map.put("parentName",parentName);
		map.put("phoneNum",phoneNum);
		map.put("curSchoolName",curSchoolName);
		map.put("payAmount",payAmount);
		map.put("prepay",prepay);
		map.put("schoolId",schoolId);
		map.put("classIds",classIds);
		map.put("isTest",isTest);
		map.put("audition",audition);
		map.put("testScore",testScore);
		map.put("testDesc",testDesc);
		map.put("auditionDesc",auditionDesc);
		map.put("communication",communication);
		map.put("timeId",timeId);
		map.put("type",type);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  getInformalStudentInfoSign(Map<String, Object> map,String userId,String studentId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}

	public static String  deleteStudentSign(Map<String, Object> map,String userId,String studentId,String Method) throws Exception{

		String signurl = "http://www.yuwenclub.com/dyw-managet/test/_manager/GenderCourseRecordSign.jsp";
//		String signurl = "http://192.168.10.150/test/_manager/GenderCourseRecordSign.jsp";
		map.put("userId",userId);
		map.put("studentId",studentId);
		map.put("time",times.getCurrentTime());
		map.put("method",Method);
		System.out.println("-------生成sign请求--------");
		String sign=HttpRequestUtil.doPost(signurl, map,"UTF-8").trim();
		System.out.println("sign："+sign);
		if(!sign.isEmpty()){
			return sign;
		}else{
			System.out.println("-------生成sign失败--------");
			return null;
		}

	}
}
