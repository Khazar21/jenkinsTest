package com.briteERP.step_definitions;

import com.briteERP.pages.InvoicingPage;
import com.briteERP.pages.MenuUser;
import com.briteERP.pages.OdooPage;
import com.briteERP.pages.SignInPage;
import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class InvoicingPageStepDefinitions {
    SignInPage signInPage= new SignInPage();
    InvoicingPage invoicingPage= new InvoicingPage();
    MenuUser menuUser= new MenuUser();
    OdooPage odooPage= new OdooPage();


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

    @Then("invoices should be listed as kanban")
    public void invoices_should_be_listed_as_kanban_ali() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(invoicingPage.kanbanView.getAttribute("class").contains("active"));
    }

    @Then("invoices should be listed as kanban")
    public void invoices_should_be_listed_as_kanban_ali_barnch() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(invoicingPage.kanbanView.getAttribute("class").contains("active"));
    }


}
