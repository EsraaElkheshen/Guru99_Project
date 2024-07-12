package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P03_NewCustomerPage;
import pages.PageBase;

import static util.Utility.*;

@Epic("Check Create New Customer")
public class TC03_CreateNewCustomer extends TestBase {



    static String customerName = generateRandomFirstName()+" "+generateRandomFirstName();
    static String dateOfBirth = generateRandomBirthDate(faker, 19, 64); // Generate a random birthdate
    static String address = String.valueOf(faker.address().streetAddress());
    static String city = String.valueOf(faker.address().city());
    static String state = String.valueOf(faker.address().state());
    static String pin = String.valueOf(faker.number().numberBetween(100000, 999999));
    static String mobileNumber = faker.regexify("[0-9]{10}");
    static String email = generateRandomEmailAddress();
    static String secondCustomerName = generateRandomFirstName();
    static String secondDateOfBirth = generateRandomBirthDate(faker, 20, 65); // Generate a random birthdate
    static String secondEmail = generateRandomSecondEmailAddress();
    static String password = "P@ssw0rd";

    // create new customer
    @Story("New Customer")
    @Severity(SeverityLevel.NORMAL)
    @Description("New Customer")
    @Test(priority = 1, description = "create new customer")
    public void createNewCustomer() {
        new P03_NewCustomerPage(driver).createNewCustomer();
        new P03_NewCustomerPage(driver).verifyNewCustomerPage("Add New Customer");
        new P03_NewCustomerPage(driver).enterCustomerName(customerName).
                enterDateOfBirth(dateOfBirth).enterAddress(address).enterCity(city).enterState(state).enterPin(pin).
                enterMobile(mobileNumber).enterEmail(email).enterPassword(password)
                .clickOnSubmit();
        Assert.assertTrue(new P03_NewCustomerPage(driver).verifySuccessMessage("Customer Registered Successfully!!!"));
    }

    @Story("Second New Customer")
    @Severity(SeverityLevel.NORMAL)
    @Description("Second New Customer")
    @Test(priority = 2, description = "create second new customer")
    public void createSecondNewCustomer() {
        new P03_NewCustomerPage(driver).createNewCustomer();
        new P03_NewCustomerPage(driver).verifyNewCustomerPage("Add New Customer");
        new P03_NewCustomerPage(driver).enterCustomerName(secondCustomerName).
                enterDateOfBirth(secondDateOfBirth).enterAddress(address).enterCity(city).enterState(state).enterPin(pin).
                enterMobile(mobileNumber).enterEmail(secondEmail).enterPassword(password)
                .clickOnSubmit();
        Assert.assertTrue(new P03_NewCustomerPage(driver).verifySuccessMessage("Customer Registered Successfully!!!"));
    }

    @Story("save Customer Id")
    @Severity(SeverityLevel.NORMAL)
    @Description("save Customer Id")
    @Test(priority = 3, description = "save customer id")
    public void saveCustomerId() {
        new P03_NewCustomerPage(driver).getCustomerId();
    }

    @Story("save Second Customer Id")
    @Severity(SeverityLevel.NORMAL)
    @Description("save Second Customer Id")
    @Test(priority = 4, description = "save second customer id")
    public void saveSecondCustomerId() {
        new P03_NewCustomerPage(driver).getSecondCustomerId();
    }

    @Story("return Home Pge")
    @Severity(SeverityLevel.NORMAL)
    @Description("Return Home Page")
    @Test(priority = 5, description = "return home page")
    public void returnHomePage() {
        new PageBase(driver).returnHomePage();
    }


 }