package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P05_DeleteCustomerPage {

   WebDriver driver;
    public static String customerId;
    public P05_DeleteCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By DELETE_Customer_MSG = By.xpath("//p[text()='Delete Customer Form']");
    private final By DELETE_CUSTOMER = By.xpath("//a[normalize-space()='Delete Customer']");
    private final By CUSTOMER_ID = By.xpath("//input[@name='cusid']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyDeleteCustomerForm(String msg){
        return driver.findElement(this.DELETE_Customer_MSG).getText().contains(msg);
    }
    public P05_DeleteCustomerPage deleteCustomer() {
        new PageBase(driver).scrollIntoView(this.DELETE_CUSTOMER);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.DELETE_CUSTOMER));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.DELETE_CUSTOMER).click();
        return this;
    }

    public P05_DeleteCustomerPage enterCustomerId(String customerIdValue) {
        new PageBase(driver).scrollIntoView(this.CUSTOMER_ID);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CUSTOMER_ID));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.CUSTOMER_ID).sendKeys(customerIdValue);
        return this;
    }

    public P05_DeleteCustomerPage clickSubmitButton() {
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
