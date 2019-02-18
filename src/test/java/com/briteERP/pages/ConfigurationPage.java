package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationPage {
    public ConfigurationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement checkBoxOfPayTerms;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//li[contains(text(),'Payment Terms')]")
    public WebElement headerPaymentTerms;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[2]")
    public WebElement newHeaders;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement paymentTermsInput;

    @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement paymentTermsText;

    @FindBy(xpath = "//div[@class='table-responsive']//a")
    public WebElement addingAnItem;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement createTermsPopUp;

    @FindBy(xpath = "//div[@name='value']/div[3]/input")
    public WebElement termTypeFixAmount;

    @FindBy(xpath = "//input[@name='value_amount']")
    public WebElement termTypeValue;

    @FindBy(xpath = "//div[@name='value']/div[2]/input")
    public WebElement termTypePercent;

    @FindBy(xpath = "//input[@data-value='last_day_following_month']")
    public WebElement duDateCompLastDayCurrentMonth;

    @FindBy(xpath = "//input[@data-value='last_day_current_month']")
    public WebElement duDateCompLastDayOfFollowMonth;

    @FindBy(xpath = "//span[contains(text(),'Save & New')]")
    public WebElement saveAndNew;

    @FindBy(xpath = "//div[@class='modal-footer']//button")
    public WebElement saveAndClose;

    @FindBy(xpath = "//span[@class='o_subtitle text-muted small']")
    public WebElement odooServerErrorMessage;

    @FindBy(xpath = "//button[@aria-label='Delete row 1']")
    public WebElement deleteRow1Item;

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement importButton;


    //Import Button in Payment Terms
    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFile;

    @FindBy(xpath = "//p[contains(text(),'Select a CSV or Excel file to import.')]")
    public WebElement textMsgForLoadFile;

    @FindBy(xpath = "//a[@class='pull-right']")
    public WebElement helpTextMsg;

    @FindBy(xpath = "//input[@placeholder='No file chosen...']")
    public WebElement textInSearchBox;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    //Payment Acquires page
    @FindBy(xpath = "//li[contains(text(),'Payment Acquirers')]")
    public WebElement headerTextPaymAcq;

    @FindBy(xpath = "//div[@name='pending_msg']//div[contains(text(),'You')]")
    public WebElement pendingMessage;

    @FindBy(xpath = "//a[contains(text(),'Configuration')]")
    public WebElement configurationButton;

    @FindBy(xpath = "//a[@name='journal_id']")
    public WebElement paymentJournal;


    //Attachment(s)
    @FindBy(xpath = "//button[contains(text(),'Attachment(s)')]")
    public WebElement attachmentDropdown;

    @FindBy(name = "ufile")
    public WebElement addInAttachment;

    @FindBy(xpath = "//span[@data-original-title='Delete this attachment']")
    public WebElement deleteAddedItem;

    @FindBy(xpath = "//span[contains(text(),'Ok')]")
    public WebElement confirmationDeleting;


    //Confirmation in new page in in Acquires page
    @FindBy(xpath = "//ol[@class='breadcrumb']")
    public WebElement headerInNewPage;

    @FindBy(xpath = "//span[contains(text(),'altun')]")
    public WebElement headerOnPopUpInNewPage;

    @FindBy(name = "type")
    public WebElement typeInNewPage;

    @FindBy(xpath = "//span[@name='code']")
    public WebElement shortCodeInNewPage;

    @FindBy(xpath = "//span[@name='sequence_number_next']")
    public WebElement nextNumberInNewPage;


    //Advanced Settings
    @FindBy(xpath = "//a[contains(text(),'Advanced Settings')]")
    public WebElement advancedSettings;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement edit;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement journalName;

    @FindBy(xpath = "//select[@name ='type']")
    public WebElement typeInJournalName;


    //Action dropdown
    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionDropdown;


    @FindBy(xpath = "//a[@data-index='4']")
    public WebElement unpaidInvoicesInActDropdown;

    @FindBy(xpath = "//div[@name='partner_id']//input[@type='text']")
    public WebElement vendorDropdwnInActDropdown;

    @FindBy(xpath = "//li[@class='ui-menu-item']/a")
    public WebElement firstElementInACDvendorDrp;

    @FindBy(xpath = "//li[@class='o_m2o_dropdown_option ui-menu-item'][2]")
    public WebElement createAndEditInVendor;

    @FindBy(xpath = "//div[@class='o_radio_item']//input[@data-value='company']")
    public WebElement companyInEditInVendor;

    @FindBy(xpath = "//div[@class='oe_title']/h1/input")
    public WebElement nameInEditInVendor;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement street_Create_Vendor;

    @FindBy(xpath = "//input[@name='street2']")
    public WebElement street2_Create_Vendor;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city_Create_Vendor;

    @FindBy(xpath = "//input[@placeholder='State']")
    public WebElement state_Create_Vendor;

//    @FindBy(xpath = "/html[1]/body[1]/ul[12]/li[9]")
//    public WebElement createAndEditState_Create_Vendor;
//
//    @FindBy(xpath = "//table[@class='o_group o_inner_group']//input[@name='name']")
//    public WebElement stateNameAdd_Create_Vendor;
//
//    @FindBy(xpath = "//table[@class='o_group o_inner_group']//input[@name='code']")
//    public WebElement stateCodeAdd_Create_Vendor;

    @FindBy(xpath = "//ul[12]//li[8]//a[1]")
    public WebElement searchMore_Create_Vendor;

    @FindBy(xpath = "//ul[13]//li[8]//a[contains(text(),'Search More')]")
    public WebElement searchMoreCountry_Create_Vendor;

    @FindBy(xpath = "//div[@class='o_searchview']//input[@placeholder='Search...']")
    public WebElement searchBoxInput_Create_Vendor;

    @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[@class='o_data_row']")
    public WebElement applySearch_Create_Vendor;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']")
    public WebElement countryModifyInSearchBox_Create_Vendor;

    @FindBy(xpath = "//input[@placeholder='Country']")
    public WebElement selectingToCountry_Create_Vendor;

    @FindBy(xpath = "//ul[25]//li[4]")
    public WebElement countryAdd_Create_Vendor;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
    public WebElement saveInCreateStateCodeAdd_Create_Vendor;

    @FindBy(xpath = "//input[@placeholder='Tags...']")
    public WebElement tagsAdd_Create_Vendor;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneAdd_Create_Vendor;

    @FindBy(xpath = "//input[@name='mobile']")
    public WebElement mobileAdd_Create_Vendor;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailAdd_Create_Vendor;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement websiteAdd_Create_Vendor;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveIn_Create_Vendor;

    @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")
    public WebElement saveInUnpaidInvoices_Create_Vendor;






    @FindBy(xpath = "//input[@name='phone']")
    public WebElement PhoneAdd_Create_Vendor;






    @FindBy(xpath = "//input[@placeholder='Company']")
    public WebElement companyPlaceHolder;








}

