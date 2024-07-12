package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P05_DeleteCustomerPage;
import pages.PageBase;

import static pages.P03_NewCustomerPage.customerId;

@Epic("CheckDelete Customer Screen")
public class TC05_DeleteCustomer extends TestBase {

    // Edit Customer
    @Story("delete Customer")
    @Severity(SeverityLevel.NORMAL)
    @Description("Delete Customer")
    @Test(priority = 1, description = "Delete Customer")
    public void deleteCustomer() {
        new P05_DeleteCustomerPage(driver).deleteCustomer();
        Assert.assertTrue(new P05_DeleteCustomerPage(driver).verifyDeleteCustomerForm("Delete Customer Form"));
        new P05_DeleteCustomerPage(driver).enterCustomerId(customerId).clickSubmitButton();
        new PageBase(driver).handleAlert();
    }

}