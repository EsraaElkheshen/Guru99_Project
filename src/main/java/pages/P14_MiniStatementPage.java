package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P14_MiniStatementPage {

   WebDriver driver;
    public static String customerId;
    public P14_MiniStatementPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By MINI_STATEMENT_MSG= By.xpath("//p[text()='Mini Statement Form']");
    private final By MINI_STATEMENT = By.xpath("//a[normalize-space()='Mini Statement']");
    private final By ACCOUNT_NO = By.xpath("//input[@name='accountno']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyMiniStatementForm(String msg){
        return driver.findElement(this.MINI_STATEMENT_MSG).getText().contains(msg);
    }
    public P14_MiniStatementPage miniStatement() {
        new PageBase(driver).scrollIntoView(this.MINI_STATEMENT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.MINI_STATEMENT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.MINI_STATEMENT).click();
        return this;
    }

    public P14_MiniStatementPage enterAccountNo(String accountNo) {
        new PageBase(driver).scrollIntoView(this.ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ACCOUNT_NO).sendKeys(accountNo);
        return this;
    }

    public P14_MiniStatementPage clickSubmitButton() {
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
