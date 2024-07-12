package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P16_LogoutPage;
import pages.PageBase;

@Epic("Check Logout Screen")
public class TC16_LogOut extends TestBase {

    // logout page
    @Story("logout page")
    @Severity(SeverityLevel.NORMAL)
    @Description("logout page")
    @Test(priority = 1, description = "logout page")
    public void logOut() {
        new P16_LogoutPage(driver).clickOnLogOut();
        new PageBase(driver).handleAlert();
        Assert.assertTrue(new P02_LoginPage(driver).verifyUserIdIsDisplay());
        Assert.assertTrue(new P02_LoginPage(driver).verifyPasswordIsDisplay());
    }

}