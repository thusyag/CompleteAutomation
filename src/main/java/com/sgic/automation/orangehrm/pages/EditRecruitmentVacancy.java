package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**Identify the EDIT RECRUITMENT VACANCY form elements and path
 * @author Thusya
 */
public class EditRecruitmentVacancy extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(EditRecruitmentVacancy.class);

    private static By editVavancyLink = By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a");
    private static By editVacancyPage = By.xpath("//*[@id=\"addJobVacancy\"]/div[1]/h1");
    private static By editButton = By.xpath("//*[@id=\"btnSave\"]");
    private static By jobTitleDropdown = By.id("addJobVacancy_jobTitle");
    private static By vacancyName = By.id("addJobVacancy_name");
    private static By hiringManager = By.id("addJobVacancy_hiringManager");
    private static By positionNum = By.id("addJobVacancy_noOfPositions");
    private static By description = By.id("addJobVacancy_description");
    private static By addSaveBtn = By.id("btnSave");
    private static By checkAdddata = By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a");


    public static boolean isVacancyEditlinkVerify(){
        return getDriver().findElement(editVavancyLink).isDisplayed();}
    public static void vacancyEditLinkClick(){ getDriver().findElement(editVavancyLink).click();
        LOGGER.info("Add Recruitment vacancy Button worked " );}
    public static boolean isVacancyEditPageVerify(){
        return getDriver().findElement(editVacancyPage).isDisplayed();}
    public static boolean isVacancyEditBtnVerify(){
        return getDriver().findElement(editButton).isDisplayed();}
    public static void vacancyEditBtnClick(){ getDriver().findElement(editButton).click();
        LOGGER.info("vacancyEditBtnClick " );}
    /**
     * add recruitment vacancy_return boolean data type value
     * @return isJobTitleDropDownDisplayed - check job title dropdown is display
     * @return isSaveBtnVisible - verify the save button
     */
    public static boolean isJobTitleDropDownDisplayed() {
        return getDriver().findElement(jobTitleDropdown).isDisplayed();}
    public static void setDropDownOption(String jobTitle) { Select dropDownOption = new Select(getDriver().findElement(jobTitleDropdown));
        dropDownOption.selectByVisibleText(jobTitle);
        LOGGER.info("Edit Recruitment vacancy_job title typed " );}
    public static void vacancyName(String VacancyName){getDriver().findElement(vacancyName).sendKeys(VacancyName);
        LOGGER.info("Edit Recruitment vacancy_vacancy name typed " );}
    public static void hiringManager(String HiringManager){getDriver().findElement(hiringManager).sendKeys(HiringManager);
        LOGGER.info("Edit Recruitment vacancy_HiringManager name typed " );}
    public static void positionNumber(String PositionNum){getDriver().findElement(positionNum).sendKeys(PositionNum);
        LOGGER.info("Edit Recruitment vacancy_position number typed " );}
    public static void description(String Description){getDriver().findElement(description).sendKeys(Description);
        LOGGER.info("Edit Recruitment vacancy_description typed " );}
    public static boolean isSaveBtnVisible(){return getDriver().findElement(addSaveBtn).isDisplayed();}
    public static void saveBtn(){getDriver().findElement(addSaveBtn).click();
        LOGGER.info("Edit Recruitment vacancy_save button worked " );}
//    public static boolean isAddDataVisible(){return getDriver().findElement(checkAdddata).isDisplayed();}
//    public static void Adddatacheck(){getDriver().findElement(checkAdddata);
//        LOGGER.info("Add data verified " );}

    /**
     * @param jobTitle - job title dropdown option
     * @param VacancyName - available job vacancy name
     * @param HiringManager - hiring manager name
     * @param PositionNum - available vacancy number
     * @param Description - description
     */
    public static void AddRecruitmentVacancyForm(String jobTitle, String VacancyName, String HiringManager, String PositionNum, String Description){
        LOGGER.info("Edit Vacancy form_DATA ........................START");
        EditRecruitmentVacancy.setDropDownOption(jobTitle);
        AddRecruitmentVacancy.vacancyName(VacancyName);
        AddRecruitmentVacancy.hiringManager(HiringManager);
        AddRecruitmentVacancy.positionNumber(PositionNum);
        AddRecruitmentVacancy.description(Description);

        LOGGER.getAppender(jobTitle+VacancyName+HiringManager+PositionNum+Description);
    }
}
