/*package Modules.TE.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

public class Eloqua_1 {

	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;
	
	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private GlobalFunction globalFunctionObj = null;
	
	//ELOQUA OBJECTS
	
	private By customerSupport_Email = null;
	private By customerSupport_Company = null;
	private By customerSupport_FirstName = null;
	private By customerSupport_LastName = null;
	private By customerSupport_Address = null;
	private By customerSupport_City = null;
	private By customerSupport_State = null;
	private By customerSupport_Country = null;
	private By customerSupport_PostalCode = null;
	private By customerSupport_Phone = null;
	private By customerSupport_Subject = null;
	private By customerSupport_Category = null;
	private By customerSupport_Question = null;
	private By customerSupport_Submit = null;
	private By customerSupport_SameAddressRadioBtn = null;
	private By customerSupport_ConfirmAddressBtn = null;
	private By customerSupport_ConfirmMailSubmitted = null;

	private By sensorSolution_Email = null;
	private By sensorSolution_FirstName = null;
	private By sensorSolution_LastName = null;
	private By sensorSolution_Company = null;
	private By sensorSolution_BusinessPhone = null;
	private By sensorSolution_Country = null;
	private String sensorSolution_Selectcountry = null;
	private By sensorSolution_ProductsListArrow = null;
	private By sensorSolution_ProductsList = null;
	private String sensorSolution_ProductListOther = null;
	private By sensorSolution_InquiryDetails = null;
	private By sensorSolution_Industry = null;
	private String sensorSolution_IndustrySelect = null;
	private By sensorSolution_IndustryOption = null;
	private By sensorSolution_Submit = null;
	
	private By medicalIndustry_FirstName = null;
	private By medicalIndustry_LastName = null;
	private By medicalIndustry_Title = null;
	private By medicalIndustry_Company = null;
	private By medicalIndustry_Address = null;
	private By medicalIndustry_City = null;
	private By medicalIndustry_State = null;
	private By medicalIndustry_Country = null;
	private String medicalIndustry_Selectcountry=null;
	private By medicalIndustry_State = null; 
	private String medicalIndustry_SelectState=null;
	private By medicalIndustry_PostalCode = null;
	private By medicalIndustry_Phone = null;
	private By medicalIndustry_Email = null;
	private By medicalIndustry_Submit = null;
	private By medicalIndustry_SameAddressRadioBtn = null;
	private By medicalIndustry_ConfirmAddressBtn = null;
	private By medicalIndustry_Capability = null;
	private By medicalIndustry_OtherCapability = null;
	private By medicalIndustry_Application = null;
	private By medicalIndustry_OtherApplication = null;
	private By medicalIndustry_SiteReference = null;
	private By medicalIndustry_SiteOtherReference = null;
	
	private By subscription_EmailAddress = null;
	private By subscription_AccessSubscriptions = null;
	private By subscription_Error = null;
	//private By subscription_Cancel = null;
	
	private By download_Link = null;

	private By login_Link = null;
	private By login_SecondLink = null;
	private By login_UserName = null;
	private By login_Password = null;
	private By login_Button = null;
	
	private By registeration_Email = null;
	private By registeration_ConfirmEmail = null;
	private By registeration_Password = null;
	private By registeration_FirstName = null;
	private By registeration_LastName = null;
	private By registeration_PhoneNo = null;
	private By registeration_Company = null;
	private By registeration_Role = null;
	private By registeration_Industry = null;
	private By registeration_Country = null;
	private By registeration_City = null;
	private By registeration_PostalCode = null;
	private By registeration_Submit = null;
	private By registeration_Error_Msg = null;
	private By registeration_useSameAddressRadio = null;
	private By registeration_submitAddressConfirmation= null;
	
	private By liveChat_Link = null;
	private By liveChat_Language = null;
	private By liveChat_FirstName = null;
	private By liveChat_LastName = null;
	private By liveChat_Email = null;
	private By liveChat_ChatNow = null;
	private By liveChat_NoAgent_Btn = null;
	
	// RPIT OBJECTS
	private By RPIT_FirstName = null;
	private By RPIT_LastName = null;
	private By RPIT_Company = null;
	private By RPIT_Address = null;
	private By RPIT_City = null;
	private By RPIT_CountryArrow = null;
	private String RPIT_CountrySelect_Element = null;
	private By RPIT_JobRoleArrow = null;
	private String RPIT_JobRoleSelect_Element = null;
	private By RPIT_Email = null;
	private By RPIT_Telephone = null;
	private By RPIT_QuestionText = null;
	private By RPIT_Submit_Btn = null;
	
	// SENSOR NEWSLETTER OBJECTS
	private By SensorNewsletter_Email = null;
	private By SensorNewsletter_FirstName = null;
	private By SensorNewsletter_LastName = null;
	private By SensorNewsletter_CountryArrow = null;
	private String SensorNewsletter_CountrySelect_Element = null;
	private By SensorNewsletter_Indutry_AreaOfInterest_Arrow = null;
	private String SensorNewsletter_Indutry_AreaOfInterest_SelectElement = null;
	private By SensorNewsletter_Submit_Btn = null;
	
	// SENSOR CONTACT US CHINA CAMPAIGN
	private By SensorChinaCampaign_LastName = null;
	private By SensorChinaCampaign_FirstName = null;
	private By SensorChinaCampaign_Company = null;
	private By SensorChinaCampaign_Email = null;
	private By SensorChinaCampaign_BusinessPhone = null;
	private By SensorChinaCampaign_CountryArrow = null;
	private String SensorChinaCampaign_CountrySelect_Element = null;
	private By SensorChinaCampaign_City = null;
	private By SensorChinaCampaign_InterestedProducts = null;
	private String SensorChinaCampaign_InterestedProducts_Element = null;
	private By SensorChinaCampaign_InterestedIndustry = null;
	private String SensorChinaCampaign_InterestedIndustry_Element = null;
	private By SensorChinaCampaign_TypeOfDemand = null;
	private String SensorChinaCampaign_TypeOfDemand_Element = null;
	private By SensorChinaCampaign_SpecificNeeds = null;
	private By SensorChinaCampaign_Submit_Btn = null;
	
	
	public By getSensorChinaCampaign_LastName() {
		return SensorChinaCampaign_LastName;
	}

	public By getSensorChinaCampaign_FirstName() {
		return SensorChinaCampaign_FirstName;
	}

	public By getSensorChinaCampaign_Company() {
		return SensorChinaCampaign_Company;
	}

	public By getSensorChinaCampaign_Email() {
		return SensorChinaCampaign_Email;
	}

	public By getSensorChinaCampaign_BusinessPhone() {
		return SensorChinaCampaign_BusinessPhone;
	}

	public By getSensorChinaCampaign_CountryArrow() {
		return SensorChinaCampaign_CountryArrow;
	}

	public String getSensorChinaCampaign_CountrySelect_Element() {
		return SensorChinaCampaign_CountrySelect_Element;
	}

	public By getSensorChinaCampaign_City() {
		return SensorChinaCampaign_City;
	}

	public By getSensorChinaCampaign_InterestedProducts() {
		return SensorChinaCampaign_InterestedProducts;
	}

	public String getSensorChinaCampaign_InterestedProducts_Element() {
		return SensorChinaCampaign_InterestedProducts_Element;
	}

	public By getSensorChinaCampaign_InterestedIndustry() {
		return SensorChinaCampaign_InterestedIndustry;
	}

	public String getSensorChinaCampaign_InterestedIndustry_Element() {
		return SensorChinaCampaign_InterestedIndustry_Element;
	}

	public By getSensorChinaCampaign_TypeOfDemand() {
		return SensorChinaCampaign_TypeOfDemand;
	}

	public String getSensorChinaCampaign_TypeOfDemand_Element() {
		return SensorChinaCampaign_TypeOfDemand_Element;
	}

	public By getSensorChinaCampaign_SpecificNeeds() {
		return SensorChinaCampaign_SpecificNeeds;
	}

	public By getSensorChinaCampaign_Submit_Btn() {
		return SensorChinaCampaign_Submit_Btn;
	}

	public By getSensorNewsletter_Email() {
		return SensorNewsletter_Email;
	}

	public By getSensorNewsletter_FirstName() {
		return SensorNewsletter_FirstName;
	}

	public By getSensorNewsletter_LastName() {
		return SensorNewsletter_LastName;
	}

	public By getSensorNewsletter_CountryArrow() {
		return SensorNewsletter_CountryArrow;
	}

	public String getSensorNewsletter_CountrySelect_Element() {
		return SensorNewsletter_CountrySelect_Element;
	}

	public By getSensorNewsletter_Indutry_AreaOfInterest_Arrow() {
		return SensorNewsletter_Indutry_AreaOfInterest_Arrow;
	}

	public String getSensorNewsletter_Indutry_AreaOfInterest_SelectElement() {
		return SensorNewsletter_Indutry_AreaOfInterest_SelectElement;
	}

	public By getSensorNewsletter_Submit_Btn() {
		return SensorNewsletter_Submit_Btn;
	}

	public By getRPIT_FirstName() {
		return RPIT_FirstName;
	}

	public By getRPIT_LastName() {
		return RPIT_LastName;
	}

	public By getRPIT_Company() {
		return RPIT_Company;
	}

	public By getRPIT_Address() {
		return RPIT_Address;
	}

	public By getRPIT_City() {
		return RPIT_City;
	}

	public By getRPIT_CountryArrow() {
		return RPIT_CountryArrow;
	}

	public String getRPIT_CountrySelect_Element() {
		return RPIT_CountrySelect_Element;
	}

	public By getRPIT_JobRoleArrow() {
		return RPIT_JobRoleArrow;
	}

	public String getRPIT_JobRoleSelect_Element() {
		return RPIT_JobRoleSelect_Element;
	}

	public By getRPIT_Email() {
		return RPIT_Email;
	}

	public By getRPIT_Telephone() {
		return RPIT_Telephone;
	}

	public By getRPIT_QuestionText() {
		return RPIT_QuestionText;
	}

	public By getRPIT_Submit_Btn() {
		return RPIT_Submit_Btn;
	}

	public By getSensorSolution_Country() {
		return sensorSolution_Country;
	}

	public String getSensorSolution_Selectcountry() {
		return sensorSolution_Selectcountry;
	}

	public By getMedicalIndustry_State() {
		return medicalIndustry_State;
	}

	public String getMedicalIndustry_SelectState() {
		return medicalIndustry_SelectState;
	}

	public By getRegisteration_useSameAddressRadio() {
		return registeration_useSameAddressRadio;
	}

	public By getRegisteration_submitAddressConfirmation() {
		return registeration_submitAddressConfirmation;
	}

	public By getSubscription_Error() {
		return subscription_Error;
	}

	public By getLiveChat_NoAgent_Btn() {
		return liveChat_NoAgent_Btn;
	}

	public By getRegisteration_Error_Msg() {
		return registeration_Error_Msg;
	}

	public By getCustomerSupport_Email() {
		return customerSupport_Email;
	}

	public By getCustomerSupport_Company() {
		return customerSupport_Company;
	}

	public By getCustomerSupport_FirstName() {
		return customerSupport_FirstName;
	}

	public By getCustomerSupport_LastName() {
		return customerSupport_LastName;
	}

	public By getCustomerSupport_Address() {
		return customerSupport_Address;
	}

	public By getCustomerSupport_City() {
		return customerSupport_City;
	}

	public By getCustomerSupport_State() {
		return customerSupport_State;
	}

	public By getCustomerSupport_Country() {
		return customerSupport_Country;
	}

	public By getCustomerSupport_PostalCode() {
		return customerSupport_PostalCode;
	}

	public By getCustomerSupport_Phone() {
		return customerSupport_Phone;
	}

	public By getCustomerSupport_Subject() {
		return customerSupport_Subject;
	}

	public By getCustomerSupport_Category() {
		return customerSupport_Category;
	}

	public By getCustomerSupport_Question() {
		return customerSupport_Question;
	}

	public By getCustomerSupport_Submit() {
		return customerSupport_Submit;
	}
	
	public By getCustomerSupport_SameAddressRadioBtn() {
		return customerSupport_SameAddressRadioBtn;
	}

	public By getCustomerSupport_ConfirmAddressBtn() {
		return customerSupport_ConfirmAddressBtn;
	}

	public By getCustomerSupport_ConfirmMailSubmitted() {
		return customerSupport_ConfirmMailSubmitted;
	}

	public By getSensorSolution_Email() {
		return sensorSolution_Email;
	}

	public By getSensorSolution_FirstName() {
		return sensorSolution_FirstName;
	}

	public By getSensorSolution_LastName() {
		return sensorSolution_LastName;
	}

	public By getSensorSolution_Company() {
		return sensorSolution_Company;
	}

	public By getSensorSolution_BusinessPhone() {
		return sensorSolution_BusinessPhone;
	}

	public By getSensorSolution_Country() {
		return sensorSolution_Country;
	}

	public By getSensorSolution_ProductsListArrow() {
		return sensorSolution_ProductsListArrow;
	}

	public By getSensorSolution_ProductsList() {
		return sensorSolution_ProductsList;
	}

	public String getSensorSolution_ProductListOther() {
		return sensorSolution_ProductListOther;
	}

	public By getSensorSolution_InquiryDetails() {
		return sensorSolution_InquiryDetails;
	}

	public By getSensorSolution_Industry() {
		return sensorSolution_Industry;
	}
	
	public String getSensorSolution_IndustrySelect() {
		return sensorSolution_IndustrySelect;
	}

	public By getSensorSolution_Industryoptions() {
		return sensorSolution_IndustryOption;
	}

	public By getSensorSolution_Submit() {
		return sensorSolution_Submit;
	}

	public By getMedicalIndustry_FirstName() {
		return medicalIndustry_FirstName;
	}

	public By getMedicalIndustry_LastName() {
		return medicalIndustry_LastName;
	}

	public By getMedicalIndustry_Title() {
		return medicalIndustry_Title;
	}

	public By getMedicalIndustry_Company() {
		return medicalIndustry_Company;
	}

	public By getMedicalIndustry_Address() {
		return medicalIndustry_Address;
	}

	public By getMedicalIndustry_City() {
		return medicalIndustry_City;
	}

	public By getMedicalIndustry_State() {
		return medicalIndustry_State;
	}

	public By getMedicalIndustry_Country() {
		return medicalIndustry_Country;
	}

	
	public PropertyHandler getPropertyHandlerObj() {
		return propertyHandlerObj;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public By getSensorSolution_IndustryOption() {
		return sensorSolution_IndustryOption;
	}

	public String getMedicalIndustry_Selectcountry() {
		return medicalIndustry_Selectcountry;
	}

	public By getMedicalIndustry_PostalCode() {
		return medicalIndustry_PostalCode;
	}

	public By getMedicalIndustry_Phone() {
		return medicalIndustry_Phone;
	}

	public By getMedicalIndustry_Email() {
		return medicalIndustry_Email;
	}

	public By getMedicalIndustry_Capability() {
		return medicalIndustry_Capability;
	}

	public By getMedicalIndustry_OtherCapability() {
		return medicalIndustry_OtherCapability;
	}

	public By getMedicalIndustry_Application() {
		return medicalIndustry_Application;
	}

	public By getMedicalIndustry_OtherApplication() {
		return medicalIndustry_OtherApplication;
	}

	public By getMedicalIndustry_SiteReference() {
		return medicalIndustry_SiteReference;
	}

	public By getMedicalIndustry_SiteOtherReference() {
		return medicalIndustry_SiteOtherReference;
	}

	public By getMedicalIndustry_Submit() {
		return medicalIndustry_Submit;
	}

	public By getMedicalIndustry_SameAddressRadioBtn() {
		return medicalIndustry_SameAddressRadioBtn;
	}

	public By getMedicalIndustry_ConfirmAddressBtn() {
		return medicalIndustry_ConfirmAddressBtn;
	}

	public By getSubscription_EmailAddress() {
		return subscription_EmailAddress;
	}

	public By getSubscription_AccessSubscriptions() {
		return subscription_AccessSubscriptions;
	}

	public By getSubscription_Cancel() {
		return subscription_Cancel;
	}

	public By getDownload_SignInLink() {
		return download_SignInLink;
	}
	
	public By getDownload_Link() {
		return download_Link;
	}

	public By getLogin_Link() {
		return login_Link;
	}

	public By getLogin_SecondLink() {
		return login_SecondLink;
	}

	public By getLogin_UserName() {
		return login_UserName;
	}

	public By getLogin_Password() {
		return login_Password;
	}

	public By getLogin_Button() {
		return login_Button;
	}

	public By getRegisteration_Email() {
		return registeration_Email;
	}

	public By getRegisteration_ConfirmEmail() {
		return registeration_ConfirmEmail;
	}

	public By getRegisteration_Password() {
		return registeration_Password;
	}

	public By getRegisteration_FirstName() {
		return registeration_FirstName;
	}

	public By getRegisteration_LastName() {
		return registeration_LastName;
	}

	public By getRegisteration_PhoneNo() {
		return registeration_PhoneNo;
	}

	public By getRegisteration_Company() {
		return registeration_Company;
	}

	public By getRegisteration_Role() {
		return registeration_Role;
	}

	public By getRegisteration_Industry() {
		return registeration_Industry;
	}

	public By getRegisteration_Country() {
		return registeration_Country;
	}

	public By getRegisteration_City() {
		return registeration_City;
	}

	public By getRegisteration_PostalCode() {
		return registeration_PostalCode;
	}

	public By getRegisteration_Submit() {
		return registeration_Submit;
	}

	public By getLiveChat_Link() {
		return liveChat_Link;
	}

	public By getLiveChat_Language() {
		return liveChat_Language;
	}

	public By getLiveChat_FirstName() {
		return liveChat_FirstName;
	}

	public By getLiveChat_LastName() {
		return liveChat_LastName;
	}

	public By getLiveChat_Email() {
		return liveChat_Email;
	}

	public By getLiveChat_ChatNow() {
		return liveChat_ChatNow;
	}

	
	public Actions getAction() {
		return action;
	}
	
	// CTOR
	public Eloqua(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}
	
	// SETUP
	private void setup(String localeChoice){
		try {
			if(localeChoice != null && localeChoice != ""){
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "eloqua");
				wait = globalFunctionObj.getWait();
				initializepageObjects();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initializepageObjects(){
		try {

			action = new Actions(webDriver);
			
			customerSupport_Email = By.xpath(propertyHandlerObj.readProperties("customerSupport_Email"));
			customerSupport_Company = By.xpath(propertyHandlerObj.readProperties("customerSupport_Company"));
			customerSupport_FirstName = By.xpath(propertyHandlerObj.readProperties("customerSupport_FirstName"));
			customerSupport_LastName = By.xpath(propertyHandlerObj.readProperties("customerSupport_LastName"));
			customerSupport_Address = By.xpath(propertyHandlerObj.readProperties("customerSupport_Address"));
			customerSupport_City = By.xpath(propertyHandlerObj.readProperties("customerSupport_City"));
			customerSupport_State = By.xpath(propertyHandlerObj.readProperties("customerSupport_State"));
			customerSupport_Country = By.xpath(propertyHandlerObj.readProperties("customerSupport_Country"));
			customerSupport_PostalCode = By.xpath(propertyHandlerObj.readProperties("customerSupport_PostalCode"));
			customerSupport_Phone = By.xpath(propertyHandlerObj.readProperties("customerSupport_Phone"));
			customerSupport_Subject = By.xpath(propertyHandlerObj.readProperties("customerSupport_Subject"));
			customerSupport_Category = By.xpath(propertyHandlerObj.readProperties("customerSupport_Category"));
			customerSupport_Question = By.xpath(propertyHandlerObj.readProperties("customerSupport_Question"));
			customerSupport_Submit = By.xpath(propertyHandlerObj.readProperties("customerSupport_Submit"));
			customerSupport_SameAddressRadioBtn = By.xpath(propertyHandlerObj.readProperties("customerSupport_SameAddressRadioBtn"));
			customerSupport_ConfirmAddressBtn = By.xpath(propertyHandlerObj.readProperties("customerSupport_ConfirmAddressBtn"));
			customerSupport_ConfirmMailSubmitted = By.xpath(propertyHandlerObj.readProperties("customerSupport_ConfirmMailSubmitted"));
			
			sensorSolution_Email = By.xpath(propertyHandlerObj.readProperties("sensorSolution_Email"));
			sensorSolution_FirstName = By.xpath(propertyHandlerObj.readProperties("sensorSolution_FirstName"));
			sensorSolution_LastName = By.xpath(propertyHandlerObj.readProperties("sensorSolution_LastName"));
			sensorSolution_Company = By.xpath(propertyHandlerObj.readProperties("sensorSolution_Company"));
			sensorSolution_BusinessPhone = By.xpath(propertyHandlerObj.readProperties("sensorSolution_BusinessPhone"));
			sensorSolution_Country = By.xpath(propertyHandlerObj.readProperties("sensorSolution_Country"));
			sensorSolution_Selectcountry = propertyHandlerObj.readProperties("sensorSolution_Selectcountry");
			sensorSolution_ProductsListArrow = By.xpath(propertyHandlerObj.readProperties("sensorSolution_ProductsListArrow"));
			sensorSolution_ProductsList = By.xpath(propertyHandlerObj.readProperties("sensorSolution_ProductsList"));
			sensorSolution_ProductListOther = propertyHandlerObj.readProperties("sensorSolution_ProductListOther");
			sensorSolution_InquiryDetails = By.xpath(propertyHandlerObj.readProperties("sensorSolution_InquiryDetails"));
			sensorSolution_Industry = By.xpath(propertyHandlerObj.readProperties("sensorSolution_Industry"));
			sensorSolution_IndustrySelect = propertyHandlerObj.readProperties("sensorSolution_IndustrySelect");
			sensorSolution_IndustryOption = By.xpath(propertyHandlerObj.readProperties("sensorSolution_IndustryOption"));
			sensorSolution_Submit = By.xpath(propertyHandlerObj.readProperties("sensorSolution_Submit"));
						
			medicalIndustry_FirstName = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_FirstName"));
			medicalIndustry_LastName = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_LastName"));
			medicalIndustry_Title = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Title"));
			medicalIndustry_Company = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Company"));
			medicalIndustry_Address = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Address"));
			medicalIndustry_City = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_City"));
			medicalIndustry_Country = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Country"));
		    medicalIndustry_PostalCode = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_PostalCode"));
			medicalIndustry_Phone = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Phone"));
			medicalIndustry_Email = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Email"));
			medicalIndustry_Capability = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Capability"));
			medicalIndustry_OtherCapability = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_OtherCapability"));
			medicalIndustry_Application = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Application"));
			medicalIndustry_OtherApplication = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_OtherApplication"));
			medicalIndustry_SiteReference = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_SiteReference"));
			medicalIndustry_SiteOtherReference = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_SiteOtherReference"));
			medicalIndustry_Submit = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Submit"));
			medicalIndustry_SameAddressRadioBtn = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_SameAddressRadioBtn"));
			medicalIndustry_ConfirmAddressBtn = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_ConfirmAddressBtn"));
			medicalIndustry_Selectcountry=By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Selectcountry"));
			medicalIndustry_Selectcountry = propertyHandlerObj.readProperties("medicalIndustry_Selectcountry");
			medicalIndustry_State = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_State"));
			medicalIndustry_SelectState = propertyHandlerObj.readProperties("medicalIndustry_SelectState");
			
			subscription_EmailAddress = By.xpath(propertyHandlerObj.readProperties("subscription_EmailAddress"));
			subscription_AccessSubscriptions = By.xpath(propertyHandlerObj.readProperties("subscription_AccessSubscriptions"));
			subscription_Error = By.xpath(propertyHandlerObj.readProperties("subscription_Error"));
			subscription_Cancel = By.xpath(propertyHandlerObj.readProperties("subscription_Cancel"));

			download_SignInLink = By.xpath(propertyHandlerObj.readProperties("download_SignInLink"));
			download_Link = By.xpath(propertyHandlerObj.readProperties("download_Link"));
					
			login_Link = By.xpath(propertyHandlerObj.readProperties("login_Link"));
			login_SecondLink = By.xpath(propertyHandlerObj.readProperties("login_SecondLink"));
			login_UserName = By.xpath(propertyHandlerObj.readProperties("login_UserName"));
			login_Password = By.xpath(propertyHandlerObj.readProperties("login_Password"));
			login_Button = By.xpath(propertyHandlerObj.readProperties("login_Button"));
					
			registeration_Email = By.xpath(propertyHandlerObj.readProperties("registeration_Email"));
			registeration_ConfirmEmail = By.xpath(propertyHandlerObj.readProperties("registeration_ConfirmEmail"));
			registeration_Password = By.xpath(propertyHandlerObj.readProperties("registeration_Password"));
			registeration_FirstName = By.xpath(propertyHandlerObj.readProperties("registeration_FirstName"));
			registeration_LastName = By.xpath(propertyHandlerObj.readProperties("registeration_LastName"));
			registeration_PhoneNo = By.xpath(propertyHandlerObj.readProperties("registeration_PhoneNo"));
			registeration_Company = By.xpath(propertyHandlerObj.readProperties("registeration_Company"));
			registeration_Role = By.xpath(propertyHandlerObj.readProperties("registeration_Role"));
			registeration_Industry = By.xpath(propertyHandlerObj.readProperties("registeration_Industry"));
			registeration_Country = By.xpath(propertyHandlerObj.readProperties("registeration_Country"));
			registeration_City = By.xpath(propertyHandlerObj.readProperties("registeration_City"));
			registeration_PostalCode = By.xpath(propertyHandlerObj.readProperties("registeration_PostalCode"));
			registeration_Submit = By.xpath(propertyHandlerObj.readProperties("registeration_Submit"));
			registeration_Error_Msg = By.xpath(propertyHandlerObj.readProperties("registeration_Error_Msg"));
			registeration_useSameAddressRadio = By.xpath(propertyHandlerObj.readProperties("registeration_useSameAddressRadio"));
			registeration_submitAddressConfirmation = By.xpath(propertyHandlerObj.readProperties("registeration_submitAddressConfirmation"));
			
			liveChat_Link = By.xpath(propertyHandlerObj.readProperties("liveChat_Link"));
			liveChat_Language = By.xpath(propertyHandlerObj.readProperties("liveChat_Language"));
			liveChat_FirstName = By.xpath(propertyHandlerObj.readProperties("liveChat_FirstName"));
			liveChat_LastName = By.xpath(propertyHandlerObj.readProperties("liveChat_LastName"));
			liveChat_Email = By.xpath(propertyHandlerObj.readProperties("liveChat_Email"));
			liveChat_ChatNow = By.xpath(propertyHandlerObj.readProperties("liveChat_ChatNow"));
			liveChat_NoAgent_Btn = By.xpath(propertyHandlerObj.readProperties("liveChat_NoAgent_Btn"));
			
			// RPIT OBJECTS
			RPIT_FirstName = By.xpath(propertyHandlerObj.readProperties("RPIT_FirstName"));
			RPIT_LastName = By.xpath(propertyHandlerObj.readProperties("RPIT_LastName"));
			RPIT_Company = By.xpath(propertyHandlerObj.readProperties("RPIT_Company"));
			RPIT_Address = By.xpath(propertyHandlerObj.readProperties("RPIT_Address"));
			RPIT_City = By.xpath(propertyHandlerObj.readProperties("RPIT_City"));
			RPIT_CountryArrow = By.xpath(propertyHandlerObj.readProperties("RPIT_CountryArrow"));
			RPIT_CountrySelect_Element = propertyHandlerObj.readProperties("RPIT_CountrySelect_Element");
			RPIT_JobRoleArrow = By.xpath(propertyHandlerObj.readProperties("RPIT_JobRoleArrow"));
			RPIT_JobRoleSelect_Element = propertyHandlerObj.readProperties("RPIT_JobRoleSelect_Element");
			RPIT_Email = By.xpath(propertyHandlerObj.readProperties("RPIT_Email"));
			RPIT_Telephone = By.xpath(propertyHandlerObj.readProperties("RPIT_Telephone"));
			RPIT_QuestionText = By.xpath(propertyHandlerObj.readProperties("RPIT_QuestionText"));
			RPIT_Submit_Btn = By.xpath(propertyHandlerObj.readProperties("RPIT_Submit_Btn"));
			
			// SENSOR NEWSLETTER OBJECTS
			SensorNewsletter_Email = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_Email"));
			SensorNewsletter_FirstName = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_FirstName"));
			SensorNewsletter_LastName = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_LastName"));
			SensorNewsletter_CountryArrow = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_CountryArrow"));
			SensorNewsletter_CountrySelect_Element = propertyHandlerObj.readProperties("SensorNewsletter_CountrySelect_Element");
			SensorNewsletter_Indutry_AreaOfInterest_Arrow = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_Indutry_AreaOfInterest_Arrow"));
			SensorNewsletter_Indutry_AreaOfInterest_SelectElement = propertyHandlerObj.readProperties("SensorNewsletter_Indutry_AreaOfInterest_SelectElement");
			SensorNewsletter_Submit_Btn = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_Submit_Btn"));
			
			// SENSOR CONTACT US CHINA CAMPAIGN
			SensorChinaCampaign_LastName = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_LastName"));
			SensorChinaCampaign_FirstName = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_FirstName"));
			SensorChinaCampaign_Company = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_Company"));
			SensorChinaCampaign_Email = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_Email"));
			SensorChinaCampaign_BusinessPhone = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_BusinessPhone"));
			SensorChinaCampaign_CountryArrow = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_CountryArrow"));
			SensorChinaCampaign_CountrySelect_Element = propertyHandlerObj.readProperties("SensorChinaCampaign_CountrySelect_Element");
			SensorChinaCampaign_City = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_City"));
			SensorChinaCampaign_InterestedProducts = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_InterestedProducts"));
			SensorChinaCampaign_InterestedProducts_Element = propertyHandlerObj.readProperties("SensorChinaCampaign_InterestedProducts_Element");
			SensorChinaCampaign_InterestedIndustry = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_InterestedIndustry"));
			SensorChinaCampaign_InterestedIndustry_Element = propertyHandlerObj.readProperties("SensorChinaCampaign_InterestedIndustry_Element");
			SensorChinaCampaign_TypeOfDemand = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_TypeOfDemand"));
			SensorChinaCampaign_TypeOfDemand_Element = propertyHandlerObj.readProperties("SensorChinaCampaign_TypeOfDemand_Element");
			SensorChinaCampaign_SpecificNeeds = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_SpecificNeeds"));
			SensorChinaCampaign_Submit_Btn = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_Submit_Btn"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CEHCK IF ELEMENT IS ENABLED
	public boolean checkIfElementEnabled(By elementByObj){
		boolean elementEnabled = false;
		WebElement webElement=null;
		try {
			
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(elementByObj));

			if(webElement.isEnabled() == Boolean.parseBoolean(("true").trim() )){
				elementEnabled=true;
			}
			else{
				elementEnabled=false;
			}
			
		} catch (Exception e) {
			elementEnabled=false;
			e.printStackTrace();
		}
		return elementEnabled;
	}
	
	public boolean checkIfElementEnabled(String elementLocator){
		boolean elementEnabled = false;
		By byObj = null;
		WebElement webElement=null;
		try {
			
			byObj = globalFunctionObj.createByObjectForLocator(elementLocator);
			
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));

			if(webElement.isEnabled() == Boolean.parseBoolean(("true").trim() ) ){
				elementEnabled=true;
			}
			else{
				elementEnabled=false;
			}
			
		} catch (Exception e) {
			elementEnabled=false;
			//e.printStackTrace();
		}
		return elementEnabled;
	}
	
	public WebElement checkIfElementEnabled_1(By elementByObj){
		WebElement webElement=null;
		try {
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(elementByObj));
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return webElement;
	}
	
	public boolean clickOnThisElement(By elementByObj){
		boolean clicked = false;
		try {
			if(checkIfElementEnabled(elementByObj)){
				webDriver.findElement(elementByObj).click();
				clicked = true;
			}
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}

	public boolean SendOnThisElement(By elementByObj, String value){
		boolean valueEntered = false;
		try {
			
			if(checkIfElementEnabled(elementByObj)){
			webDriver.findElement(elementByObj).sendKeys(value);
			valueEntered = true;
			}
		} catch (Exception e) {
			valueEntered = false;
			e.printStackTrace();
		}
		return valueEntered;
	}
	
	public boolean selectElement_ByVisibleText(By elementByObj, String value){
		boolean selected = false;
		Select dropdown = null;
	
		try {
			if(checkIfElementEnabled(elementByObj)){
				dropdown = new Select(webDriver.findElement(elementByObj));
				dropdown.selectByVisibleText(value);
				selected = true;
			}
		} catch (Exception e) {
			selected = false;
			e.printStackTrace();
		}
		return selected;
	}
	

	public boolean selectElement_ByIndex(By elementByObj, int value){
		boolean selected = false;
	
		Select dropdown = null;
	
		try {
			if(checkIfElementEnabled(elementByObj)){
				 dropdown = new Select(webDriver.findElement(elementByObj));
				dropdown.selectByIndex(value);
				selected = true;
			}
		} catch (Exception e) {
			selected = false;
			e.printStackTrace();
		}
		return selected;
	}
	
	
	public boolean selectElement_ByValue(By elementByObj, String value){
		boolean selected = false;
	
		Select dropdown = null;
	
		try {
			if(checkIfElementEnabled(elementByObj)){
				 dropdown = new Select(webDriver.findElement(elementByObj));
				dropdown.selectByValue(value);
				selected = true;
			}
		} catch (Exception e) {
			selected = false;
			e.printStackTrace();
		}
		return selected;
	}
	
	public boolean selectRadioElement_ByVisibleText(By elementByObj, String value){
		boolean selected = false;
	
		Select radiobtn = null;
	
		try {
			if(checkIfElementEnabled(elementByObj)){
				radiobtn = new Select(webDriver.findElement(elementByObj));
				radiobtn.selectByVisibleText(value);
			}
		} catch (Exception e) {
			selected = false;
			e.printStackTrace();
		}
		return selected;
	}
	
	
	public boolean VerifyElement(By elementByObj, String value){
		boolean verifyResult = false;
		try {
			String actual_Result = "";
			String expected_Result = "";
			
			if(checkIfElementEnabled(elementByObj)){
				actual_Result =  globalFunctionObj.cleanString_Simple(webDriver.findElement(elementByObj).getText());
			}
			
			expected_Result = globalFunctionObj.cleanString_Simple(value);
			
			if(actual_Result.equalsIgnoreCase(expected_Result)){
				verifyResult = true;
			}
			
		} catch (Exception e) {
			verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}
	
	public boolean checkIfElementPresent(String elementLocator){
		boolean elementPresent = false;
		By byObj = null;
		WebElement webElement=null;
		try {
			
			byObj = globalFunctionObj.createByObjectForLocator(elementLocator);
			
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
			if(webElement.isDisplayed()== Boolean.parseBoolean(("true").trim() ) ){
				elementPresent=true;
			}
			else{
				elementPresent=false;
			}
			
		} catch (Exception e) {
			elementPresent=false;
			//e.printStackTrace();
		}
		return elementPresent;
	}
	
	public boolean moveTo_ClickElement(By elementByObj){
		boolean verifyResult = false;
		try {
			// action.moveToElement(webDriver.findElement(elementByObj)).build().perform();
			action.moveToElement(webDriver.findElement(elementByObj)).click().build().perform();
			
			globalFunctionObj.pause(200);
			//webDriver.findElement(elementByObj).click();
			verifyResult = true;
		} catch (Exception e) {
			verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}
	
	public boolean moveTo_ClickElement(String customLocator, String keyword){
		boolean verifyResult = false;
		String updatedLocator = "";
		try {
			updatedLocator = globalFunctionObj.getUpdatedLocator(customLocator, keyword);
			System.out.println("updatedLocator---->>> "+ updatedLocator);
			action.moveToElement(webDriver.findElement(By.xpath(updatedLocator))).perform();
			globalFunctionObj.pause(200);
			webDriver.findElement(By.xpath(updatedLocator)).click();
			verifyResult = true;
		} catch (Exception e) {
			verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}

	public boolean moveTo_Element(By elementByObj){
		boolean verifyResult = false;
		try {
			action.moveToElement(webDriver.findElement(elementByObj)).build().perform();
			verifyResult = true;
		} catch (Exception e) {
			verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}
	
	public boolean moveTo_Element(String customLocator, String keyword){
		boolean verifyResult = false;
		String updatedLocator = "";
		try {
			updatedLocator = globalFunctionObj.getUpdatedLocator(customLocator, keyword);
			System.out.println("-<< updatedLocator :: " + updatedLocator);
			action.moveToElement(webDriver.findElement(By.xpath(updatedLocator))).perform();
			verifyResult = true;
		} catch (Exception e) {
			verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}
} // CLASS END
*/