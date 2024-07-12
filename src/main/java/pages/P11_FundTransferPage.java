package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P11_FundTransferPage {

   WebDriver driver;
    public static String customerId;
    public P11_FundTransferPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By FUND_TRANSFER_MSG= By.xpath("//p[text()='Fund transfer']");
    private final By FUND_TRANSFER = By.xpath("//a[normalize-space()='Fund Transfer']");
    private final By PAYERS_ACCOUNT_NO = By.xpath("//input[@name='payersaccount']");
    private final By PAYEES_ACCOUNT_NO = By.xpath("//input[@name='payeeaccount']");
    private final By AMOUNT = By.xpath("//input[@name='ammount']");
    private final By DESCRIPTION = By.xpath("//input[@name='desc']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");
    private final By FUND_TRANSFER_DETAILS = By.xpath("//p[text()='Fund Transfer Details']");

    public boolean verifyFundTransferDetails(String parameterName, String parameterValue, String value){
        System.out.println(driver.findElement(By.xpath("//td[normalize-space()='"+parameterName+"']")).getText()+" "+driver.findElement(By.xpath("//td[normalize-space()='"+parameterValue+"']")).getText());
        return driver.findElement(By.xpath("//td[normalize-space()='"+parameterValue+"']")).getText().replaceAll("\\s", "").contains(value);
    }
    public boolean verifyFundTransferForm(String msg){
        return driver.findElement(this.FUND_TRANSFER_MSG).getText().contains(msg);
    }

    public boolean verifyFundTransfer(String msg){
        return driver.findElement(this.FUND_TRANSFER_DETAILS).getText().contains(msg);
    }

    public P11_FundTransferPage fundTransfer() {
        new PageBase(driver).scrollIntoView(this.FUND_TRANSFER);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.FUND_TRANSFER));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.FUND_TRANSFER).click();
        return this;
    }

    public P11_FundTransferPage enterPayersAccountNo(String payersAccountNo) {
        new PageBase(driver).scrollIntoView(this.PAYERS_ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.PAYERS_ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.PAYERS_ACCOUNT_NO).sendKeys(payersAccountNo);
        return this;
    }

    public P11_FundTransferPage enterPayeesAccountNo(String payeesAccountNo) {
        new PageBase(driver).scrollIntoView(this.PAYEES_ACCOUNT_NO);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.PAYEES_ACCOUNT_NO));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.PAYEES_ACCOUNT_NO).sendKeys(payeesAccountNo);
        return this;
    }

    public P11_FundTransferPage enterAmount(String amount) {
        new PageBase(driver).scrollIntoView(this.AMOUNT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.AMOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.AMOUNT).sendKeys(amount);
        return this;
    }

    public P11_FundTransferPage enterDescription(String description) {
        new PageBase(driver).scrollIntoView(this.DESCRIPTION);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.DESCRIPTION));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.DESCRIPTION).sendKeys(description);
        return this;
    }

    public P11_FundTransferPage clickSubmitButton() {
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
