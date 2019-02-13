package com.briteERP.tests.functionalTests.login;

import com.briteERP.utilities.ApplicationConstants;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegative extends TestBase {
    @Test(groups = "regression")
    public void LoginInvalidCredentials(){
        extentLogger= report.createTest("Negative Login With Invalid Credentials");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in with invalid email and invalid password");
        pages.signInPage.signIn("invalidboth");
        extentLogger.info("Verifying error message");
        Assert.assertEquals(pages.signInPage.errorMessage.getText(), ApplicationConstants.LOGIN_ERROR_MESSAGE);
        extentLogger.info("PASSED Negative Login Test With Invalid Credentials");
    }
    @Test
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
    @Test
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
