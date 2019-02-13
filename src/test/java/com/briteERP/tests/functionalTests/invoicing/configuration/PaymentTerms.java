package com.briteERP.tests.functionalTests.invoicing.configuration;


import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class PaymentTerms extends TestBase {
    @Test
    public void paymentTerm() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going to the 'Payment Term' page");
        pages.invoicingPage.paymentTerms.click();

        extentLogger.info("Clicking to 'Import' button");
        pages.configurationPage.importButton.click();

        String path = "C:\\Users\\Toshiba\\Desktop\\delete.xlsx";
        Thread.sleep(2000);
        pages.configurationPage.loadFile.sendKeys(path);



    }
}
