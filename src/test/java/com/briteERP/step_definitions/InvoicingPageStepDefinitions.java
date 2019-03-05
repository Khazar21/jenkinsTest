package com.briteERP.step_definitions;

import com.briteERP.pages.*;
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
    ConfigurationPage configurationPage = new ConfigurationPage();
    MenuGeneral menuGeneral= new MenuGeneral();


    @Given("user is in invoicing page logged as a Manager")
    public void user_is_in_invoicing_page_logged_as_a_Manager() {
     //   odooPage.briteERPDemo.click();
        menuGeneral.signIn.click();
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

    }

    @When("user choose Computer Case product")
    public void user_choose_Computer_Case_product() {
        invoicingPage.productComputerCase.click();
    }


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
    @Then("system should display Print Button")
    public void system_should_display_Print_Button() {
        Assert.assertEquals(true, invoicingPage.printInAgedPartnerBalance.isDisplayed());
    }

    @Then("system should display Cancel Button")
    public void system_should_display_Cancel_Button() {
        Assert.assertEquals(true, invoicingPage.cancelInAgedPartnerBalance.isDisplayed());
    }



}