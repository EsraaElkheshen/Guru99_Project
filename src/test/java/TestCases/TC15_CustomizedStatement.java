package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P15_CustomizedStatementPage;
import util.Utility;

import static pages.P06_NewAccountPage.accountId;
import static util.Utility.*;

@Epic("Check customized Screen")
public class TC15_CustomizedStatement extends TestBase {

    static String from_date  = formattedDate;
    static String to_date = formattedDate;
    static String transaction = "1234567";
    static String transaction_Number = "44894489";

    // customized Statement
    @Story("customizedStatement")
    @Severity(SeverityLevel.NORMAL)
    @Description("customizedStatement")
    @Test(priority = 1, description = "customizedStatement")
    public void customizedStatement() {
        new P15_CustomizedStatementPage(driver).customizedStatement();
        Assert.assertTrue(new P15_CustomizedStatementPage(driver).
                verifyCustomizedStatementForm("Customized Statement Form"));
        new P15_CustomizedStatementPage(driver).enterAccountNo(accountId).
                enterFromDate(from_date).enterToDate(to_date).enterMinTransactionValue(transaction).
                enterNumberOfTransaction(transaction_Number).clickSubmitButton();
    }

}