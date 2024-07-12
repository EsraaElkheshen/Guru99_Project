package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P13_BalanceEnquiryPage {

   WebDriver driver;
    public static String customerId;
    public P13_BalanceEnquiryPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By BALANCE_ENQUIRY_MSG= By.xpath("//p[text()='Balance Enquiry Form']");
    private final By BALANCE_ENQUIRY = By.xpath("//a[normalize-space()='Balance Enquiry']");
    private final By ACCOUNT_NO = By.xpath("//input[@name='accountno']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyBalanceEnquiryForm(String msg){
        return driver.findElement(this.BALANCE_ENQUIRY_MSG).getText().contains(msg);
    }
    public P13_BalanceEnquiryPage BalanceEnquiry() {
        new PageBase(driver).scrollIntoView(this.BALANCE_ENQUIRY);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.BALANCE_ENQUIRY));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.BALANCE_ENQUIRY).click();
        return this;
    }

    public P13_BalanceEnquiryPage enterAccountNo(String accountNo) {
        new PageBase(driver).scrollIntoView(this.ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ACCOUNT_NO).sendKeys(accountNo);
        return this;
    }

    public P13_BalanceEnquiryPage clickSubmitButton() {
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
