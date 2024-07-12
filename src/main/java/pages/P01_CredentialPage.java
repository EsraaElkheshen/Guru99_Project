package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P01_CredentialPage {

    WebDriver driver;

    public P01_CredentialPage(WebDriver driver) {

        this.driver = driver;
    }

    public static String userId;
    public static String password;

    private final By HERE = By.xpath("//a[contains(text(),'here')]");
    private final By EMAIL = By.xpath("//input[@name='emailid']");
    private final By SUBMIT_BTN = By.xpath("//input[@name='btnLogin']");
    private final By USER_ID_TEXT = By.xpath("//tr[4]/td[2]");
    private final By PASSWORD_TEXT = By.xpath("//tr[5]/td[2]");

    public P01_CredentialPage openLink() {
        new PageBase(driver).scrollIntoView(this.HERE);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.HERE));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.HERE).click();
        return this;
    }

    public P01_CredentialPage enterEmail(String email) {
        new PageBase(driver).scrollIntoView(this.EMAIL);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.EMAIL));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.EMAIL).sendKeys(email);
        return this;
    }

    public P01_CredentialPage clickOnSubmit() {
        new PageBase(driver).scrollIntoView(this.SUBMIT_BTN);
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.SUBMIT_BTN));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.SUBMIT_BTN).click();
        System.out.println(" UserId : " + driver.findElement(this.USER_ID_TEXT).getText().replaceAll("\\s+", ""));
        System.out.println(" Password : " + driver.findElement(this.PASSWORD_TEXT).getText().replaceAll("\\s+", ""));
        return this;
    }

    public P01_CredentialPage getUserId(){
        userId = driver.findElement(this.USER_ID_TEXT).getText().replaceAll("\\s+", "");
        System.out.println(userId);
        return this;
    }

    public P01_CredentialPage getPassword(){
         password = driver.findElement(this.PASSWORD_TEXT).getText().replaceAll("\\s+", "");
        System.out.println(password);
         return this;
    }

    public boolean userIdIsDisplayed(){
        return driver.findElement(USER_ID_TEXT).isDisplayed();
    }

    public boolean passwordIsDisplayed(){
        return driver.findElement(PASSWORD_TEXT).isDisplayed();
    }

}
