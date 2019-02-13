package com.briteERP.tests.functionalTests.invoicing.purchases.documents;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import com.briteERP.utilities.TestBase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VendorCreditNotes extends TestBase {


    @Test
    public void displayingDraftCreditNote() {
        extentLogger = report.createTest("Testingthat Draft Credit Note  box  should be displayed");
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
        extentLogger.info("Clicking on  Vendor Credit Notes");
        pages.invoicingPage.vendorCreditNotes.click();
        extentLogger.info("Clicking on Create button");
        pages.invoicingPage.createButton.click();
        extentLogger.info("Verifying that Draft Credit Note  box  should be displayed");
        Assert.assertTrue(pages.invoicingPage.draftCreditNoteSheet.isDisplayed());
        extentLogger.info("PASSED- - Draft Credit Note  box  should be displayed Is Displayed");
    }


    @Test
    public void displayingSearchMoreCreditAndEditOptions() {

        extentLogger = report.createTest(" by clicking add an item, 'Search More' and 'Credit and Edit' options are displayed inside the 'Product' dropdown options");
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
        extentLogger.info("Clicking on  Vendor Credit Notes");
        pages.invoicingPage.vendorCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Vendor Credit Notes - Odoo");
        System.out.println(Driver.getDriver().getTitle());
        extentLogger.info("Clicking on Create button");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        extentLogger.info("Clicking on Vendor ");
        pages.invoicingPage.draftCreditNoteVendor.click();//////this is not working
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.draftCreditNoteVendor);
        extentLogger.info("Choose any Vendor on dropdown");
        pages.invoicingPage.draftCreditNoteVendor1.click();
        extentLogger.info("Click on Add an item");
        pages.invoicingPage.vendorCreditNoteAddAnItem.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.vendorCreditNoteAddAnItem);
        extentLogger.info("Click on Add an item input");
        pages.invoicingPage.addAnItemInput.click();
        extentLogger.info("'Search More' and 'Credit and Edit' options are displayed inside the 'Product' dropdown options");
        System.out.println(pages.invoicingPage.searchMore.getAttribute("innerHTML"));
        System.out.println(pages.invoicingPage.creditAndEdit.getAttribute("innerHTML"));
        Assert.assertTrue(pages.invoicingPage.searchMore.isEnabled());
        Assert.assertTrue(pages.invoicingPage.creditAndEdit.isEnabled());
        extentLogger.info("PASSED- - 'Search More' and 'Credit and Edit' options are displayed ");
    }


    @Test
    public void productInformationFilledAutomatically() {

        extentLogger = report.createTest("Testing that by clicking any product in dropdown menu, all product information  is filled in a fields accordingly");
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
        extentLogger.info("Clicking on  Vendor Credit Notes");
        pages.invoicingPage.vendorCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Vendor Credit Notes - Odoo");
        extentLogger.info("Clicking on Create button");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        extentLogger.info("Clicking on Vendor ");
        pages.invoicingPage.draftCreditNoteVendor.click();//////this is not working
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.draftCreditNoteVendor);
        extentLogger.info("Choose any Vendor on dropdown");
        pages.invoicingPage.draftCreditNoteVendor1.click();
        extentLogger.info("Click on Add an item");
        pages.invoicingPage.vendorCreditNoteAddAnItem.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.vendorCreditNoteAddAnItem);
        extentLogger.info("Click on Add an item input");
        pages.invoicingPage.addAnItemInput.click();
        extentLogger.info("Choose Computer Case product");
        pages.invoicingPage.productComputerCase.click();
        extentLogger.info("Verifying all product information  is filled in a fields accordingly.");
        Assert.assertTrue(pages.invoicingPage.productDescription.isDisplayed());
        Assert.assertTrue(pages.invoicingPage.productQuantity.isDisplayed());
        Assert.assertTrue(pages.invoicingPage.productUnitPrice.isDisplayed());
        Assert.assertTrue(pages.invoicingPage.productAmount.isDisplayed());
        System.out.println(pages.invoicingPage.productDescription.getText());
        BrowserUtilities.waitForAttributeToContain(pages.invoicingPage.productDescription, "type", "text");
        extentLogger.info("PASSED- -  all product information  should be filled in a fields accordingly  . ");
    }

    @Test
    public void productInformationCanBeEdited() throws InterruptedException {

        extentLogger = report.createTest("Testing that required fields   can be edited  by InvoiceManager according to product information.");
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
        extentLogger.info("Clicking on  Vendor Credit Notes");
        pages.invoicingPage.vendorCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Vendor Credit Notes - Odoo");
        extentLogger.info("Clicking on Create button");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        extentLogger.info("Clicking on Vendor ");
        pages.invoicingPage.draftCreditNoteVendor.click();//////this is not working
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.draftCreditNoteVendor);
        extentLogger.info("Choose any Vendor on dropdown");
        pages.invoicingPage.draftCreditNoteVendor1.click();
        extentLogger.info("Click on Add an item");
        pages.invoicingPage.vendorCreditNoteAddAnItem.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.vendorCreditNoteAddAnItem);
        extentLogger.info("Click on Add an item input");
        pages.invoicingPage.addAnItemInput.click();
        extentLogger.info("Choose Computer Case product");
        pages.invoicingPage.productComputerCase.click();
        extentLogger.info("Delete quantity ");
        pages.invoicingPage.productQuantity.click();
        actions.sendKeys(Keys.DELETE).perform();
        extentLogger.info("Edit  quantity  by entering 50 ");
        pages.invoicingPage.productQuantity.click();
        Thread.sleep(2000);
        actions.sendKeys("50" + Keys.ENTER).perform();
        actions.doubleClick(pages.invoicingPage.productQuantity).sendKeys(Keys.ENTER);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        extentLogger.info("Verifying new value is displayed");
        BrowserUtilities.textToBePresentInElementValue(pages.invoicingPage.productQuantity);
        Assert.assertEquals(pages.invoicingPage.productQuantity.getText(), "50.000");
        extentLogger.info("PASSED- -  required fields   should be edited  by InvoiceManager according to product information . ");
    }


    @Test
    public void clickingDeleteButton() throws InterruptedException {

        extentLogger = report.createTest("Testing that by clicking delete button , all product information returns to blank");
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
        extentLogger.info("Clicking on  Vendor Credit Notes");
        pages.invoicingPage.vendorCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Vendor Credit Notes - Odoo");
        extentLogger.info("Clicking on Create button");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        extentLogger.info("Clicking on Vendor ");
        pages.invoicingPage.draftCreditNoteVendor.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.draftCreditNoteVendor);
        extentLogger.info("Choose any Vendor on dropdown");
        pages.invoicingPage.draftCreditNoteVendor1.click();
        extentLogger.info("Click on Add an item");
        pages.invoicingPage.vendorCreditNoteAddAnItem.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.vendorCreditNoteAddAnItem);
        extentLogger.info("Click on Add an item input");
        pages.invoicingPage.addAnItemInput.click();
        extentLogger.info("Choose Computer Case product");
        pages.invoicingPage.productComputerCase.click();
        extentLogger.info("Click on Delete icon");
        BrowserUtilities.waitForClickablility(pages.invoicingPage.productDelete);
        pages.invoicingPage.productDelete.click();
        extentLogger.info("Verifying new value is displayed");
       // BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.productDescription);
        System.out.println(pages.invoicingPage.productDescription.getAttribute("value"));
        Thread.sleep(2000);

        Assert.assertFalse(pages.invoicingPage.elementDisplayed(pages.invoicingPage.productDescription));
        Assert.assertFalse(pages.invoicingPage.elementDisplayed(pages.invoicingPage.productUnitPrice));
        Assert.assertFalse(pages.invoicingPage.elementDisplayed(pages.invoicingPage.productQuantity));
        Assert.assertFalse(pages.invoicingPage.elementDisplayed(pages.invoicingPage.productDescription));
        Assert.assertFalse(pages.invoicingPage.elementDisplayed(pages.invoicingPage.productAmount));


        extentLogger.info("Passed- -  by clicking delete button , all product information returns to blank ");
    }

}
