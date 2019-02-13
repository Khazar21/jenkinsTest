package com.briteERP.tests.functionalTests.invoicing.reporting;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JournalsAudit extends TestBase {

    @Test
    public void PrintJournalsAudit(){
        extentLogger = report.createTest("Testing- Print Journals Audit between selected dates");

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
        extentLogger.info("Going to the Journals Audit");
        pages.invoicingPage.journalsAudit.click();
        extentLogger.info("Entering a start date for Journals Audit");
        pages.invoicingPage.startDateInJournalAudit.sendKeys("01/01/2019");
        extentLogger.info("Entering a end date for Journals Audit");
        pages.invoicingPage.endDateInJournalAudit.sendKeys("02/06/2019");
        extentLogger.info("Clicking print button");
        pages.invoicingPage.printInJournalAudit.click();
        extentLogger.info("Verifying- print button is displayed for printing");
        Assert.assertTrue(pages.invoicingPage.lastPrintInJournalAudit.isDisplayed());
        extentLogger.info("PASSED- Journals Audit printed");
    }

    @Test
    public void PrintJournalsAuditBasedOnDateAndAllEntries(){
        extentLogger = report.createTest("Testing- Print Journals Audit between selected dates based on date and all entries");

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
        extentLogger.info("Going to the Journals Audit");
        pages.invoicingPage.journalsAudit.click();
        extentLogger.info("Clicking All Entries button at Target Moves");
        pages.invoicingPage.allEntriesInJournalAudit.click();
        extentLogger.info("Clicking Date button at Entries Sorted by");
        pages.invoicingPage.dateInJournalAudit.click();
        extentLogger.info("Entering a start date for Journals Audit");
        pages.invoicingPage.startDateInJournalAudit.sendKeys("01/01/2019");
        extentLogger.info("Entering a end date for Journals Audit");
        pages.invoicingPage.endDateInJournalAudit.sendKeys("02/06/2019");
        extentLogger.info("Clicking print button");
        pages.invoicingPage.printInJournalAudit.click();
        extentLogger.info("Verifying- print button is displayed for printing");
        Assert.assertTrue(pages.invoicingPage.lastPrintInJournalAudit.isDisplayed());
        extentLogger.info("PASSED- Journals Audit printed");
    }

}
