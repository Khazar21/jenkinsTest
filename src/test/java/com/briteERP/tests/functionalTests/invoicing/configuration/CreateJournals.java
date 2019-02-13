package com.briteERP.tests.functionalTests.invoicing.configuration;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateJournals extends TestBase {

    @Test
    public void JournalsManualNumberingCBSelectable(){
        extentLogger = report.createTest("Testing - 'Manual Numbering of check' checkbox is clickable. " +
                "When clicked, 'Next Check Number' option is displayed with '1' as default, and accepts user input.");
        extentLogger.info("Choosing the Database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Sign in as manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to Invoicing page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to Journals");
        pages.invoicingPage.journals.click();
        BrowserUtilities.waitForTitleContains("Journals");
        extentLogger.info("Creating new Journal");
        pages.invoicingPage.createButton.click();
        extentLogger.info("Going to Advanced Settings");
        pages.invoicingPage.advancedSettings.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.manualNumberingCB);
        extentLogger.info("Verifying that 'Next Check Number' " +
                "option is not displayed before selecting Manual Numbering CB");
        Assert.assertFalse(pages.invoicingPage.nextCheckNumberLabel.isDisplayed());
        extentLogger.info("Selecting Manual Numbering of check checkbox");
        pages.invoicingPage.manualNumberingCB.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.nextCheckNumberLabel);
        extentLogger.info("Verifying that 'Next Check Number' is displayed");
        Assert.assertTrue(pages.invoicingPage.nextCheckNumberLabel.isDisplayed());
        extentLogger.info("Verifying that 'Next Check Number' data box is displayed");
        Assert.assertTrue(pages.invoicingPage.nextCheckNumberDataBox.isDisplayed());
        extentLogger.info("Verifying that 'Next Check Number' option is displayed with '1' as default");
        Assert.assertEquals(pages.invoicingPage.nextCheckNumberDataBox.getAttribute("value"),"1");
        extentLogger.info("Clear and Type new check number");
        pages.invoicingPage.nextCheckNumberDataBox.clear();
        pages.invoicingPage.nextCheckNumberDataBox.sendKeys("2");
        extentLogger.info("Verify that 'Next Check Number' option is displayed with '2' as the input value");
        Assert.assertEquals(pages.invoicingPage.nextCheckNumberDataBox.getAttribute("value"),"2");
    }

}
