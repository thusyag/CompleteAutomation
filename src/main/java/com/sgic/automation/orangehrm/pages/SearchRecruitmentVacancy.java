package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**Identify the SEARCH RECRUITMENT VACANCY form elements and path
 * @author Thusya 
 */
public class SearchRecruitmentVacancy extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(SearchRecruitmentVacancy.class);

    private static By vacancySearch_jobTitle = By.id("vacancySearch_jobTitle");
    private static By vacancySearch_jobVacancy = By.id("vacancySearch_jobVacancy");
    private static By vacancySearch_hiringManager = By.id("vacancySearch_hiringManager");
    private static By vacancySearch_status = By.id("vacancySearch_status");
    private static By vacancySearch_button = By.id("btnSrch");

    public static boolean VacancySearch_jobTitle_Display(){return getDriver().findElement(vacancySearch_jobTitle).isDisplayed();}
    public static void VacancySearch_jobTitleDropdown(String SearchJobtitle){
            Select dropDownOption = new Select(getDriver().findElement(vacancySearch_jobTitle));
            dropDownOption.selectByVisibleText(SearchJobtitle);
        LOGGER.info("search vacancy_job title dropdown worked");}
    public static boolean vacancySearch_jobVacancy_Display(){return getDriver().findElement(vacancySearch_jobVacancy).isDisplayed();}
    public static void VacancySearch_jobVacancyDropdown(String SearchJobvacancy){
            Select dropDownOption = new Select(getDriver().findElement(vacancySearch_jobVacancy));
            dropDownOption.selectByVisibleText(SearchJobvacancy);
        LOGGER.info("search vacancy_vacancy dropdown worked");}
    public static boolean vacancySearch_hiringManager_Display(){return getDriver().findElement(vacancySearch_hiringManager).isDisplayed();}
    public static void VacancySearch_hiringManager_Dropdown(String SearchhiringManager){
            Select dropDownOption = new Select(getDriver().findElement(vacancySearch_hiringManager));
            dropDownOption.selectByVisibleText(SearchhiringManager);
        LOGGER.info("search vacancy_hiring manager dropdown worked");}
    public static boolean vacancySearch_Status(){return getDriver().findElement(vacancySearch_status).isDisplayed();}
    public static void VacancySearch_Status(String vacancySearch_Status ){
            Select dropDownOption = new Select(getDriver().findElement(vacancySearch_status));
            dropDownOption.selectByVisibleText(vacancySearch_Status);
        LOGGER.info("search vacancy_status dropdown worked");}
    public static boolean vacancySearch_button_verify(){return getDriver().findElement(vacancySearch_button).isDisplayed();}
    public static void VacancySearch_button_Click(){getDriver().findElement(vacancySearch_button).click();
        LOGGER.info("search vacancy_search button worked");}

    public static void searchRecruitmentVacancyForm(String SearchJobtitle, String SearchJobvacancy, String SearchhiringManager, String vacancySearch_Status){
        LOGGER.info("Search vacancy form_DATA ........................START");
        SearchRecruitmentVacancy.VacancySearch_jobTitleDropdown(SearchJobtitle);
        SearchRecruitmentVacancy.VacancySearch_jobVacancyDropdown(SearchJobvacancy);
        SearchRecruitmentVacancy.VacancySearch_hiringManager_Dropdown(SearchhiringManager);
        SearchRecruitmentVacancy.VacancySearch_Status(vacancySearch_Status);
    }
}



