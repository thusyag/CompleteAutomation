package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class RecruitmentData extends ExcelDataConfig {

  private static final Logger LOGGER = Logger.getLogger(RecruitmentData.class);

  public RecruitmentData() {
    super("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
  }

  @DataProvider(name = "AddVacancy")
  public Object[][] AddVacancy() {

    int rows = getRowCount("AddVacancy");
    int col = getColumnCount("AddVacancy");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("AddVacancy", i, j);
      }
    }
    return data;
  }

  @DataProvider(name = "AddCandidate")
  public Object[][] AddCandidate() {

    int rows = getRowCount("AddCandidate");
    int col = getColumnCount("AddCandidate");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("AddCandidate", i, j);
      }
    }
    return data;
  }

  @DataProvider(name = "SearchCandidate")
  public Object[][] SearchCandidate() {
    int rows = getRowCount("SearchCandidate");
    int col = getColumnCount("SearchCandidate");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("SearchCandidate", i, j);
      }
    }
    return data;
  }

  @DataProvider(name = "SearchVacancy")
  public Object[][] SearchVacancy() {
    int rows = getRowCount("SearchVacancy");
    int col = getColumnCount("SearchVacancy");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("SearchVacancy", i, j);
      }
    }
    return data;
  }

  @DataProvider(name = "EditVacancy")
  public Object[][] EditVacancy() {

    int rows = getRowCount("EditVacancy");
    int col = getColumnCount("EditVacancy");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("EditVacancy", i, j);
      }
    }
    return data;
  }

  @DataProvider(name = "EditCandidate")
  public Object[][] EditCandidate() {

    int rows = getRowCount("EditCandidate");
    int col = getColumnCount("EditCandidate");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("EditCandidate", i, j);
      }
    }
    return data;
  }

}