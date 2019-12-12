package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**Identify the REPORT PROJECT form elements and path
 * @author Thusya
 */
public class ReportReportProject extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(ReportReportProject .class);

    private static By Report_projectname = By.id("time_project_name");
    private static By Report_projectFromDate = By.id("project_date_range_from_date");
    private static By Report_projectToDate = By.id("project_date_range_to_date");
    private static By Report_Approve = By.id("only_include_approved_timesheets");
    private static By Report_ViewBtn = By.id("viewbutton");

    public static boolean ReportProjectnameVerify(){return getDriver().findElement(Report_projectname).isDisplayed();}
    public static void ReportProjectnameWrite(){Select dropDownOption = new Select (getDriver().findElement(Report_projectname));
    dropDownOption.selectByVisibleText("thusya - HRMsys");
        LOGGER.info("Report project name sent");}
    public static boolean ReportFromDateVerify(){return getDriver().findElement(Report_projectFromDate).isDisplayed();}
    public static void ReportFromDateClear(){getDriver().findElement(Report_projectFromDate).clear();}
    public static void ReportFromDate(){getDriver().findElement(Report_projectFromDate).sendKeys("2019-02-24");
        LOGGER.info("Report From Date sent");}
    public static boolean ReportToDateVerify(){return getDriver().findElement(Report_projectToDate).isDisplayed();}
    public static void ReportToDateClear(){getDriver().findElement(Report_projectToDate).clear();}
    public static void ReportToDate(){getDriver().findElement(Report_projectToDate).sendKeys("2019-02-27");
        LOGGER.info("Report  To Date sent");}
    public static boolean ReportApproveVerify(){return getDriver().findElement(Report_Approve).isDisplayed();}
    public static void ReportApproveClick(){getDriver().findElement(Report_Approve).click();
        LOGGER.info("Report approved");}
    public static boolean ReportViewBtnVerify(){return getDriver().findElement(Report_ViewBtn).isDisplayed();}
    public static void ReportViewBtnClick(){getDriver().findElement(Report_ViewBtn).click();
        LOGGER.info("Report view button clicked");}
}
