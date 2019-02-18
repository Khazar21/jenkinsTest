package com.briteERP.utilities;

import com.briteERP.pages.*;

public class Pages {
    public HomePage homePage;
    public InvoicingPage invoicingPage;
    public MenuGeneral menuGeneral;
    public MenuUser menuUser;
    public OdooPage odooPage;
    public SignInPage signInPage;
    public ConfigurationPage configurationPage;

    public Pages(){
        homePage= new HomePage();
        invoicingPage= new InvoicingPage();
        menuGeneral= new MenuGeneral();
        menuUser= new MenuUser();
        odooPage= new OdooPage();
        signInPage= new SignInPage();
        configurationPage = new ConfigurationPage();
    }
}
