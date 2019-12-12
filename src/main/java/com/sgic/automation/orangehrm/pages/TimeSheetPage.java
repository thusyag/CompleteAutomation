package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**Identify the TIME SHEET form elements and path
 * @author Thusya
 */
public class TimeSheetPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(TimeSheetPage.class);

    private static By employeeName = By.id("employee");
    private static By viewButton = By.id("btnView");
    private static By addTimeSheetBtn = By.id("btnAddTimesheet");
    private static By timesheetDate = By.id("time_date");
    //edit
    public static boolean employeeNameVerify(){return getDriver().findElement(employeeName).isDisplayed();}
    public static void employeenameClear(){getDriver().findElement(employeeName).click();}
    public static void employeeName(){getDriver().findElement(employeeName).sendKeys("Russel Hamilton");
        LOGGER.info("employeeName sent ");}
    public static boolean viewButtonVerify(){return getDriver().findElement(viewButton).isDisplayed();}
    public static void viewButtonClick(){getDriver().findElement(viewButton).click();
        LOGGER.info("view button click ");}
    public static boolean addTimesheetButtonVerify(){return getDriver().findElement(addTimeSheetBtn).isDisplayed();}
    public static void addTimesheetButtonClick(){getDriver().findElement(addTimeSheetBtn).click();
        LOGGER.info("timesheet add button click ");}
    public static boolean addTimesheetDateVerify(){return getDriver().findElement(timesheetDate).isDisplayed();}
    public static void addTimesheetDateClear(){getDriver().findElement(timesheetDate).clear();}
    public static void addTimesheetDate(){getDriver().findElement(timesheetDate).sendKeys("2019-02-24");
        LOGGER.info("timesheet date add ");}
}
