package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P15_CustomizedStatementPage {

   WebDriver driver;
    public static String customerId;
    public P15_CustomizedStatementPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CUSTOMIZED_STATEMENT_MSG= By.xpath("//p[text()='Customized Statement Form']");
    private final By CUSTOMIZED_STATEMENT = By.xpath("//a[normalize-space()='Customised Statement']");
    private final By ACCOUNT_NO = By.xpath("//input[@name='accountno']");
    private final By FROM_DATE = By.xpath("//input[@name='fdate']");
    private final By TO_DATE = By.xpath("//input[@name='tdate']");
    private final By MIN_TRANSACTION_VALUE = By.xpath("//input[@name='amountlowerlimit']");
    private final By NUMBER_TRANSACTION = By.xpath("//input[@name='numtransaction']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyCustomizedStatementForm(String msg){
        return driver.findElement(this.CUSTOMIZED_STATEMENT_MSG).getText().contains(msg);
    }
    public P15_CustomizedStatementPage customizedStatement() {
        new PageBase(driver).scrollIntoView(this.CUSTOMIZED_STATEMENT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CUSTOMIZED_STATEMENT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.CUSTOMIZED_STATEMENT).click();
        return this;
    }

    public P15_CustomizedStatementPage enterAccountNo(String accountNo) {
        new PageBase(driver).scrollIntoView(this.ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ACCOUNT_NO).sendKeys(accountNo);
        return this;
    }

    public P15_CustomizedStatementPage enterFromDate(String date) {
        new PageBase(driver).scrollIntoView(this.FROM_DATE);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.FROM_DATE));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.FROM_DATE).sendKeys(date);
        return this;
    }


    public P15_CustomizedStatementPage enterToDate(String date) {
        new PageBase(driver).scrollIntoView(this.TO_DATE);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.TO_DATE));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.TO_DATE).sendKeys(date);
        return this;
    }

    public P15_CustomizedStatementPage enterMinTransactionValue(String transaction) {
        new PageBase(driver).scrollIntoView(this.MIN_TRANSACTION_VALUE);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.MIN_TRANSACTION_VALUE));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.MIN_TRANSACTION_VALUE).sendKeys(transaction);
        return this;
    }

    public P15_CustomizedStatementPage enterNumberOfTransaction(String transaction) {
        new PageBase(driver).scrollIntoView(this.NUMBER_TRANSACTION);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.NUMBER_TRANSACTION));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.NUMBER_TRANSACTION).sendKeys(transaction);
        return this;
    }

    public P15_CustomizedStatementPage clickSubmitButton() {
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
