package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P08_DeleteAccountPage;
import pages.PageBase;

import static pages.P06_NewAccountPage.accountId;

@Epic("Check Delete Account Screen")
public class TC08_DeleteAccount extends TestBase {


    // Edit Account
    @Story("delete Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("delete Account")
    @Test(priority = 1, description = "delete Account")
    public void deleteAccount() {
        new P08_DeleteAccountPage(driver).deleteAccount();
        Assert.assertTrue(new P08_DeleteAccountPage(driver).verifyDeleteAccountForm("Delete Account Form"));
        new P08_DeleteAccountPage(driver).enterAccountId(accountId).clickSubmitButton();
        new PageBase(driver).handleAlert();
    }

}