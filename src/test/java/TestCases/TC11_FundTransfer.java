package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P11_FundTransferPage;

import static pages.P06_NewAccountPage.accountId;
import static pages.P06_NewAccountPage.secondAccountId;


@Epic("Check Fund transfer")
public class TC11_FundTransfer extends TestBase {

    static String description  = "test";
    static String amount  = "500";

    // fundTransfer
    @Story("fundTransfer")
    @Severity(SeverityLevel.NORMAL)
    @Description("fundTransfer")
    @Test(priority = 1, description = "fundTransfer")
    public void fundTransfer() {
        new P11_FundTransferPage(driver).fundTransfer();
        Assert.assertTrue(new P11_FundTransferPage(driver).verifyFundTransferForm("Fund transfer"));
        new P11_FundTransferPage(driver).enterPayersAccountNo(accountId).
                enterPayeesAccountNo(secondAccountId).enterAmount(amount).
                enterDescription(description).clickSubmitButton();
        Assert.assertTrue(new P11_FundTransferPage(driver).verifyFundTransfer("Fund Transfer Details"));
    }


    @Story("verify Fund Transfer Details")
    @Severity(SeverityLevel.NORMAL)
    @Description("verify Fund Transfer Details")
    @Test(priority = 2, description = "verify Fund Transfer Details")
    public void verifyFundTransferDetails() {
        new P11_FundTransferPage(driver).verifyFundTransferDetails("From Account Number", accountId, accountId);
        new P11_FundTransferPage(driver).verifyFundTransferDetails("Description", description ,description);
        new P11_FundTransferPage(driver).verifyFundTransferDetails("Amount", amount, amount);
        new P11_FundTransferPage(driver).verifyFundTransferDetails("To Account Number", secondAccountId, secondAccountId);

    }
}