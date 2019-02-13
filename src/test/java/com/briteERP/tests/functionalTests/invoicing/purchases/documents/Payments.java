package com.briteERP.tests.functionalTests.invoicing.purchases.documents;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Payments extends TestBase {

    @Test
    public void displayingPaymentOptions() {

        extentLogger = report.createTest("Testing by clicking on 'create'  button Payment options   should be displayed");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Clicking on Purchase Documents");
        pages.invoicingPage.purchasesDocuments.click();
        extentLogger.info("Clicking on  Payment button");
        pages.invoicingPage.purchasesPayments.click();
        BrowserUtilities.waitForTitleContains("Payments");
        extentLogger.info("Clicking on Create button");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        extentLogger.info("Verifying Payment options   should be displayed.");
        BrowserUtilities.waitForTitleContains("New");
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("New"));
        extentLogger.info("PASSED- - Payment options   should be displayed. ");
    }


    @Test
    public void displayingPaymentDate() {
        extentLogger = report.createTest("Testing that  current  payment Date is displayed by default.");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Clicking on Purchase Documents");
        pages.invoicingPage.purchasesDocuments.click();
        extentLogger.info("Clicking on  Payment button");
        pages.invoicingPage.purchasesPayments.click();
        BrowserUtilities.waitForTitleContains("Payments");
        extentLogger.info("Clicking on Create button");
        pages.invoicingPage.paymentCreateButton.click();
        BrowserUtilities.waitForTitleContains("New");
        extentLogger.info("Verifying current  payment Date is displayed by default.");
        System.out.println(pages.invoicingPage.paymentDate.getText());
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.paymentDate);
        Assert.assertEquals("02/07/2019", pages.invoicingPage.paymentDate.getAttribute("value"));
        extentLogger.info("PASSED- - current  payment Date should be  displayed by default. ");
    }


    @Test
    public void verifyingErrorMessageDisplayed() {
        extentLogger = report.createTest("Testing that error message displayed .");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Clicking on Purchase Documents");
        pages.invoicingPage.purchasesDocuments.click();
        extentLogger.info("Clicking on  Payment button");
        pages.invoicingPage.purchasesPayments.click();
        extentLogger.info("Clicking on Create button");
        BrowserUtilities.waitForTitleContains("Payments");
        pages.invoicingPage.paymentCreateButton.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.paymentCreateButton);
        BrowserUtilities.waitForTitleContains("New");
        extentLogger.info("Clicking on Internal Transfer as a payment type");
        pages.invoicingPage.paymentTypeInternalTransfer.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.paymentTypeInternalTransfer);
        extentLogger.info("Clicking on Discard button");
        pages.invoicingPage.paymentDiscardButton.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.paymentDiscardButton);
        extentLogger.info("Verifying 'The record has been modified, your changes will be discarded. Do you want to proceed?' error message  message displayed");
        Assert.assertEquals(pages.invoicingPage.paymentWarningMessage.getText(), "The record has been modified, your changes will be discarded. Do you want to proceed?");
        extentLogger.info("PASSED- - Error message should be  displayed.");
    }


}
