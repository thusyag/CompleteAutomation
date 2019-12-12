package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
/**
 * Identify the ADD RECRUITMENT VACANCY form elements and path
 * @author ThusyaG
 */
public class AddRecruitmentVacancy extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AddRecruitmentVacancy.class);

    private static By recruitmentButtonLink = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
    private static By recruitmentVacancyButtonLink = By.id("menu_recruitment_viewJobVacancy");
    private static By vacancyAddButton = By.id("btnAdd");
    private static By vacancyAddPageVerify = By.xpath("//*[@id=\"addJobVacancy\"]/div[1]/h1");
    private static By jobTitleDropdown = By.id("addJobVacancy_jobTitle");
    private static By vacancyName = By.id("addJobVacancy_name");
    private static By hiringManager = By.id("addJobVacancy_hiringManager");
    private static By positionNum = By.id("addJobVacancy_noOfPositions");
    private static By description = By.id("addJobVacancy_description");
    private static By addSaveBtn = By.id("btnSave");
    private static By checkAdddata = By.linkText("Engineer");
    private static By checkAdddataPage = By.xpath("//*[@id=\"addJobVacancy\"]/div[1]/h1");

    public static boolean isRecruitmentBtnDisplay(){
        return getDriver().findElement(recruitmentButtonLink).isDisplayed();}

    public static void recruitmentBtnClick(){implicitWait(5);getDriver().findElement(recruitmentButtonLink).click();
        LOGGER.info("Recruitment Button worked " );}
    public static boolean isVancyBtnDisplay(){
        return getDriver().findElement(recruitmentVacancyButtonLink).isDisplayed();}
    public static void vacancyBtnClick(){ implicitWait(10);getDriver().findElement(recruitmentVacancyButtonLink).click();
        LOGGER.info("Recruitment vacancy Button worked " );}
    public static boolean isVacancyAddBtnVerify(){
        return getDriver().findElement(vacancyAddButton).isDisplayed();}
    public static void vacancyAddBtnClick(){implicitWait(5); getDriver().findElement(vacancyAddButton).click();
        LOGGER.info("Add Recruitment vacancy Button worked " );}
    public static boolean isVacancyAddPageVerify(){
        return getDriver().findElement(vacancyAddPageVerify).isDisplayed();}

    /**
     * add recruitment vacancy_return boolean data type value
     * @return isJobTitleDropDownDisplayed - check job title dropdown is display
     * @return isSaveBtnVisible - verify the save button
     */
    public static boolean isJobTitleDropDownDisplayed() {
        return getDriver().findElement(jobTitleDropdown).isDisplayed();}
    public static void setDropDownOption(String jobTitle) { implicitWait(5);Select dropDownOption = new Select(getDriver().findElement(jobTitleDropdown));
        dropDownOption.selectByVisibleText(jobTitle);
        LOGGER.info("Add Recruitment vacancy_job title typed " );}
    public static void vacancyName(String VacancyName){implicitWait(5);getDriver().findElement(vacancyName).sendKeys(VacancyName);
        LOGGER.info("Add Recruitment vacancy_vacancy name typed " );}
    public static void hiringManager(String HiringManager){implicitWait(5);getDriver().findElement(hiringManager).sendKeys(HiringManager);
        LOGGER.info("Add Recruitment vacancy_HiringManager name typed " );}
    public static void positionNumber(String PositionNum){implicitWait(5);getDriver().findElement(positionNum).sendKeys(PositionNum);
        LOGGER.info("Add Recruitment vacancy_position number typed " );}
    public static void description(String Description){implicitWait(5);getDriver().findElement(description).sendKeys(Description);
        LOGGER.info("Add Recruitment vacancy_description typed " );}
    public static boolean isSaveBtnVisible(){return getDriver().findElement(addSaveBtn).isDisplayed();}
    public static void saveBtn(){implicitWait(5);getDriver().findElement(addSaveBtn).click();
        LOGGER.info("Add Recruitment vacancy_save button worked " ); }







   // public static boolean isAddDataVisible(){return getDriver().findElement(checkAdddata).isDisplayed();}
    public static void Adddatacheck(){implicitWait(10);getDriver().findElement(checkAdddata).click();
        LOGGER.info("Add data verified " );}
    public static void checkAdddataPage(){implicitWait(10);getDriver().findElement(checkAdddataPage).isDisplayed();}
//driver.findElement(By.linkText("click here")).click();
    /**
     * @param jobTitle - job title dropdown option
     * @param VacancyName - available job vacancy name
     * @param HiringManager - hiring manager name
     * @param PositionNum - available vacancy number
     * @param Description - description
     */
    public static void AddRecruitmentVacancyForm(String jobTitle, String VacancyName, String HiringManager, String PositionNum, String Description){
        LOGGER.info("Add Vacancy form_DATA ........................START");
        AddRecruitmentVacancy.setDropDownOption(jobTitle);
        AddRecruitmentVacancy.vacancyName(VacancyName);
        AddRecruitmentVacancy.hiringManager(HiringManager);
        AddRecruitmentVacancy.positionNumber(PositionNum);
        AddRecruitmentVacancy.description(Description);

        LOGGER.getAppender(jobTitle+VacancyName+HiringManager+PositionNum+Description);
    }
}
