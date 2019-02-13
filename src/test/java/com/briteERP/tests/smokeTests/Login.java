package com.briteERP.tests.smokeTests;

import com.briteERP.utilities.ApplicationConstants;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Login extends TestBase {
    @Test(groups = "smoke")
    public void positiveLoginManager(){
        extentLogger= report.createTest("Positive Login as a Manager");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in with valid Manager credentials");
        pages.signInPage.signIn("manager");
        extentLogger.info("Verifying title");
        Assert.assertTrue(driver.getTitle().contains("Odoo"));
        extentLogger.info("PASSED- Positive Login Test");
    }
    @Test(groups = "smoke")
    public void LoginInvalidEmail(){
        extentLogger= report.createTest("Negative Login With Invalid Email");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in with invalid email");
        pages.signInPage.signIn("invalidemail");
        extentLogger.info("Verifying error message");
        Assert.assertEquals(pages.signInPage.errorMessage.getText(), ApplicationConstants.LOGIN_ERROR_MESSAGE);
        extentLogger.info("PASSED Negative Login Test With Invalid Email");
    }
    @Test (groups = "smoke")
    public void LoginInvalidPassword(){
        extentLogger= report.createTest("Negative Login With Invalid Password");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in with invalid password");
        pages.signInPage.signIn("invalidpassword");
        extentLogger.info("Verifying error message");
        Assert.assertEquals(pages.signInPage.errorMessage.getText(), ApplicationConstants.LOGIN_ERROR_MESSAGE);
        extentLogger.info("PASSED Negative Login Test With Invalid Password");
    }
}
