package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.JiraIssueCreate.JiraPolicy;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * RECRUITMENT PAGE_TESTS
 * @author Thusya
 */
public class RecruitmentTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(RecruitmentTest.class);

    /**
     * RECRUITMENT_ADD VACANCY
     */
    @JiraPolicy(logTicketReady = true)
  @Test(priority = 0,groups = "jira", dataProviderClass = RecruitmentData.class, dataProvider = "AddVacancy", testName = "AddRecruitmentVacancy")
  public void addRecruitmentVacancyTest(String jobTitle, String VacancyName, String HiringManager,
                                    String PositionNum, String Description) {
      extentTest =extentReport.startTest("AddRecruitmentVacancy");
    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);


    softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
        "RecruitmentBtn is not Displayed");
    AddRecruitmentVacancy.recruitmentBtnClick();
      extentTest.log(LogStatus.PASS, "recruitment Button Click");
    softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
    AddRecruitmentVacancy.vacancyBtnClick();
      extentTest.log(LogStatus.PASS, "Vacancy Button Click");
    AddRecruitmentVacancy.isVacancyAddBtnVerify();
      extentTest.log(LogStatus.PASS, "Vacancy Add Button Verify");
    AddRecruitmentVacancy.vacancyAddBtnClick();
      extentTest.log(LogStatus.PASS, "Vacancy Add Button Click");
    softAssert.assertTrue(AddRecruitmentVacancy.isVacancyAddPageVerify());
    softAssert.assertTrue(AddRecruitmentVacancy.isJobTitleDropDownDisplayed(), "DropDown not Display");
      extentTest.log(LogStatus.PASS, "Vacancy Add Page Verify");
      extentTest.log(LogStatus.PASS, "jobtitle = " +jobTitle+"vacancy name = " + VacancyName+"hiringmanager = "+HiringManager
              +"position num = "+PositionNum+"description ="+Description);
    AddRecruitmentVacancy.AddRecruitmentVacancyForm(jobTitle, VacancyName, HiringManager, PositionNum, Description);
    AddRecruitmentVacancy.isSaveBtnVisible();
      extentTest.log(LogStatus.PASS, "Vacancy save Button verify");
    AddRecruitmentVacancy.saveBtn();
      extentTest.log(LogStatus.PASS, "Vacancy save button click");


      /**
       * Verified add vacancy details
       */
      AddRecruitmentVacancy.vacancyBtnClick();
      AddRecruitmentVacancy.Adddatacheck();


      extentTest.log(LogStatus.PASS, "Vacancy add data verifyed");
      AddRecruitmentVacancy.checkAdddataPage();
      extentReport.endTest(extentTest);
    softAssert.assertAll();

  }
  /**
   * RECRUITMENT_ADD CANDIDATE
   */
  @JiraPolicy(logTicketReady = true)
  @Test(priority = 1, groups = {"REGRESSION","jira"},dataProviderClass = RecruitmentData.class, dataProvider = "AddCandidate", testName = "AddRecruitmentCandidate")
  public void addCandidates(String Firstname, String Middlename, String Lastname, String Mail,
      String ContactNumber, String jobVacancy, String keyWord, String comment,
      String dateofApplication) {
      extentTest =extentReport.startTest("AddRecruitmentCandidate");
    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);
      extentTest.log(LogStatus.PASS, " Login worked");
    softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),"Recruitment Page is not Displayed");
    AddRecruitmentVacancy.recruitmentBtnClick();
      extentTest.log(LogStatus.PASS, " Recruitment button worked");
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
    SearchRecruitmentCandidate.candidateBtnClick();
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
    softAssert.assertTrue(AddRecruitmentCandidate.addButtonDis(),"Candidate AddBtn is not Verify");
    AddRecruitmentCandidate.AddButtonClick();
    AddRecruitmentCandidate.AddCandidatePage();
    AddRecruitmentCandidate.uploadFile("HRMcv.docx");
      extentTest.log(LogStatus.PASS, " Recruitment file upload");
    softAssert.assertTrue(AddRecruitmentCandidate.jobVacancy());
    AddRecruitmentCandidate.dateclear();
      extentTest.log(LogStatus.PASS, "FirstName = "+Firstname+", Middle Name = "+Middlename+", Last Name = "+Lastname
              +", Email = "+Mail+", Contact Number = "+ContactNumber+", Job Vacancy = "+jobVacancy+", Keyword = "+keyWord
              +", Comment = "+comment+", Date of Application = "+dateofApplication);
    AddRecruitmentCandidate.AddCandidateForms(Firstname, Middlename, Lastname,Mail,ContactNumber,jobVacancy,keyWord,comment,dateofApplication);
    AddRecruitmentCandidate.setSaveBtn();
      extentReport.endTest(extentTest);
    //DashBoardPage.clickLogoutbtn();
    }
    /**
     * RECRUITMENT_SEARCH CANDIDATE test
     */
    @JiraPolicy(logTicketReady = true)
  @Test(priority = 2, groups = {"REGRESSION","jira"},dataProviderClass = RecruitmentData.class, dataProvider = "SearchCandidate", testName = "SearchRecruitmentCandidate")
  public void searchCandidates(String CanJobTitle, String CanVacancy, String CanHiringManager,
      String CanStatus, String CanName, String CanKey, String fromDate, String toDate,
      String CanMethodApplication) {

      extentTest =extentReport.startTest("Search Recruitment Candidate");

    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

    softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay());
    AddRecruitmentVacancy.recruitmentBtnClick();
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify());
    SearchRecruitmentCandidate.candidateBtnClick();
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay());
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateJobTitleDropDownDisplayed(),
        "DropDown is not Displayed");

      extentTest =extentReport.startTest("JobTitle ="+CanJobTitle+", Vacancy = "+CanVacancy+", HiringManager = "
              +CanHiringManager+", Status = "+CanStatus+", Candidate name = "+CanName+", Keyword = "+CanKey+", FromDate = "+fromDate+", ToDate"+toDate
              +", Method of Application ="+CanMethodApplication);
    SearchRecruitmentCandidate.RecruitmentCandidateSearchForm(CanJobTitle, CanVacancy, CanHiringManager, CanStatus, CanName,
            CanKey, fromDate, toDate, CanMethodApplication);
  }

    /**
     * SEARCH RECRUITMENT VACANCY
     */
  @Test(priority = 3,groups = {"REGRESSION","jira"}, dataProviderClass = RecruitmentData.class, dataProvider = "SearchVacancy", testName = "SearchRecruitmentVacancy")
  public void searchRecruitmentVacancy(String SearchJobtitle,String SearchJobvacancy,String SearchhiringManager,String vacancySearch_Status){
      extentTest =extentReport.startTest("SearchRecruitmentVacancy");
      softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
      LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);
      softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(), "RecruitmentBtn is not Displayed");
      AddRecruitmentVacancy.recruitmentBtnClick();
      softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
      AddRecruitmentVacancy.vacancyBtnClick();
      softAssert.assertTrue(SearchRecruitmentVacancy.VacancySearch_jobTitle_Display());
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_jobVacancy_Display());
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_hiringManager_Display());
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_Status());
      SearchRecruitmentVacancy.searchRecruitmentVacancyForm(SearchJobtitle,SearchJobvacancy,SearchhiringManager,vacancySearch_Status);
      extentTest.log(LogStatus.PASS, "Jobtitle = "+SearchJobtitle+", Vacancy = "+SearchJobvacancy+", HirinhManager = "
              +SearchhiringManager+", Status = "+vacancySearch_Status);
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_button_verify());
      SearchRecruitmentVacancy.VacancySearch_button_Click();
      extentReport.endTest(extentTest);
  }

    /**
     * DELETE RECRUITMENT VACANCY
     */

    @Test(priority = 6, groups = "REGRESSION", testName = "DeleteRecruitmentVacancy")
    public void deleteRecruitmentVacancy() {
        extentTest =extentReport.startTest("DeleteRecruitmentVacancy");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);


        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
        AddRecruitmentVacancy.vacancyBtnClick();
        softAssert.assertTrue(DeleteRecruitmentVacancy.isRecruitmentdeleteCBoxDisplay());
        DeleteRecruitmentVacancy.recruitmentdeleteCBoxClick();
        softAssert.assertTrue(DeleteRecruitmentVacancy.isRecruitmentdeleteBtnDisplay());
        DeleteRecruitmentVacancy.recruitmentdeleteBtnClick();
        DeleteRecruitmentVacancy.setOkBtn();
        extentTest.log(LogStatus.PASS,"Data Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    /**
     * DELETE RECRUITMENT CANDIDATE
     */
    @Test(priority = 7, groups = "REGRESSION", testName = "DeleteCandidate")
    public void deleteCandidate() {
        extentTest =extentReport.startTest("DeleteCandidate");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(DeleteRecruitmentCandidate.isCandidatedeleteCBoxDisplay());
        DeleteRecruitmentCandidate.candidate_deleteCBoxClick();
        softAssert.assertTrue(DeleteRecruitmentCandidate.isCandidatedeleteBtnDisplay());
        DeleteRecruitmentCandidate.recruitmentdeleteBtnClick();
        softAssert.assertTrue(DeleteRecruitmentCandidate.okBtnVerify());
        DeleteRecruitmentCandidate.setOkBtn();
        extentTest.log(LogStatus.PASS,"Data Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    /**
     * EDIT RECRUITMENT VACANCY
     */
    @Test(priority = 4, groups = "REGRESSION",dataProviderClass = RecruitmentData.class, dataProvider = "EditVacancy", testName = "EditRecruitmentVacancy")
    public void editRecruitmentVacancy(String jobTitle, String VacancyName, String HiringManager,
                                             String PositionNum, String Description) {
        extentTest =extentReport.startTest("EditRecruitmentVacancy");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
        AddRecruitmentVacancy.vacancyBtnClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isVacancyEditlinkVerify());
        EditRecruitmentVacancy.vacancyEditLinkClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isVacancyEditBtnVerify());
        EditRecruitmentVacancy.vacancyEditBtnClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isJobTitleDropDownDisplayed(), "DropDown not Display");
        extentTest.log(LogStatus.PASS,"JobTitle ="+jobTitle+", Vacancy ="+VacancyName+", HiringManager ="+HiringManager+", Position ="+PositionNum
                +", Description ="+Description);
        EditRecruitmentVacancy.AddRecruitmentVacancyForm(jobTitle, VacancyName, HiringManager, PositionNum, Description);
        EditRecruitmentVacancy.isSaveBtnVisible();
        EditRecruitmentVacancy.saveBtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

    /**
     * EDIT RECRUITMENT CANDIDATE
     * @param Firstname, edit recruitment candidate firstname
     * @param Middlename,edit recruitment candidate middlename
     * @param Lastname, edit candidate lastname
     * @param Mail, edit candidate mail address
     * @param ContactNumber, edite contact number
     * @param jobVacancy, edit recruitment jobvacancy
     * @param keyWord, edit keyword
     * @param comment, edit vacancy comment
     * @param dateofApplication, edit candidate date of application
     */
    @Test(priority = 5, groups = "REGRESSION",dataProviderClass = RecruitmentData.class, dataProvider = "EditCandidate", testName = "EditRecruitmentCandidate")
    public void editCandidates(String Firstname, String Middlename, String Lastname, String Mail,
                              String ContactNumber, String jobVacancy, String keyWord, String comment,
                              String dateofApplication) {
        extentTest =extentReport.startTest("EditRecruitmentCandidate");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),"Recruitment Page is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(EditRecruitmentCandidate.EditLinkLVerify());
        EditRecruitmentCandidate.setEditCandidateLink();
        EditRecruitmentCandidate.setEditCanBtn();

        AddRecruitmentCandidate.uploadFile("HRMcv.docx");
        softAssert.assertTrue(AddRecruitmentCandidate.jobVacancy());
        AddRecruitmentCandidate.dateclear();
        extentTest.log(LogStatus.PASS,"Firstame ="+Firstname+", MiddleName = "+Middlename+", Lastname = "+Lastname+", Email ="+Mail
                +", ContactNumber ="+ContactNumber+", Vacancy = "+jobVacancy+", Keyword = "+keyWord+", Comment = "+comment
                +", Date of Application = "+dateofApplication);
        AddRecruitmentCandidate.AddCandidateForms(Firstname, Middlename, Lastname,Mail,ContactNumber,jobVacancy,keyWord,comment,dateofApplication);
        AddRecruitmentCandidate.setSaveBtn();
        extentReport.endTest(extentTest);
    }
}