package com.briteERP.tests.functionalTests.login;

import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPositive extends TestBase{
    @Test(groups = "regression")
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
    @Test(groups = "regression")
    public void positiveLoginUser(){
        extentLogger= report.createTest("Positive Login as a User");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in with valid Manager credentials");
        pages.signInPage.signIn("user");
        extentLogger.info("Verifying title");
        Assert.assertTrue(driver.getTitle().contains("Odoo"));
        extentLogger.info("PASSED- Positive Login Test");
    }
}
