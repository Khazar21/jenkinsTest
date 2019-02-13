package com.briteERP.tests.functionalTests.invoicing.sales.documents;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerInvoices extends TestBase {


    @Test
    public void searchBoxDefault() {
        extentLogger = report.createTest("Testing- Search...is displayed by default");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Verifying- Search... is displayed by default");
        Assert.assertEquals(pages.invoicingPage.searchInput.getAttribute("placeholder"), "Search...");
        extentLogger.info("PASSED- Search... is displayed by default");
    }
    @Test
    public void invoicesListingAsList() {
        extentLogger = report.createTest("Testing- Invoices are listed as list format by default");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Verifying- list button are selected by default");
        Assert.assertTrue(pages.invoicingPage.listView.getAttribute("class").contains("active"));
        extentLogger.info("PASSED- - List Format Button Is Selected");
    }
    @Test
    public void invoicesListingAsKanban() {
        extentLogger = report.createTest("Testing- Invoices are listed as kanban");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("clicking on to kanbanView button");
        pages.invoicingPage.kanbanView.click();
        extentLogger.info("Verifying- kanban button are selected");
        BrowserUtilities.waitForAttributeToContain(pages.invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(pages.invoicingPage.kanbanView.getAttribute("class").contains("active"));
        extentLogger.info("PASSED- - Kanban Format Button Is Selected");
    }
    @Test
    public void invoicesListingInCalendar() {
        extentLogger = report.createTest("Testing- Invoices are listed in calendar");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("clicking on to calendarView button");
        pages.invoicingPage.calendarView.click();
        extentLogger.info("Verifying- calendar button are selected");
        BrowserUtilities.waitForAttributeToContain(pages.invoicingPage.calendarView, "class", "active");
        Assert.assertTrue(pages.invoicingPage.calendarView.getAttribute("class").contains("active"));
        extentLogger.info("PASSED- Calendar Format Button Is Selected");
    }
}