package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P06_NewAccountPage;

import static pages.P03_NewCustomerPage.customerId;

@Epic("Check Create New Account Screen")
public class TC06_NewAccount extends TestBase {

    // New Account
    @Story("New Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("New Account")
    @Test(priority = 1, description = "New Account")
    public void newAccount() {
        new P06_NewAccountPage(driver).addNewAccount();
        Assert.assertTrue(new P06_NewAccountPage(driver).verifyNewAccountForm("Add new account form"));
        new P06_NewAccountPage(driver).enterCustomerId(customerId).enterInitialDeposit("30000").clickSubmitButton();
        Assert.assertTrue( new P06_NewAccountPage(driver).verifyNewAccountCreatedSuccessfully("Account Generated Successfully!!!"));
    }

    @Test(priority = 2, description = "get account details")
    public void getFirstAccountDetails() {
        new P06_NewAccountPage(driver).getAccountId();
        new P06_NewAccountPage(driver).getCustomerId();
        new P06_NewAccountPage(driver).getAccountType();
        new P06_NewAccountPage(driver).getDateOfOpening();
        new P06_NewAccountPage(driver).getCurrentAmount();
    }

    @Test(priority = 3, description = "get second account details")
    public void getSecondAccountDetails() {
        new P06_NewAccountPage(driver).getSecondAccountId();
        new P06_NewAccountPage(driver).getSecondCustomerId();
        new P06_NewAccountPage(driver).getSecondAccountType();
        new P06_NewAccountPage(driver).getSecondDateOfOpening();
        new P06_NewAccountPage(driver).getSecondCurrentAmount();
    }
}