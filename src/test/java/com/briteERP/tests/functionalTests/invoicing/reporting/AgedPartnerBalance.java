package com.briteERP.tests.functionalTests.invoicing.reporting;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgedPartnerBalance extends TestBase {

    @Test
    public void PrintAgedPartnerBalance(){
        extentLogger = report.createTest("Testing- Print Aged Partner Balance for selected date and period length(Days)");

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
        extentLogger.info("Going to the Tax REports");
        pages.invoicingPage.agedPartnerBalance.click();
        extentLogger.info("Entering a start date for Aged Partner Balance");
        pages.invoicingPage.startDateInJournalAudit.sendKeys("09/01/2018");
        extentLogger.info("Clicking print button");
        pages.invoicingPage.printInJournalAudit.click();
        extentLogger.info("Verifying- print button is displayed for printing");
        Assert.assertTrue(pages.invoicingPage.lastPrintInJournalAudit.isDisplayed());
        extentLogger.info("PASSED- Aged Partner Balance");
    }

    @Test
    public void PrintAgedPartnerBalanceWithSelectedPeriodLength(){
        extentLogger = report.createTest("Testing- Print Aged Partner Balance for selected date and period length(Days)");

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
        pages.invoicingPage.agedPartnerBalance.click();
        extentLogger.info("Entering a start date for Aged Partner Balance");
        pages.invoicingPage.startDateInJournalAudit.sendKeys("09/01/2018");
        extentLogger.info("Deleting default Period Length(Days)");
        pages.invoicingPage.periodLengtDaysInAgedPartner.clear();
        extentLogger.info("Entering specific period for Period Length(Days)");
        pages.invoicingPage.periodLengtDaysInAgedPartner.sendKeys("67");
        extentLogger.info("Clicking print button");
        pages.invoicingPage.printInJournalAudit.click();
        extentLogger.info("Verifying- print button is displayed for printing");
        Assert.assertTrue(pages.invoicingPage.lastPrintInJournalAudit.isDisplayed());
        extentLogger.info("PASSED- Aged Partner Balance");
    }
}
