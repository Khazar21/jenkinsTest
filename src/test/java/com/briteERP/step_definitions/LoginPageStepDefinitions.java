package com.briteERP.step_definitions;

import com.briteERP.pages.OdooPage;
import com.briteERP.pages.SignInPage;
import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import com.briteERP.utilities.Pages;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class LoginPageStepDefinitions {
    OdooPage odooPage= new OdooPage();
    SignInPage signInPage= new SignInPage();

    @Given("user is in sign in page")
    public void user_is_in_sign_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        odooPage.briteERPDemo.click();
    }

    @When("user inputs valid {string} and {string}")
    public void user_inputs_valid_and(String username, String password) {
        signInPage.email.sendKeys(username);
        signInPage.password.sendKeys(password);
        signInPage.loginButton.click();
    }

    @Then("System displays the page with title {string}")
    public void system_displays_the_page_with_title(String title) {
        BrowserUtilities.waitForTitleContains(title);
        Assert.assertEquals(Driver.getDriver().getTitle(),title);
    }

}
