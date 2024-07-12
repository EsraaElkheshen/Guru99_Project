package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P10_WithdrawalPage {

   WebDriver driver;
    public static String customerId;
    public P10_WithdrawalPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By WITHDRAW_MSG= By.xpath("//p[text()='Amount Withdrawal Form']");
    private final By WITHDRAW = By.xpath("//a[normalize-space()='Withdrawal']");
    private final By ACCOUNT_NO = By.xpath("//input[@name='accountno']");
    private final By AMOUNT = By.xpath("//input[@name='ammount']");
    private final By DESCRIPTION = By.xpath("//input[@name='desc']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");
    private final By MSG = By.xpath(" //tr[1]//td[1]//p");


    public boolean verifyWithdrawalForm(String msg){
        return driver.findElement(this.WITHDRAW_MSG).getText().contains(msg);
    }

    public boolean verifyWithdrawalMsg(String msg){
        return driver.findElement(this.MSG).getText().contains(msg);
    }

    public P10_WithdrawalPage Withdrawal() {
        new PageBase(driver).scrollIntoView(this.WITHDRAW);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.WITHDRAW));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.WITHDRAW).click();
        return this;
    }

    public P10_WithdrawalPage enterAccountNo(String accountNo) {
        new PageBase(driver).scrollIntoView(this.ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ACCOUNT_NO).sendKeys(accountNo);
        return this;
    }

    public P10_WithdrawalPage enterAmount(String amount) {
        new PageBase(driver).scrollIntoView(this.AMOUNT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.AMOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.AMOUNT).sendKeys(amount);
        return this;
    }

    public P10_WithdrawalPage enterDescription(String description) {
        new PageBase(driver).scrollIntoView(this.DESCRIPTION);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.DESCRIPTION));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.DESCRIPTION).sendKeys(description);
        return this;
    }

    public P10_WithdrawalPage clickSubmitButton() {
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
