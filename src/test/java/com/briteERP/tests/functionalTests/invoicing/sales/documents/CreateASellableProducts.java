package com.briteERP.tests.functionalTests.invoicing.sales.documents;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateASellableProducts extends TestBase {

    @Test
    public void CanBeSold() {
        extentLogger = report.createTest("Product's pictures can appear,after clicking 'Kanban' button");


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
      //  BrowserUtilities.waitForClickablility(pages.invoicingPage.salesMasterData);
        extentLogger.info("Going to the Sellable Products");
        pages.invoicingPage.sellableProducts.click();
        BrowserUtilities.waitForTitleContains("Sellable");
       // BrowserUtilities.waitForClickablility(pages.invoicingPage.kanbanView);
        pages.invoicingPage.kanbanView.click();
        BrowserUtilities.waitForAttributeToContain(pages.invoicingPage.kanbanView,"class","active");

        extentLogger.info("Verifying - picture is displayed");
        Assert.assertTrue(pages.invoicingPage.pictureRandom.isDisplayed());
 }


    @Test
    public void isClickable() {
        extentLogger = report.createTest("'Can be Sold' is displayed in 'search' box");

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
        extentLogger.info("Going to the Sellable Products");
        pages.invoicingPage.sellableProducts.click();
        extentLogger.info("Verifying-'Can be Sold' is displayed in 'search' box");
        Assert.assertTrue(pages.invoicingPage.canbesold.isDisplayed());
        extentLogger.info("PASSED-'Can be Sold' is displayed in 'search' box");


    }
    }

