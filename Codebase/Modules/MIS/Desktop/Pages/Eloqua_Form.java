package Modules.MIS.Desktop.Pages;

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
	public PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;

	// 8 ELOQUA FORMS
	public By emailContactUs_DateSubmitted = null;
	public By emailContactUs_Email = null;
	public By emailContactUs_FirstName = null;
	public By emailContactUs_LastName = null;
	public By emailContactUs_Company = null;
	public By emailContactUs_Address1 = null;
	public By emailContactUs_Address2 = null;
	public By emailContactUs_City = null;
	public By emailContactUs_State = null;
	public By emailContactUs_ZipCode = null;
	public By emailContactUs_BusinessPhone = null;
	public By emailContactUs_Country = null;
	public By emailContactUs_Subject = null;
	public By emailContactUs_Question = null;
	public By emailContactUs_Category = null;
	public By emailContactUs_OptIn = null;
	public By emailContactUs_DUNSNumber = null;
	public By emailContactUs_DUNSConfidence = null;
	public By emailContactUs_TECewt7 = null;
	public By emailContactUs_EloquaCampaignID = null;
	public By emailContactUs_CountrySiteID = null;
	public By emailContactUs_EmailSubmitted = null;

	public By sensorContactUs_DateSubmitted = null;
	public By sensorContactUs_Email = null;
	public By sensorContactUs_FirstName = null;
	public By sensorContactUs_LastName = null;
	public By sensorContactUs_Company = null;
	public By sensorContactUs_BussinessPhone = null;	
	public By sensorContactUs_Country = null;
	public By sensorContactUs_ProductsList = null;
	public By sensorContactUs_ProductsListIfOther = null;
	public By sensorContactUs_EnquiryDetails = null;
	public By sensorContactUs_Industry = null;
	public By sensorContactUs_IndustryIfOther = null;
	public By sensorContactUs_EloquaCampaignID = null;
	public By sensorContactUs_tECewt7 = null;

	public By medicalContactUs_DateSubmitted = null;
	public By medicalContactUs_FirstName = null;
	public By medicalContactUs_LastName = null;
	public By medicalContactUs_Title = null;
	public By medicalContactUs_Company = null;
	public By medicalContactUs_Address = null;
	public By medicalContactUs_City = null;
	public By medicalContactUs_State = null;
	public By medicalContactUs_Country = null;
	public By medicalContactUs_ZipCode = null;
	public By medicalContactUs_BusinessPhone = null;
	public By medicalContactUs_Email = null;
	public By medicalContactUs_AreaOfInterestCapability = null;
	public By medicalContactUs_AreaOfInterestCapabilityIfOther = null;	
	public By medicalContactUs_AreaOfInterestApplication = null;
	public By medicalContactUs_AreaOfInterestApplicationIfOther = null;
	public By medicalContactUs_HowDidYouHearAboutUs = null;
	public By medicalContactUs_HowDidYouHearAboutUsIfOther = null;
	public By medicalContactUs_YesIWouldLikeToRequestAProductSample = null;
	public By medicalContactUs_DUNSNumber = null;
	public By medicalContactUs_DUNSConfidence = null;
	public By medicalContactUs_EloquaCampaignID = null;
	public By medicalContactUs_tECewt7 = null;

	public By registration_DateSubmitted = null;
	public By registration_Email = null;
	public By registration_TECewt5 = null;
	public By registration_TECewt7 = null;
	public By registration_HiddenCampaignID = null;
	public By registration_KeepMeInformed = null;
	public By registration_FirstName = null;
	public By registration_LastName = null;
	public By registration_City = null;
	public By registration_State = null;
	public By registration_ZipCode = null;
	public By registration_Company = null;
	public By registration_Country = null;
	public By registration_Address1 = null;
	public By registration_Address2 = null;
	public By registration_CompanyType = null;
	public By registration_BussinessPhone = null;
	public By registration_JobRole = null;
	public By registration_PrimaryIndustry = null;
	public By registration_EloquaCampaignID = null;

	public By subscription_EloquaCampaignID = null;
	public By subscription_Email = null;
	public By subscription_IndustryIntrests = null;
	public By subscription_SubscriptionKeepMeInformed = null;
	public By subscription_EloquaContactID = null;
	public By subscription_AllIndustries = null;
	public By subscription_UnsubscribeAll = null;
	public By subscription_HiddenSubscription = null;
	public By subscription_HiddenIndustryIntrest = null;
	public By subscription_HiddenCustomerSpecifiedIndustry1 = null;
	public By subscription_hiddenSubscription = null;
	public By subscription_TestPleaseDelete = null;

	public By login_DateSubmitted = null;
	public By login_Email = null;
	public By login_TECewt5 = null;
	public By login_TECewt7 = null;
	public By login_Username = null;

	public By liveChat_DateSubmitted = null;
	public By liveChat_Email = null;
	public By liveChat_FirstName = null;
	public By liveChat_LastName = null;
	public By liveChat_Company = null;
	public By liveChat_SubscriptionKeepMeInformed = null;
	public By liveChat_TECewt7 = null;
	public By liveChat_EloquaCampaignID = null;

	public By downloadProduct_DateSubmitted = null;
	public By downloadProduct_Email = null;
	public By downloadProduct_TECewt7 = null;
	public By downloadProduct_DocumentType = null;
	public By downloadProduct_DocumentURL = null;
	public By downloadProduct_DocumentName = null;
	public By downloadProduct_DocumentDownloadGUID = null;
	public By downloadProduct_EloquaCampaignID = null;

	public By login_Password = null;
	public By login_Company = null;
	public By login_SignInBtn = null;
	public By eloqua_ActionBtn = null;
	public By eloqua_SubmissionDataBtn = null;

	// RPIT OBJECTS
	public By RPIT_FirstName = null;
	public By RPIT_LastName = null;
	public By RPIT_Company = null;
	public By RPIT_Address = null;
	public By RPIT_City = null;
	public By RPIT_Country = null;
	public By RPIT_JobRole = null;
	public By RPIT_Email = null;
	public By RPIT_Telephone  = null;
	public By RPIT_Question = null;
	public By RPIT_CountryArrow=null;
	
	// SENSOR NEWSLETTER OBJECTS
	public By SensorNewsletter_Email = null;
	public By SensorNewsletter_FirstName = null;
	public By SensorNewsletter_LastName = null;
	public By SensorNewsletter_Country = null;
	public By SensorNewsletter_Indutry_AreaOfInterest = null;
	
	// SENSORS CONTACT US CHINA CMPAIGN
	public By SensorChinaCampaign_LastName = null;
	public By SensorChinaCampaign_FirstName = null;
	public By SensorChinaCampaign_Company = null;
	public By SensorChinaCampaign_Email = null;
	public By SensorChinaCampaign_BusinessPhone = null;
	public By SensorChinaCampaign_Country = null;
	public By SensorChinaCampaign_City = null;
	public By SensorChinaCampaign_InterestedProducts = null;
	public By SensorChinaCampaign_InterestedIndustry = null;
	public By SensorChinaCampaign_TypeOfDemand = null;
	public By SensorChinaCampaign_SpecificNeeds = null;

	// CTOR
	public Eloqua_Form(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	public void setup(String localeChoice){
		try {
			if(localeChoice != null && localeChoice != ""){
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "eloqua_form");
				initializepageObjects();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializepageObjects(){
		try {

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
			RPIT_CountryArrow = By.xpath(propertyHandlerObj.readProperties("RPIT_CountryArrow"));
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
	
	
	public boolean loginToEloqua(String eloquaURL, String El_Username, String El_Password, String El_Company){
		boolean operationFlag=false;
		try {
			globalFunctionObj.get_WebDriver().navigate().to(eloquaURL);
			globalFunctionObj.pause_Short();
			if(globalFunctionObj.checkIfElementEnabled(login_Username)){
				globalFunctionObj.SendOnThisElement(login_Username, El_Username);
				globalFunctionObj.SendOnThisElement(login_Password, El_Password);
				globalFunctionObj.SendOnThisElement(login_Company, El_Company);
				globalFunctionObj.pause(3000);
				globalFunctionObj.clickOnThisElement(login_SignInBtn);
				globalFunctionObj.pause(3000);
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
			System.out.println("Opening URL :: " + EL_URL);
			globalFunctionObj.get_WebDriver().get(EL_URL);
			// globalFunctionObj.open_URL(EL_URL);
			System.out.println("CRRR :: " + globalFunctionObj.get_WebDriver().getCurrentUrl());
			globalFunctionObj.pause(10000);

			System.out.println("Click on ACTION BTN");
			// CLICK ON ACTION BTN
			globalFunctionObj.clickOnThisElement(eloqua_ActionBtn);

			globalFunctionObj.pause(4000);

			System.out.println("Click on VIEW SUBMISSION DATA BTN");
			// CLICK ON SUBMMITION DATA OPTION
			globalFunctionObj.clickOnThisElement(eloqua_SubmissionDataBtn);
			
			operationFlag = true;
		} catch (Exception e) {
			operationFlag = false;
			e.printStackTrace();
		}
		return operationFlag;
	}
	
}
