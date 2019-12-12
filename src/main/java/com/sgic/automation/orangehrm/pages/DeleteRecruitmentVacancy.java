package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;

/**Identify the DELETE RECRUITMENT VACANCY form elements and path
 * @author Thusya
 */
public class DeleteRecruitmentVacancy extends PageBase {

    private static By deleteCheckboxVerify = By.id("ohrmList_chkSelectAll");
    private static By deleteBtn = By.id("btnDelete");
    private static By deleteConformationmsgVerify = By.xpath("//*[@id=\"deleteConfirmation\"]/div[1]/h3");
    private static By popupHeading = By.xpath("//*[@id=\"deleteConfirmation\"]/div[1]/h3");
    private static By okBtn = By.id("dialogDeleteBtn");

    public static boolean isRecruitmentdeleteCBoxDisplay(){
        return getDriver().findElement(deleteCheckboxVerify).isDisplayed();}
    public static void recruitmentdeleteCBoxClick(){getDriver().findElement(deleteCheckboxVerify).click();}

        public static boolean isRecruitmentdeleteBtnDisplay(){
            return getDriver().findElement(deleteBtn).isDisplayed();}
        public static void recruitmentdeleteBtnClick(){getDriver().findElement(deleteBtn).click();}
        public static void setOkBtn(){getDriver().findElement(okBtn).click();}
}
