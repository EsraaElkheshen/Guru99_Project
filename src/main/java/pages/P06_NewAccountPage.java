package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P06_NewAccountPage {

   WebDriver driver;
    public static String accountId;
    public static String customerId;
    public static String accountType;
    public static String dateOfOpening;
    public static String currentAmount;

    public static String secondAccountId;
    public static String secondCustomerId;
    public static String secondAccountType;
    public static String secondDateOfOpening;
    public static String secondCurrentAmount;
    public P06_NewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By NEW_ACCOUNT_MSG= By.xpath("//p[text()='Add new account form']");
    private final By NEW_ACCOUNT = By.xpath("//a[normalize-space()='New Account']");
    private final By CUSTOMER_ID = By.xpath("//input[@name='cusid']");
    private final By INITIAL_DEPOSIT = By.xpath("//input[@name='inideposit']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='button2']");
    private final By Success_Msg = By.xpath("//*[text()='Account Generated Successfully!!!']");
    private final By ACCOUNT_ID_TEXT = By.xpath("//tbody//tr[4]//td[2]");
    private final By CUSTOMER_ID_TEXT = By.xpath("//tbody//tr[5]//td[2]");
    private final By ACCOUNT_TYPE = By.xpath("//tbody//tr[8]//td[2]");
    private final By DATE_OF_OPENING = By.xpath("//tbody//tr[9]//td[2]");
    private final By CURRENT_AMOUNT = By.xpath("//tbody//tr[10]//td[2]");


    public P06_NewAccountPage getAccountId(){
        accountId = driver.findElement(this.ACCOUNT_ID_TEXT).getText().replaceAll("\\s", "");
        System.out.println("account_Id : " + accountId);
        return this;
    }

    public P06_NewAccountPage getCustomerId(){
        customerId = driver.findElement(this.CUSTOMER_ID_TEXT).getText().replaceAll("\\s", "");
        System.out.println("customer_Id : " + customerId);
        return this;
    }

    public P06_NewAccountPage getAccountType(){
        accountType = driver.findElement(this.ACCOUNT_TYPE).getText().replaceAll("\\s", "");
        System.out.println("account_Type : " + accountType);
        return this;
    }

    public P06_NewAccountPage getDateOfOpening(){
        dateOfOpening = driver.findElement(this.DATE_OF_OPENING).getText().replaceAll("\\s", "");
        System.out.println("dateOfOpening : " + dateOfOpening);
        return this;
    }

    public P06_NewAccountPage getCurrentAmount(){
        currentAmount = driver.findElement(this.CURRENT_AMOUNT).getText().replaceAll("\\s", "");
        System.out.println("currentAmount : " + currentAmount);
        return this;
    }


    public P06_NewAccountPage getSecondAccountId(){
        secondAccountId = driver.findElement(this.ACCOUNT_ID_TEXT).getText().replaceAll("\\s", "");
        System.out.println("second_account_Id : " + secondAccountId);
        return this;
    }

    public P06_NewAccountPage getSecondCustomerId(){
        secondCustomerId = driver.findElement(this.CUSTOMER_ID_TEXT).getText().replaceAll("\\s", "");
        System.out.println("second_customer_Id : " + secondCustomerId);
        return this;
    }

    public P06_NewAccountPage getSecondAccountType(){
        secondAccountType = driver.findElement(this.ACCOUNT_TYPE).getText().replaceAll("\\s", "");
        System.out.println("second_account_Type : " + secondAccountType);
        return this;
    }

    public P06_NewAccountPage getSecondDateOfOpening(){
        secondDateOfOpening = driver.findElement(this.DATE_OF_OPENING).getText().replaceAll("\\s", "");
        System.out.println("second_dateOfOpening : " + secondDateOfOpening);
        return this;
    }

    public P06_NewAccountPage getSecondCurrentAmount(){
        secondCurrentAmount = driver.findElement(this.CURRENT_AMOUNT).getText().replaceAll("\\s", "");
        System.out.println("second_currentAmount : " + secondCurrentAmount);
        return this;
    }

    public boolean verifyNewAccountCreatedSuccessfully(String msg){
        return driver.findElement(this.Success_Msg).getText().contains(msg);
    }

    public boolean verifyNewAccountForm(String msg){
        return driver.findElement(this.NEW_ACCOUNT_MSG).getText().contains(msg);
    }
    public P06_NewAccountPage addNewAccount() {
        new PageBase(driver).scrollIntoView(this.NEW_ACCOUNT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.NEW_ACCOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.NEW_ACCOUNT).click();
        return this;
    }

    public P06_NewAccountPage enterCustomerId(String customerIdValue) {
        new PageBase(driver).scrollIntoView(this.CUSTOMER_ID);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CUSTOMER_ID));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.CUSTOMER_ID).sendKeys(customerIdValue);
        return this;
    }

    public P06_NewAccountPage enterInitialDeposit(String deposit) {
        new PageBase(driver).scrollIntoView(this.INITIAL_DEPOSIT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.INITIAL_DEPOSIT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.INITIAL_DEPOSIT).sendKeys(deposit);
        return this;
    }

    public P06_NewAccountPage clickSubmitButton() {
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
