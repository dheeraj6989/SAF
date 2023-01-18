package Modules.MIS.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

public class Eloqua {

	// SAF OBJECTS
	public PropertyHandler propertyHandlerObj = null;
	
	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;
	
	//ELOQUA OBJECTS
	
	public By customerSupport_Email = null;
	public By customerSupport_Company = null;
	public By customerSupport_FirstName = null;
	public By customerSupport_LastName = null;
	public By customerSupport_Address = null;
	public By customerSupport_City = null;
	public By customerSupport_State = null;
	public By customerSupport_Country = null;
	public By customerSupport_PostalCode = null;
	public By customerSupport_Phone = null;
	public By customerSupport_Subject = null;
	public By customerSupport_Category = null;
	public By customerSupport_Question = null;
	public By customerSupport_Submit = null;
	public By customerSupport_SameAddressRadioBtn = null;
	public By customerSupport_ConfirmAddressBtn = null;
	public By customerSupport_ConfirmMailSubmitted = null;

	public By sensorSolution_Email = null;
	public By sensorSolution_FirstName = null;
	public By sensorSolution_LastName = null;
	public By sensorSolution_Company = null;
	public By sensorSolution_BusinessPhone = null;
	public By sensorSolution_Country = null;
	public String sensorSolution_Selectcountry = null;
	public By sensorSolution_ProductsListArrow = null;
	public By sensorSolution_ProductsList = null;
	public String sensorSolution_ProductListOther = null;
	public By sensorSolution_InquiryDetails = null;
	public By sensorSolution_Industry = null;
	public String sensorSolution_IndustrySelect = null;
	public By sensorSolution_IndustryOption = null;
	public By sensorSolution_Submit = null;
	
	public By medicalIndustry_FirstName = null;
	public By medicalIndustry_LastName = null;
	public By medicalIndustry_Title = null;
	public By medicalIndustry_Company = null;
	public By medicalIndustry_Address = null;
	public By medicalIndustry_City = null;
	/*public By medicalIndustry_State = null;*/
	public By medicalIndustry_Country = null;
	public String medicalIndustry_Selectcountry=null;
	public By medicalIndustry_State = null; 
	public String medicalIndustry_SelectState=null;
	public By medicalIndustry_PostalCode = null;
	public By medicalIndustry_Phone = null;
	public By medicalIndustry_Email = null;
	public By medicalIndustry_Submit = null;
	
	public By medicalIndustry_SameAddressRadioBtn = null;
	public By medicalIndustry_ConfirmAddressBtn = null;
	/*public By medicalIndustry_Capability = null;
	public By medicalIndustry_OtherCapability = null;
	public By medicalIndustry_Application = null;
	public By medicalIndustry_OtherApplication = null;
	public By medicalIndustry_SiteReference = null;
	public By medicalIndustry_SiteOtherReference = null;
	*/
	public By subscription_EmailAddress = null;
	public By subscription_AccessSubscriptions = null;
	public By subscription_Error = null;
	//public By subscription_Cancel = null;
	
	public By download_Link = null;

	public By login_Link = null;
	public By login_SecondLink = null;
	public By login_UserName = null;
	public By login_Password = null;
	public By login_Button = null;
	
	public By registeration_Email = null;
	public By registeration_ConfirmEmail = null;
	public By registeration_Password = null;
	public By registeration_FirstName = null;
	public By registeration_LastName = null;
	public By registeration_PhoneNo = null;
	public By registeration_Company = null;
	public By registeration_Role = null;
	public By registeration_Industry = null;
	public By registeration_Country = null;
	public By registeration_City = null;
	public By registeration_PostalCode = null;
	public By registeration_Submit = null;
	public By registeration_Error_Msg = null;
	public By registeration_useSameAddressRadio = null;
	public By registeration_submitAddressConfirmation= null;
	
	public By liveChat_Link = null;
	public By liveChat_Language = null;
	public By liveChat_FirstName = null;
	public By liveChat_LastName = null;
	public By liveChat_Email = null;
	public By liveChat_ChatNow = null;
	public By liveChat_NoAgent_Btn = null;
	
	// RPIT OBJECTS
	public By RPIT_FirstName = null;
	public By RPIT_LastName = null;
	public By RPIT_Company = null;
	public By RPIT_Address = null;
	public By RPIT_City = null;
	public By RPIT_CountryArrow = null;
	public String RPIT_CountrySelect_Element = null;
	public By RPIT_JobRoleArrow = null;
	public String RPIT_JobRoleSelect_Element = null;
	public By RPIT_Email = null;
	public By RPIT_Telephone = null;
	public By RPIT_QuestionText = null;
	public By RPIT_Submit_Btn = null;
	
	// SENSOR NEWSLETTER OBJECTS
	public By SensorNewsletter_Email = null;
	public By SensorNewsletter_FirstName = null;
	public By SensorNewsletter_LastName = null;
	public By SensorNewsletter_CountryArrow = null;
	public String SensorNewsletter_CountrySelect_Element = null;
	public By SensorNewsletter_Indutry_AreaOfInterest_Arrow = null;
	public String SensorNewsletter_Indutry_AreaOfInterest_SelectElement = null;
	public By SensorNewsletter_Submit_Btn = null;
	
	// SENSOR CONTACT US CHINA CAMPAIGN
	public By SensorChinaCampaign_LastName = null;
	public By SensorChinaCampaign_FirstName = null;
	public By SensorChinaCampaign_Company = null;
	public By SensorChinaCampaign_Email = null;
	public By SensorChinaCampaign_BusinessPhone = null;
	public By SensorChinaCampaign_CountryArrow = null;
	public String SensorChinaCampaign_CountrySelect_Element = null;
	public By SensorChinaCampaign_City = null;
	public By SensorChinaCampaign_InterestedProducts = null;
	public String SensorChinaCampaign_InterestedProducts_Element = null;
	public By SensorChinaCampaign_InterestedIndustry = null;
	public String SensorChinaCampaign_InterestedIndustry_Element = null;
	public By SensorChinaCampaign_TypeOfDemand = null;
	public String SensorChinaCampaign_TypeOfDemand_Element = null;
	public By SensorChinaCampaign_SpecificNeeds = null;
	public By SensorChinaCampaign_Submit_Btn = null;
	
	//added by adhir
	public By sensorSolution_AreaofInterestArrow = null;
	public By sensorSolution_AreaofInterestSelect = null;
	public By sensorSolution_NeedhelpArrow = null;
	public By sensorSolution_NeedHelpSelect = null;
	public By sensorSolution_textboxComment = null;
	public By medical_Confirm_Button=null;
	
	
	// CTOR
	public Eloqua(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}
	
	// SETUP
	public void setup(String localeChoice){
		try {
			if(localeChoice != null && localeChoice != ""){
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "eloqua");
				initializepageObjects();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initializepageObjects(){
		try {

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
			/*medicalIndustry_Capability = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Capability"));
			medicalIndustry_OtherCapability = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_OtherCapability"));
			medicalIndustry_Application = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Application"));
			medicalIndustry_OtherApplication = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_OtherApplication"));
			medicalIndustry_SiteReference = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_SiteReference"));
			medicalIndustry_SiteOtherReference = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_SiteOtherReference"));*/
			medicalIndustry_Submit = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Submit"));
			
			medicalIndustry_SameAddressRadioBtn = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_SameAddressRadioBtn"));
			medicalIndustry_ConfirmAddressBtn = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_ConfirmAddressBtn"));
			/*medicalIndustry_Selectcountry=By.xpath(propertyHandlerObj.readProperties("medicalIndustry_Selectcountry"));*/
			medicalIndustry_Selectcountry = propertyHandlerObj.readProperties("medicalIndustry_Selectcountry");
			medicalIndustry_State = By.xpath(propertyHandlerObj.readProperties("medicalIndustry_State"));
			medicalIndustry_SelectState = propertyHandlerObj.readProperties("medicalIndustry_SelectState");
			
			subscription_EmailAddress = By.xpath(propertyHandlerObj.readProperties("subscription_EmailAddress"));
			subscription_AccessSubscriptions = By.xpath(propertyHandlerObj.readProperties("subscription_AccessSubscriptions"));
			subscription_Error = By.xpath(propertyHandlerObj.readProperties("subscription_Error"));
			/*subscription_Cancel = By.xpath(propertyHandlerObj.readProperties("subscription_Cancel"));

			download_SignInLink = By.xpath(propertyHandlerObj.readProperties("download_SignInLink"));*/
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
			
			//add by adhir
			sensorSolution_AreaofInterestArrow= By.xpath(propertyHandlerObj.readProperties("sensorSolution_AreaofInterestArrow"));
			sensorSolution_AreaofInterestSelect= By.xpath(propertyHandlerObj.readProperties("sensorSolution_AreaofInterestSelect"));
			sensorSolution_NeedhelpArrow= By.xpath(propertyHandlerObj.readProperties("sensorSolution_NeedhelpArrow"));
			sensorSolution_NeedHelpSelect= By.xpath(propertyHandlerObj.readProperties("sensorSolution_NeedHelpSelect"));
			sensorSolution_textboxComment= By.xpath(propertyHandlerObj.readProperties("sensorSolution_textboxComment"));
			medical_Confirm_Button= By.xpath(propertyHandlerObj.readProperties("medical_Confirm_Button"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

} // CLASS END
