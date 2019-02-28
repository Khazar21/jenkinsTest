package com.briteERP.step_definitions;

import com.briteERP.pages.*;
import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class InvoicingPageStepDefinitions {
    SignInPage signInPage= new SignInPage();
    InvoicingPage invoicingPage= new InvoicingPage();
    MenuUser menuUser= new MenuUser();
    OdooPage odooPage= new OdooPage();
    ConfigurationPage configurationPage = new ConfigurationPage();


    @Given("user is in invoicing page logged as a Manager")
    public void user_is_in_invoicing_page_logged_as_a_Manager() {
        odooPage.briteERPDemo.click();
        signInPage.signIn("manager");
        BrowserUtilities.waitForTitleContains("Inbox");
        menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Customer");
    }

    @Given("system should display Customer Invoices page")
    public void system_should_display_Customer_Invoices_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Customer Invoices - Odoo");
    }

    @Then("user should see Search... keyword in a searchbox by default")
    public void user_should_see_Search_keyword_in_a_searchbox_by_default() {
        Assert.assertEquals(invoicingPage.searchInput.getAttribute("placeholder"), "Search...");
    }
    @Then("user should see invoices listed as list by default")
    public void user_should_see_invoices_listed_as_list_by_default() {
        Assert.assertTrue(invoicingPage.listView.getAttribute("class").contains("active"));

    }
    @When("user clicks on kanban view button")
    public void user_clicks_on_kanban_view_button() {
        invoicingPage.kanbanView.click();
    }

    @Then("invoices should be listed as kanban")
    public void invoices_should_be_listed_as_kanban() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(invoicingPage.kanbanView.getAttribute("class").contains("active"));
    }

    @When("user go to Management Invoices page in reporting")
    public void user_go_to_Management_Invoices_page_in_reporting() {
        invoicingPage.reportingManagement.click();
        invoicingPage.invoices.click();
    }

    @Then("Bar char should be displayed by default")
    public void bar_char_should_be_displayed_by_default() {
        Assert.assertTrue(invoicingPage.barChart.getAttribute("class").contains("active"));
    }

    @Then("click Pivot format")
    public void click_Pivot_format() {
        invoicingPage.pivotView.click();
    }

    @Then("Pivot for should be displayed on the screen")
    public void pivot_for_should_be_displayed_on_the_screen() {
        Assert.assertTrue(invoicingPage.pivotView.isEnabled());
    }

    @Then("click Chart format")
    public void click_Chart_format() {
        invoicingPage.pieChart.click();
    }

    @Then("Chart format should be displayed on the screen")
    public void chart_format_should_be_displayed_on_the_screen() {
        Assert.assertTrue(invoicingPage.pivotView.isEnabled());
    }

    @When("user clicks on PDF Reports")
    public void user_clicks_on_PDF_Reports() {
        invoicingPage.pdfReports.click();
    }

    @Then("user clicks on Aged Partner Balance")
    public void user_clicks_on_Aged_Partner_Balance() {
        invoicingPage.agedPartnerBalance.click();
    }

    @Then("system should display Aged Partner Balance text")
    public void system_should_display_Aged_Partner_Balance_text() {
        Assert.assertTrue(invoicingPage.innerHeadAgedPartnerBalance.isDisplayed());
    }


}
