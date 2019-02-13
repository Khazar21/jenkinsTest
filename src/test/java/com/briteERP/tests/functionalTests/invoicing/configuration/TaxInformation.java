package com.briteERP.tests.functionalTests.invoicing.configuration;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxInformation extends TestBase {

    @Test(groups = "regression")
    public void checkboxSelecting() {
        extentLogger = report.createTest("Testing- Checkbox is clikable by default and 'Action' button appears");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to the Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to the Taxes");
        pages.invoicingPage.taxes.click();
        BrowserUtilities.waitForTitleContains("Taxes");
        extentLogger.info("Clicking to the 'select all' checkbox");
        pages.invoicingPage.checkAllBox.click();
        List<WebElement> boxes = driver.findElements(
                By.xpath("//table//tr//td//div[@class='o_checkbox']//input"));
        boolean checked = true;

        for (int i = 0; i < boxes.size(); i++) {
            if(!boxes.get(i).isSelected()){
                checked = false;
            }
        }
        extentLogger.info("Verifying all checkboxes are selected");
        Assert.assertTrue(checked);
        extentLogger.info("Verifying Action dropdown is displayed");
        Assert.assertTrue(pages.invoicingPage.actionDropdown.isDisplayed());
    }

    @Test
    public void taxesListingAsKanban(){
        extentLogger = report.createTest("Testing- Taxes are listed as kanban");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to the Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to the Taxes");
        pages.invoicingPage.taxes.click();
        BrowserUtilities.waitForClickablility(pages.invoicingPage.kanbanView);
        extentLogger.info("clicking on to kanbanView button");
        pages.invoicingPage.kanbanView.click();
        extentLogger.info("Verifying- kanban button are selected");
        BrowserUtilities.waitForAttributeToContain(pages.invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(pages.invoicingPage.kanbanView.getAttribute("class").contains("active"));
        extentLogger.info("PASSED- - Kanban Format Button Is Selected");

    }
}

