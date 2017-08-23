package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.testng.annotations.Test;
import util.HttpRequestUtil;
import util.TitleUtil;



public class test {
	Map<String, Object> postData = new HashMap<String, Object>();
	String totalUrl="http://192.168.10.228:8080";

	@Test(description = "登录", dataProvider = "logintest", dataProviderClass = data.TestDataProvider.class)
	public void Logintest(String loginid, String pwd, String method) throws Exception {
		TitleUtil titleutil = new TitleUtil();
		String url1 = totalUrl+ "/test/login.jsp";
		postData.put("s", "s");
		String json1 = HttpRequestUtil.doPost(url1, postData, "UTF-8");
		//System.out.println(titleutil.getTitle(json1));
		System.out.println("DAYUWEN-APPtoCDS-DYWHT1-V1.0 G1登录");
		String url =totalUrl+ "/bgLogin.do";
		String s = sign.getLoginSign(postData, loginid, pwd, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "修改密码", dataProvider = "changepwd", dataProviderClass = data.TestDataProvider.class)
	public void ChangePwd(String userId, String oldPwd, String newPwd, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT2-V1.0 G1.2.1 修改密码");

		String url = totalUrl+"/modifyPwd.do";
		String s = sign.changepwdSign(postData, userId, oldPwd, newPwd, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取分校列表", dataProvider = "getSchoolList", dataProviderClass = data.TestDataProvider.class)
	public void GetSchoolList(String userid, String schoolcode, String schoolname, String pagenum, String pagesize, String Method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT3-V1.0 G2 获取分校列表");

		String url = totalUrl+ "/sm/getSchoolList.do";
		String s = sign.getSchoolListSign(postData, userid, schoolcode, schoolname, pagenum, pagesize, Method);
		postData.put("sign", s);
		postData.remove("method");
//		String t = postData.get("time").toString();
//		String param = "userId="+userid+"&schoolCode="+schoolcode+"&schoolName="+schoolname+"&pageNum="+pagenum+"&pageSize="+pagesize+"&time="+t+"&sign="+s;
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "开启/关闭分校", dataProvider = "changeSchoolStatus", dataProviderClass = data.TestDataProvider.class)
	public void ChangeSchoolStatus(String userId, String schoolId, String type, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT4-V1.0 G2 开启/关闭分校");
		String url = totalUrl+"/sm/changeSchoolStatus.do";
		String s = sign.changeSchoolStatusSign(postData, userId, schoolId, type, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取省市列表", dataProvider = "getProvinceCityList", dataProviderClass = data.TestDataProvider.class)
	public void GetProvinceCityList(String userId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT5-V1.0 获取省市列表");

		String url = totalUrl+"/getProvinceCityList.do";
		String s = sign.getProvinceCityListSign(postData, userId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取新账号", dataProvider = "getNewAccount", dataProviderClass = data.TestDataProvider.class)
	public void GetNewAccount(String userId, String schoolId, String type, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT6-V1.0 获取新账号");

		String url = totalUrl+"/getNewAccount.do";
		String s = sign.getNewAccountSign(postData, userId, schoolId, type, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "创建分校", dataProvider = "addSchool", dataProviderClass = data.TestDataProvider.class)
	public void AddSchool(String userId, String schoolName, String relatePersonName, String phoneNum, String schoolPhoneNum, String schoolCode, String address, String schoolType, String provinceId, String cityId, String adminLoginId, String isCheck, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT7-V1.0 G2.1 创建分校");

		String url = totalUrl+"/sm/addSchoolInfo.do";
		String s = sign.createSchoolSign(postData, userId, schoolName, relatePersonName, phoneNum, schoolPhoneNum, schoolCode, address, schoolType, provinceId, cityId, adminLoginId, isCheck, method);
		postData.put("sign", s);
		postData.remove("method");
		System.out.println(postData);
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取分校信息", dataProvider = "getSchoolInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetSchoolInfo(String userId, String schoolId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT8-V1.0 G2.2获取分校信息");

		String url =totalUrl+ "/sm/getSchoolInfo.do";
		String s = sign.getSchoolInfoSign(postData, userId, schoolId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "更新分校信息", dataProvider = "modifySchoolInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifySchoolInfo(String userId, String schoolId, String schoolName, String relatePersonName, String phoneNum, String schoolPhoneNum, String address, String schoolType, String provinceId, String cityId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT9-V1.0 G2.2 更新分校信息");

		String url =totalUrl+ "/sm/modifySchoolInfo.do";
		String s = sign.modifySchoolInfoSign(postData, userId, schoolId, schoolName, relatePersonName, phoneNum, schoolPhoneNum, address, schoolType, provinceId, cityId, method);
		postData.remove("method");
		postData.put("sign", s);
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();

	}

	@Test(description = "获取教师列表", dataProvider = "getTeacherList", dataProviderClass = data.TestDataProvider.class)
	public void GetTeacherList(String userId, String searchLoginId, String searchUserName, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT10-V1.0 G3获取教师列表");

		String url = totalUrl+"/tm/getTeacherList.do";
		String s = sign.getTeacherListSign(postData, userId, searchLoginId, searchUserName, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取分校校区列表", dataProvider = "getSchoolAndSubList", dataProviderClass = data.TestDataProvider.class)
	public void GetSchoolAndSubList(String userId, String type, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT11-V1.0 获取分校校区列表");

		String url =totalUrl+ "/sm/getSchoolAndSubList.do";
		String s = sign.getSchoolAndSubListSign(postData, userId, type, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "添加教师", dataProvider = "addTeacher", dataProviderClass = data.TestDataProvider.class)
	public void AddTeacher(String userId, String teacherName, String phoneNum, String idNum, String teacherCERTNum, String sex, String teacherLoginId, String teacherStatus, String schoolId, String subSchoolId, String teacherType, String address, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT12-V1.0 G3.1 添加教师");

		String url =totalUrl+ "/tm/addTeacher.do";
		String s = sign.addTeacherSign(postData, userId, teacherName, phoneNum, idNum, teacherCERTNum, sex, teacherLoginId, teacherStatus, schoolId, subSchoolId, teacherType, address, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取教师信息", dataProvider = "getTeacherInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetTeacherInfo(String userId, String teacherId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT13-V1.0 G3.2 获取教师信息");

		String url = totalUrl+"/tm/getTeacherInfo.do";
		String s = sign.getTeacherInfoSign(postData, userId, teacherId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "修改教师信息", dataProvider = "modifyTeacherInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyTeacherInfo(String userId, String teacherUserId, String realName, String phoneNum, String idNum, String teacherCERTNum, String sex, String teacherStatus, String schoolId, String subSchoolId, String teacherType, String address,String isLecture,String isBaseSkill,String isBK,String workCertNum ,String workCertSignDate,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT14-V1.0 G3.2 修改教师信息");

		String url =totalUrl+ "/tm/modifyTeacherInfo.do";
		String s = sign.modifyTeacherInfoSign(postData, userId, teacherUserId, realName, phoneNum, idNum, teacherCERTNum, sex, teacherStatus, schoolId, subSchoolId, teacherType, address,isLecture,isBaseSkill,isBK,workCertNum,workCertSignDate, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取课程列表", dataProvider = "getCourseList", dataProviderClass = data.TestDataProvider.class)
	public void GetCourseList(String userId, String courseId, String courseName, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT15-V1.0 G4 获取课程列表");

		String url = totalUrl+"/cm/getCourseList.do";
		String s = sign.getCourseListSign(postData, userId, courseId, courseName, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获得适应性阶段列表", dataProvider = "getApplyPhaseIdNameList", dataProviderClass = data.TestDataProvider.class)
	public void GetApplyPhaseIdNameList(String userId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT16-V1.0 获得适应性阶段列表");

		String url =totalUrl+ "/apm/getApplyPhaseIdNameList.do";
		String s = sign.getApplyPhaseIdNameListSign(postData, userId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "创建课程", dataProvider = "addCourseInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddCourseInfo(String userId, String courseName, String subject, String phaseId, String courseGoal, String resIds, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT17-V1.0 G4.1 创建课程");

		String url =totalUrl+ "/cm/addCourseInfo.do";
		String s = sign.addCourseInfoSign(postData, userId, courseName, subject, phaseId, courseGoal, resIds, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

/*	@Test(description="上传资源",dataProvider = "addResFile", dataProviderClass = data.TestDataProvider.class)
	public void AddResFile(String userId,String courseId,String sourceType,String resTitle,String file,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT18-V1.0 上传资源");

		String url = totalUrl+"/addResFile.do";
		String s = sign.addResFileSign(postData,userId,courseId,sourceType,resTitle,file,method);
		postData.put("sign",s);
		postData.remove("method");
		String json=HttpRequestUtil.doPost(url, postData,"UTF-8");
		System.out.println("返回结果"+json);
		requestResult.getResult(json);
		postData.clear();
	} */

	@Test(description = "删除资源", dataProvider = "delRes", dataProviderClass = data.TestDataProvider.class)
	public void DelRes(String userId, String courseId, String sourceType, String resId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT19-V1.0 删除资源");

		String url = totalUrl+"/delRes.do";
		String s = sign.delResSign(postData, userId, courseId, sourceType, resId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取课程信息", dataProvider = "getCourseInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetCourseInfo(String userId, String courseId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT20-V1.0 G4.2 获取课程信息");

		String url = totalUrl+"/cm/getCourseInfo.do";
		String s = sign.getCourseInfoSign(postData, userId, courseId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "更新课程信息", dataProvider = "modifyCourseInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyCourseInfo(String userId, String courseId, String courseName, String subject, String phaseId, String courseGoal, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT21-V1.0 G4.2 更新课程信息");

		String url = totalUrl+"/cm/modifyCourseInfo.do";
		String s = sign.modifyCourseInfoSign(postData, userId, courseId, courseName, subject, phaseId, courseGoal, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取\"课程列表\"列表", dataProvider = "getCourselistList", dataProviderClass = data.TestDataProvider.class)
	public void GetCourselistList(String userId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT22-V1.0 G5 获取\"课程列表\"列表");

		String url = totalUrl+"/clm/getCourselistList.do";
		String s = sign.getCourselistListSign(postData, userId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}


	@Test(description = "获取所属科目及适应阶段下的所有课程", dataProvider = "getCourseListBySubjectPhase", dataProviderClass = data.TestDataProvider.class)
	public void GetCourseListBySubjectPhase(String userId, String subject, String phaseId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT23-V1.0 G5.1 获取所属科目及适应阶段下的所有课程");

		String url =totalUrl+ "/cm/getCourseListBySubjectPhase.do";
		String s = sign.getCourseListBySubjectPhaseSign(postData, userId, subject, phaseId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "创建\"课程列表\"", dataProvider = "addCourselistInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddCourselistInfo(String userId, String courselistName, String subject, String phaseId, String courseIds, String schoolIds, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT24-V1.0 G5.1 创建\"课程列表\"");

		String url = totalUrl+"/clm/addCourselistInfo.do";
		String s = sign.addCourselistInfoSign(postData, userId, courselistName, subject, phaseId, courseIds, schoolIds, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取\"课程列表\"信息", dataProvider = "getCourselistInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetCourselistInfo(String userId,String courselistId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT25-V1.0 G5.2 获取\"课程列表\"信息");

		String url =totalUrl+ "/clm/getCourselistInfo.do";
		String s = sign.getCourselistInfoSign(postData,userId,courselistId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "更新\"课程列表\"", dataProvider = "modifyCourselistInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyCourselistInfo(String userId, String courselistId, String courselistName, String subject, String phaseId, String courseIds, String schoolIds, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT26-V1.0 G5.2 更新\"课程列表\"");

		String url =totalUrl+ "/clm/modifyCourselistInfo.do";
		String s = sign.modifyCourselistInfoSign(postData, userId, courselistId, courselistName, subject, phaseId, courseIds, schoolIds, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取备课列表", dataProvider = "getPlessonList", dataProviderClass = data.TestDataProvider.class)
	public void GetPlessonList(String userId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT27-V1.0 G6 获取备课列表");

		String url =totalUrl+ "/plm/getPlessonList.do";
		String s = sign.getPlessonListSign(postData, userId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取所有课程列表", dataProvider = "getAllCourseIdNamwList", dataProviderClass = data.TestDataProvider.class)
	public void GetAllCourseIdNamwList(String userId, String useFor, String subject, String phaseId, String courseName, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT28-V1.0 G6.1 获取所有课程列表");

		String url =totalUrl+ "/cm/getAllCourseIdNamwList.do";
		String s = sign.getAllCourseIdNamwListSign(postData, userId, useFor, subject, phaseId, courseName, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "添加备课", dataProvider = "addPlessonInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddPlessonInfo(String userId, String courseId, String plessonDuration, String plessonCredits, String plessonDesc, String resIds,
							   String liveList, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT29-V1.0 G6.1 添加备课");

		String url = totalUrl+"/plm/addPlessonInfo.do";
		String liveList2="";
		if(liveList.contains("\"")||liveList.contains("|")||liveList.contains("/")){
			liveList2=util.CharReplace.getCharReplace(liveList);
		}
		String s = sign.addPlessonInfoSign(postData, userId, courseId, plessonDuration, plessonCredits, plessonDesc, resIds,liveList2, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取备课信息", dataProvider = "getPlessonInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetPlessonInfo(String userId, String plessonId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT30-V1.0 G6.2 获取备课信息");

		String url =totalUrl+ "/plm/getPlessonInfo.do";
		String s = sign.getPlessonInfoSign(postData, userId, plessonId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "更新备课信息", dataProvider = "modifyPlessonInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyPlessonInfo(String userId, String plessonId, String courseId, String plessonDuration, String plessonCredits, String plessonDesc,
								  String liveList, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT31-V1.0 G6.2 更新备课信息");
		String url =totalUrl+ "/plm/modifyPlessonInfo.do";
		String liveList2="";
		if(liveList.contains("\"")||liveList.contains("|")||liveList.contains("/")){
			liveList2=util.CharReplace.getCharReplace(liveList);
		}
		String s = sign.modifyPlessonInfoSign(postData, userId, plessonId, courseId, plessonDuration, plessonCredits, plessonDesc,liveList2, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "班级管理-获取班级列表", dataProvider = "getClassList", dataProviderClass = data.TestDataProvider.class)
	public void GetClassList(String userId, String classId, String className, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT32-V1.0 G8 班级管理-获取班级列表");

		String url = totalUrl+"/classm/getClassList.do";
		String s = sign.getClassListSign(postData, userId, classId, className, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "班级管理-开启/关闭班级", dataProvider = "changeClassStatus", dataProviderClass = data.TestDataProvider.class)
	public void ChangeClassStatus(String userId, String classId, String type, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT33-V1.0 G8 班级管理-开启/关闭班级");

		String url =totalUrl+ "/classm/changeClassStatus.do";
		String s = sign.changeClassStatusSign(postData, userId, classId, type, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "班级管理-获取\"课程列表\"Id名称课列表", dataProvider = "getCourselistIdNameCourseList", dataProviderClass = data.TestDataProvider.class)
	public void GetCourselistIdNameCourseList(String userId, String phaseId, String schoolId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT34-V1.0 G8.1 班级管理-获取\"课程列表\"Id名称课列表");

		String url =totalUrl+ "/clm/getCourselistIdNameCourseList.do";
		String s = sign.getCourselistIdNameCourseListSign(postData, userId, phaseId, schoolId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "班级管理- 查询教师Id名称列表", dataProvider = "getTeacherIdNameList", dataProviderClass = data.TestDataProvider.class)
	public void GetTeacherIdNameList(String userId, String schoolId, String subSchoolId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT35-V1.0 G8.1 班级管理- 查询教师Id名称列表");

		String url =totalUrl+ "/tm/getTeacherIdNameList.do";
		String s = sign.getTeacherIdNameListSign(postData, userId, schoolId, subSchoolId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "班级管理- 查询教室Id名称列表", dataProvider = "getClassroomIdNameList", dataProviderClass = data.TestDataProvider.class)
	public void GetClassroomIdNameList(String userId, String schoolId, String subSchoolId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT36-V1.0 G8.1 班级管理- 查询教室Id名称列表");

		String url =totalUrl+ "/crm/getClassroomIdNameList.do";
		String s = sign.getClassroomIdNameListSign(postData, userId, schoolId, subSchoolId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "创建班级", dataProvider = "addClassInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddClassInfo(String userId, String className, String phaseId, String schoolId, String subSchoolId, String courselistId, String courseList, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT37-V1.0 G8.1 创建班级");

		String url = totalUrl+"/classm/addClassInfo.do";
		String courseList1="";
		if(courseList.contains("\"")||courseList.contains("|")||courseList.contains("/")){
			courseList1=util.CharReplace.getCharReplace(courseList);
		}
		String s = sign.addClassInfoSign(postData, userId, className, phaseId, schoolId, subSchoolId, courselistId, courseList1, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取班级信息", dataProvider = "getClassInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetClassInfo(String userId, String classId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT38-V1.0 G8.2 获取班级信息");

		String url = totalUrl+"/classm/getClassInfo.do";
		String s = sign.getClassInfoSign(postData, userId, classId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "更新班级信息", dataProvider = "modifyClassInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyClassInfo(String userId, String phaseId, String classId, String className, String courselistId, String courseList, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT39-V1.0 G8.2 更新班级信息");

		String url = totalUrl+"/classm/modifyClassInfo.do";
		String courseList1="";
		if(courseList.contains("\"")||courseList.contains("|")||courseList.contains("/")){
			courseList1= util.CharReplace.getCharReplace(courseList);
		}
		String s = sign.modifyClassInfoSign(postData, userId, phaseId, classId, className, courselistId, courseList1, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取班级成员列表", dataProvider = "getClassmatelist", dataProviderClass = data.TestDataProvider.class)
	public void GetClassmatelist(String userId, String classId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT40-V1.0 G8.3 获取班级成员列表");

		String url = totalUrl+ "/classm/getClassmatelist.do";
		String s = sign.getClassmatelistSign(postData, userId, classId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取班级变更明细", dataProvider = "getClassModifyDetail", dataProviderClass = data.TestDataProvider.class)
	public void GetClassModifyDetail(String userId, String classId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT41-V1.0 G8.4 获取班级变更明细");

		String url =totalUrl+ "/classm/getClassModifyDetail.do";
		String s = sign.getClassModifyDetailSign(postData, userId, classId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "招生管理- 通过分校Id获取班级课程列表信息", dataProvider = "getClassCourselistList", dataProviderClass = data.TestDataProvider.class)
	public void GetClassCourselistList(String userId, String schoolId, String stuBirth, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT42-V1.0 G9 招生管理- 通过分校Id获取班级课程列表信息");

		String url = totalUrl+"/em/getClassCourselistList.do";
		String s = sign.getClassCourselistListSign(postData, userId, schoolId, stuBirth, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "招生管理-获取课程表", dataProvider = "getClassCourseList", dataProviderClass = data.TestDataProvider.class)
	public void GetClassCourseList(String userId, String classIds, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT43-V1.0 G9.1 招生管理-获取课程表");

		String url = totalUrl+ "/em/getClassCourseList.do";
		String s = sign.getClassCourseListSign(postData, userId, classIds, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "创建招生信息", dataProvider = "addEnrollInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddEnrollInfo(String userId, String studentLoginId, String studentName, String studentBirth, String studentSex,
							  String gradeId, String parentName, String phoneNum, String curSchoolName, String payAmount,
							  String schoolId, String classIds, String ignorePhoneNum, String isTest,String audition,String prepay, String testScore,
							  String testDesc, String auditionDesc, String communication, String timeId, String type, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT44-V1.0 创建招生信息");

		String url= totalUrl+"/em/addEnrollInfo.do";
		System.out.println("classIds:"+classIds);
		String s = sign.addEnrollInfoSign(postData, userId, studentLoginId, studentName, studentBirth, studentSex, gradeId, parentName, phoneNum, curSchoolName, payAmount, schoolId,
				classIds, ignorePhoneNum, isTest,audition,prepay, testScore, testDesc, auditionDesc, communication, timeId, type, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "学生管理-获取学生列表", dataProvider = "getStudentList", dataProviderClass = data.TestDataProvider.class)
	public void GetStudentList(String userId, String loginId, String pageNum, String pageSize, String name, String className, String schoolId, String gradeId, String campusId, String state, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT45-V1.0 G10 学生管理-获取学生列表");

		String url =totalUrl+"/stum/getStudentList.do";
		String s = sign.getStudentListSign(postData, userId, loginId, pageNum, pageSize, name, className, schoolId, gradeId, campusId, state, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取学生信息", dataProvider = "getStudentInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetStudentInfo(String userId, String studentId, String type, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT46-V1.0 G10.1获取学生信息");

		String url = totalUrl+"/stum/getStudentInfo.do";

		String s = sign.getStudentInfoSign(postData, userId, studentId, type, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取学生信息变更明细", dataProvider = "getStudentChangeDetail", dataProviderClass = data.TestDataProvider.class)
	public void GetStudentChangeDetail(String userId, String studentId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT47-V1.0 G10.1.1获取学生信息变更明细");

		String url =totalUrl+ "/stum/getStudentChangeDetail.do";

		String s = sign.getStudentChangeDetailSign(postData, userId, studentId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "修改学生信息", dataProvider = "modifyStudentInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyStudentInfo(String userId, String studentId, String studentName, String birthday, String sex,
								  String gradeId, String parentName, String phoneNum, String curSchoolName, String classIds, String studentStatus, String ignorePhoneNum, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT48-V1.0 G10.2修改学生信息");

		String url = totalUrl+"/stum/modifyStudentInfo.do";
		String s = sign.modifyStudentInfoSign(postData, userId, studentId, studentName, birthday, sex, gradeId, parentName, phoneNum, curSchoolName,
				classIds, studentStatus, ignorePhoneNum, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "重置密码", dataProvider = "resetPwd", dataProviderClass = data.TestDataProvider.class)
	public void ResetPwd(String userId, String targetUserId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT49-V1.0 重置密码");

		String url = totalUrl+"/am/resetPwd.do";
		String s = sign.resetPwdSign(postData, userId, targetUserId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "通知中心-获取通知列表", dataProvider = "getNoticeList", dataProviderClass = data.TestDataProvider.class)
	public void GetNoticeList(String userId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT51-V1.0 G11 通知中心-获取通知列表");

		String url = totalUrl+"/notice/getNoticeList.do";
		String s = sign.getNoticeListSign(postData, userId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "通知中心-获取通知详情", dataProvider = "getNoticeInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetNoticeInfo(String userId, String noticeId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT53-V1.0 G11.2 通知中心-获取通知详情");

		String url = totalUrl+ "/notice/getNoticeInfo.do";
		String s = sign.getNoticeInfoSign(postData, userId, noticeId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}


	@Test(description = "通知中心-创建通知", dataProvider = "addNoticeInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddNoticeInfo(String userId, String message, String noticeTitle, String noticeImg, String noticeContent, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT55-V1.0 G11.2 通知中心-创建通知");

		String url =totalUrl+ "/notice/addNoticeInfo.do";
		String s = sign.addNoticeInfoSign(postData, userId, message, noticeTitle, noticeImg, noticeContent, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "账号管理-获取账户(含管理员和教师)列表", dataProvider = "getAdminAndTeacherList", dataProviderClass = data.TestDataProvider.class)
	public void GetAdminAndTeacherList(String userId, String loginId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT56-V1.0 G12.1 账号管理-获取账户(含管理员和教师)列表");

		String url = totalUrl+"/am/getAdminAndTeacherList.do";
		String s = sign.getAdminAndTeacherListSign(postData, userId, loginId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "账号管理-获取角色列表", dataProvider = "getRoleList", dataProviderClass = data.TestDataProvider.class)
	public void GetRoleList(String userId, String schoolId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT57-V1.0 12.1.1账号管理-获取角色列表");

		String url = totalUrl+"/am/getRoleList.do";
		String s = sign.getRoleListSign(postData, userId, schoolId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "账号管理-创建管理员", dataProvider = "addAdminInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddAdminInfo(String userId, String schoolId, String loginId, String userName, String phoneNum,String roleId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT58-V1.0 G12.1.1账号管理-创建管理员");

		String url =totalUrl+ "/am/addAdminInfo.do";
		String s = sign.addAdminInfoSign(postData, userId, schoolId, loginId, userName, phoneNum,roleId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "适用阶段-获取适用阶段列表", dataProvider = "getPhaseList", dataProviderClass = data.TestDataProvider.class)
	public void GetPhaseList(String userId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT59-V1.0 G12.3适用阶段-获取适用阶段列表");

		String url =totalUrl+ "/apm/getPhaseList.do";
		String s = sign.getPhaseListSign(postData, userId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "适用阶段-创建适用阶段", dataProvider = "addPhaseInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddPhaseInfo(String userId, String phaseName, String phaseDesc, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT60-V1.0 G12.3.1适用阶段-创建适用阶段");

		String url = totalUrl+ "/apm/addPhaseInfo.do";
		String s = sign.addPhaseInfoSign(postData, userId, phaseName, phaseDesc, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "适用阶段-获取适用阶段信息", dataProvider = "getPhaseInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetPhaseInfo(String userId, String phaseId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT61-V1.0 G12.3.1适用阶段-获取适用阶段信息");

		String url = totalUrl+"/apm/getPhaseInfo.do";
		String s = sign.getPhaseInfoSign(postData, userId, phaseId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "适用阶段-修改适用阶段", dataProvider = "modifyPhaseInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyPhaseInfo(String userId, String phaseId, String phaseName, String phaseDesc, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT62-V1.0 G12.3.1适用阶段-修改适用阶段");

		String url = totalUrl+"/apm/modifyPhaseInfo.do";
		String s = sign.modifyPhaseInfoSign(postData, userId, phaseId, phaseName, phaseDesc, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "班级人数管理-获取班级人数列表", dataProvider = "getClassStudentCountList", dataProviderClass = data.TestDataProvider.class)
	public void GetClassStudentCountList(String userId, String classId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT63-V1.0 G12.5 班级人数管理-获取班级人数列表");

		String url = totalUrl+"/classm/getClassStudentCountList.do";
		String s = sign.getClassStudentCountListSign(postData, userId, classId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "班级人数管理-修改班级最大人数", dataProvider = "modifyClassMaxCapacity", dataProviderClass = data.TestDataProvider.class)
	public void ModifyClassMaxCapacity(String userId, String classId, String classMaxCapacity, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT64-V1.0 G12.5 班级人数管理-修改班级最大人数");

		String url = totalUrl+"/classm/modifyClassMaxCapacity.do";
		String s = sign.modifyClassMaxCapacitySign(postData, userId, classId, classMaxCapacity, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}


	@Test(description = "积分管理-获取学生积分列表", dataProvider = "getStudentScoreList", dataProviderClass = data.TestDataProvider.class)
	public void GetStudentScoreList(String userId, String loginId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT65-V1.0 G12.7 积分管理-获取学生积分列表");

		String url = totalUrl+ "/scorem/getStudentScoreList.do";
		String s = sign.getStudentScoreListSign(postData, userId, loginId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "积分管理-修改学生积分", dataProvider = "modifyStudentScore", dataProviderClass = data.TestDataProvider.class)
	public void ModifyStudentScore(String userId, String studentId, String score, String reson, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT66-V1.0 G12.7 积分管理-修改学生积分");

		String url = totalUrl+"/scorem/modifyStudentScore.do";
		String s = sign.modifyStudentScoreSign(postData, userId, studentId, score, reson, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "教室管理-获取教室列表", dataProvider = "getClassroomList", dataProviderClass = data.TestDataProvider.class)
	public void GetClassroomList(String userId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT67-V1.0 G12.4 教室管理-获取教室列表");

		String url = totalUrl+ "/crm/getClassroomList.do";
		String s = sign.getClassroomListSign(postData, userId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "教室管理-创建教室", dataProvider = "addClassroom", dataProviderClass = data.TestDataProvider.class)
	public void AddClassroom(String userId, String schoolId, String subSchoolId, String classroomName, String classroomAddr, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT68-V1.0 G12.4.1 教室管理-创建教室");

		String url = totalUrl+ "/crm/addClassroom.do";
		String s = sign.addClassroomSign(postData, userId, schoolId, subSchoolId, classroomName, classroomAddr, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "教室管理-获取教室信息", dataProvider = "getClassroomInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetClassroomInfo(String userId, String classroomId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT69-V1.0 G12.4.1 教室管理-获取教室信息");

		String url = totalUrl+ "/crm/getClassroomInfo.do";
		String s = sign.getClassroomInfoSign(postData, userId, classroomId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "教室管理-修改教室信息", dataProvider = "modifyClassroom", dataProviderClass = data.TestDataProvider.class)
	public void ModifyClassroom(String userId, String classroomId, String schoolId, String subSchoolId, String classroomName, String classroomAddr, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT70-V1.0 G12.4.1 教室管理-修改教室信息");

		String url = totalUrl +"/crm/modifyClassroom.do";
		String s = sign.modifyClassroomSign(postData, userId, classroomId, schoolId, subSchoolId, classroomName, classroomAddr, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "校区管理-获取校区列表", dataProvider = "getSubSchoolList", dataProviderClass = data.TestDataProvider.class)
	public void GetSubSchoolList(String userId, String pageNum, String pageSize, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT71-V1.0 G13 校区管理-获取校区列表");

		String url = totalUrl+ "/subsm/getSubSchoolList.do";
		String s = sign.getSubSchoolListSign(postData, userId, pageNum, pageSize, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "校区管理-创建校区", dataProvider = "addSubSchoolInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddSubSchoolInfo(String userId, String subSchoolName, String relatePersonName, String phoneNum, String subSchoolPhoneNum, String address, String provinceId, String cityId, String adminLoginId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT72-V1.0 G13 校区管理-创建校区");

		String url = totalUrl+"/subsm/addSubSchoolInfo.do";
		String s = sign.addSubSchoolInfoSign(postData, userId, subSchoolName, relatePersonName, phoneNum, subSchoolPhoneNum, address, provinceId, cityId, adminLoginId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "校区管理-获取校区信息", dataProvider = "getSubSchoolInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetSubSchoolInfo(String userId, String subSchoolId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT73-V1.0 G13 校区管理-获取校区信息");

		String url = totalUrl+"/subsm/getSubSchoolInfo.do";
		String s = sign.getSubSchoolInfoSign(postData, userId, subSchoolId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "校区管理-修改校区信息", dataProvider = "modifySubSchoolInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifySubSchoolInfo(String userId, String subSchoolId, String subSchoolName, String relatePersonName, String phoneNum, String subSchoolPhoneNum, String address, String provinceId, String cityId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT74-V1.0 G13 校区管理-修改校区信息");

		String url = totalUrl+ "/subsm/modifySubSchoolInfo.do";
		String s = sign.modifySubSchoolInfoSign(postData, userId, subSchoolId, subSchoolName, relatePersonName, phoneNum, subSchoolPhoneNum, address, provinceId, cityId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取最新版本信息", dataProvider = "checkVersion", dataProviderClass = data.TestDataProvider.class)
	public void CheckVersion(String versionCode, String appId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT75-V1.0 获取最新版本信息");

		String url = totalUrl+"/checkVersion.do";
		String s = sign.checkVersionSign(postData, versionCode, appId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "创建学生续签信息", dataProvider = "addRenewEnrollInfo", dataProviderClass = data.TestDataProvider.class)
	public void AddRenewEnrollInfo(String userId, String studentId,String studentLoginId,String studentName,String studentBirth,String studentSex,
								   String curSchoolName,String gradeId,String parentName,String phoneNum ,String payAmount,String schoolId,String classIds,  String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT76-V1.0 创建学生续签信息");

		String url=totalUrl+"/em/addRenewEnrollInfo.do";
		String s = sign.addRenewEnrollInfoSign(postData, userId, studentId,studentLoginId,studentName,studentBirth,studentSex,curSchoolName,gradeId,
				parentName,phoneNum,payAmount,schoolId,classIds, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "通知中心-获取通过所有管理员/教师/学生", dataProvider = "getAllUserByType", dataProviderClass = data.TestDataProvider.class)
	public void GetAllUserByType(String userId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT77-V1.0 G11.1 通知中心-获取通过所有管理员/教师/学生");

		String url = totalUrl+"/notice/getAllUserByType.do";
		String s = sign.getAllUserByTypeSign(postData, userId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "账号管理-修改管理员状态", dataProvider = "modifyAdminStatus", dataProviderClass = data.TestDataProvider.class)
	public void ModifyAdminStatus(String userId, String targetUserId, String status, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT78-V1.0 G12.1.1账号管理-修改管理员状态");

		String url = totalUrl+ "/am/modifyAdminStatus.do";
		String s = sign.modifyAdminStatusSign(postData, userId, targetUserId, status, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "招生管理-获取当前用户所在分校下是否存在班级", dataProvider = "checkHasClass", dataProviderClass = data.TestDataProvider.class)
	public void CheckHasClass(String userId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT79-V1.0 G9招生管理-获取当前用户所在分校下是否存在班级");

		String url = totalUrl+ "/em/checkHasClass.do";
		String s = sign.checkHasClassSign(postData, userId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "保存设备token信息(用于推送)", dataProvider = "saveTokens", dataProviderClass = data.TestDataProvider.class)
	public void saveTokens(String userId, String deviceToken, String deviceType, String appId, String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT80-V1.0 保存设备token信息(用于推送)");

		String url = totalUrl+"/saveTokens.do";
		String s = sign.saveTokensSign(postData, userId, deviceToken, deviceType, appId, method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取用户未读通知条数", dataProvider = "getUnreadCount", dataProviderClass = data.TestDataProvider.class)
	public void GetUnreadCount(String userId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT81-V1.0 获取用户未读通知条数");

		String url = totalUrl+"/notice/getUnreadCount.do";
		String s = sign.getUnreadCountSign(postData, userId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "批阅心得-获取心得详情", dataProvider = "getPaperInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetPaperInfo(String userId,String paperId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT82-V1.1 G14.1 批阅心得-获取心得详情");

		String url = totalUrl+"/training/getPaperInfo.do";
		String s = sign.getPaperInfoSign(postData, userId,paperId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "批阅心得-批阅", dataProvider = "approvePaper", dataProviderClass = data.TestDataProvider.class)
	public void ApprovePaper(String userId,String paperId,String pass,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT83-V1.1 G14.1 批阅心得-批阅");

		String url = totalUrl+ "/training/approvePaper.do";
		String s = sign.approvePaperSign(postData, userId,paperId,pass,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取心得提交列表", dataProvider = "getExpList", dataProviderClass = data.TestDataProvider.class)
	public void GetExpList(String userId,String trainId,String markType,String pageNum,String pageSize,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT84-V1.1 G14 获取心得提交列表");

		String url = totalUrl+ "/training/getExpList.do";
		String s = sign.getExpListSign(postData, userId,trainId,markType,pageNum,pageSize,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "设置/取消当期适用阶段", dataProvider = "setCurrPhase", dataProviderClass = data.TestDataProvider.class)
	public void SetCurrPhase(String userId,String phaseId,String type,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT85-V1.1 G12.3 设置/取消当期适用阶段");

		String url = totalUrl+"/apm/setCurrPhase.do";
		String s = sign.setCurrPhaseSign(postData, userId,phaseId,type,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取整班升级信息", dataProvider = "getUpClassInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetUpClassInfo(String userId,String classId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT86-V1.2 G8.5 获取整班升级信息");

		String url =totalUrl+ "/classm/getUpClassInfo.do";
		String s = sign.getUpClassInfoSign(postData, userId,classId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "提交整班升级信息", dataProvider = "upClass", dataProviderClass = data.TestDataProvider.class)
	public void UpClass(String userId,String studentIds,String classId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT87-V1.2 G8.5 提交整班升级信息");

		String url =totalUrl+ "/em/UpClass.do";
		String s = sign.upClassSign(postData, userId,studentIds,classId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取时间段意向信息", dataProvider = "getPeriod", dataProviderClass = data.TestDataProvider.class)
	public void GetPeriod(String userId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT88-V1.2 G9 获取时间段意向信息");

		String url = totalUrl+ "/getPeriod.do";
		String s = sign.getPeriodSign(postData, userId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}
	@Test(description = "获取已存在名字的学生信息", dataProvider = "getInfoByName", dataProviderClass = data.TestDataProvider.class)
	public void GetInfoByName(String userId,String studentName,String schoolId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT89-V1.2 G9 获取已存在名字的学生信息");

		String url =totalUrl+ "/getInfoByName.do";
		String s = sign.getInfoByNameSign(postData, userId,studentName,schoolId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取已存在联系方式的学生信息", dataProvider = "getInfoByPhone", dataProviderClass = data.TestDataProvider.class)
	public void GetInfoByPhone(String userId,String phoneNum,String schoolId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT90-V1.2 G9 获取已存在联系方式的学生信息");

		String url = totalUrl+"/getInfoByPhone.do";
		String s = sign.getInfoByPhoneSign(postData, userId,phoneNum,schoolId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}


	@Test(description = "获取招生数据库列表", dataProvider = "getInformalStudentList", dataProviderClass = data.TestDataProvider.class)
	public void GetInformalStudentList(String userId,String name,String pageNum,String pageSize,String phone,String schoolName,String schoolId,
									   String subSchoolId,String gradeId,String periodType,String test,String audition,String enrollTime,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT91-V1.2 G9.2 获取招生数据库列表");

		String url = totalUrl+"/stum/getInformalStudentList.do";
		String s = sign.getInformalStudentListSign(postData, userId,name,pageNum,pageSize,phone,schoolName,schoolId,
				subSchoolId,gradeId,periodType,test,audition,enrollTime,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取时段类型", dataProvider = "getPeriodType", dataProviderClass = data.TestDataProvider.class)
	public void GetPeriodType(String userId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT92-V1.2 G9.2 获取时段类型");

		String url = totalUrl+ "/getPeriodType.do";
		String s = sign.getPeriodTypeSign(postData, userId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "招生信息变更", dataProvider = "modifyInformalStudentInfo", dataProviderClass = data.TestDataProvider.class)
	public void ModifyInformalStudentInfo(String userId,String studentId,String studentName,String studentBirth,String studentSex,String gradeId,String parentName,
										  String phoneNum,String curSchoolName,String payAmount,String prepay,String schoolId,String classIds,String isTest,String audition,
										  String testScore,String testDesc,String auditionDesc,String communication,String timeId,String type,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT93-V1.2 G9.3 招生信息变更");

		String url = totalUrl+"/stum/modifyInformalStudentInfo.do";
		String s = sign.modifyInformalStudentInfoSign(postData, userId,studentId,studentName,studentBirth,studentSex,gradeId,parentName, phoneNum,
				curSchoolName,payAmount,prepay,schoolId,classIds,isTest,audition, testScore,testDesc,auditionDesc,communication,timeId,type,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "获取招生信息详情", dataProvider = "getInformalStudentInfo", dataProviderClass = data.TestDataProvider.class)
	public void GetInformalStudentInfo(String userId,String studentId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT94-V1.2 G9.4 获取招生信息详情");

		String url = totalUrl+ "/stum/getInformalStudentInfo.do";
		String s = sign.getInformalStudentInfoSign(postData, userId,studentId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doGet(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}

	@Test(description = "删除学生信息", dataProvider = "deleteStudent", dataProviderClass = data.TestDataProvider.class)
	public void DeleteStudent(String userId,String studentId,String method) throws Exception {
		System.out.println("DAYUWEN-APPtoCDS-DYWHT95-V1.2 G10 删除学生信息");

		String url = totalUrl+"/stum/deleteStudent.do";
		String s = sign.deleteStudentSign(postData, userId,studentId,method);
		postData.put("sign", s);
		postData.remove("method");
		String json = HttpRequestUtil.doPost(url, postData, "UTF-8");
		System.out.println("返回结果" + json);
		requestResult.getResult(json);
		postData.clear();
	}
}