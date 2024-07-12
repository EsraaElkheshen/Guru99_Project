package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P03_NewCustomerPage {

   WebDriver driver;
    public static String customerId;
    public static String secondCustomerId;
    public P03_NewCustomerPage(WebDriver driver) {

        this.driver = driver;
    }

    private final By NEW_CUSTOMER = By.xpath("//a[normalize-space()='New Customer']");
    private final By NEW_CUSTOMER_MSG = By.xpath("//p[text()='Add New Customer']");
    private final By CUSTOMER_NAME = By.xpath("//input[@name='name']");
    private final By DATE_OF_BIRTH = By.xpath("//input[@id='dob']");
    private final By ADDRESS = By.xpath("//textarea[@name='addr']");
    private final By CITY = By.xpath("//input[@name='city']");
    private final By STATE = By.xpath("//input[@name='state']");
    private final By PIN = By.xpath("//input[@name='pinno']");
    private final By MOBILE_NUMBER = By.xpath("//input[@name='telephoneno']");
    private final By EMAIL = By.xpath("//input[@name='emailid']");
    private final By PASSWORD = By.xpath("//input[@name='password']");
    private final By SUBMIT = By.xpath("//input[@name='sub']");
    private final By SUCCESS_MSG = By.xpath("//tr[1]//td[1]/p[text()='Customer Registered Successfully!!!']");
    private final By CUSTOMER_ID = By.xpath("//tr[4]//td[2]");

    public P03_NewCustomerPage getCustomerId() {
        customerId = driver.findElement(this.CUSTOMER_ID).getText().replaceAll("\\s", "");
        System.out.println("customerId : " + customerId);
        return this;
    }

    public P03_NewCustomerPage getSecondCustomerId() {
        secondCustomerId = driver.findElement(this.CUSTOMER_ID).getText().replaceAll("\\s", "");
        System.out.println("customerId : " + secondCustomerId);
        return this;
    }

    public boolean verifySuccessMessage(String msg){
       return driver.findElement(this.SUCCESS_MSG).getText().contains(msg);
    }

    public boolean verifyNewCustomerPage(String msg){
        return driver.findElement(this.NEW_CUSTOMER_MSG).getText().contains(msg);
    }
    public P03_NewCustomerPage createNewCustomer() {
        new PageBase(driver).scrollIntoView(this.NEW_CUSTOMER);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.NEW_CUSTOMER));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.NEW_CUSTOMER).click();
        return this;
    }

    public P03_NewCustomerPage enterCustomerName(String name) {
        new PageBase(driver).scrollIntoView(this.CUSTOMER_NAME);
        driver.findElement(this.CUSTOMER_NAME).sendKeys(name);
        return this;
    }

    public P03_NewCustomerPage enterDateOfBirth(String birthDate) {
        new PageBase(driver).scrollIntoView(this.DATE_OF_BIRTH);
        driver.findElement(this.DATE_OF_BIRTH).sendKeys(birthDate);
        return this;
    }

    public P03_NewCustomerPage enterAddress(String address) {
        new PageBase(driver).scrollIntoView(this.ADDRESS);
        driver.findElement(this.ADDRESS).sendKeys(address);
        return this;
    }

    public P03_NewCustomerPage enterState(String state) {
        new PageBase(driver).scrollIntoView(this.STATE);
        driver.findElement(this.STATE).sendKeys(state);
        return this;
    }

    public P03_NewCustomerPage enterCity(String city) {
        new PageBase(driver).scrollIntoView(this.CITY);
        driver.findElement(this.CITY).sendKeys(city);
        return this;
    }

    public P03_NewCustomerPage enterPin(String pin) {
        new PageBase(driver).scrollIntoView(this.PIN);
        driver.findElement(this.PIN).sendKeys(pin);
        return this;
    }

    public P03_NewCustomerPage enterMobile(String mobile) {
        new PageBase(driver).scrollIntoView(this.MOBILE_NUMBER);
        driver.findElement(this.MOBILE_NUMBER).sendKeys(mobile);
        return this;
    }

    public P03_NewCustomerPage enterEmail(String email) {
        new PageBase(driver).scrollIntoView(this.EMAIL);
        driver.findElement(this.EMAIL).sendKeys(email);
        return this;
    }

    public P03_NewCustomerPage enterPassword(String password) {
        new PageBase(driver).scrollIntoView(this.PASSWORD);
        driver.findElement(this.PASSWORD).sendKeys(password);
        return this;
    }

    public P03_NewCustomerPage clickOnSubmit() {
        new PageBase(driver).scrollIntoView(this.SUBMIT);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.SUBMIT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.SUBMIT).click();
        return this;
    }

}
