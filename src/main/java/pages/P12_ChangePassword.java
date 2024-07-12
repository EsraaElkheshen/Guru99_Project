package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P12_ChangePassword {

   WebDriver driver;
    public static String customerId;
    public P12_ChangePassword(WebDriver driver) {
        this.driver = driver;
    }

    private final By CHANGE_PASSWORD_MSG= By.xpath("//p[text()='Change Password']");
    private final By CHANGE_PASSWORD= By.xpath("//a[normalize-space()='Change Password']");
    private final By OLD_PASSWORD = By.xpath("//input[@name='oldpassword']");
    private final By NEW_PASSWORD = By.xpath("//input[@name='newpassword']");
    private final By CONFIRM_PASSWORD = By.xpath("//input[@name='confirmpassword']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='sub']");


    public boolean verifyChangePasswordForm(String msg){
        return driver.findElement(this.CHANGE_PASSWORD_MSG).getText().contains(msg);
    }

    public P12_ChangePassword changePassword() {
        new PageBase(driver).scrollIntoView(this.CHANGE_PASSWORD);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CHANGE_PASSWORD));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.CHANGE_PASSWORD).click();
        return this;
    }

    public P12_ChangePassword enterOldPassword(String oldPassword) {
        new PageBase(driver).scrollIntoView(this.OLD_PASSWORD);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.OLD_PASSWORD));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.OLD_PASSWORD).sendKeys(oldPassword);
        return this;
    }

    public P12_ChangePassword enterNewPassword(String newPassword) {
        new PageBase(driver).scrollIntoView(this.NEW_PASSWORD);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.NEW_PASSWORD));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.NEW_PASSWORD).sendKeys(newPassword);
        return this;
    }

    public P12_ChangePassword enterConfirmPassword(String confirmPassword) {
        new PageBase(driver).scrollIntoView(this.CONFIRM_PASSWORD);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CONFIRM_PASSWORD));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.CONFIRM_PASSWORD).sendKeys(confirmPassword);
        return this;
    }

    public P12_ChangePassword clickSubmitButton() {
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
