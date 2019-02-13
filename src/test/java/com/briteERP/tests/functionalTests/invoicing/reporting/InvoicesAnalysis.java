package com.briteERP.tests.functionalTests.invoicing.reporting;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InvoicesAnalysis extends TestBase {

    @Test
    public void BarChartDefault(){

       extentLogger = report.createTest("Testing- Bar Chart is displayed by default");

       extentLogger.info("Choosing the database");
       pages.odooPage.briteERPDemo.click();
       extentLogger.info("Signing in as a Manager");
       pages.signInPage.signIn("manager");
       BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
       extentLogger.info("Going to the Invoicing Page");
       pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
       extentLogger.info("Going to the reporting management");
       pages.invoicingPage.reportingManagement.click();
       extentLogger.info("Clicking to the Invoices");
       pages.invoicingPage.invoices.click();
       extentLogger.info("Verifying- Bar Chart is displayed by default");
       Assert.assertTrue(pages.invoicingPage.barChart.getAttribute("class").contains("active"));
       extentLogger.info("PASSED- Bar Chart button is selected");
    }

   @Test
   public void pivotView(){

       extentLogger = report.createTest("Testing- Pivot is clickable and clicked");

       extentLogger.info("Choosing the database");
       pages.odooPage.briteERPDemo.click();
       extentLogger.info("Signing in as a Manager");
       pages.signInPage.signIn("manager");
       BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
       extentLogger.info("Going to the Invoicing Page");
       pages.menuUser.invoicing.click();
       BrowserUtilities.waitForTitleContains("Invoices");
       extentLogger.info("Going to the reporting management");
       pages.invoicingPage.reportingManagement.click();
       extentLogger.info("Clicking to the Invoices");
       pages.invoicingPage.invoices.click();
       extentLogger.info("Clicking to the Pivot");
       pages.invoicingPage.pivotView.click();
       extentLogger.info("Verifying- Pivot is clicked");
       Assert.assertTrue(pages.invoicingPage.pivotView.isEnabled());

   }

    @Test
    public void pieChart(){

        extentLogger = report.createTest("Testing- Pie Chart is clickable and clicked");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to the reporting management");
        pages.invoicingPage.reportingManagement.click();
        extentLogger.info("Clicking to the Invoices");
        pages.invoicingPage.invoices.click();
        extentLogger.info("Clicking to the Pie Chart");
        pages.invoicingPage.pieChart.click();
        extentLogger.info("Verifying- Pie Chart is clicked");
        Assert.assertTrue(pages.invoicingPage.pivotView.isEnabled());
    }
}
