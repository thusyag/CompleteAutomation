package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**Identify the EMPLOYEE RECORD form elements and path -[Time_Attendance_Employee record]
 * @author Thusya
 */
public class AttendanceEmployeeRecord extends PageBase {

        private static final Logger LOGGER = Logger.getLogger(AttendanceEmployeeRecord .class);

        private static By attendemployeeName = By.id("attendance_employeeName_empName");
        private static By attendDate = By.id("attendance_date");
        private static By viewBtn = By.id("btView");

    /**
     * View the employee record
     */
    public static boolean employeeNameVerify(){return getDriver().findElement(attendemployeeName).isDisplayed();}
        public static void employeenameClear(){getDriver().findElement(attendemployeeName).click();}
        public static void employeeName(){getDriver().findElement(attendemployeeName).sendKeys("Russel Hamilton");
            LOGGER.info("employeeName sent ");}
        public static boolean AttendanceEmployeeRecordDateVerify(){return getDriver().findElement(attendDate).isDisplayed();}
        public static void AttendanceEmployeeRecordDateClear(){getDriver().findElement(attendDate).clear();}
        public static void AttendanceEmployeeRecordDate(){getDriver().findElement(attendDate).sendKeys("2019-02-24");
            LOGGER.info("attendance date add ");}
        public static boolean viewButtonVerify(){return getDriver().findElement(viewBtn).isDisplayed();}
        public static void viewButtonClick(){getDriver().findElement(viewBtn).click();
            LOGGER.info("view button click ");}
    }

