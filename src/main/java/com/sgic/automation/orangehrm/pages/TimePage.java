package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**Identify the TIME PAGE elements and path
 * @author Thusya
 */
public class TimePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(TimePage.class);

    private static By timeBtn = By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b");
    private static By time_timesheets = By.id("menu_time_Timesheets");
    private static By time_viewEmployeeTimesheet = By.id("menu_time_viewEmployeeTimesheet");
    private static By time_attendance = By.id("menu_attendance_Attendance");
    private static By time_viewAttendanceRecord = By.id("menu_attendance_viewAttendanceRecord");
    private static By time_attendanceConfiguration = By.id("menu_attendance_configure");
    private static By time_reports = By.id("menu_time_Reports");
    private static By time_projectReport = By.id("menu_time_displayProjectReportCriteria");
    private static By time_employeeReport = By.id("menu_time_displayEmployeeReportCriteria");
    private static By time_attendanceSummaryReport= By.id("menu_time_displayAttendanceSummaryReportCriteria");
    private static By time_projectInfo = By.id("menu_admin_ProjectInfo");
    private static By time_viewCustomer = By.id("menu_admin_viewCustomers");
    private static By time_viewProjects = By.id("menu_admin_viewProjects");

    public static boolean timeButtonVerify(){return getDriver().findElement(timeBtn).isDisplayed();}
    public static void timeBtnClick(){getDriver().findElement(timeBtn).click();
        LOGGER.info("time button clicked ");}
    public static boolean timesheets_ButtonVerify(){return getDriver().findElement(time_timesheets).isDisplayed();}
    public static void timesheets_ButtonClick(){getDriver().findElement(time_timesheets).click();
        LOGGER.info("timesheets dropdown Clicked ");}
    public static boolean employeeTimesheetsdropdownVerify(){return getDriver().findElement(time_viewEmployeeTimesheet).isDisplayed();}
    public static void employeeTimesheetsdropdownClick(){getDriver().findElement(time_viewEmployeeTimesheet).click();
        LOGGER.info("employee Timesheets dropdown clicked ");}
    public static boolean time_attendanceButtonVerify(){return getDriver().findElement(time_attendance).isDisplayed();}
    public static void  time_attendanceButtonClick(){getDriver().findElement(time_attendance).click();
        LOGGER.info(" attendance Button clicked ");}
    public static boolean attendanceEmployeeRecorddsropdownVerify(){return getDriver().findElement(time_viewAttendanceRecord).isDisplayed();}
    public static void attendanceEmployeeRecordsropdownClick(){getDriver().findElement(time_viewAttendanceRecord).click();
        LOGGER.info("Records dropdown clicked ");}
    public static boolean  attendanceConfigurationdropdownVerify(){return getDriver().findElement(time_attendanceConfiguration).isDisplayed();}
    public static void attendanceConfigurationdropdownClick(){getDriver().findElement(time_attendanceConfiguration).click();
        LOGGER.info("Configuration dropdown clicked ");}
    public static boolean time_ReportButtonVerify(){return getDriver().findElement(time_reports).isDisplayed();}
    public static void time_ReportButtonClick(){getDriver().findElement(time_reports).click();
        LOGGER.info("Report button clicked ");}
    public static boolean reportProjectdropdownVerify(){return getDriver().findElement(time_projectReport).isDisplayed();}
    public static void reportProjectdropdownClick(){getDriver().findElement(time_projectReport).click();
        LOGGER.info("project Report dropdown clicked ");}
    public static boolean reportEmployeedropdownVerify(){return getDriver().findElement(time_employeeReport).isDisplayed();}
    public static void reportEmployeedropdownClick(){getDriver().findElement(time_employeeReport).click();
        LOGGER.info("employee Report dropdown clicked ");}
    public static boolean  reporyAttendanceSummeryReportdropdownVerify(){return getDriver().findElement(time_attendanceSummaryReport).isDisplayed();}
    public static void  reporyAttendanceSummeryReportdropdownClick(){getDriver().findElement(time_attendanceSummaryReport).click();
        LOGGER.info("attendance Summery Report dropdown clicked ");}
    public static boolean time_projectInfoButtonVerify(){return getDriver().findElement(time_projectInfo).isDisplayed();}
    public static void time_projectInfoButtonClick(){getDriver().findElement(time_projectInfo).click();
        LOGGER.info("projectInfo button clicked ");}
    public static boolean projectInfoCustomerInfodropdownVerify(){return getDriver().findElement(time_viewCustomer).isDisplayed();}
    public static void projectInfoCustomerInfodropdownClick(){getDriver().findElement(time_viewCustomer).click();
        LOGGER.info("CustomerInfo dropdown clicked ");}
    public static boolean projectInfodropdownVerify(){return getDriver().findElement(time_viewProjects).isDisplayed();}
    public static void projectInfodropdownClick(){getDriver().findElement(time_viewProjects).click();
        LOGGER.info("projectInfo dropdown clicked ");}


}
