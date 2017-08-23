package data;

import com.bj58.qa.atf.data.BaseINIData;
import org.testng.annotations.DataProvider;

public class TestDataProvider{
	
	@DataProvider(name="student")
	public static Object[][] studentData()
	{ 
		return new BaseINIData().getData("student","testdata");		
	}
	
	@DataProvider(name="logintest")
	public static Object[][] logintestData()
	{ 
		return new BaseINIData().getData("logintest","testdata");		
	}
	
	@DataProvider(name="changepwd")
	public static Object[][] changepwdData()
	{ 
		return new BaseINIData().getData("changepwd","testdata");		
	}
	
	@DataProvider(name="getSchoolList")
	public static Object[][] getSchoolListData()
	{ 
		return new BaseINIData().getData("getSchoolList","testdata");		
	}
	
	@DataProvider(name="changeSchoolStatus")
	public static Object[][] changeSchoolStatusData()
	{ 
		return new BaseINIData().getData("changeSchoolStatus","testdata");		
	}
	
	@DataProvider(name="getProvinceCityList")
	public static Object[][] getProvinceCityListData()
	{ 
		return new BaseINIData().getData("getProvinceCityList","testdata");		
	}
	
	@DataProvider(name="getNewAccount")
	public static Object[][] getNewAccountData()
	{ 
		return new BaseINIData().getData("getNewAccount","testdata");		
	}
	
	@DataProvider(name="addSchool")
	public static Object[][] addSchoolData()
	{ 
		return new BaseINIData().getData("addSchool","testdata");		
	}
	
	@DataProvider(name="getSchoolInfo")
	public static Object[][] getSchoolInfoData()
	{ 
		return new BaseINIData().getData("getSchoolInfo","testdata");		
	}
	
	@DataProvider(name="modifySchoolInfo")
	public static Object[][] modifySchoolInfoData()
	{ 
		return new BaseINIData().getData("modifySchoolInfo","testdata");		
	}
	
	@DataProvider(name="getTeacherList")
	public static Object[][] getTeacherListData()
	{ 
		return new BaseINIData().getData("getTeacherList","testdata");		
	}
	
	@DataProvider(name="getSchoolAndSubList")
	public static Object[][] getSchoolAndSubListData()
	{ 
		return new BaseINIData().getData("getSchoolAndSubList","testdata");		
	}
	
	@DataProvider(name="addTeacher")
	public static Object[][] addTeacherData()
	{ 
		return new BaseINIData().getData("addTeacher","testdata");		
	}
	
	@DataProvider(name="getTeacherInfo")
	public static Object[][] getTeacherInfoData()
	{ 
		return new BaseINIData().getData("getTeacherInfo","testdata");		
	}
	
	@DataProvider(name="modifyTeacherInfo")
	public static Object[][] modifyTeacherInfoData()
	{ 
		return new BaseINIData().getData("modifyTeacherInfo","testdata");		
	}
	
	@DataProvider(name="getCourseList")
	public static Object[][] getCourseListData()
	{ 
		return new BaseINIData().getData("getCourseList","testdata");		
	}
	
	@DataProvider(name="getApplyPhaseIdNameList")
	public static Object[][] getApplyPhaseIdNameListData()
	{ 
		return new BaseINIData().getData("getApplyPhaseIdNameList","testdata");		
	}
	
	@DataProvider(name="addCourseInfo")
	public static Object[][] addCourseInfoData()
	{ 
		return new BaseINIData().getData("addCourseInfo","testdata");		
	}
	
/*	@DataProvider(name="addResFile")
	public static Object[][] addResFileData()
	{ 
		return new BaseINIData().getData("addResFile","testdata");		
	} */
	
	@DataProvider(name="delRes")
	public static Object[][] delResData()
	{ 
		return new BaseINIData().getData("delRes","testdata");		
	}
	
	@DataProvider(name="getCourseInfo")
	public static Object[][] getCourseInfoData()
	{ 
		return new BaseINIData().getData("getCourseInfo","testdata");		
	}
	
	@DataProvider(name="modifyCourseInfo")
	public static Object[][] modifyCourseInfoData()
	{ 
		return new BaseINIData().getData("modifyCourseInfo","testdata");		
	}
	
	@DataProvider(name="getCourselistList")
	public static Object[][] getCourselistListData()
	{ 
		return new BaseINIData().getData("getCourselistList","testdata");		
	}
	
	@DataProvider(name="getCourseListBySubjectPhase")
	public static Object[][] getCourseListBySubjectPhaseData()
	{ 
		return new BaseINIData().getData("getCourseListBySubjectPhase","testdata");		
	}
	
	@DataProvider(name="addCourselistInfo")
	public static Object[][] addCourselistInfoData()
	{ 
		return new BaseINIData().getData("addCourselistInfo","testdata");		
	}
	
	@DataProvider(name="getCourselistInfo")
	public static Object[][] getCourselistInfoData()
	{ 
		return new BaseINIData().getData("getCourselistInfo","testdata");		
	}
	
	@DataProvider(name="modifyCourselistInfo")
	public static Object[][] modifyCourselistInfoData()
	{ 
		return new BaseINIData().getData("modifyCourselistInfo","testdata");		
	}
	
	@DataProvider(name="getPlessonList")
	public static Object[][] getPlessonListData()
	{ 
		return new BaseINIData().getData("getPlessonList","testdata");		
	}
	
	@DataProvider(name="getAllCourseIdNamwList")
	public static Object[][] getAllCourseIdNamwListData()
	{ 
		return new BaseINIData().getData("getAllCourseIdNamwList","testdata");		
	}
	
	@DataProvider(name="addPlessonInfo")
	public static Object[][] addPlessonInfoData()
	{ 
		return new BaseINIData().getData("addPlessonInfo","testdata");		
	}
	
	@DataProvider(name="getPlessonInfo")
	public static Object[][] getPlessonInfoData()
	{ 
		return new BaseINIData().getData("getPlessonInfo","testdata");		
	}
	
	@DataProvider(name="modifyPlessonInfo")
	public static Object[][] modifyPlessonInfoData()
	{ 
		return new BaseINIData().getData("modifyPlessonInfo","testdata");		
	}
	
	@DataProvider(name="getClassList")
	public static Object[][] getClassListData()
	{ 
		return new BaseINIData().getData("getClassList","testdata");		
	}
	
	@DataProvider(name="changeClassStatus")
	public static Object[][] changeClassStatusData()
	{ 
		return new BaseINIData().getData("changeClassStatus","testdata");		
	}
	
	@DataProvider(name="getCourselistIdNameCourseList")
	public static Object[][] getCourselistIdNameCourseListData()
	{ 
		return new BaseINIData().getData("getCourselistIdNameCourseList","testdata");		
	}
	
	@DataProvider(name="getTeacherIdNameList")
	public static Object[][] getTeacherIdNameListData()
	{ 
		return new BaseINIData().getData("getTeacherIdNameList","testdata");		
	}
	
	@DataProvider(name="getClassroomIdNameList")
	public static Object[][] getClassroomIdNameListData()
	{ 
		return new BaseINIData().getData("getClassroomIdNameList","testdata");		
	}
	
	@DataProvider(name="addClassInfo")
	public static Object[][] addClassInfoData()
	{ 
		return new BaseINIData().getData("addClassInfo","testdata");		
	}
	
	@DataProvider(name="getClassInfo")
	public static Object[][] getClassInfoData()
	{ 
		return new BaseINIData().getData("getClassInfo","testdata");		
	}
	
	@DataProvider(name="modifyClassInfo")
	public static Object[][] modifyClassInfoData()
	{ 
		return new BaseINIData().getData("modifyClassInfo","testdata");		
	}
	
	@DataProvider(name="getClassmatelist")
	public static Object[][] getClassmatelistData()
	{ 
		return new BaseINIData().getData("getClassmatelist","testdata");		
	}
	
	@DataProvider(name="getClassModifyDetail")
	public static Object[][] getClassModifyDetailData()
	{ 
		return new BaseINIData().getData("getClassModifyDetail","testdata");		
	}
	
	@DataProvider(name="getClassCourselistList")
	public static Object[][] getClassCourselistListData()
	{ 
		return new BaseINIData().getData("getClassCourselistList","testdata");		
	}
	
	@DataProvider(name="getClassCourseList")
	public static Object[][] getClassCourseListData()
	{ 
		return new BaseINIData().getData("getClassCourseList","testdata");		
	}
	
	@DataProvider(name="addEnrollInfo")
	public static Object[][] addEnrollInfoData()
	{ 
		return new BaseINIData().getData("addEnrollInfo","testdata");		
	}
	
	@DataProvider(name="getStudentList")
	public static Object[][] getStudentListData()
	{ 
		return new BaseINIData().getData("getStudentList","testdata");		
	}
	
	@DataProvider(name="getStudentInfo")
	public static Object[][] getStudentInfoData()
	{ 
		return new BaseINIData().getData("getStudentInfo","testdata");		
	}
	
	@DataProvider(name="getStudentChangeDetail")
	public static Object[][] getStudentChangeDetailData()
	{ 
		return new BaseINIData().getData("getStudentChangeDetail","testdata");		
	}
	@DataProvider(name="modifyStudentInfo")
	public static Object[][] modifyStudentInfoData()
	{
		return new BaseINIData().getData("modifyStudentInfo","testdata");
	}
	
	@DataProvider(name="resetPwd")
	public static Object[][] resetPwdData()
	{ 
		return new BaseINIData().getData("resetPwd","testdata");		
	}

	@DataProvider(name="getNoticeList")
	public static Object[][] getNoticeListData()
	{
		return new BaseINIData().getData("getNoticeList","testdata");
	}

	@DataProvider(name="getNoticeInfo")
	public static Object[][] getNoticeInfoData()
	{
		return new BaseINIData().getData("getNoticeInfo","testdata");
	}
	
	@DataProvider(name="addNoticeInfo")
	public static Object[][] addNoticeInfoData()
	{ 
		return new BaseINIData().getData("addNoticeInfo","testdata");		
	}
	
	@DataProvider(name="getAdminAndTeacherList")
	public static Object[][] getAdminAndTeacherListData()
	{ 
		return new BaseINIData().getData("getAdminAndTeacherList","testdata");		
	}
	
	@DataProvider(name="getRoleList")
	public static Object[][] getRoleListData()
	{ 
		return new BaseINIData().getData("getRoleList","testdata");		
	}
	
	@DataProvider(name="addAdminInfo")
	public static Object[][] addAdminInfoData()
	{ 
		return new BaseINIData().getData("addAdminInfo","testdata");		
	}
	
	@DataProvider(name="getPhaseList")
	public static Object[][] getPhaseListData()
	{ 
		return new BaseINIData().getData("getPhaseList","testdata");		
	}

	@DataProvider(name="addPhaseInfo")
	public static Object[][] addPhaseInfoData()
	{
		return new BaseINIData().getData("addPhaseInfo","testdata");
	}

	@DataProvider(name="getPhaseInfo")
	public static Object[][] getPhaseInfoData()
	{
		return new BaseINIData().getData("getPhaseInfo","testdata");
	}
	
	@DataProvider(name="modifyPhaseInfo")
	public static Object[][] modifyPhaseInfoData()
	{ 
		return new BaseINIData().getData("modifyPhaseInfo","testdata");		
	}
	
	@DataProvider(name="getClassStudentCountList")
	public static Object[][] getClassStudentCountListData()
	{ 
		return new BaseINIData().getData("getClassStudentCountList","testdata");		
	}
	
	@DataProvider(name="modifyClassMaxCapacity")
	public static Object[][] modifyClassMaxCapacityData()
	{ 
		return new BaseINIData().getData("modifyClassMaxCapacity","testdata");		
	}
	
	@DataProvider(name="getStudentScoreList")
	public static Object[][] getStudentScoreListData()
	{ 
		return new BaseINIData().getData("getStudentScoreList","testdata");		
	}
	
	@DataProvider(name="modifyStudentScore")
	public static Object[][] modifyStudentScoreData()
	{ 
		return new BaseINIData().getData("modifyStudentScore","testdata");		
	}
	
	@DataProvider(name="getClassroomList")
	public static Object[][] getClassroomListData()
	{ 
		return new BaseINIData().getData("getClassroomList","testdata");		
	}
	
	@DataProvider(name="addClassroom")
	public static Object[][] addClassroomData()
	{ 
		return new BaseINIData().getData("addClassroom","testdata");		
	}
	
	@DataProvider(name="getClassroomInfo")
	public static Object[][] getClassroomInfoData()
	{ 
		return new BaseINIData().getData("getClassroomInfo","testdata");		
	}
	
	@DataProvider(name="modifyClassroom")
	public static Object[][] modifyClassroomData()
	{ 
		return new BaseINIData().getData("modifyClassroom","testdata");		
	}
	
	@DataProvider(name="getSubSchoolList")
	public static Object[][] getSubSchoolListData()
	{ 
		return new BaseINIData().getData("getSubSchoolList","testdata");		
	}
	
	@DataProvider(name="addSubSchoolInfo")
	public static Object[][] addSubSchoolInfoData()
	{ 
		return new BaseINIData().getData("addSubSchoolInfo","testdata");		
	}
	
	@DataProvider(name="getSubSchoolInfo")
	public static Object[][] getSubSchoolInfoData()
	{ 
		return new BaseINIData().getData("getSubSchoolInfo","testdata");		
	}
	
	@DataProvider(name="modifySubSchoolInfo")
	public static Object[][] modifySubSchoolInfoData()
	{ 
		return new BaseINIData().getData("modifySubSchoolInfo","testdata");		
	}

	@DataProvider(name="checkVersion")
	public static Object[][] checkVersionData()
	{
		return new BaseINIData().getData("checkVersion","testdata");
	}
	@DataProvider(name="addRenewEnrollInfo")
	public static Object[][] addRenewEnrollInfoData()
	{
		return new BaseINIData().getData("addRenewEnrollInfo","testdata");
	}
	@DataProvider(name="getAllUserByType")
	public static Object[][] getAllUserByTypeData()
	{
		return new BaseINIData().getData("getAllUserByType","testdata");
	}
	
	@DataProvider(name="modifyAdminStatus")
	public static Object[][] modifyAdminStatusData()
	{ 
		return new BaseINIData().getData("modifyAdminStatus","testdata");		
	}

	@DataProvider(name="checkHasClass")
	public static Object[][] checkHasClassData()
	{
		return new BaseINIData().getData("checkHasClass","testdata");
	}

	@DataProvider(name="saveTokens")
	public static Object[][] saveTokensData()
	{
		return new BaseINIData().getData("saveTokens","testdata");
	}

	@DataProvider(name="getUnreadCount")
	public static Object[][] getUnreadCountData()
	{
		return new BaseINIData().getData("getUnreadCount","testdata");
	}
	
	@DataProvider(name="getPaperInfo")
	public static Object[][] getPaperInfoData()
	{ 
		return new BaseINIData().getData("getPaperInfo","testdata");		
	}
	
	@DataProvider(name="approvePaper")
	public static Object[][] approvePaperData()
	{ 
		return new BaseINIData().getData("approvePaper","testdata");		
	}
	
	@DataProvider(name="getExpList")
	public static Object[][] getExpListData()
	{ 
		return new BaseINIData().getData("getExpList","testdata");		
	}
	
	@DataProvider(name="setCurrPhase")
	public static Object[][] setCurrPhaseData()
	{ 
		return new BaseINIData().getData("setCurrPhase","testdata");		
	}

	@DataProvider(name="getUpClassInfo")
	public static Object[][] getUpClassInfoData()
	{
		return new BaseINIData().getData("getUpClassInfo","testdata");
	}

	@DataProvider(name="upClass")
	public static Object[][] upClassData()
	{
		return new BaseINIData().getData("upClass","testdata");
	}

	@DataProvider(name="getPeriod")
	public static Object[][] getPeriodData()
	{
		return new BaseINIData().getData("getPeriod","testdata");
	}

	@DataProvider(name="getInfoByName")
	public static Object[][] getInfoByNameData()
	{
		return new BaseINIData().getData("getInfoByName","testdata");
	}

	@DataProvider(name="getInfoByPhone")
	public static Object[][] getInfoByPhoneData()
	{
		return new BaseINIData().getData("getInfoByPhone","testdata");
	}

	@DataProvider(name="getInformalStudentList")
	public static Object[][] getInformalStudentListData()
	{
		return new BaseINIData().getData("getInformalStudentList","testdata");
	}

	@DataProvider(name="getPeriodType")
	public static Object[][] getPeriodTypeData()
	{
		return new BaseINIData().getData("getPeriodType","testdata");
	}
	@DataProvider(name="modifyInformalStudentInfo")
	public static Object[][] modifyInformalStudentInfoData()
	{
		return new BaseINIData().getData("modifyInformalStudentInfo","testdata");
	}

	@DataProvider(name="getInformalStudentInfo")
	public static Object[][] getInformalStudentInfoData()
	{
		return new BaseINIData().getData("getInformalStudentInfo","testdata");
	}

	@DataProvider(name="deleteStudent")
	public static Object[][] deleteStudentData()
	{
		return new BaseINIData().getData("deleteStudent","testdata");
	}

}
