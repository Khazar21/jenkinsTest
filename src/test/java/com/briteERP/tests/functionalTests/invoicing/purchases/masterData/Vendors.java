package com.briteERP.tests.functionalTests.invoicing.purchases.masterData;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vendors extends TestBase {
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

        extentLogger.info("click on Master Data");
        pages.invoicingPage.purchasesMasterData.click();

        extentLogger.info("click on Vendors");
        pages.invoicingPage.vendors.click();

        extentLogger.info("Verifying- Search... is displayed by default");
        Assert.assertEquals(pages.invoicingPage.searchInput.getAttribute("placeholder"), "Search...");
        extentLogger.info("PASSED- Search... is displayed by default");

    }
    @Test
    public void createButtonIsClickable() {

        extentLogger = report.createTest("Testing- Search...is displayed by default");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();

        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");

        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("click on Master Data");
        pages.invoicingPage.purchasesMasterData.click();

        extentLogger.info("click on Vendors");
        pages.invoicingPage.vendors.click();

        BrowserUtilities.waitForTitleContains("Vendors");
        extentLogger.info("click on Create");
        //BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForTitleContains("New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        extentLogger.info("PASSED-'Create' button is clickable.");
    }
    @Test
    public void ImportButtonIsClickable() {

        extentLogger = report.createTest("Testing- Search...is displayed by default");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();

        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");

        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("click on Master Data");
        pages.invoicingPage.purchasesMasterData.click();

        extentLogger.info("click on Vendors");
        pages.invoicingPage.vendors.click();

        BrowserUtilities.waitForTitleContains("Vendors");
        extentLogger.info("click on Import");
        //BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        pages.invoicingPage.importButton.click();
        BrowserUtilities.waitForTitleContains("Import");
        Assert.assertTrue(driver.getTitle().contains("Import"));
        extentLogger.info("PASSED-'Import' button is clickable.");
    }
}
