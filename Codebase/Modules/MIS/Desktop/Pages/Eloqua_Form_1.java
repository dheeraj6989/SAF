/*package Modules.TE.Desktop.Pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

public class Eloqua_Form {
	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private GlobalFunction globalFunctionObj = null;

	
	
	// 8 ELOQUA FORMS
	private By emailContactUs_DateSubmitted = null;
	private By emailContactUs_Email = null;
	private By emailContactUs_FirstName = null;
	private By emailContactUs_LastName = null;
	private By emailContactUs_Company = null;
	private By emailContactUs_Address1 = null;
	private By emailContactUs_Address2 = null;
	private By emailContactUs_City = null;
	private By emailContactUs_State = null;
	private By emailContactUs_ZipCode = null;
	private By emailContactUs_BusinessPhone = null;
	private By emailContactUs_Country = null;
	private By emailContactUs_Subject = null;
	private By emailContactUs_Question = null;
	private By emailContactUs_Category = null;
	private By emailContactUs_OptIn = null;
	private By emailContactUs_DUNSNumber = null;
	private By emailContactUs_DUNSConfidence = null;
	private By emailContactUs_TECewt7 = null;
	private By emailContactUs_EloquaCampaignID = null;
	private By emailContactUs_CountrySiteID = null;
	private By emailContactUs_EmailSubmitted = null;

	private By sensorContactUs_DateSubmitted = null;
	private By sensorContactUs_Email = null;
	private By sensorContactUs_FirstName = null;
	private By sensorContactUs_LastName = null;
	private By sensorContactUs_Company = null;
	private By sensorContactUs_BussinessPhone = null;	
	private By sensorContactUs_Country = null;
	private By sensorContactUs_ProductsList = null;
	private By sensorContactUs_ProductsListIfOther = null;
	private By sensorContactUs_EnquiryDetails = null;
	private By sensorContactUs_Industry = null;
	private By sensorContactUs_IndustryIfOther = null;
	private By sensorContactUs_EloquaCampaignID = null;
	private By sensorContactUs_tECewt7 = null;

	private By medicalContactUs_DateSubmitted = null;
	private By medicalContactUs_FirstName = null;
	private By medicalContactUs_LastName = null;
	private By medicalContactUs_Title = null;
	private By medicalContactUs_Company = null;
	private By medicalContactUs_Address = null;
	private By medicalContactUs_City = null;
	private By medicalContactUs_State = null;
	private By medicalContactUs_Country = null;
	private By medicalContactUs_ZipCode = null;
	private By medicalContactUs_BusinessPhone = null;
	private By medicalContactUs_Email = null;
	private By medicalContactUs_AreaOfInterestCapability = null;
	private By medicalContactUs_AreaOfInterestCapabilityIfOther = null;	
	private By medicalContactUs_AreaOfInterestApplication = null;
	private By medicalContactUs_AreaOfInterestApplicationIfOther = null;
	private By medicalContactUs_HowDidYouHearAboutUs = null;
	private By medicalContactUs_HowDidYouHearAboutUsIfOther = null;
	private By medicalContactUs_YesIWouldLikeToRequestAProductSample = null;
	private By medicalContactUs_DUNSNumber = null;
	private By medicalContactUs_DUNSConfidence = null;
	private By medicalContactUs_EloquaCampaignID = null;
	private By medicalContactUs_tECewt7 = null;

	private By registration_DateSubmitted = null;
	private By registration_Email = null;
	private By registration_TECewt5 = null;
	private By registration_TECewt7 = null;
	private By registration_HiddenCampaignID = null;
	private By registration_KeepMeInformed = null;
	private By registration_FirstName = null;
	private By registration_LastName = null;
	private By registration_City = null;
	private By registration_State = null;
	private By registration_ZipCode = null;
	private By registration_Company = null;
	private By registration_Country = null;
	private By registration_Address1 = null;
	private By registration_Address2 = null;
	private By registration_CompanyType = null;
	private By registration_BussinessPhone = null;
	private By registration_JobRole = null;
	private By registration_PrimaryIndustry = null;
	private By registration_EloquaCampaignID = null;

	private By subscription_EloquaCampaignID = null;
	private By subscription_Email = null;
	private By subscription_IndustryIntrests = null;
	private By subscription_SubscriptionKeepMeInformed = null;
	private By subscription_EloquaContactID = null;
	private By subscription_AllIndustries = null;
	private By subscription_UnsubscribeAll = null;
	private By subscription_HiddenSubscription = null;
	private By subscription_HiddenIndustryIntrest = null;
	private By subscription_HiddenCustomerSpecifiedIndustry1 = null;
	private By subscription_hiddenSubscription = null;
	private By subscription_TestPleaseDelete = null;

	private By login_DateSubmitted = null;
	private By login_Email = null;
	private By login_TECewt5 = null;
	private By login_TECewt7 = null;
	private By login_Username = null;

	private By liveChat_DateSubmitted = null;
	private By liveChat_Email = null;
	private By liveChat_FirstName = null;
	private By liveChat_LastName = null;
	private By liveChat_Company = null;
	private By liveChat_SubscriptionKeepMeInformed = null;
	private By liveChat_TECewt7 = null;
	private By liveChat_EloquaCampaignID = null;

	private By downloadProduct_DateSubmitted = null;
	private By downloadProduct_Email = null;
	private By downloadProduct_TECewt7 = null;
	private By downloadProduct_DocumentType = null;
	private By downloadProduct_DocumentURL = null;
	private By downloadProduct_DocumentName = null;
	private By downloadProduct_DocumentDownloadGUID = null;
	private By downloadProduct_EloquaCampaignID = null;

	private By login_Password = null;
	private By login_Company = null;
	private By login_SignInBtn = null;
	private By eloqua_ActionBtn = null;
	private By eloqua_SubmissionDataBtn = null;

	// RPIT OBJECTS
	private By RPIT_FirstName = null;
	private By RPIT_LastName = null;
	private By RPIT_Company = null;
	private By RPIT_Address = null;
	private By RPIT_City = null;
	private By RPIT_Country = null;
	private By RPIT_JobRole = null;
	private By RPIT_Email = null;
	private By RPIT_Telephone  = null;
	private By RPIT_Question = null;
	
	// SENSOR NEWSLETTER OBJECTS
	private By SensorNewsletter_Email = null;
	private By SensorNewsletter_FirstName = null;
	private By SensorNewsletter_LastName = null;
	private By SensorNewsletter_Country = null;
	private By SensorNewsletter_Indutry_AreaOfInterest = null;
	
	// SENSORS CONTACT US CHINA CMPAIGN
	private By SensorChinaCampaign_LastName = null;
	private By SensorChinaCampaign_FirstName = null;
	private By SensorChinaCampaign_Company = null;
	private By SensorChinaCampaign_Email = null;
	private By SensorChinaCampaign_BusinessPhone = null;
	private By SensorChinaCampaign_Country = null;
	private By SensorChinaCampaign_City = null;
	private By SensorChinaCampaign_InterestedProducts = null;
	private By SensorChinaCampaign_InterestedIndustry = null;
	private By SensorChinaCampaign_TypeOfDemand = null;
	private By SensorChinaCampaign_SpecificNeeds = null;
	
	
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

	public By getSensorChinaCampaign_Country() {
		return SensorChinaCampaign_Country;
	}

	public By getSensorChinaCampaign_City() {
		return SensorChinaCampaign_City;
	}

	public By getSensorChinaCampaign_InterestedProducts() {
		return SensorChinaCampaign_InterestedProducts;
	}

	public By getSensorChinaCampaign_InterestedIndustry() {
		return SensorChinaCampaign_InterestedIndustry;
	}

	public By getSensorChinaCampaign_TypeOfDemand() {
		return SensorChinaCampaign_TypeOfDemand;
	}

	public By getSensorChinaCampaign_SpecificNeeds() {
		return SensorChinaCampaign_SpecificNeeds;
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

	public By getSensorNewsletter_Country() {
		return SensorNewsletter_Country;
	}

	public By getSensorNewsletter_Indutry_AreaOfInterest() {
		return SensorNewsletter_Indutry_AreaOfInterest;
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

	public By getRPIT_Country() {
		return RPIT_Country;
	}

	public By getRPIT_JobRole() {
		return RPIT_JobRole;
	}

	public By getRPIT_Email() {
		return RPIT_Email;
	}

	public By getRPIT_Telephone() {
		return RPIT_Telephone;
	}

	public By getRPIT_Question() {
		return RPIT_Question;
	}

	public By getEmailContactUs_DateSubmitted() {
		return emailContactUs_DateSubmitted;
	}

	public By getEmailContactUs_Email() {
		return emailContactUs_Email;
	}

	public By getEmailContactUs_FirstName() {
		return emailContactUs_FirstName;
	}

	public By getEmailContactUs_LastName() {
		return emailContactUs_LastName;
	}

	public By getEmailContactUs_Company() {
		return emailContactUs_Company;
	}

	public By getEmailContactUs_Address1() {
		return emailContactUs_Address1;
	}

	public By getEmailContactUs_Address2() {
		return emailContactUs_Address2;
	}

	public By getEmailContactUs_City() {
		return emailContactUs_City;
	}

	public By getEmailContactUs_State() {
		return emailContactUs_State;
	}

	public By getEmailContactUs_ZipCode() {
		return emailContactUs_ZipCode;
	}

	public By getEmailContactUs_BusinessPhone() {
		return emailContactUs_BusinessPhone;
	}

	public By getEmailContactUs_Country() {
		return emailContactUs_Country;
	}

	public By getEmailContactUs_Subject() {
		return emailContactUs_Subject;
	}

	public By getEmailContactUs_Question() {
		return emailContactUs_Question;
	}

	public By getEmailContactUs_Category() {
		return emailContactUs_Category;
	}

	public By getEmailContactUs_OptIn() {
		return emailContactUs_OptIn;
	}

	public By getEmailContactUs_DUNSNumber() {
		return emailContactUs_DUNSNumber;
	}

	public By getEmailContactUs_DUNSConfidence() {
		return emailContactUs_DUNSConfidence;
	}

	public By getEmailContactUs_TECewt7() {
		return emailContactUs_TECewt7;
	}

	public By getEmailContactUs_EloquaCampaignID() {
		return emailContactUs_EloquaCampaignID;
	}

	public By getEmailContactUs_CountrySiteID() {
		return emailContactUs_CountrySiteID;
	}

	public By getEmailContactUs_EmailSubmitted() {
		return emailContactUs_EmailSubmitted;
	}

	public By getSensorContactUs_DateSubmitted() {
		return sensorContactUs_DateSubmitted;
	}

	public By getSensorContactUs_Email() {
		return sensorContactUs_Email;
	}

	public By getSensorContactUs_FirstName() {
		return sensorContactUs_FirstName;
	}

	public By getSensorContactUs_LastName() {
		return sensorContactUs_LastName;
	}

	public By getSensorContactUs_Company() {
		return sensorContactUs_Company;
	}

	public By getSensorContactUs_BussinessPhone() {
		return sensorContactUs_BussinessPhone;
	}

	public By getSensorContactUs_Country() {
		return sensorContactUs_Country;
	}

	public By getSensorContactUs_ProductsList() {
		return sensorContactUs_ProductsList;
	}

	public By getSensorContactUs_ProductsListIfOther() {
		return sensorContactUs_ProductsListIfOther;
	}

	public By getSensorContactUs_EnquiryDetails() {
		return sensorContactUs_EnquiryDetails;
	}

	public By getSensorContactUs_Industry() {
		return sensorContactUs_Industry;
	}

	public By getSensorContactUs_IndustryIfOther() {
		return sensorContactUs_IndustryIfOther;
	}

	public By getSensorContactUs_EloquaCampaignID() {
		return sensorContactUs_EloquaCampaignID;
	}

	public By getSensorContactUs_tECewt7() {
		return sensorContactUs_tECewt7;
	}


	public By getMedicalContactUs_DateSubmitted() {
		return medicalContactUs_DateSubmitted;
	}

	public By getMedicalContactUs_FirstName() {
		return medicalContactUs_FirstName;
	}

	public By getMedicalContactUs_LastName() {
		return medicalContactUs_LastName;
	}

	public By getMedicalContactUs_Title() {
		return medicalContactUs_Title;
	}

	public By getMedicalContactUs_Company() {
		return medicalContactUs_Company;
	}

	public By getMedicalContactUs_Address() {
		return medicalContactUs_Address;
	}

	public By getMedicalContactUs_City() {
		return medicalContactUs_City;
	}

	public By getMedicalContactUs_State() {
		return medicalContactUs_State;
	}

	public By getMedicalContactUs_Country() {
		return medicalContactUs_Country;
	}

	public By getMedicalContactUs_ZipCode() {
		return medicalContactUs_ZipCode;
	}

	public By getMedicalContactUs_BusinessPhone() {
		return medicalContactUs_BusinessPhone;
	}

	public By getMedicalContactUs_Email() {
		return medicalContactUs_Email;
	}

	public By getMedicalContactUs_AreaOfInterestCapability() {
		return medicalContactUs_AreaOfInterestCapability;
	}

	public By getMedicalContactUs_AreaOfInterestCapabilityIfOther() {
		return medicalContactUs_AreaOfInterestCapabilityIfOther;
	}

	public By getMedicalContactUs_AreaOfInterestApplication() {
		return medicalContactUs_AreaOfInterestApplication;
	}

	public By getMedicalContactUs_AreaOfInterestApplicationIfOther() {
		return medicalContactUs_AreaOfInterestApplicationIfOther;
	}

	public By getMedicalContactUs_HowDidYouHearAboutUs() {
		return medicalContactUs_HowDidYouHearAboutUs;
	}

	public By getMedicalContactUs_HowDidYouHearAboutUsIfOther() {
		return medicalContactUs_HowDidYouHearAboutUsIfOther;
	}

	public By getMedicalContactUs_YesIWouldLikeToRequestAProductSample() {
		return medicalContactUs_YesIWouldLikeToRequestAProductSample;
	}

	public By getMedicalContactUs_DUNSNumber() {
		return medicalContactUs_DUNSNumber;
	}

	public By getMedicalContactUs_DUNSConfidence() {
		return medicalContactUs_DUNSConfidence;
	}

	public By getMedicalContactUs_EloquaCampaignID() {
		return medicalContactUs_EloquaCampaignID;
	}

	public By getMedicalContactUs_tECewt7() {
		return medicalContactUs_tECewt7;
	}


	public By getRegistration_DateSubmitted() {
		return registration_DateSubmitted;
	}

	public By getRegistration_Email() {
		return registration_Email;
	}

	public By getRegistration_TECewt5() {
		return registration_TECewt5;
	}

	public By getRegistration_TECewt7() {
		return registration_TECewt7;
	}

	public By getRegistration_HiddenCampaignID() {
		return registration_HiddenCampaignID;
	}

	public By getRegistration_KeepMeInformed() {
		return registration_KeepMeInformed;
	}

	public By getRegistration_FirstName() {
		return registration_FirstName;
	}

	public By getRegistration_LastName() {
		return registration_LastName;
	}

	public By getRegistration_City() {
		return registration_City;
	}

	public By getRegistration_State() {
		return registration_State;
	}

	public By getRegistration_ZipCode() {
		return registration_ZipCode;
	}

	public By getRegistration_Company() {
		return registration_Company;
	}

	public By getRegistration_Country() {
		return registration_Country;
	}

	public By getRegistration_Address1() {
		return registration_Address1;
	}

	public By getRegistration_Address2() {
		return registration_Address2;
	}

	public By getRegistration_CompanyType() {
		return registration_CompanyType;
	}

	public By getRegistration_BussinessPhone() {
		return registration_BussinessPhone;
	}

	public By getRegistration_JobRole() {
		return registration_JobRole;
	}

	public By getRegistration_PrimaryIndustry() {
		return registration_PrimaryIndustry;
	}

	public By getRegistration_EloquaCampaignID() {
		return registration_EloquaCampaignID;
	}


	public By getSubscription_EloquaCampaignID() {
		return subscription_EloquaCampaignID;
	}

	public By getSubscription_Email() {
		return subscription_Email;
	}

	public By getSubscription_IndustryIntrests() {
		return subscription_IndustryIntrests;
	}

	public By getSubscription_SubscriptionKeepMeInformed() {
		return subscription_SubscriptionKeepMeInformed;
	}

	public By getSubscription_EloquaContactID() {
		return subscription_EloquaContactID;
	}

	public By getSubscription_AllIndustries() {
		return subscription_AllIndustries;
	}

	public By getSubscription_UnsubscribeAll() {
		return subscription_UnsubscribeAll;
	}

	public By getSubscription_HiddenSubscription() {
		return subscription_HiddenSubscription;
	}

	public By getSubscription_HiddenIndustryIntrest() {
		return subscription_HiddenIndustryIntrest;
	}

	public By getSubscription_HiddenCustomerSpecifiedIndustry1() {
		return subscription_HiddenCustomerSpecifiedIndustry1;
	}

	public By getSubscription_hiddenSubscription() {
		return subscription_hiddenSubscription;
	}

	public By getSubscription_TestPleaseDelete() {
		return subscription_TestPleaseDelete;
	}


	public By getLogin_DateSubmitted() {
		return login_DateSubmitted;
	}

	public By getLogin_Email() {
		return login_Email;
	}

	public By getLogin_TECewt5() {
		return login_TECewt5;
	}

	public By getLogin_TECewt7() {
		return login_TECewt7;
	}


	public By getLiveChat_DateSubmitted() {
		return liveChat_DateSubmitted;
	}

	public By getLiveChat_Email() {
		return liveChat_Email;
	}

	public By getLiveChat_FirstName() {
		return liveChat_FirstName;
	}

	public By getLiveChat_LastName() {
		return liveChat_LastName;
	}

	public By getLiveChat_Company() {
		return liveChat_Company;
	}

	public By getLiveChat_SubscriptionKeepMeInformed() {
		return liveChat_SubscriptionKeepMeInformed;
	}

	public By getLiveChat_TECewt7() {
		return liveChat_TECewt7;
	}

	public By getLiveChat_EloquaCampaignID() {
		return liveChat_EloquaCampaignID;
	}


	public By getDownloadProduct_DateSubmitted() {
		return downloadProduct_DateSubmitted;
	}

	public By getDownloadProduct_Email() {
		return downloadProduct_Email;
	}

	public By getDownloadProduct_TECewt7() {
		return downloadProduct_TECewt7;
	}

	public By getDownloadProduct_DocumentType() {
		return downloadProduct_DocumentType;
	}

	public By getDownloadProduct_DocumentURL() {
		return downloadProduct_DocumentURL;
	}

	public By getDownloadProduct_DocumentName() {
		return downloadProduct_DocumentName;
	}

	public By getDownloadProduct_DocumentDownloadGUID() {
		return downloadProduct_DocumentDownloadGUID;
	}

	public By getDownloadProduct_EloquaCampaignID() {
		return downloadProduct_EloquaCampaignID;
	}

	public By getLogin_Username() {
		return login_Username;
	}

	public By getLogin_Password() {
		return login_Password;
	}

	public By getLogin_Company() {
		return login_Company;
	}

	public By getLogin_SignInBtn() {
		return login_SignInBtn;
	}

	public By getEloqua_ActionBtn() {
		return eloqua_ActionBtn;
	}

	public By getEloqua_SubmissionDataBtn() {
		return eloqua_SubmissionDataBtn;
	}

	// CTOR
	public Eloqua_Form(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	private void setup(String localeChoice){
		try {
			if(localeChoice != null && localeChoice != ""){
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "eloqua_form");
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

			//popUpCloseBtn = By.xpath(propertyHandlerObj.readProperties("popUpCloseBtn"));
			//searchBox = By.xpath(propertyHandlerObj.readProperties("searchBox"));
			//searchbutton = By.xpath(propertyHandlerObj.readProperties("searchbutton"));

			emailContactUs_DateSubmitted = By.xpath(propertyHandlerObj.readProperties("emailContactUs_DateSubmitted"));
			emailContactUs_Email = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Email"));
			emailContactUs_FirstName = By.xpath(propertyHandlerObj.readProperties("emailContactUs_FirstName"));
			emailContactUs_LastName = By.xpath(propertyHandlerObj.readProperties("emailContactUs_LastName"));
			emailContactUs_Company = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Company"));
			emailContactUs_Address1 = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Address1"));
			emailContactUs_Address2 = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Address2"));
			emailContactUs_City = By.xpath(propertyHandlerObj.readProperties("emailContactUs_City"));
			emailContactUs_State = By.xpath(propertyHandlerObj.readProperties("emailContactUs_State"));
			emailContactUs_ZipCode = By.xpath(propertyHandlerObj.readProperties("emailContactUs_ZipCode"));
			emailContactUs_BusinessPhone = By.xpath(propertyHandlerObj.readProperties("emailContactUs_BusinessPhone"));
			emailContactUs_Country = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Country"));
			emailContactUs_Subject = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Subject"));
			emailContactUs_Question = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Question"));
			emailContactUs_Category = By.xpath(propertyHandlerObj.readProperties("emailContactUs_Category"));
			emailContactUs_OptIn = By.xpath(propertyHandlerObj.readProperties("emailContactUs_OptIn"));
			emailContactUs_DUNSNumber = By.xpath(propertyHandlerObj.readProperties("emailContactUs_DUNSNumber"));
			emailContactUs_DUNSConfidence = By.xpath(propertyHandlerObj.readProperties("emailContactUs_DUNSConfidence"));
			emailContactUs_TECewt7 = By.xpath(propertyHandlerObj.readProperties("emailContactUs_TECewt7"));
			emailContactUs_EloquaCampaignID = By.xpath(propertyHandlerObj.readProperties("emailContactUs_EloquaCampaignID"));
			emailContactUs_CountrySiteID = By.xpath(propertyHandlerObj.readProperties("emailContactUs_CountrySiteID"));
			emailContactUs_EmailSubmitted = By.xpath(propertyHandlerObj.readProperties("emailContactUs_EmailSubmitted"));

			sensorContactUs_DateSubmitted = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_DateSubmitted"));
			sensorContactUs_Email = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_Email"));
			sensorContactUs_FirstName = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_FirstName"));
			sensorContactUs_LastName = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_LastName"));
			sensorContactUs_Company = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_Company"));
			sensorContactUs_BussinessPhone = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_BussinessPhone"));
			sensorContactUs_Country = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_Country"));
			sensorContactUs_ProductsList = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_ProductsList"));
			sensorContactUs_ProductsListIfOther = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_ProductsListIfOther"));
			sensorContactUs_EnquiryDetails = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_EnquiryDetails"));
			sensorContactUs_Industry = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_Industry"));
			sensorContactUs_IndustryIfOther = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_IndustryIfOther"));
			sensorContactUs_EloquaCampaignID = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_EloquaCampaignID"));
			sensorContactUs_tECewt7 = By.xpath(propertyHandlerObj.readProperties("sensorContactUs_tECewt7"));

			medicalContactUs_DateSubmitted = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_DateSubmitted"));
			medicalContactUs_FirstName = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_FirstName"));
			medicalContactUs_LastName = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_LastName"));
			medicalContactUs_Title = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_Title"));
			medicalContactUs_Company = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_Company"));
			medicalContactUs_Address = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_Address"));
			medicalContactUs_City = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_City"));
			medicalContactUs_State = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_State"));
			medicalContactUs_Country = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_Country"));
			medicalContactUs_ZipCode = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_ZipCode"));
			medicalContactUs_BusinessPhone = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_BusinessPhone"));
			medicalContactUs_Email = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_BusinessPhone"));
			medicalContactUs_AreaOfInterestCapability = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_AreaOfInterestCapability"));
			medicalContactUs_AreaOfInterestCapabilityIfOther = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_AreaOfInterestCapabilityIfOther"));
			medicalContactUs_AreaOfInterestApplication = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_AreaOfInterestApplication"));
			medicalContactUs_AreaOfInterestApplicationIfOther = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_AreaOfInterestApplicationIfOther"));
			medicalContactUs_HowDidYouHearAboutUs = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_HowDidYouHearAboutUs"));
			medicalContactUs_HowDidYouHearAboutUsIfOther = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_HowDidYouHearAboutUsIfOther"));
			medicalContactUs_YesIWouldLikeToRequestAProductSample = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_YesIWouldLikeToRequestAProductSample"));
			medicalContactUs_DUNSNumber = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_DUNSNumber"));
			medicalContactUs_DUNSConfidence = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_DUNSConfidence"));
			medicalContactUs_EloquaCampaignID = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_EloquaCampaignID"));
			medicalContactUs_tECewt7 = By.xpath(propertyHandlerObj.readProperties("medicalContactUs_tECewt7"));

			registration_DateSubmitted = By.xpath(propertyHandlerObj.readProperties("registration_DateSubmitted"));
			registration_Email = By.xpath(propertyHandlerObj.readProperties("registration_Email"));
			registration_TECewt5 = By.xpath(propertyHandlerObj.readProperties("registration_TECewt5"));
			registration_TECewt7 = By.xpath(propertyHandlerObj.readProperties("registration_TECewt7"));
			registration_HiddenCampaignID = By.xpath(propertyHandlerObj.readProperties("registration_HiddenCampaignID"));
			registration_KeepMeInformed = By.xpath(propertyHandlerObj.readProperties("registration_KeepMeInformed"));
			registration_FirstName = By.xpath(propertyHandlerObj.readProperties("registration_FirstName"));
			registration_LastName = By.xpath(propertyHandlerObj.readProperties("registration_LastName"));
			registration_City = By.xpath(propertyHandlerObj.readProperties("registration_City"));
			registration_State = By.xpath(propertyHandlerObj.readProperties("registration_State"));
			registration_ZipCode = By.xpath(propertyHandlerObj.readProperties("registration_ZipCode"));
			registration_Company = By.xpath(propertyHandlerObj.readProperties("registration_Company"));
			registration_Country = By.xpath(propertyHandlerObj.readProperties("registration_Country"));
			registration_Address1 = By.xpath(propertyHandlerObj.readProperties("registration_Address1"));
			registration_Address2 = By.xpath(propertyHandlerObj.readProperties("registration_Address2"));
			registration_CompanyType = By.xpath(propertyHandlerObj.readProperties("registration_CompanyType"));
			registration_BussinessPhone = By.xpath(propertyHandlerObj.readProperties("registration_BussinessPhone"));
			registration_JobRole = By.xpath(propertyHandlerObj.readProperties("registration_JobRole"));
			registration_PrimaryIndustry = By.xpath(propertyHandlerObj.readProperties("registration_PrimaryIndustry"));
			registration_EloquaCampaignID = By.xpath(propertyHandlerObj.readProperties("registration_EloquaCampaignID"));

			subscription_EloquaCampaignID = By.xpath(propertyHandlerObj.readProperties("subscription_EloquaCampaignID"));
			subscription_Email = By.xpath(propertyHandlerObj.readProperties("subscription_Email"));
			subscription_IndustryIntrests = By.xpath(propertyHandlerObj.readProperties("subscription_IndustryIntrests"));
			subscription_SubscriptionKeepMeInformed = By.xpath(propertyHandlerObj.readProperties("subscription_SubscriptionKeepMeInformed"));
			subscription_EloquaContactID = By.xpath(propertyHandlerObj.readProperties("subscription_EloquaContactID"));
			subscription_AllIndustries = By.xpath(propertyHandlerObj.readProperties("subscription_AllIndustries"));
			subscription_UnsubscribeAll = By.xpath(propertyHandlerObj.readProperties("subscription_UnsubscribeAll"));
			subscription_HiddenSubscription = By.xpath(propertyHandlerObj.readProperties("subscription_HiddenSubscription"));
			subscription_HiddenIndustryIntrest = By.xpath(propertyHandlerObj.readProperties("subscription_HiddenIndustryIntrest"));
			subscription_HiddenCustomerSpecifiedIndustry1 = By.xpath(propertyHandlerObj.readProperties("subscription_HiddenCustomerSpecifiedIndustry1"));
			subscription_hiddenSubscription = By.xpath(propertyHandlerObj.readProperties("subscription_hiddenSubscription"));
			subscription_TestPleaseDelete = By.xpath(propertyHandlerObj.readProperties("subscription_hiddenSubscription"));

			login_DateSubmitted = By.xpath(propertyHandlerObj.readProperties("login_DateSubmitted"));
			login_Email = By.xpath(propertyHandlerObj.readProperties("login_Email"));
			login_TECewt5 = By.xpath(propertyHandlerObj.readProperties("login_TECewt5"));
			login_TECewt7 = By.xpath(propertyHandlerObj.readProperties("login_TECewt7"));

			liveChat_DateSubmitted = By.xpath(propertyHandlerObj.readProperties("liveChat_DateSubmitted"));
			liveChat_Email = By.xpath(propertyHandlerObj.readProperties("liveChat_Email"));
			liveChat_FirstName = By.xpath(propertyHandlerObj.readProperties("liveChat_FirstName"));
			liveChat_LastName = By.xpath(propertyHandlerObj.readProperties("liveChat_LastName"));
			liveChat_Company = By.xpath(propertyHandlerObj.readProperties("liveChat_Company"));
			liveChat_SubscriptionKeepMeInformed = By.xpath(propertyHandlerObj.readProperties("liveChat_SubscriptionKeepMeInformed"));
			liveChat_TECewt7 = By.xpath(propertyHandlerObj.readProperties("liveChat_TECewt7"));
			liveChat_EloquaCampaignID = By.xpath(propertyHandlerObj.readProperties("liveChat_EloquaCampaignID"));

			downloadProduct_DateSubmitted = By.xpath(propertyHandlerObj.readProperties("downloadProduct_DateSubmitted"));
			downloadProduct_Email = By.xpath(propertyHandlerObj.readProperties("downloadProduct_Email"));
			downloadProduct_TECewt7 = By.xpath(propertyHandlerObj.readProperties("downloadProduct_TECewt7"));
			downloadProduct_DocumentType = By.xpath(propertyHandlerObj.readProperties("downloadProduct_DocumentType"));
			downloadProduct_DocumentURL = By.xpath(propertyHandlerObj.readProperties("downloadProduct_DocumentURL"));
			downloadProduct_DocumentName = By.xpath(propertyHandlerObj.readProperties("downloadProduct_DocumentName"));
			downloadProduct_DocumentDownloadGUID = By.xpath(propertyHandlerObj.readProperties("downloadProduct_DocumentDownloadGUID"));
			downloadProduct_EloquaCampaignID = By.xpath(propertyHandlerObj.readProperties("downloadProduct_EloquaCampaignID"));

			login_Username = By.xpath(propertyHandlerObj.readProperties("login_Username"));  
			login_Password = By.xpath(propertyHandlerObj.readProperties("login_Password"));
			login_Company = By.xpath(propertyHandlerObj.readProperties("login_Company"));
			login_SignInBtn = By.xpath(propertyHandlerObj.readProperties("login_SignInBtn"));
			eloqua_ActionBtn = By.xpath(propertyHandlerObj.readProperties("eloqua_ActionBtn"));
			eloqua_SubmissionDataBtn = By.xpath(propertyHandlerObj.readProperties("eloqua_SubmissionDataBtn"));

			// RPIT OBJECTS
			RPIT_FirstName = By.xpath(propertyHandlerObj.readProperties("RPIT_FirstName"));
			RPIT_LastName = By.xpath(propertyHandlerObj.readProperties("RPIT_LastName"));
			RPIT_Company = By.xpath(propertyHandlerObj.readProperties("RPIT_Company"));
			RPIT_Address = By.xpath(propertyHandlerObj.readProperties("RPIT_Address"));
			RPIT_City = By.xpath(propertyHandlerObj.readProperties("RPIT_City"));
			RPIT_Country = By.xpath(propertyHandlerObj.readProperties("RPIT_Country"));
			RPIT_JobRole = By.xpath(propertyHandlerObj.readProperties("RPIT_JobRole"));
			RPIT_Email = By.xpath(propertyHandlerObj.readProperties("RPIT_Email"));
			RPIT_Telephone  = By.xpath(propertyHandlerObj.readProperties("RPIT_Telephone"));
			RPIT_Question = By.xpath(propertyHandlerObj.readProperties("RPIT_Question"));

			// SENSOR NEWSLETTER OBJECTS
			SensorNewsletter_Email = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_Email"));
			SensorNewsletter_FirstName = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_FirstName"));
			SensorNewsletter_LastName = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_LastName"));
			SensorNewsletter_Country = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_Country"));
			SensorNewsletter_Indutry_AreaOfInterest = By.xpath(propertyHandlerObj.readProperties("SensorNewsletter_Indutry_AreaOfInterest"));

			// SENSOR CONTACT US CHINA CAMPAIGN
			SensorChinaCampaign_LastName = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_LastName"));
			SensorChinaCampaign_FirstName = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_FirstName"));
			SensorChinaCampaign_Company = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_Company"));
			SensorChinaCampaign_Email = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_Email"));
			SensorChinaCampaign_BusinessPhone = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_BusinessPhone"));
			SensorChinaCampaign_Country = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_Country"));
			SensorChinaCampaign_City = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_City"));
			SensorChinaCampaign_InterestedProducts = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_InterestedProducts"));
			SensorChinaCampaign_InterestedIndustry = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_InterestedIndustry"));
			SensorChinaCampaign_TypeOfDemand = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_TypeOfDemand"));
			SensorChinaCampaign_SpecificNeeds = By.xpath(propertyHandlerObj.readProperties("SensorChinaCampaign_SpecificNeeds"));
			
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
		boolean clicked = false;
		try {
			if(checkIfElementEnabled(elementByObj)){
				webDriver.findElement(elementByObj).sendKeys(value);
				clicked = true;
			}
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public String getTextForThisElement(By elementByObj){
		String verifyResult = "";
		try {
		//	moveTo_Element(elementByObj);
			verifyResult = webDriver.findElement(elementByObj).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return verifyResult;
	}

	public boolean VerifyElement(By elementByObj, String expected_Result){
		boolean verifyResult = false;
		String actual_Result = "";

		try {

			if(checkIfElementEnabled(elementByObj)){
				actual_Result =  webDriver.findElement(elementByObj).getText();
			}

			actual_Result = globalFunctionObj.cleanString_Simple(actual_Result);
			expected_Result = globalFunctionObj.cleanString_Simple(expected_Result);

			if(actual_Result.equalsIgnoreCase(expected_Result)){
				verifyResult = true;
			}

		} catch (Exception e) {
			//verifyResult = false;
			//e.printStackTrace();
		}
		return verifyResult;
	}

	public boolean moveTo_VerifyElement(By elementByObj, String expected_Result){
		boolean verifyResult = false;
		String actual_Result = "";
		try {
			
			//if(checkIfElementEnabled(elementByObj)){
				action.moveToElement(webDriver.findElement(elementByObj)).perform();
			//}
			
			globalFunctionObj.pause(2000);
			
			actual_Result =  webDriver.findElement(elementByObj).getText();

			actual_Result = globalFunctionObj.cleanString_Simple(actual_Result);
			expected_Result = globalFunctionObj.cleanString_Simple(expected_Result);

			//System.out.println("\tactual_Result   :: >" + actual_Result + "<");
			//System.out.println("\texpected_Result :: >" + expected_Result + "<");
			
			if(actual_Result != null){
				if(actual_Result.equalsIgnoreCase(expected_Result)){
					verifyResult = true;
				}
			}

		} catch (Exception e) {
			//verifyResult = false;
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
			if(webElement.isDisplayed() == Boolean.parseBoolean(("true").trim() ) ){
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
	
	public boolean loginToEloqua(String eloquaURL, String El_Username, String El_Password, String El_Company){

		boolean operationFlag=false;
		
		try {
			webDriver.navigate().to(eloquaURL);

			globalFunctionObj.pause_Short();
			
			if(checkIfElementEnabled(getLogin_Username())){
				
				webDriver.findElement(getLogin_Username()).sendKeys(El_Username);
				webDriver.findElement(getLogin_Password()).sendKeys(El_Password);
				webDriver.findElement(getLogin_Company()).sendKeys(El_Company);
				webDriver.findElement(getLogin_SignInBtn()).click();
				operationFlag = true;
				
			}
		} catch (Exception e) {
			operationFlag = false;
			//e.printStackTrace();
		}
		return operationFlag;
	}

	public boolean openFormURL_OpenDetails(String EL_URL){
		boolean operationFlag = false;
		
		try {
			webDriver.navigate().to(EL_URL);

			globalFunctionObj.pause_Short();

			// CLICK ON ACTION BTN
			clickOnThisElement(getEloqua_ActionBtn());

			globalFunctionObj.pause_Short();

			// CLICK ON SUBMMITION DATA OPTION
			clickOnThisElement(getEloqua_SubmissionDataBtn());
			
			operationFlag = true;
		} catch (Exception e) {
			operationFlag = false;
			//e.printStackTrace();
		}
		return operationFlag;
	}
	
	public boolean moveTo_ClickElement(By elementByObj){
		boolean verifyResult = false;
		try {
			action.moveToElement(webDriver.findElement(elementByObj)).build().perform();
			globalFunctionObj.pause(200);
			webDriver.findElement(elementByObj).click();
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
}
*/