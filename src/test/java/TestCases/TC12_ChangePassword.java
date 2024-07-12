package TestCases;

import io.qameta.allure.*;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P12_ChangePassword;
import pages.PageBase;

import static pages.P01_CredentialPage.password;


@Epic("Check Change Password Screen")
public class TC12_ChangePassword extends TestBase {


    static String new_password = "P@ssword1234";
    static String confirm_password = "P@ssword1234";


    // changePassword
    @Story("change password")
    @Severity(SeverityLevel.NORMAL)
    @Description("changePassword")
    @Test(priority = 1, description = "change password")
    public void changePassword() {
        new P12_ChangePassword(driver).changePassword();
        Assert.assertTrue(new P12_ChangePassword(driver).verifyChangePasswordForm("Change Password"));
        new P12_ChangePassword(driver).enterOldPassword(password).
                enterNewPassword(new_password).enterConfirmPassword(confirm_password).clickSubmitButton();
        new PageBase(driver).handleAlert();
    }

}