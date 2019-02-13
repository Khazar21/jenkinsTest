package com.briteERP.pages;

import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-default']")
    public WebElement selectDataBase;
    @FindBy(id = "login")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;


    public void signIn(String user){
        if (user.equalsIgnoreCase("manager")) {
            email.sendKeys(ConfigurationReader.getProperty("emailLunchInvoicingManager"));
            password.sendKeys(ConfigurationReader.getProperty("passwordLunchInvoicingManager"));
            loginButton.click();
        } else if (user.equalsIgnoreCase("user")) {
            email.sendKeys(ConfigurationReader.getProperty("emailLunchInvoicingUser"));
            password.sendKeys(ConfigurationReader.getProperty("passwordLunchInvoicingUser"));
            loginButton.click();
        }else if (user.equalsIgnoreCase("invalidemail")) {
            email.sendKeys(ConfigurationReader.getProperty("invalidEmail"));
            password.sendKeys(ConfigurationReader.getProperty("passwordLunchInvoicingManager"));
            loginButton.click();
        } else if (user.equalsIgnoreCase("invalidpassword")) {
            email.sendKeys(ConfigurationReader.getProperty("emailLunchInvoicingManager"));
            password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
            loginButton.click();
        } else if (user.equalsIgnoreCase("invalidboth")) {
            email.sendKeys(ConfigurationReader.getProperty("invalidEmail"));
            password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
            loginButton.click();
        }
    }
}
