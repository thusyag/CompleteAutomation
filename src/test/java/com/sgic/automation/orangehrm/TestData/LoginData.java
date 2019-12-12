package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class LoginData extends ExcelDataConfig {
  private static final Logger LOGGER = Logger.getLogger(RecruitmentData.class);

  public LoginData () {
    super("src\\test\\resources\\ExcelSheet\\excel.xlsx");
  }
  @DataProvider
  public Object[][] VacancyAdd() {

    int rows = getRowCount("");
    int col = getColumnCount("");

    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("AddVacancy", i, j);
      }
    }
    return data;
  }

}
