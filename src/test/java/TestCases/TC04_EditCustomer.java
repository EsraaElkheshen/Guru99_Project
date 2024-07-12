package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.P04_EditCustomerPage;

;import static pages.P03_NewCustomerPage.customerId;

@Epic("CheckEdit Customer  Screen")
public class TC04_EditCustomer extends TestBase {

    // Edit Customer
    @Story("Edit Customer")
    @Severity(SeverityLevel.NORMAL)
    @Description("Edit Customer")
    @Test(priority = 1, description = "Edit Customer")
    public void editCustomer() {
        new P04_EditCustomerPage(driver).editCustomer();
        Assert.assertTrue(new P04_EditCustomerPage(driver).verifyEditCustomerForm("Edit Customer Form"));
        new P04_EditCustomerPage(driver).enterCustomerId(customerId).clickSubmitButton();
    }

}