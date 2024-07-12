package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P14_MiniStatementPage;

@Epic("Check Mini Statement Screen")
public class TC14_MiniStatement extends TestBase {

    static String accountNo = "123456";

    // mini Statement
    @Story("miniStatement")
    @Severity(SeverityLevel.NORMAL)
    @Description("miniStatement")
    @Test(priority = 1, description = "miniStatement")
    public void miniStatement() {
        new P14_MiniStatementPage(driver).miniStatement();
        Assert.assertTrue(new P14_MiniStatementPage(driver).verifyMiniStatementForm("Mini Statement Form"));
        new P14_MiniStatementPage(driver).enterAccountNo(accountNo).clickSubmitButton();
    }

}