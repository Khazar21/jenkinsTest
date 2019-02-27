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
    @Given("user clicks on Master Data")
    public void user_clicks_on_Master_Data() {
        invoicingPage.purchasesMasterData.click();
    }

    @When("user clicks on Vendors button")
    public void user_clicks_on_Vendors_button() {
        invoicingPage.vendors.click();
    }

    @Then("user should see Search... keyword is displayed")
    public void user_should_see_keyword_is_displayed() {
        Assert.assertEquals(invoicingPage.searchInput.getAttribute("placeholder"), "Search...");
    }

    @Then("user should see Create button is clickable")
    public void user_should_see_Create_button_is_clickable() {
        invoicingPage.createButton.click();
    }

    @Then("user should see Import button is clickable")
    public void user_should_see_Import_button_is_clickable() {
        invoicingPage.importButton.click();
    }

    @Then("user should see Kanban format button invoices is displayed")
    public void user_should_see_Kanban_format_button_invoices_is_displayed() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(invoicingPage.kanbanView.getAttribute("class").contains("active"));
    }

    @Then("user should see Vendors are listed as List format type by default.")
    public void user_should_see_Vendors_are_listed_as_List_format_type_by_default() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.listView, "class", "active");
        Assert.assertTrue(invoicingPage.listView.getAttribute("class").contains("active"));

    }

    @Then("user should be create an account")
    public void user_should_be_create_an_account() {
       invoicingPage.accounting.click();
    }

    @When("user clicks on Purchasable Products button")
    public void user_clicks_on_Purchasable_Products_button() {
        invoicingPage.purchasableProducts.click();
    }

    @Then("user should see Purchasable Products are listed as List format type by default.")
    public void user_should_see_Purchasable_Products_are_listed_as_List_format_type_by_default() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.listView, "class", "active");
        Assert.assertTrue(invoicingPage.listView.getAttribute("class").contains("active"));
    }

    @Then("user should see Product's pictures can appear clicking Kanban format button")
    public void user_should_see_Product_s_pictures_can_appear_clicking_Kanban_format_button() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(invoicingPage.kanbanView.getAttribute("class").contains("active"));
    }
    @Then("user should see Purchasable Products are clicking Load File can be import")
    public void user_should_see_Purchasable_Products_are_clicking_Load_File_can_be_import() {
        invoicingPage.importButton.click();
    }








}
