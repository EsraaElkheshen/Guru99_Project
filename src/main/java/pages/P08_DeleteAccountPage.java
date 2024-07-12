package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P08_DeleteAccountPage {

   WebDriver driver;
    public static String customerId;
    public P08_DeleteAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By DELETE_ACCOUNT_MSG= By.xpath("//p[text()='Delete Account Form']");
    private final By DELETE_ACCOUNT = By.xpath("//a[normalize-space()='Delete Account']");
    private final By ACCOUNT_NO = By.xpath("//input[@name='accountno']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyDeleteAccountForm(String msg){
        return driver.findElement(this.DELETE_ACCOUNT_MSG).getText().contains(msg);
    }
    public P08_DeleteAccountPage deleteAccount() {
        new PageBase(driver).scrollIntoView(this.DELETE_ACCOUNT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.DELETE_ACCOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.DELETE_ACCOUNT).click();
        return this;
    }

    public P08_DeleteAccountPage enterAccountId(String accountNo) {
        new PageBase(driver).scrollIntoView(this.ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ACCOUNT_NO).sendKeys(accountNo);
        return this;
    }




    public P08_DeleteAccountPage clickSubmitButton() {
        new PageBase(driver).scrollIntoView(this.SUBMIT_BTN);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.SUBMIT_BTN));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.SUBMIT_BTN).click();
        return this;
    }






}
