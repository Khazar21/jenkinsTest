package com.briteERP.step_definitions;

import com.briteERP.pages.InvoicingPage;
import com.briteERP.pages.MenuUser;
import com.briteERP.pages.OdooPage;
import com.briteERP.pages.SignInPage;
import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.*;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InvoicingPageStepDefinitions {
    SignInPage signInPage= new SignInPage();
    InvoicingPage invoicingPage= new InvoicingPage();
    MenuUser menuUser= new MenuUser();
    OdooPage odooPage= new OdooPage();


    @Given("user is in invoicing page logged as a Manager")
    public void user_is_in_invoicing_page_logged_as_a_Manager() {
     //   odooPage.briteERPDemo.click();
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

    @When("user click on {string}")
    public void user_click_on(String mod) {
       invoicingPage.module(mod);
    }



    @Then("user should see Vendor Bills listed as list by default")
    public void user_should_see_vendor_Bills_listed_as_list_by_default() {
        Assert.assertTrue(invoicingPage.listView.getAttribute("class").contains("active"));
    }
    @When("user click on Vendor kanban view button")
    public void customer_click_on_Vendor_kanban_view_button() {
        invoicingPage.kanbanView.click();
    }

    @Then("Vendor Bills should be listed as kanban")
    public void vendor_Bills_should_be_listed_as_kanban() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.kanbanView, "class", "active");
        Assert.assertTrue(invoicingPage.kanbanView.getAttribute("class").contains("active"));

    }

    @When("user click on Vendor Calendar view button")
    public void user_click_on_Vendor_Calendar_view_button() {
        invoicingPage.calendarView.click();
    }

    @Then("calendar button should display selected")
    public void calendar_button_should_display_selected() {
        BrowserUtilities.waitForAttributeToContain(invoicingPage.calendarView, "class", "active");
        Assert.assertTrue(invoicingPage.calendarView.getAttribute("class").contains("active"));
    }



    @When("user click on Create button")
    public void user_click_on_Create_button() {
        invoicingPage.createButton.click();
        BrowserUtilities.waitForClickablility(invoicingPage.createButton);
    }

    @Then("Draft Credit Note should be displayed")
    public void draft_Credit_Note_should_be_displayed() {
        Assert.assertTrue(invoicingPage.draftCreditNoteSheet.isDisplayed());
    }



    @When("user click on Vendor")
    public void user_click_on_Vendor() {
        invoicingPage.draftCreditNoteVendor.click();

        BrowserUtilities.waitForElementToBoVisible(invoicingPage.draftCreditNoteVendor);

    }

    @When("user choose any vendor dropdown")
    public void user_choose_any_vendor_dropdown() {
        invoicingPage.draftCreditNoteVendor1.click();
        BrowserUtilities.waitForClickablility(invoicingPage.vendorCreditNoteAddAnItem);
    }

    @When("click on Add an item")
    public void click_on_Add_an_item() {

        invoicingPage.vendorCreditNoteAddAnItem.click();
        BrowserUtilities.waitForClickablility(invoicingPage.vendorCreditNoteAddAnItem);
        invoicingPage.addAnItemInput.click();
    }

    @Then("Search More and Credit and Edit options are displayed")
    public void search_More_and_Credit_and_Edit_options_are_displayed() {
        Assert.assertTrue(invoicingPage.searchMore.isEnabled());
        Assert.assertTrue(invoicingPage.creditAndEdit.isEnabled());
    }





    @When("user choose {string}")
    public void user_choose(String product) {

invoicingPage.getProducts(product);
    }

    @Then("user should see all product information {string},{string} ,{string} ,{string} ,{string}  accordingly:")
    public void user_should_see_all_product_information_accordingly(String product, String description, String quantity, String unitPrice, String amount) throws InterruptedException {
        Thread.sleep(1000);
       // BrowserUtilities.waitForElementToBoVisible(invoicingPage.product);
        Assert.assertTrue(product.contains(invoicingPage.product.getText()));
        Thread.sleep(1000);
        Assert.assertEquals(description,invoicingPage.productDescription.getAttribute("value"));
        Thread.sleep(2000);
    //   Assert.assertEquals(quantity,invoicingPage.productQuantity.getText());
        Thread.sleep(1000);
       // Assert.assertEquals(unitPrice,invoicingPage.productUnitPrice.getText());
        Assert.assertEquals(amount,invoicingPage.productAmount.getText());
        BrowserUtilities.waitForClickablility(invoicingPage.paymentDiscardButton);
        invoicingPage.paymentDiscardButton.click();
        invoicingPage.warningOkay.click();
   /*   //  BrowserUtilities.waitForTitleContains("");
        MenuUser menuUser= new MenuUser();
        menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains(" Odo");*/

    }

    @When("user choose Computer Case product")
    public void user_choose_Computer_Case_product() {
        invoicingPage.productComputerCase.click();
    }

   /* @Then("user should see all product information accordingly")
    public void user_should_see_all_product_information_accordingly() {
        Assert.assertTrue(invoicingPage.productDescription.isDisplayed());
        Assert.assertTrue(invoicingPage.productQuantity.isDisplayed());
        Assert.assertTrue(invoicingPage.productUnitPrice.isDisplayed());
        Assert.assertTrue(invoicingPage.productAmount.isDisplayed());
    }*/


    @When("user delete delete quantity")
    public void user_delete_delete_quantity() {
        invoicingPage.productQuantity.click();
    }

    @When("user edit quantity by entering {int}")
    public void user_edit_quantity_by_entering(Integer amount) throws InterruptedException {
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DELETE).perform();
        invoicingPage.productQuantity.click();
        Thread.sleep(2000);
        actions.sendKeys(""+ amount+ Keys.ENTER).perform();
        actions.doubleClick(invoicingPage.productQuantity).sendKeys(Keys.ENTER);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
    }

    @Then("user should see new value is displayed")
    public void user_should_see_new_value_is_displayed() {
        BrowserUtilities.textToBePresentInElementValue(invoicingPage.productQuantity);
        Assert.assertEquals(invoicingPage.productQuantity.getText(), "50.000");
    }

    @When("user click delete button")
    public void user_click_delete_button() {
        BrowserUtilities.waitForClickablility(invoicingPage.productDelete);
        invoicingPage.productDelete.click();
    }

    @Then("all product information returns the blank")
    public void all_product_information_returns_the_blank() throws InterruptedException {
        Thread.sleep(2000);

        Assert.assertFalse(invoicingPage.elementDisplayed(invoicingPage.productDescription));
        Assert.assertFalse(invoicingPage.elementDisplayed(invoicingPage.productUnitPrice));
        Assert.assertFalse(invoicingPage.elementDisplayed(invoicingPage.productQuantity));
        Assert.assertFalse(invoicingPage.elementDisplayed(invoicingPage.productDescription));
        Assert.assertFalse(invoicingPage.elementDisplayed(invoicingPage.productAmount));

    }



    @Then("user should see payment options")
    public void user_should_see_payment_options() {
        BrowserUtilities.waitForTitleContains("New");

        Assert.assertTrue(Driver.getDriver().getTitle().contains("New"));
    }

    @Then("user should see current payment Date should display")
    public void user_should_see_current_payment_Date_should_display() {
        System.out.println(invoicingPage.paymentDate.getText());
        BrowserUtilities.waitForElementToBoVisible(invoicingPage.paymentDate);
            String today= new SimpleDateFormat("mm/dd/yyyy").format(new Date());

        Assert.assertEquals(today, invoicingPage.paymentDate.getAttribute("value"));
    }


    @When("user click on Internal Transfer  as a payment type")
    public void user_click_on_Internal_Transfer_as_a_payment_type() {
        invoicingPage.paymentTypeInternalTransfer.click();
        BrowserUtilities.waitForClickablility(invoicingPage.paymentTypeInternalTransfer);
    }

    @When("user click on Discard button")
    public void user_click_on_Discard_button() {
      invoicingPage.paymentDiscardButton.click();
        BrowserUtilities.waitForClickablility(invoicingPage.paymentDiscardButton);

    }

    @Then("system should throw warning message")
    public void system_should_throw_warning_message() {
        Assert.assertEquals(invoicingPage.paymentWarningMessage.getText(), "The record has been modified, your changes will be discarded. Do you want to proceed?");
    }



}
