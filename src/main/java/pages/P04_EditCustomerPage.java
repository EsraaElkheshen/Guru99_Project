package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P04_EditCustomerPage {

   WebDriver driver;
    public static String customerId;
    public P04_EditCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By editCustomerMsg = By.xpath("//p[text()='Edit Customer Form']");
    private final By EDIT_CUSTOMER = By.xpath("//a[normalize-space()='Edit Customer']");
    private final By CUSTOMER_ID = By.xpath("//input[@name='cusid']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='AccSubmit']");


    public boolean verifyEditCustomerForm(String msg){
        return driver.findElement(this.editCustomerMsg).getText().contains(msg);
    }
    public P04_EditCustomerPage editCustomer() {
        new PageBase(driver).scrollIntoView(this.EDIT_CUSTOMER);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.EDIT_CUSTOMER));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.EDIT_CUSTOMER).click();
        return this;
    }

    public P04_EditCustomerPage enterCustomerId(String customerIdValue) {
        new PageBase(driver).scrollIntoView(this.CUSTOMER_ID);
        driver.findElement(this.CUSTOMER_ID).sendKeys(customerIdValue);
        return this;
    }

    public P04_EditCustomerPage clickSubmitButton() {
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
