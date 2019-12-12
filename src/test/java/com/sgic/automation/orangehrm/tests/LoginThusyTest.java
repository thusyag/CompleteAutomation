package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginThusyData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.JiraIssueCreate.JiraPolicy;
import com.sgic.automation.orangehrm.utils.MyScreenRecorder;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author Thusya
 */
public class LoginThusyTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LoginThusyTest.class);


    @Test(priority = 0, groups = "REGRESSION",dataProviderClass = LoginThusyData.class, dataProvider = "LoginThusy", testName = "LoginCorrect")
    public void LoginCorrect(String username,String Password,String status,String alertmsg) throws Exception {
        MyScreenRecorder.startRecording("Login_recording");
        extentTest =extentReport.startTest("LoginTestThusy");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(),"Login page not display");
        extentTest.log(LogStatus.PASS, "UserName = " + username + ", Password = " + Password + ", Message = " + alertmsg);
        LoginPage.login(username,Password);
        if(status.equals("valid") ){

            softAssert.assertTrue(DashBoardPage.isDashboardDisplayed());
            LOGGER.info("Login success");
        }
        else{
            LoginPage.isLoginAlertDisplay();
        softAssert.assertEquals(LoginPage.isLoginAlertDisplay(),alertmsg);
        
        LOGGER.info(alertmsg);
        extentReport.endTest(extentTest);
            MyScreenRecorder.stopRecording();
        }
}
}
