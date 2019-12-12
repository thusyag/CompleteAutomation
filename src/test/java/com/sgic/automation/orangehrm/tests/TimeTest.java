package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

/**
 * @author Thusya
 * TIME PAGE TEST
 */
public class TimeTest extends TestBase {
    /**
     * Time page verification test
     */
    @Test(priority = 8,groups = "REGRESSION",testName = "TimePageTest")
    public void TimePageTest() {
        extentTest =extentReport.startTest("TimePage Verification");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.timesheets_ButtonVerify());
        TimePage.timesheets_ButtonClick();
        softAssert.assertTrue(TimePage.employeeTimesheetsdropdownVerify());
        //TimePage.employeeTimesheetsdropdownClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceEmployeeRecorddsropdownVerify());
        //TimePage.attendanceEmployeeRecordsropdownClick();
        softAssert.assertTrue(TimePage.attendanceConfigurationdropdownVerify());
        // TimePage.attendanceConfigurationdropdownClick();
        softAssert.assertTrue(TimePage.time_ReportButtonVerify());
        TimePage.time_ReportButtonClick();
        softAssert.assertTrue(TimePage.reportProjectdropdownVerify());
        //TimePage.reportProjectdropdownClick();
        softAssert.assertTrue(TimePage.reportEmployeedropdownVerify());
        //TimePage.reportEmployeedropdownClick();
        softAssert.assertTrue(TimePage.reporyAttendanceSummeryReportdropdownVerify());
        //TimePage.reporyAttendanceSummeryReportdropdownClick();
        softAssert.assertTrue(TimePage.time_projectInfoButtonVerify());
        TimePage.time_projectInfoButtonClick();
        softAssert.assertTrue(TimePage.projectInfoCustomerInfodropdownVerify());
        //TimePage.projectInfoCustomerInfodropdownClick();
        softAssert.assertTrue(TimePage.projectInfodropdownVerify());
        //TimePage.projectInfodropdownClick();
        extentTest.log(LogStatus.PASS, "Time page verification success");


    }

    /**
     * Time_Time sheet test
     */
    @Test(priority = 9, groups = "REGRESSION", testName = "TimePageTimesheetTest")
    public void TimePageTimesheetTest() {
        extentTest =extentReport.startTest("TimePage_TimeSheet Test");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.timesheets_ButtonVerify());
        TimePage.timesheets_ButtonClick();
        softAssert.assertTrue(TimePage.employeeTimesheetsdropdownVerify());
        TimePage.employeeTimesheetsdropdownClick();
        softAssert.assertTrue(TimeSheetPage.employeeNameVerify());
        TimeSheetPage.employeenameClear();
        TimeSheetPage.employeeName();
        extentTest.log(LogStatus.PASS, "Employee name = "+ "Russel Hamilton");
        softAssert.assertTrue(TimeSheetPage.viewButtonVerify());
        TimeSheetPage.viewButtonClick();
        softAssert.assertTrue(TimeSheetPage.addTimesheetButtonVerify());
        TimeSheetPage.addTimesheetButtonClick();
        softAssert.assertTrue(TimeSheetPage.addTimesheetDateVerify());
        TimeSheetPage.addTimesheetDateClear();
        TimeSheetPage.addTimesheetDate();
        extentTest.log(LogStatus.PASS, "Date = "+"2019-02-24");
        TimeSheetPage.addTimesheetButtonClick();
        extentTest.log(LogStatus.PASS, "Time sheet page data success fully added");


    }

    /**
     * Time_Attendance test
     */
    @Test(priority = 10,groups = "REGRESSION", testName = "TimePageAttendanceTest")
    public void TimePageAttendanceTest() {
        extentTest =extentReport.startTest("TimePage_Attendance Test");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceEmployeeRecorddsropdownVerify());
        TimePage.attendanceEmployeeRecordsropdownClick();
        softAssert.assertTrue(AttendanceEmployeeRecord.employeeNameVerify());
        AttendanceEmployeeRecord.employeenameClear();
        AttendanceEmployeeRecord.employeeName();
        extentTest.log(LogStatus.PASS, "Employee name = "+ "Russel Hamilton");
        softAssert.assertTrue(AttendanceEmployeeRecord.AttendanceEmployeeRecordDateVerify());
        AttendanceEmployeeRecord.AttendanceEmployeeRecordDateClear();
        AttendanceEmployeeRecord.AttendanceEmployeeRecordDate();
        extentTest.log(LogStatus.PASS, "Date = "+ "2019-02-24");
        AttendanceEmployeeRecord.viewButtonClick();
        extentTest.log(LogStatus.PASS, "Attendance details success fully added");


    }

    /**
     * Time_Attendance_configuration test
     */
    @Test(priority = 11, groups = "REGRESSION",testName = "TimePageAttendanceConfigurationTest")
    public void TimePageAttendanceCofigurationTest() {
        extentTest =extentReport.startTest("TimePage_Attendance Configuration Test");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceConfigurationdropdownVerify());
        TimePage.attendanceConfigurationdropdownClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceEmployeeInOutVerify());
        AttendanceConfiguration.attendanceEmployeeInOutClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceEmployeeEditDeleteVerify());
        AttendanceConfiguration.attendanceEmployeeEditDeleteClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceSupervisorEditDeleteVerify());
        AttendanceConfiguration.attendanceSupervisorEditDeleteClick();
        softAssert.assertTrue(AttendanceConfiguration.saveBtnVerify());
        AttendanceConfiguration.saveBtnClick();
        extentTest.log(LogStatus.PASS, "Successfully save attendance configuration ");


    }

    /**
     * Time_Report_report test
     */
    @Test(priority = 12,groups = "REGRESSION", testName = "TimePageProjectReportTest")
    public void TimePageProjectReportTest() {
        extentTest =extentReport.startTest("TimePage_ProjectReportTest");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_ReportButtonVerify());
        TimePage.time_ReportButtonClick();
        softAssert.assertTrue(TimePage.reportProjectdropdownVerify());
        TimePage.reportProjectdropdownClick();
        softAssert.assertTrue(ReportReportProject.ReportProjectnameVerify());
        ReportReportProject.ReportProjectnameWrite();
        extentTest.log(LogStatus.PASS, "Project name = "+"thusya - HRMsys");
        softAssert.assertTrue(ReportReportProject.ReportFromDateVerify());
        ReportReportProject.ReportFromDateClear();
        ReportReportProject.ReportFromDate();
        extentTest.log(LogStatus.PASS, "From date = "+"2019-02-24");
        softAssert.assertTrue(ReportReportProject.ReportToDateVerify());
        ReportReportProject.ReportToDateClear();
        ReportReportProject.ReportToDate();
        extentTest.log(LogStatus.PASS, "Todate"+"2019-02-27");
        softAssert.assertTrue(ReportReportProject.ReportApproveVerify());
        ReportReportProject.ReportApproveClick();
        softAssert.assertTrue(ReportReportProject.ReportViewBtnVerify());
        ReportReportProject.ReportViewBtnClick();
        extentTest.log(LogStatus.PASS, "Successfully view ");

    }
}