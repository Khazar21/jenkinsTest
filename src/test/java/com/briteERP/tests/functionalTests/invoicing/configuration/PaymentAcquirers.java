package com.briteERP.tests.functionalTests.invoicing.configuration;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PaymentAcquirers extends TestBase {
    @Test
    public void activeCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        extentLogger.info("Displaying text of 'Payment Acquirers'");
        Assert.assertTrue(pages.configurationPage.headerTextPaymAcq.isDisplayed());

        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

    }

    @Test
    public void messagesAfterCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();
        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        System.out.println(pages.invoicingPage.pageHeader.getText());

//        extentLogger.info("Confirming title");
//        Assert.assertTrue("New - Odoo".equals(driver.getTitle()));

        extentLogger.info("Confirmating header of 'Messages' page after clicking Create button");
        Assert.assertTrue("Payment Acquirers".equals(pages.configurationPage.headerInNewPage.getText()));

        extentLogger.info("Displaying text of 'Pending Message'");
        Assert.assertTrue(pages.configurationPage.pendingMessage.isDisplayed());

    }

    @Test
    public void configurationAfterCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();


        extentLogger.info("Clicking on 'Configuration' button");
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal");
        pages.configurationPage.paymentJournal.click();

    }

    @Test
    public void PaymentJournal_AfterCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();


        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        extentLogger.info("Clicking on 'Configuration' button");
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal'");
        BrowserUtilities.waitForClickablility(pages.configurationPage.paymentJournal);
        pages.configurationPage.paymentJournal.click();

        extentLogger.info("Displaying text as 'altun'");
        Assert.assertEquals(pages.configurationPage.headerOnPopUpInNewPage.getText(),"altun");

        extentLogger.info("Confirming header of pop-up");
        Assert.assertTrue(pages.configurationPage.paymentJournal.getText().contains(pages.configurationPage.headerOnPopUpInNewPage.getText()));

        extentLogger.info("Displaying 'Bank' in 'Type' as default");
        Assert.assertTrue(pages.configurationPage.typeInNewPage.isDisplayed());

        extentLogger.info("Displaying '1' in 'Short Code' as default");
        Assert.assertTrue(pages.configurationPage.shortCodeInNewPage.isDisplayed());

        extentLogger.info("Displaying '2' in 'Short Code' as default");
        Assert.assertTrue(pages.configurationPage.nextNumberInNewPage.isDisplayed());

    }

    @Test
    public void AttachmentDropdown_InNewCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();

        extentLogger.info("Going to the Configuration Management");
        BrowserUtilities.waitForTitleContains("Invoices");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        extentLogger.info("Clicking on 'Configuration' button");
        Thread.sleep(3000);
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal'");
        pages.configurationPage.paymentJournal.click();


        Thread.sleep(3000);
        extentLogger.info("Clicking on 'Attachment(s)' dropdown");
        pages.configurationPage.attachmentDropdown.click();

        extentLogger.info("Adding item to attach");
        WebElement add = pages.configurationPage.addInAttachment;
        String path = "C:\\Users\\Toshiba\\Desktop\\delete.xlsx";
        add.sendKeys(path);

        extentLogger.info("Deleting an item");
        Thread.sleep(2000);
        pages.configurationPage.attachmentDropdown.click();
        Thread.sleep(2000);
        pages.configurationPage.deleteAddedItem.click();

        extentLogger.info("Confirmation deleteing");
        pages.configurationPage.confirmationDeleting.click();


    }

    @Test
    public void ActionDropdownInNewCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(5000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        extentLogger.info("Clicking on 'Configuration' button");
        BrowserUtilities.waitForClickablility(pages.configurationPage.configurationButton);
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal'");
        BrowserUtilities.waitForClickablility(pages.configurationPage.paymentJournal);
        pages.configurationPage.paymentJournal.click();


        extentLogger.info("Clicking on 'Action' dropdown");
        BrowserUtilities.waitForClickablility(pages.configurationPage.actionDropdown);
        pages.configurationPage.actionDropdown.click();

        extentLogger.info("Go to 'Unpaid Invoices' page");
        pages.configurationPage.unpaidInvoicesInActDropdown.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.createButton);
        pages.invoicingPage.createButton.click();
    }


    @Test
    public void createUnpaidInvoices() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(4000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        extentLogger.info("Clicking on 'Configuration' button");
        BrowserUtilities.waitForClickablility(pages.configurationPage.configurationButton);
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal'");
        BrowserUtilities.waitForClickablility(pages.configurationPage.paymentJournal);
        pages.configurationPage.paymentJournal.click();

        extentLogger.info("Clicking on 'Action' dropdown");
        BrowserUtilities.waitForClickablility(pages.configurationPage.actionDropdown);
        pages.configurationPage.actionDropdown.click();

        extentLogger.info("Going to 'Unpaid Invoices' page");
        pages.configurationPage.unpaidInvoicesInActDropdown.click();
        Thread.sleep(3000);
        pages.invoicingPage.createButton.click();

        BrowserUtilities.waitForClickablility(pages.configurationPage.vendorDropdwnInActDropdown);
        pages.configurationPage.vendorDropdwnInActDropdown.click();

        extentLogger.info("Going to 'Create And Edit' in Vendor dropdown");
        pages.configurationPage.createAndEditInVendor.click();

        extentLogger.info("Clicking to 'Company' check box");
        pages.configurationPage.companyInEditInVendor.click();

        extentLogger.info("Entering a name to 'name' box");
        pages.configurationPage.nameInEditInVendor.sendKeys("My First Company");

        extentLogger.info("Entering a street name for address box");
        pages.configurationPage.street_Create_Vendor.sendKeys("Palace_str.");

        extentLogger.info("Entering 2. street name for address box");
        pages.configurationPage.street2_Create_Vendor.sendKeys("Downtown_str.");

        extentLogger.info("Entering a city name for address box");
        pages.configurationPage.city_Create_Vendor.sendKeys("Austin");

        extentLogger.info("Clicking on state box");
        pages.configurationPage.state_Create_Vendor.click();

//        Thread.sleep(3000);
//        pages.configurationPage.createAndEditState_Create_Vendor.click();
//        pages.configurationPage.stateNameAdd_Create_Vendor.sendKeys("Texas");
//        pages.configurationPage.stateCodeAdd_Create_Vendor.sendKeys("78456");

        extentLogger.info("Clicking on 'Search More' box for searchig state(s)");
        pages.configurationPage.searchMore_Create_Vendor.click();

        extentLogger.info("Entering a state name to search box");
        Thread.sleep(1000);
        pages.configurationPage.searchBoxInput_Create_Vendor.sendKeys("Texas"+Keys.ENTER);

        extentLogger.info("Clicking onto state name to apply state");
        Thread.sleep(1000);
        pages.configurationPage.applySearch_Create_Vendor.click();

        extentLogger.info("Clicking onto country box");
        pages.configurationPage.selectingToCountry_Create_Vendor.click();

        extentLogger.info("Clicking on 'Search More' box for searchig country(ies)");
        pages.configurationPage.searchMoreCountry_Create_Vendor.click();

        extentLogger.info("Entering a country name to search box");
        Thread.sleep(1000);
        pages.configurationPage.searchBoxInput_Create_Vendor.sendKeys("United States"+Keys.ENTER);

        extentLogger.info("Clicking onto country name to apply the country");
        Thread.sleep(1000);
        pages.configurationPage.countryModifyInSearchBox_Create_Vendor.click();

//        Random random = new Random();
//        int a = random.nextInt(100);
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(""+a);
//        ""+a
//        veya
//        a+""


//        pages.configurationPage.selectingToCountry_Create_Vendor.sendKeys("American Samoa");
//        Thread.sleep(3000);
//        pages.configurationPage.countryAdd_Create_Vendor.click();
//        Thread.sleep(3000);
//        pages.configurationPage.saveInCreateStateCodeAdd_Create_Vendor.click();

        extentLogger.info("Clicking on 'Tags' for adding 'Tag'");
        pages.configurationPage.tagsAdd_Create_Vendor.click();

        extentLogger.info("Entering a phone number");
        pages.configurationPage.phoneAdd_Create_Vendor.sendKeys("+15121111111");

        extentLogger.info("Entering a mobile number");
        pages.configurationPage.mobileAdd_Create_Vendor.sendKeys("+17121111111");

        extentLogger.info("Entering an email address");
        pages.configurationPage.emailAdd_Create_Vendor.sendKeys("abcd@gmail.com");

        extentLogger.info("Entering a website");
        pages.configurationPage.websiteAdd_Create_Vendor.sendKeys("www.saybirtek.com");

//        pages.configurationPage.titleAdd_Create_Vendor.click();
        extentLogger.info("Clicking on 'Tags' for adding 'Tag'");
        pages.configurationPage.saveIn_Create_Vendor.click();

        extentLogger.info("Clicking on 'Save' button");
        Thread.sleep(3000);
        pages.configurationPage.saveInUnpaidInvoices_Create_Vendor.click();


//        BrowserUtilities.waitForClickablility(pages.configurationPage.advancedSettings);
//        Thread.sleep(3000);
//        pages.configurationPage.advancedSettings.click();
//        pages.configurationPage.edit.click();
//
//        pages.configurationPage.journalName.sendKeys("Banknot");
//        Assert.assertEquals(pages.configurationPage.journalName, equals(pages.configurationPage.headerOnPopUpInNewPage));
//
//        Select select = new Select(pages.configurationPage.typeInJournalName);
//        System.out.println(pages.configurationPage.typeInJournalName.getText());


    }
}
