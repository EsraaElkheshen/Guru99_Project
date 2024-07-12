package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P09_DepoistPage {

   WebDriver driver;
    public static String customerId;
    public P09_DepoistPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By DEPOSIT_MSG= By.xpath("//p[text()='Amount Deposit Form']");
    private final By DEPOSIT = By.xpath("//a[normalize-space()='Deposit']");
    private final By ACCOUNT_NO = By.xpath("//input[@name='accountno']");
    private final By AMOUNT = By.xpath("//input[@name='ammount']");
    private final By DESCRIPTION = By.xpath("//input[@name='desc']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyDepositForm(String msg){
        return driver.findElement(this.DEPOSIT_MSG).getText().contains(msg);
    }

    public P09_DepoistPage deposit() {
        new PageBase(driver).scrollIntoView(this.DEPOSIT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.DEPOSIT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.DEPOSIT).click();
        return this;
    }

    public P09_DepoistPage enterAccountNo(String accountNo) {
        new PageBase(driver).scrollIntoView(this.ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ACCOUNT_NO).sendKeys(accountNo);
        return this;
    }

    public P09_DepoistPage enterAmount(String amount) {
        new PageBase(driver).scrollIntoView(this.AMOUNT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.AMOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.AMOUNT).sendKeys(amount);
        return this;
    }

    public P09_DepoistPage enterDescription(String description) {
        new PageBase(driver).scrollIntoView(this.DESCRIPTION);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.DESCRIPTION));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.DESCRIPTION).sendKeys(description);
        return this;
    }

    public P09_DepoistPage clickSubmitButton() {
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
