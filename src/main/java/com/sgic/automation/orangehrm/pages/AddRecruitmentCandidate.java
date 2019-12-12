package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

/**
 * Identify the ADD RECRUITMENT CANDIDATE form elements and path
 * @author ThusyaG
 */
public class AddRecruitmentCandidate extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(AddRecruitmentCandidate.class);

    private static By candidateAddBtn = By.xpath("//*[@id=\"btnAdd\"]");
    private static By candidatePageDisplay = By.id("addCandidateHeading");
    private static By FirstName = By.id("addCandidate_firstName");
    private static By MiddleName = By.id("addCandidate_middleName");
    private static By LastName = By.id("addCandidate_lastName");
    private static By Email = By.id("addCandidate_email");
    private static By ContactNum = By.id("addCandidate_contactNo");
    private static By JobVacancy = By.id("addCandidate_vacancy");
    private static By ResumeFileUpload = By.id("addCandidate_resume");
    private static By Keyword = By.id("addCandidate_keyWords");
    private static By Comment = By.id("addCandidate_comment");
    private static By DateOfApplication = By.id("addCandidate_appliedDate");
    private static By SaveBtn = By.id("btnSave");

    public static boolean addButtonDis(){return getDriver().findElement(candidateAddBtn).isDisplayed();}
    public static void AddButtonClick(){getDriver().findElement(candidateAddBtn).click();
        LOGGER.info("Candidate add button worked");}
    public static void AddCandidatePage(){getDriver().findElement(candidatePageDisplay).isDisplayed();
        LOGGER.info("Candidate page displayed");}
    public static void firstName(String Firstname){getDriver().findElement(FirstName).sendKeys(Firstname);
        LOGGER.info("fist name Sent ");}
    public static void middleName(String Middlename){getDriver().findElement(MiddleName).sendKeys(Middlename);
        LOGGER.info(" middle name Sent ");}
    public static void lastName(String Lastname){getDriver().findElement(LastName).sendKeys(Lastname);
        LOGGER.info("last name Sent ");}
    public static void setEmail(String Mail){getDriver().findElement(Email).sendKeys(Mail);
        LOGGER.info("fist name Sent ");}
    public static void setContactNum(String ContactNumber){getDriver().findElement(ContactNum).sendKeys(ContactNumber);
        LOGGER.info("contact number Sent ");}
    public static boolean jobVacancy() { return getDriver().findElement(JobVacancy).isDisplayed();}
    public static void setjobVacancySelectedOption(String jobVacancy) { Select dropDownOption = new Select(getDriver().findElement(JobVacancy));dropDownOption.selectByVisibleText(jobVacancy);
        LOGGER.info("job vacancy dropdown worked");}
    public static void uploadFile(String filename) {getDriver().findElement(ResumeFileUpload).sendKeys(PageBase.uploadFilepath+File.separator+ filename);
        LOGGER.info("File upload worked");}
    public static void setKeyword(String keyWord){getDriver().findElement(Keyword).sendKeys(keyWord);
        LOGGER.info(" key word Sent ");}
    public static void setComment(String comment){getDriver().findElement(Comment).sendKeys(comment);
        LOGGER.info(" comment Sent ");}
        public static void dateclear(){getDriver().findElement(DateOfApplication).clear();}
    public static void setDateOfApplication(String dateofApplication){getDriver().findElement(DateOfApplication).sendKeys(dateofApplication);
        LOGGER.info(" date Sent ");}
    public static void setSaveBtn(){getDriver().findElement(SaveBtn).click();
        LOGGER.info(" save button worked ");}
    /**
     * @param Firstname - candidate first name
     * @param Middlename - candidate middle name
     * @param Lastname - candidate last name
     * @param Mail - candidate email address
     * @param ContactNumber - candidate contact number
     * @param jobVacancy - candidate job vacancy
     * @param keyWord - key words
     * @param comment - comments
     * @param dateofApplication - date of application
     */
    public static void AddCandidateForms(String Firstname,String Middlename,String Lastname,String Mail,String ContactNumber,String jobVacancy,String keyWord,String comment,String dateofApplication){
        LOGGER.info("Add candidate form_DATA ........................START");
        AddRecruitmentCandidate.firstName(Firstname);
        AddRecruitmentCandidate.middleName(Middlename);
        AddRecruitmentCandidate.lastName(Lastname);
        AddRecruitmentCandidate.setEmail(Mail);
        AddRecruitmentCandidate.setContactNum(ContactNumber);
        AddRecruitmentCandidate.setjobVacancySelectedOption(jobVacancy);
        AddRecruitmentCandidate.setKeyword(keyWord);
        AddRecruitmentCandidate.setComment(comment);
        AddRecruitmentCandidate.setDateOfApplication(dateofApplication);
    }
}
