package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuGeneral {
    public MenuGeneral(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "navbar-brand logo")
    public WebElement briteErpLogo;
    @FindBy(xpath = "//span[.='Home']")
    public WebElement home;
    @FindBy(xpath = "//span[.='Shop']")
    public WebElement shop;
    @FindBy(xpath = "//span[.='Events']")
    public WebElement events;
    @FindBy(xpath = "//span[.='Forum']")
    public WebElement forum;
    @FindBy(xpath = "//span[.='Blog']")
    public WebElement blog;
    @FindBy(xpath = "//span[.='Presentations']")
    public WebElement presentations;
    @FindBy(xpath = "//span[.='Contact us']")
    public WebElement contactUs;
    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//li[@class='dropdown open']/a")
    public WebElement loggedInUser;
    @FindBy(xpath = "//a[.='My Account']")
    public WebElement myAccount;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;


}
