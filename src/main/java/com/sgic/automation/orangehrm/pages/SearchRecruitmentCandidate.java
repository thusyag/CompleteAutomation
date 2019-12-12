package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Identify the SEARCH RECRUITMENT CANDIDATE form path and elements
 * @author ThusyaG
 */
public class SearchRecruitmentCandidate extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(SearchRecruitmentCandidate.class);

    private static By candidateButton = By.id("menu_recruitment_viewCandidates");
    private static By candidatePage = By.xpath("//*[@id=\"srchCandidates\"]/a");
    private static By candidateJobTitle = By.id("candidateSearch_jobTitle");
    private static By candidateVacancy = By.id("candidateSearch_jobVacancy");
    private static By candidateHiringManager = By.id("candidateSearch_hiringManager");
    private static By candidateStatus = By.id("candidateSearch_status");
    private static By candidateCandidateName = By.id("candidateSearch_candidateName");
    private static By candidateKeyword = By.id("candidateSearch_keywords");
    private static By candidateDateOfApplicationFrom = By.id("candidateSearch_fromDate");
    private static By candidateDateOfApplicationTo = By.id("candidateSearch_toDate");
    private static By methodOfApplication = By.id("candidateSearch_modeOfApplication");

    /**
     * @return candidateBtnClick - click candidateButton
     * @return isCandidatePageDisplay - Candidate_PageDisplay
     * @return isCandidateJobTitleDropDownDisplayed - Candidate_JobTitleDropDownDisplay
     * @return isCandidateVacancyDropDownDisplayed - Candidate_VacancyDropDown
     * @return isCandidateHiringManagerDropDown - Candidate_HiringManagerDropDownDisplay
     * @return isCandidateStatusDropDownDisplayed - Candidate_StatusDropDownDisplay
     */
    public static boolean isCandidateBtnVerify(){return getDriver().findElement(candidateButton).isDisplayed();}
    public static void candidateBtnClick(){getDriver().findElement(candidateButton).click();
        LOGGER.info("Candidate button worked");}
    public static boolean isCandidatePageDisplay(){return getDriver().findElement(candidatePage).isDisplayed();}
    public static boolean isCandidateJobTitleDropDownDisplayed() { return getDriver().findElement(candidateJobTitle).isDisplayed();}
    public static void setCandidateJobTitleSelectedOption(String CanJobTitle) {
        Select dropDownOption = new Select(getDriver().findElement(candidateJobTitle));
        dropDownOption.selectByVisibleText(CanJobTitle);
        LOGGER.info("Candidate job title dropdown worked");
    }
    public static boolean isCandidateVacancyDropDownDisplayed() { return getDriver().findElement(candidateVacancy).isDisplayed();}
    public static void setCandidateVacancySelectedOption(String CanVacancy) {
        Select dropDownOption = new Select(getDriver().findElement(candidateVacancy));
        dropDownOption.selectByVisibleText(CanVacancy);
        LOGGER.info("Candidate Vacancy dropdown worked");
    }
    public static boolean isCandidateHiringManagerDropDownDisplayed() { return getDriver().findElement(candidateHiringManager).isDisplayed();}
    public static void setCandidateHiringManagerSelectedOption(String CanHiringManager) { Select dropDownOption = new Select(getDriver().findElement(candidateHiringManager));dropDownOption.selectByVisibleText( CanHiringManager);
        LOGGER.info("Candidate HiringManager dropdown worked");}
    public static boolean isCandidateStatusDropDownDisplayed() { return getDriver().findElement(candidateStatus).isDisplayed();}
    public static void setCandidateStatusSelectedOption(String CanStatus) { Select dropDownOption = new Select(getDriver().findElement(candidateStatus));dropDownOption.selectByVisibleText(CanStatus);
        LOGGER.info("Candidate_status dropdown worked");}
    public static void candidateName(String CanName){getDriver().findElement(candidateCandidateName).sendKeys(CanName);
        LOGGER.info("Candidate_name sent ");}
    public static void keywords(String CanKey){getDriver().findElement(candidateKeyword ).sendKeys(CanKey);
        LOGGER.info("Candidate_keyword sent ");}
        public static void applicationFromDateClick(){getDriver().findElement(candidateDateOfApplicationFrom).click();}
            public static void applicationFromDateClear(){getDriver().findElement(candidateDateOfApplicationFrom).clear();}
    public static void applicationFromDate(String fromDate){getDriver().findElement(candidateDateOfApplicationFrom).sendKeys(fromDate);
        LOGGER.info("Candidate_from date sent ");}
    public static void applicationToDate(String toDate){getDriver().findElement(candidateDateOfApplicationTo).sendKeys(toDate);
        LOGGER.info("Candidate_to date sent ");}
    public static boolean isCandidateSMethodOfApplication() { return getDriver().findElement(methodOfApplication).isDisplayed();}
    public static void setCandidateSMethodOfApplicationSelectedOption(String CanMethodApplication) { Select dropDownOption = new Select(getDriver().findElement(methodOfApplication));dropDownOption.selectByVisibleText(CanMethodApplication);
        LOGGER.info("Candidate_MethodOfApplication_dropdown worked ");}
    /**
     * @param CanJobTitle - job title
     * @param CanVacancy - vacancy
     * @param CanHiringManager - hiring manager name
     * @param CanStatus - status
     * @param CanName - candidate name
     * @param CanKey - keyword
     * @param fromDate - application from date
     * @param toDate - application to date
     * @param CanMethodApplication - method of application
     */
    public static void RecruitmentCandidateSearchForm(String CanJobTitle, String CanVacancy, String CanHiringManager, String CanStatus, String CanName, String CanKey, String fromDate, String toDate, String CanMethodApplication){
        LOGGER.info("Search candidate form_DATA ........................START");
        SearchRecruitmentCandidate.setCandidateJobTitleSelectedOption(CanJobTitle);
        SearchRecruitmentCandidate.setCandidateVacancySelectedOption(CanVacancy);
        SearchRecruitmentCandidate.setCandidateHiringManagerSelectedOption(CanHiringManager);
        SearchRecruitmentCandidate.setCandidateStatusSelectedOption(CanStatus);
        SearchRecruitmentCandidate.candidateName(CanName);
        SearchRecruitmentCandidate.keywords(CanKey);
        SearchRecruitmentCandidate.applicationFromDate(fromDate);
        SearchRecruitmentCandidate.applicationToDate(toDate);
        SearchRecruitmentCandidate.setCandidateSMethodOfApplicationSelectedOption(CanMethodApplication);
        implicitWait(10);
    }
}
