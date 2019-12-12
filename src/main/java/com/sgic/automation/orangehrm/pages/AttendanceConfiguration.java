package com.sgic.automation.orangehrm.pages;
import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**Identify the ATTENDANCE CONFIGURATION form elements and path -[Time_Attendance_Configuration]
 * @author Thusya
 */
public class AttendanceConfiguration extends PageBase {

        private static final Logger LOGGER = Logger.getLogger(AttendanceConfiguration .class);

        private static By employee_InOut = By.id("attendance_configuration1");
        private static By employee_edit_delete = By.id("attendance_configuration2");
        private static By supervisor_edit_delete = By.id("attendance_configuration3");
        private static By saveBtn = By.id("btnSave");

        /**
         *Save the configuration record
         */
        public static boolean attendanceEmployeeInOutVerify(){return getDriver().findElement(employee_InOut).isDisplayed();}
        public static void attendanceEmployeeInOutClick(){getDriver().findElement(employee_InOut).click();}
        public static boolean attendanceEmployeeEditDeleteVerify(){return getDriver().findElement(employee_edit_delete).isDisplayed();}
        public static void attendanceEmployeeEditDeleteClick(){getDriver().findElement(employee_edit_delete).click();}
        public static boolean attendanceSupervisorEditDeleteVerify(){return getDriver().findElement(supervisor_edit_delete).isDisplayed();}
        public static void attendanceSupervisorEditDeleteClick(){getDriver().findElement(supervisor_edit_delete).click();}
        public static boolean saveBtnVerify(){return getDriver().findElement(saveBtn).isDisplayed();}
        public static void saveBtnClick(){getDriver().findElement(saveBtn).click();}
    }

