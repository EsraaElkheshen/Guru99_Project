package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P10_WithdrawalPage;

import static pages.P06_NewAccountPage.accountId;
import static pages.P06_NewAccountPage.currentAmount;

@Epic("Check Withdrawal Screen")
public class TC10_WithDrawl extends TestBase {

    static String description  = "test";

    // Withdrawal
    @Story("Withdrawal")
    @Severity(SeverityLevel.NORMAL)
    @Description("Withdrawal")
    @Test(priority = 1, description = "Withdrawal")
    public void Withdrawal() {
        new P10_WithdrawalPage(driver).Withdrawal();
        Assert.assertTrue(new P10_WithdrawalPage(driver).verifyWithdrawalForm("Amount Withdrawal Form"));
        new P10_WithdrawalPage(driver).enterAccountNo(accountId).enterAmount(currentAmount).
                enterDescription(description).clickSubmitButton();
        Assert.assertTrue(new P10_WithdrawalPage(driver).verifyWithdrawalMsg("Transaction details of Withdrawal for Account "+accountId));
    }

}