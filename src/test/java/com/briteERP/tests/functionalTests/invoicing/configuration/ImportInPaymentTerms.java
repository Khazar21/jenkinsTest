package com.briteERP.tests.functionalTests.invoicing.configuration;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImportInPaymentTerms extends TestBase {
    @Test
    public void importPage(){
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
//        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going to the 'Payment Term' page");
        pages.invoicingPage.paymentTerms.click();

        extentLogger.info("Going to 'Import' button");
        pages.configurationPage.importButton.click();

        extentLogger.info("Displaying text message for loading file");
        Assert.assertTrue(pages.configurationPage.textMsgForLoadFile.isDisplayed());

        extentLogger.info("Displaying text message for 'Help'");
        pages.configurationPage.helpTextMsg.click();

        extentLogger.info("Displaying text in search box as default");
        Assert.assertTrue(pages.configurationPage.textInSearchBox.isDisplayed());

        extentLogger.info("Clicking to 'Cancel' button");
        pages.configurationPage.cancelButton.click();
    }
}
