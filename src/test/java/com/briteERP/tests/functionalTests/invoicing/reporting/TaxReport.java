package com.briteERP.tests.functionalTests.invoicing.reporting;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaxReport extends TestBase {
    @Test
    public void PrintTaxReports(){
        extentLogger = report.createTest("Testing- Printing Tax Reports between selected dates");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to the PDF Reports");
        pages.invoicingPage.pdfReports.click();
        extentLogger.info("Going to the Aged Partner Balance");
        pages.invoicingPage.taxReport.click();
        extentLogger.info("Entering a start date for Tax Reports");
        pages.invoicingPage.startDateInJournalAudit.sendKeys("07/25/2016");
        extentLogger.info("Entering a end date for Tax Reports");
        pages.invoicingPage.endDateInJournalAudit.sendKeys("02/06/2019");
        extentLogger.info("Clicking print button");
        pages.invoicingPage.printInJournalAudit.click();
        extentLogger.info("Verifying- print button is displayed for printing");
        Assert.assertTrue(pages.invoicingPage.lastPrintInJournalAudit.isDisplayed());
        extentLogger.info("PASSED- Tax Report Pringtin");
    }

    @Test
    public void CancelButtonOnTaxReports(){
        extentLogger = report.createTest("Testing- Click Cancel button that cancel tax reports");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to the PDF Reports");
        pages.invoicingPage.pdfReports.click();
        extentLogger.info("Going to the Aged Partner Balance");
        pages.invoicingPage.taxReport.click();
        extentLogger.info("Entering a start date for Tax Reports");
        pages.invoicingPage.startDateInJournalAudit.sendKeys("07/25/2016");
        extentLogger.info("Entering a end date for Tax Reports");
        pages.invoicingPage.endDateInJournalAudit.sendKeys("02/06/2019");
        extentLogger.info("Clicking cancel button");
        pages.invoicingPage.cancelButtonOnTaxReports.click();
        extentLogger.info("Verifying- cancel button is clicked");
        Assert.assertTrue(pages.invoicingPage.cancelVerifying.getText().contains("Invoices"));
        extentLogger.info("PASSED- Cancel button is working");
    }
}
