package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;


public class LoginThusyData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(LoginThusyData.class);

    public LoginThusyData () {
        super("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
    }
    @DataProvider(name = "LoginThusy")
    public Object[][] LoginThusy() {

        int rows = getRowCount("Login");
        int col = getColumnCount("Login");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Login", i, j);
            }
        }
        return data;
    }

}
