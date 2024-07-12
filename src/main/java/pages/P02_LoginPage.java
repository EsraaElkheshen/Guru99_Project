package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.shortWait;
import static org.junit.Assert.fail;

public class P02_LoginPage {

    WebDriver driver;

    public P02_LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    private final By USER_ID = By.xpath("//input[@name='uid']");
    private final By PASSWORD = By.xpath("//input[@name='password']");
    private final By LOGIN_BTN = By.xpath("//input[@name='btnLogin']");
    private final By USER_ID_TEXT = By.xpath("//*[text()='UserID']");
    private final By PASSWORD_TEXT = By.xpath("//*[text()='Password']");


    public P02_LoginPage enterUserId(String value) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.USER_ID));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.USER_ID).
                sendKeys(value);
        return this;
    }

    public P02_LoginPage enterPassword(String value) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.PASSWORD));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.PASSWORD).
                sendKeys(value);
        return this;
    }

    public P02_LoginPage clickLoginButton() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.LOGIN_BTN));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.LOGIN_BTN).click();
        return this;
    }

    public boolean verifyWelcomeMessage(String message){
        return driver.getPageSource().contains(message);
    }

    public boolean verifyUserIdIsDisplay(){
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.USER_ID));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        return driver.findElement(this.USER_ID).isDisplayed();
    }

    public boolean verifyPasswordIsDisplay(){
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.PASSWORD));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        return driver.findElement(this.PASSWORD).isDisplayed();
    }

}
