package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P16_LogoutPage {

   WebDriver driver;
    public static String customerId;
    public P16_LogoutPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By LOGOUT = By.xpath("//a[normalize-space()='Log out']");


    public P16_LogoutPage clickOnLogOut() {
        new PageBase(driver).scrollIntoView(this.LOGOUT);
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.LOGOUT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.LOGOUT).click();
        return this;
    }

}
