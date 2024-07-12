package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P09_DepoistPage;

import static pages.P06_NewAccountPage.accountId;

@Epic("Check Deposit Screen")
public class TC09_Deposit extends TestBase {

    static String description  = "test";
    static String currentAmount  = "7000";

    // Deposit
    @Story("Deposit")
    @Severity(SeverityLevel.NORMAL)
    @Description("Deposit")
    @Test(priority = 1, description = "Deposit")
    public void Deposit() {
        new P09_DepoistPage(driver).deposit();
        Assert.assertTrue(new P09_DepoistPage(driver).verifyDepositForm("Amount Deposit Form"));
        new P09_DepoistPage(driver).enterAccountNo(accountId).enterAmount(currentAmount).
                enterDescription(description).clickSubmitButton();
    }

}