package com.briteERP.tests.functionalTests.invoicing.sales.documents;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateACustomer extends TestBase {


    @Test
    public void isDisplayed() {

        extentLogger = report.createTest("Testing search button is displayed");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to the Master Data");
        pages.invoicingPage.salesMasterData.click();
        extentLogger.info("Going to the Customers");
        pages.invoicingPage.customers.click();
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
        pages.invoicingPage.salesMasterData.click();
        extentLogger.info("click on Customers");
        pages.invoicingPage.customers.click();
        BrowserUtilities.waitForTitleContains("Customers");
        extentLogger.info("click on Create");
        //BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForTitleContains("New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        extentLogger.info("PASSED-'Create' button is clickable.");
    }

}