package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_CredentialPage;

@Epic("Generate Credential")
public class TC01_Credential extends TestBase{
    static String email ="esraa.elkheshen53@gmail.com";

    // check open link
    @Story("open Link")
    @Severity(SeverityLevel.NORMAL)
    @Description("open Link")
    @Test(priority = 1, description = "open Link")
    public void openLink() {
        new P01_CredentialPage(driver).openLink();
    }

    // check generate user id and password
    @Story("generate user id and password")
    @Severity(SeverityLevel.NORMAL)
    @Description("generate credential")
    @Test(priority = 2, description = "generate user id and password")
    public void generateCredential() {
        new P01_CredentialPage(driver).enterEmail(email).clickOnSubmit();
        new P01_CredentialPage(driver).getUserId();
        new P01_CredentialPage(driver).getPassword();
        Assert.assertTrue(new P01_CredentialPage(driver).userIdIsDisplayed());
        Assert.assertTrue(new P01_CredentialPage(driver).passwordIsDisplayed());
    }
}
