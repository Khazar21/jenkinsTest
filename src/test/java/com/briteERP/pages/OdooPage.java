package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OdooPage {
    public OdooPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Demo')]/../a)[1]")
    public WebElement briteERP;

    @FindBy(xpath = "//a[contains(text(),'Demo')]")
    public WebElement briteERPDemo;

    @FindBy(xpath = "//a[contains(text(),'Test')]")
    public WebElement test;
}
