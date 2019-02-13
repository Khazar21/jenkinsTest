package com.briteERP.tests.functionalTests.invoicing.configuration;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateInPaymentTerms extends TestBase {

    @Test
    public void paymentTermsNewPage() throws InterruptedException {
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

        extentLogger.info("Displaying 'New' page after clicking to the 'Create' button");
        BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        pages.invoicingPage.createButton.click();
//        Assert.assertTrue(pages.configurationPage.newHeaders.getText().contains("New"));

        extentLogger.info("Entering, saving and confirming data in 'Payment Terms' input box");
        pages.configurationPage.paymentTermsInput.sendKeys("hello!");

        extentLogger.info("Clicking 'Add an Item' and open 'Create Terms' pop-up");
        pages.configurationPage.addingAnItem.click();
        pages.configurationPage.createTermsPopUp.click();

        extentLogger.info("Selecting 'Fixed Amount' and entering an amount to checkbox");
        pages.configurationPage.termTypeFixAmount.click();
        pages.configurationPage.termTypeValue.clear();
        pages.configurationPage.termTypeValue.sendKeys("0");

        extentLogger.info("Selecting 'Last day of current month' and entering an amount to checkbox");
        pages.configurationPage.duDateCompLastDayCurrentMonth.click();
        pages.configurationPage.saveAndNew.click();

        extentLogger.info("Selecting 'Percent' and entering an amount to checkbox");
        pages.configurationPage.termTypePercent.click();
        pages.configurationPage.termTypeValue.clear();
        pages.configurationPage.termTypeValue.sendKeys("0");

        extentLogger.info("Selecting 'Last day of following month' and entering an amount to checkbox");
        pages.configurationPage.duDateCompLastDayOfFollowMonth.click();
        pages.configurationPage.saveAndClose.click();

        if(pages.configurationPage.odooServerErrorMessage.isDisplayed()){
            pages.configurationPage.odooServerErrorMessage.click();
        }

        extentLogger.info("Deleting rows from 'Terms' table");
        pages.configurationPage.deleteRow1Item.click();

        extentLogger.info("Go to save entering value/s");
        Thread.sleep(2000);
        pages.configurationPage.saveButton.click();
        Assert.assertTrue(pages.configurationPage.paymentTermsText.isDisplayed());
    }
}
