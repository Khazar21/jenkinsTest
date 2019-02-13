package com.briteERP.tests.functionalTests.invoicing.configuration;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;


public class CreateBankAccounts extends TestBase {

    @Test
    public void DebitMethodsCBSelectable(){
        extentLogger = report.createTest(
                "Testing - Debit Methods displays two checkboxes and manual CB is selected by default");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Sign in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to invoicing page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to Bank Accounts");
        pages.invoicingPage.bankAccounts.click();
        BrowserUtilities.waitForTitleContains("Bank");
        extentLogger.info("Creating new Bank Account");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.debitMethodsManualCB);
        extentLogger.info("Verifying checkboxes are enabled");
        Assert.assertTrue(pages.invoicingPage.debitMethodsManualCB.isEnabled());
        Assert.assertTrue(pages.invoicingPage.debitMethodsElectronicCB.isEnabled());
        extentLogger.info("Verifying manual checkbox is selected by default");
        Assert.assertTrue(pages.invoicingPage.debitMethodsManualCB.isSelected());
        extentLogger.info("Clicking 'Electronic' checkbox");
        pages.invoicingPage.debitMethodsElectronicCB.click();
        Assert.assertTrue(pages.invoicingPage.debitMethodsElectronicCB.isSelected());
    }
        @Test
        public void PaymentMethodsCBSelectable(){
        extentLogger = report.createTest(
                "Testing - Payment Methods has two checkboxes and they are both selected by default");
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
        extentLogger.info("Going to Bank Accounts");
        pages.invoicingPage.bankAccounts.click();
        BrowserUtilities.waitForTitleContains("Bank");
        extentLogger.info("Creating new Bank Account");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.paymentMethodsManualCB);
        extentLogger.info("Verifying checkbox names are displayed");
        Assert.assertTrue(pages.invoicingPage.paymentMethodsManualTxt.isDisplayed());
        Assert.assertTrue(pages.invoicingPage.paymentMethodsChecksTxt.isDisplayed());
        extentLogger.info("Verifying checkboxes are enabled");
        Assert.assertTrue(pages.invoicingPage.paymentMethodsManualCB.isEnabled());
        Assert.assertTrue(pages.invoicingPage.paymentMethodsChecksCB.isEnabled());
        extentLogger.info("Verifying that manual and checks checkboxes are selected");
        Assert.assertTrue(pages.invoicingPage.paymentMethodsManualCB.isSelected());
        Assert.assertTrue(pages.invoicingPage.paymentMethodsChecksCB.isSelected());
        }

        @Test
        public void BankAcctNameDataBox(){
        extentLogger = report.createTest(
                "Testing - 'Bank Account Name' data box accepts user input");
        extentLogger.info("Choosing the Database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Sign in as manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to invoicing page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to Bank Accounts");
        pages.invoicingPage.bankAccounts.click();
        BrowserUtilities.waitForTitleContains("Bank");
        extentLogger.info("Creating new Bank Account");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.paymentMethodsManualCB);
        extentLogger.info("Typing Bank account name");
        pages.invoicingPage.bankAcctName.sendKeys("Account On");
        extentLogger.info("Saving Bank account");
        pages.invoicingPage.bankAcctSave.click();
        extentLogger.info("Verifying that given account name is displayed");
        Assert.assertTrue(pages.invoicingPage.bankAcctNameDisplay.isDisplayed());
        }

        @Test
        public void BankAcctDropdown(){
        extentLogger = report.createTest(
                "Testing that when user clicks 'Bank Account' dropdown, " +
                        "dropdown box opens. User should be able to enter text, " +
                        "select 'Create and Edit...' option, or select 'Search More...' option.");
            extentLogger.info("Choosing the Database");
            pages.odooPage.briteERPDemo.click();
            extentLogger.info("Sign in as manager");
            pages.signInPage.signIn("manager");
            BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
            extentLogger.info("Going to invoicing page");
            pages.menuUser.invoicing.click();
            BrowserUtilities.waitForTitleContains("Invoices");
            extentLogger.info("Going to Accounting");
            pages.invoicingPage.accounting.click();
            extentLogger.info("Going to Bank Accounts");
            pages.invoicingPage.bankAccounts.click();
            BrowserUtilities.waitForTitleContains("Bank");
            extentLogger.info("Creating new Bank Account");
            pages.invoicingPage.createButton.click();
            BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.paymentMethodsManualCB);
            pages.invoicingPage.bankAcctDropdown.click();
            extentLogger.info("Verifying that 'Search More...' and 'Create and Edit...' options are displayed");
            Assert.assertTrue(pages.invoicingPage.bankAcctSearchMore.isDisplayed());
            Assert.assertTrue(pages.invoicingPage.bankAcctCreateAndEdit.isDisplayed());
            extentLogger.info("Verifying that 'Search More...' is clickable & directs us to search");
            pages.invoicingPage.bankAcctSearchMore.click();
            BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.searchBankAcctTitle);
            Assert.assertTrue(pages.invoicingPage.searchBankAcctTitle.isDisplayed());
            pages.invoicingPage.bankAcctCloseButton.click();
            BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.bankAcctDropdown);
            extentLogger.info("Verifying that 'Create and Edit...' is clickable & directs us to edit");
            pages.invoicingPage.bankAcctDropdown.click();
            BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.bankAcctCreateAndEdit);
            pages.invoicingPage.bankAcctCreateAndEdit.click();
            BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.createBankAcctTitle);
            Assert.assertTrue(pages.invoicingPage.createBankAcctTitle.isDisplayed());

        }
        @Test
        public void ManualNumberingCBSelectable(){
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
            extentLogger.info("Going to Bank Accounts");
            pages.invoicingPage.bankAccounts.click();
            BrowserUtilities.waitForTitleContains("Bank");
            extentLogger.info("Creating new Bank Account");
            pages.invoicingPage.createButton.click();
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
        @Test
        public void UseInPointOfSaleCB(){
        extentLogger = report.createTest("Testing - Use in Point of Sale has a selectable checkbox, " +
                "and when selected, clickable 'Mercury Credentials' dropdown appears" );
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
            extentLogger.info("Going to Bank Accounts");
            pages.invoicingPage.bankAccounts.click();
            BrowserUtilities.waitForTitleContains("Bank");
            extentLogger.info("Creating new Bank Account");
            pages.invoicingPage.createButton.click();
            BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.useInPointOfSaleCB);
            extentLogger.info("Selecting checkbox");
            pages.invoicingPage.useInPointOfSaleCB.click();
            Assert.assertTrue(pages.invoicingPage.useInPointOfSaleCB.isSelected());
            extentLogger.info("Verifying that 'Mercury Credentials' dropdown is clickable");
            Assert.assertTrue(pages.invoicingPage.mercuryCredentialsDropdown.isDisplayed());
            pages.invoicingPage.mercuryCredentialsDropdown.click();
            Assert.assertTrue(pages.invoicingPage.bankAcctOdooServerError.isDisplayed());
            extentLogger.info("Verifying bank account Odoo Server Error");
            Assert.assertEquals(pages.invoicingPage.bankAcctOdooServerError.getText(), "Odoo Server Error - Access Error");
        }

}
