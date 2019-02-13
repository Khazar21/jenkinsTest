package com.briteERP.tests.smokeTests;

import com.briteERP.utilities.ApplicationConstants;
import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageHeadersTest extends TestBase {
    @Test (groups = "smoke")
    public void pageHeaders(){
        extentLogger= report.createTest("Page Headers Test");

        extentLogger.info("Selecting database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Verifying page header-Customer Invoices");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.CUSTOMER_INVOICES);

        extentLogger.info("Going to the Customer Credit Notes page");
        pages.invoicingPage.customerCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Credit Notes");
        extentLogger.info("Verifying page header-Customer Credit Notes");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.CUSTOMER_CREDIT_NOTES);

        extentLogger.info("Going to the Sales Payments page");
        pages.invoicingPage.salesPayments.click();
        BrowserUtilities.waitForTitleContains("Payments");
        extentLogger.info("Verifying page header-Payments");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENTS);

        extentLogger.info("Going to the Sales Master Data");
        pages.invoicingPage.salesMasterData.click();
        extentLogger.info("Going to the Customer page");
        pages.invoicingPage.customers.click();
        BrowserUtilities.waitForTitleContains("Customers");
        extentLogger.info("Verifying page header-Customers");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.CUSTOMERS);

        extentLogger.info("Going to the Sellable Products page");
        pages.invoicingPage.sellableProducts.click();
        BrowserUtilities.waitForTitleContains("Sellable");
        extentLogger.info("Verifying page header-Sellable Products");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.SELLABLE_PRODUCTS);

        extentLogger.info("Going to the Purchase Documents");
        pages.invoicingPage.purchasesDocuments.click();
        extentLogger.info("Going to the Vendor Bills page");
        pages.invoicingPage.vendorBills.click();
        BrowserUtilities.waitForTitleContains("Bills");
        extentLogger.info("Verifying page header-Vendor Bills");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.VENDOR_BILLS);

        extentLogger.info("Going to the Vendor Credit Notes page");
        pages.invoicingPage.vendorCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Notes");
        extentLogger.info("Verifying page header-Vendor Credit Notes");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.VENDOR_CREDIT_NOTES);

        extentLogger.info("Going to the Purchase Payments page");
        pages.invoicingPage.purchasesPayments.click();
        BrowserUtilities.waitForTitleContains("Payments");
        extentLogger.info("Verifying page header-Payments");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENTS);

        extentLogger.info("Going to the Purchases Master Data");
        pages.invoicingPage.purchasesMasterData.click();
        extentLogger.info("Going to the Vendors page");
        pages.invoicingPage.vendors.click();
        BrowserUtilities.waitForTitleContains("Vendors");
        extentLogger.info("Verifying page header-Vendors");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.VENDORS);

        extentLogger.info("Going to the Purchasable Products page");
        pages.invoicingPage.purchasableProducts.click();
        BrowserUtilities.waitForTitleContains("Purchasable");
        extentLogger.info("Verifying page header Purchasable Products");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PURCHASABLE_PRODUCTS);

        extentLogger.info("Going to the reporting Management");
        pages.invoicingPage.reportingManagement.click();
        extentLogger.info("Going to the Invoices page");
        pages.invoicingPage.invoices.click();
        extentLogger.info("Verifying page header Purchasable Products");
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Verifying page header- Invoices");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.INVOICES);

        extentLogger.info("Going to the PDF reports");
        pages.invoicingPage.pdfReports.click();
        extentLogger.info("Going to the Journals Audit page");
        pages.invoicingPage.journalsAudit.click();
        extentLogger.info("Verifying page header- Journals Audit");
        Assert.assertEquals(pages.invoicingPage.popUpWindowHeader.getText(), ApplicationConstants.JOURNALS_AUDIT);
        pages.invoicingPage.cancelButton.click();

        extentLogger.info("Going to the Aged Partner Balance page");
        pages.invoicingPage.agedPartnerBalance.click();
        extentLogger.info("Verifying page header- Aged Partner Balance");
        Assert.assertEquals(pages.invoicingPage.popUpWindowHeader.getText(), ApplicationConstants.AGED_PARTNER_BALANCE);
        pages.invoicingPage.cancelButton.click();

        extentLogger.info("Going to the Tax Report page");
        pages.invoicingPage.taxReport.click();
        extentLogger.info("Verifying page header- Tax Reports");
        Assert.assertEquals(pages.invoicingPage.popUpWindowHeader.getText(), ApplicationConstants.TAX_REPORTS);
        pages.invoicingPage.cancelButton.click();

        extentLogger.info("Going to the Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to the Taxes page");
        pages.invoicingPage.taxes.click();
        BrowserUtilities.waitForTitleContains("Taxes");
        extentLogger.info("Verifying page header- Taxes");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.TAXES);

        extentLogger.info("Going to the Fiscal Positions page");
        pages.invoicingPage.fiscalPositions.click();
        BrowserUtilities.waitForTitleContains("Fiscal");
        extentLogger.info("Verifying page header- Fiscal Positions");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.FISCAL_POSITIONS);

        extentLogger.info("Going to the Bank Accounts page");
        pages.invoicingPage.bankAccounts.click();
        BrowserUtilities.waitForTitleContains("Bank");
        extentLogger.info("Verifying page header- Bank Accounts");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.BANK_ACCOUNTS);

        extentLogger.info("Going to the Journals page");
        pages.invoicingPage.journals.click();
        BrowserUtilities.waitForTitleContains("Journals");
        extentLogger.info("Verifying page header- Journals");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.JOURNALS);

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();
        extentLogger.info("Going to the Payment Terms page");
        pages.invoicingPage.paymentTerms.click();
        BrowserUtilities.waitForTitleContains("Terms");
        extentLogger.info("Verifying page header- Payment Terms");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENT_TERMS);

        extentLogger.info("Going to the Configuration Payments");
        pages.invoicingPage.configurationPayments.click();
        extentLogger.info("Going to the Payment Acquirers page");
        pages.invoicingPage.paymentAcquirers.click();
        BrowserUtilities.waitForTitleContains("Acquirers");
        extentLogger.info("Verifying page header- Payment Acquirers");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENT_ACQUIRERS);
        extentLogger.info("PASSED: Page Headers Test");
    }
}
