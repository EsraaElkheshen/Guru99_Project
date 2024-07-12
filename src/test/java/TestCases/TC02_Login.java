package TestCases;

import pages.P02_LoginPage;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.P01_CredentialPage.password;
import static pages.P01_CredentialPage.userId;

@Epic("Check Login Screen")
public class TC02_Login extends TestBase {


    // check login positive scenarios
    @Story("Login Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Login Page")
    //@Test(priority = 3, description = "login with valid credential", retryAnalyzer = MyRetry.class, timeOut = 20000)
    @Test(priority = 1, description = "login with valid credential")
    public void loginWithValidCredential() {
        new P02_LoginPage(driver).enterUserId(userId).
                enterPassword(password).clickLoginButton();
        Assert.assertTrue(new P02_LoginPage(driver).verifyWelcomeMessage("Welcome To Manager's Page of Guru99 Bank"));
    }



}