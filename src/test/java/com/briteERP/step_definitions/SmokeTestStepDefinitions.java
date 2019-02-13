package com.briteERP.step_definitions;

import com.briteERP.pages.InvoicingPage;
import com.briteERP.pages.MenuUser;
import com.briteERP.pages.SignInPage;
import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmokeTestStepDefinitions {
    SignInPage signInPage= new SignInPage();
    InvoicingPage invoicingPage= new InvoicingPage();
    MenuUser menuUser= new MenuUser();


    @When("user logs in as a manager")
    public void user_logs_in_as_a_manager() {
        signInPage.signIn("manager");
    }
    @When("clicks on Invoicing")
    public void clicks_on_Invoicing() {
        BrowserUtilities.waitForTitleContains("Inbox");
        menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Customer");
        invoicingPage.clickAllMenuModules();

    }
    @When("user clicks on {string}")

    public void user_clicks_on(String module){
       invoicingPage.module(module).click();
    }

    @Then("System should display {string} for each module")
    public void system_should_display_for_each_module(String header) {
        BrowserUtilities.waitForTitleContains(header);
        Assert.assertEquals(invoicingPage.pageHeader.getText(),header);
    }

}
