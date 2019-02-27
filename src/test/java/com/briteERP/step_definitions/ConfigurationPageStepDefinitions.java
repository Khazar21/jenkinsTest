package com.briteERP.step_definitions;

import com.briteERP.pages.*;
import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConfigurationPageStepDefinitions {
    SignInPage signInPage= new SignInPage();
    ConfigurationPage configurationPage = new ConfigurationPage();

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

    @Given("user clicks first checkbox next to 'Tax Name', all checkboxes are selected by default")
    public void user_clicks_first_checkbox_all_checkboxes_are_selected_by_default(){
        List<WebElement> boxes = Driver.getDriver().findElements(By.xpath("//table//tr//td//div[@class='o_checkbox']//input"));
        boolean checked = true;

        for (int i = 0; i < boxes.size(); i++) {
            if(!boxes.get(i).isSelected()){
                checked = false;
            }
        }
        Assert.assertTrue(checked);
    }

    @Given("Action dropdown is displayed by default")
    public void action_dropdown_is_displayed_by_default(){
        Assert.assertTrue(configurationPage.actionDropdown.isDisplayed());
    }

    @Then("user should see Search... keyword in a searchbox by default")
    public void user_should_see_Search_keyword_in_a_searchbox_by_default() {
        Assert.assertEquals(configurationPage.searchInput.getAttribute("placeholder"), "Search...");
    }

    @Then("user should see invoices listed as list by default")
    public void user_should_see_invoices_listed_as_list_by_default() {
        Assert.assertTrue(configurationPage.listView.getAttribute("class").contains("active"));

    }

    @Then("invoices should be listed as kanban")
    public void invoices_should_be_listed_as_kanban() {
        BrowserUtilities.waitForAttributeToContain(configurationPage.kanbanView, "class", "active");
        Assert.assertTrue(configurationPage.kanbanView.getAttribute("class").contains("active"));
    }

}
