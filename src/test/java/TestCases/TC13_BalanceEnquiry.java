package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P13_BalanceEnquiryPage;

@Epic("Check balance Enquiry Screen")
public class TC13_BalanceEnquiry extends TestBase {

    static String accountNo = "123456";

    // balance Enquiry
    @Story("balanceEnquiry")
    @Severity(SeverityLevel.NORMAL)
    @Description("balance Enquiry")
    @Test(priority = 1, description = "balance Enquiry")
    public void balanceEnquiry() {
        new P13_BalanceEnquiryPage(driver).BalanceEnquiry();
        Assert.assertTrue(new P13_BalanceEnquiryPage(driver).verifyBalanceEnquiryForm("Balance Enquiry Form"));
        new P13_BalanceEnquiryPage(driver).enterAccountNo(accountNo).clickSubmitButton();
    }

}