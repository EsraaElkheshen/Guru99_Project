package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P07_EditAccountPage;
import pages.PageBase;

import static pages.P06_NewAccountPage.accountId;

@Epic("Check Edit Account Screen")
public class TC07_EditAccount extends TestBase {


    // Edit Account
    @Story("Edit Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Edit Account")
    @Test(priority = 1, description = "Edit Account")
    public void EditAccount() {
        new P07_EditAccountPage(driver).editAccount();
        Assert.assertTrue(new P07_EditAccountPage(driver).verifyEditAccountForm("Edit Account Form"));
        new P07_EditAccountPage(driver).enterAccountId(accountId).clickSubmitButton();
    }

}