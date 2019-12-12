package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**Identify DELETE CANDIDATE form elements and path
 * @author Thusya
 */
public class DeleteRecruitmentCandidate extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(DeleteRecruitmentCandidate.class);

    private  static By deleteCanCheckbox = By.id("ohrmList_chkSelectAll");
    private static By deleteCanBtn = By.id("btnDelete");
    private static By CanDeleteOkBtn = By.id("dialogDeleteBtn");

    public static boolean isCandidatedeleteCBoxDisplay(){
        return getDriver().findElement(deleteCanCheckbox).isDisplayed();}
    public static void candidate_deleteCBoxClick(){getDriver().findElement(deleteCanCheckbox).click();
        LOGGER.info("Candidate delete checkbox worked");}
    public static boolean isCandidatedeleteBtnDisplay(){
        return getDriver().findElement(deleteCanBtn).isDisplayed();}
    public static void recruitmentdeleteBtnClick(){getDriver().findElement(deleteCanBtn).click();
        LOGGER.info("Candidate delete button worked");}
    public static boolean okBtnVerify(){return getDriver().findElement(CanDeleteOkBtn).isDisplayed();}
    public static void setOkBtn(){getDriver().findElement(CanDeleteOkBtn).click();
        LOGGER.info("Candidate delete ok button worked");}


}
