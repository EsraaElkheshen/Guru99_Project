package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P07_EditAccountPage {

   WebDriver driver;
    public static String customerId;
    public P07_EditAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By EDIT_ACCOUNT_MSG= By.xpath("//p[text()='Edit Account Form']");
    private final By EDIT_ACCOUNT = By.xpath("//a[normalize-space()='Edit Account']");
    private final By ACCOUNT_NO = By.xpath("//input[@name='accountno']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyEditAccountForm(String msg){
        return driver.findElement(this.EDIT_ACCOUNT_MSG).getText().contains(msg);
    }
    public P07_EditAccountPage editAccount() {
        new PageBase(driver).scrollIntoView(this.EDIT_ACCOUNT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.EDIT_ACCOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.EDIT_ACCOUNT).click();
        return this;
    }

    public P07_EditAccountPage enterAccountId(String accountNo) {
        new PageBase(driver).scrollIntoView(this.ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ACCOUNT_NO).sendKeys(accountNo);
        return this;
    }




    public P07_EditAccountPage clickSubmitButton() {
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
