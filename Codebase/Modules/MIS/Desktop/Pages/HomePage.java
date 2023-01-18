package Modules.MIS.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.GlobalVariable;
import FunctionLibrary.PropertyHandler;

public class HomePage {

	// VARS

	// SAF OBJECTS
	public PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;

	public By login_Link = null;
	public By login_SecondLink = null;
	public By login_UserName = null;
	public By login_Password = null;
	public By login_Button = null;
	
	public By secureCheckout_Checkout_Btn = null;
	
	// TE HOME PAGE OBJBECTS
	public By popUpCloseBtn = null;
	public By cookiesConsentBtn = null;
	public By close_EnhancementMsg = null;
	private WebDriverWait wait = null;
	public By searchBox = null;
	public By searchbutton = null;
	public By globleMenu_Products = null;
	public By globleMenu_IndustryAndSolution = null;
	public By gmIndustryAndSolution_Automotive = null;

	public By gmProduct_Categories = null;
	public By gmProduct_MostSearched = null;
	public By gmProduct_Utilities = null;

	public By gmProduct_Antennas = null;
	public By gmProduct_ApplicationTooling = null;
	public By gmProduct_FibreOptics = null;
	public By gmProduct_EMIFilters = null;
	public By gmProduct_Sensors = null;
	
	public String gmProduct_Categories_CustomXpath = null;
	public String gmIndustrySoln_CustomXpath = null;
	
	// -------------------------------------------------------------------
	public By gmProduct_Aerospace = null;
	public By gmProduct_SensorSolutions = null;

	public By gmProduct_Connectors = null;
	public By header_Logo = null;
	public By header_AddToCart = null;
	public By header_MyPartslist = null;
	public By header_SignInMenu = null;
	public By header_SignInLink = null;
	public By header_CancelSearch = null;

	public By footer_AboutTEConnectivity = null;
	public By footer_ForPartners = null;
	public By footer_CustomerSupport = null;
	public By footer_Email = null;
	public By footer_CallUs = null;
	public By footer_LiveChat = null;

	public By footer_OurCompany = null;
	public By footer_Events = null;
	public By footer_TENewsCenter = null;
	public By footer_Careers = null;
	public By footer_Investors = null;
	public By footer_CorpResponsibility = null;
	public By footer_TermsAndCondition = null;

	public By footer_Distributors = null;
	public By footer_Suppliers = null;

	public By footer_ConnectWithUs = null;
	public By footer_FindAuthDistributors = null;
	public By footer_WhatsNewOnTE = null;
	public By footer_ShareFeedback = null;

	public By footer_AllCountry_Link = null;
	public String Product_MS_Costom_Keyword = null;

	// --------------------------------------------------------------------------

	public By msProduct_AMP = null;
	public By msProduct_Raychem = null;
	public By msProduct_Deutch = null;
	public By msProduct_Costom_Keyword = null;
	
	//-------------------------------------------------------------------------
	
	public By footer_Country_list = null;
	public By footer_Us_link = null;
	public By footer_China_link = null;
	public By footer_follow_us = null;
	public By footer_Bottom_rail = null;
	public By footer_findUrCountry = null;
	public By footer_findUrCountry_Element = null;
	public By searchExact_InternalNumber = null;
	
	public By expanded_Footer  =null;
	
	public By popUp_iframe  = null;
	public By popUp_agree_and_procced_close  =null;
	public By popUp_agree_and_procced = null;
	
	public By gmIndustryAndSolution_MedicalAndHealthcare = null;
	public By viewAll_Resource=null;
	public By data_Export=null;
	public By part_Number_Txt=null;
	public By content_OutPut_Dropdown=null;
	public By product_Attribute=null;
	public By exportToExcel=null;
	public By submitSpreadSheet=null;
	public By languageOutPutBar=null;
	public By viewYourDownloadsLink=null;
	public By excelAndProductFileLInk=null;
	public By resourcesLink=null;
	
	// NEW ELEMENT
	public By header_SignInLink_AfterLogin = null;
	public By menuItem_OrderStatus = null;
	public By link_MenuItem_ViewAll_AfterLogin = null;
	public By link_ShipAndDebit = null;
	public By link_Pricing_And_Availability = null;
	public By footer_Feedback=null; 
	public By footer_Facebook =null;
	public By footer_Linkedin=null;
	public By footer_twitter=null;
	public By footer_Instagram=null;
	public By footer_YouTube=null;
	public By footer_GooglePlus=null;
	

	public By header_YourAcct_Link = null;
	public By yourAcct_ViewOrderHistory_Btn = null;
	public By yourAcct_ViewOrderDetails_Prod1_Link = null;
	public By yourAcct_ProfileTab_Link = null;
	public By yourAcct_SubscriptionsTab_Link = null;
	public By yourAcct_AddressTab_Link = null;
	public By yourAcct_PaymentMethodTab_Link = null;
	public By salesforce_username=null;
	public By salesforce_password=null;
	public By salesforce_logibButton=null;
	
	// CTOR
	public HomePage(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj) {
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	public void setup(String localeChoice) {
		try {
			if (localeChoice != null && localeChoice != "") {

				propertyHandlerObj = globalFunctionObj.getPropertyFile(
						localeChoice, "home");
				
				initializepageObjects();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initializepageObjects() {
		try {
			popUp_iframe = By.xpath(propertyHandlerObj.readProperties("popUp_iframe"));
			popUp_agree_and_procced_close = By.xpath(propertyHandlerObj.readProperties("popUp_agree_and_procced_close"));
			popUp_agree_and_procced = By.xpath(propertyHandlerObj.readProperties("popUp_agree_and_procced"));
			
			popUpCloseBtn = By.xpath(propertyHandlerObj.readProperties("popUpCloseBtn"));
			cookiesConsentBtn = By.xpath(propertyHandlerObj.readProperties("cookiesConsentBtn"));
			close_EnhancementMsg = By.xpath(propertyHandlerObj.readProperties("close_EnhancementMsg"));
			
			login_Link = By.xpath(propertyHandlerObj.readProperties("login_Link"));
			login_SecondLink = By.xpath(propertyHandlerObj.readProperties("login_SecondLink"));
			login_UserName = By.xpath(propertyHandlerObj.readProperties("login_UserName"));
			login_Password = By.xpath(propertyHandlerObj.readProperties("login_Password"));
			login_Button = By.xpath(propertyHandlerObj.readProperties("login_Button"));
			
			secureCheckout_Checkout_Btn = By.xpath(propertyHandlerObj.readProperties("secureCheckout_Checkout_Btn"));
			
			searchBox = By
					.xpath(propertyHandlerObj.readProperties("searchBox"));
			searchbutton = By.xpath(propertyHandlerObj
					.readProperties("searchbutton"));

			globleMenu_Products = By.xpath(propertyHandlerObj
					.readProperties("globleMenu_Products"));
			globleMenu_IndustryAndSolution = By.xpath(propertyHandlerObj
					.readProperties("globleMenu_IndustryAndSolution"));
			gmIndustryAndSolution_Automotive = By.xpath(propertyHandlerObj
					.readProperties("gmIndustryAndSolution_Automotive"));

			gmProduct_Categories = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_Categories"));
			gmProduct_MostSearched = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_MostSearched"));
			gmProduct_Utilities = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_Utilities"));

			gmProduct_Antennas = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_Antennas"));
			gmProduct_ApplicationTooling = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_ApplicationTooling"));
			gmProduct_FibreOptics = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_FibreOptics"));
			gmProduct_EMIFilters = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_EMIFilters"));
			gmProduct_Sensors = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_Sensors"));
			// -----------------------------------------------------------------------------------------------------
			gmProduct_Aerospace = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_Aerospace"));
			gmProduct_SensorSolutions = By.xpath(propertyHandlerObj
					.readProperties("gmProduct_SensorSolutions"));
			// -------------------------------------------------------------------------------------------------------
			footer_AboutTEConnectivity = By.xpath(propertyHandlerObj
					.readProperties("footer_AboutTEConnectivity"));
			footer_ForPartners = By.xpath(propertyHandlerObj
					.readProperties("footer_AboutTEConnectivity"));
			footer_CustomerSupport = By.xpath(propertyHandlerObj
					.readProperties("footer_CustomerSupport"));
			footer_LiveChat = By.xpath(propertyHandlerObj
					.readProperties("footer_LiveChat"));
			footer_CallUs = By.xpath(propertyHandlerObj
					.readProperties("footer_CallUs"));
			footer_AllCountry_Link = By.xpath(propertyHandlerObj
					.readProperties("footer_AllCountry_Link"));
			footer_OurCompany = By.xpath(propertyHandlerObj
					.readProperties("footer_OurCompany"));
			footer_Events = By.xpath(propertyHandlerObj
					.readProperties("footer_Events"));
			footer_TENewsCenter = By.xpath(propertyHandlerObj
					.readProperties("footer_TENewsCenter"));
			footer_Investors = By.xpath(propertyHandlerObj
					.readProperties("footer_Investors"));
			footer_Careers = By.xpath(propertyHandlerObj
					.readProperties("footer_Careers"));
			footer_TermsAndCondition = By.xpath(propertyHandlerObj
					.readProperties("footer_TermsAndCondition"));
			footer_CorpResponsibility = By.xpath(propertyHandlerObj
					.readProperties("footer_CorpResponsibility"));
			footer_Email = By.xpath(propertyHandlerObj
					.readProperties("footer_Email"));
			footer_Distributors = By.xpath(propertyHandlerObj
					.readProperties("footer_Distributors"));
			footer_Suppliers = By.xpath(propertyHandlerObj
					.readProperties("footer_Suppliers"));
			footer_ConnectWithUs = By.xpath(propertyHandlerObj
					.readProperties("footer_ConnectWithUs"));
			footer_FindAuthDistributors = By.xpath(propertyHandlerObj
					.readProperties("footer_FindAuthDistributors"));
			footer_WhatsNewOnTE = By.xpath(propertyHandlerObj
					.readProperties("footer_WhatsNewOnTE"));
			footer_ShareFeedback = By.xpath(propertyHandlerObj
					.readProperties("footer_ShareFeedback"));

			header_Logo = By.xpath(propertyHandlerObj
					.readProperties("header_Logo"));
			header_AddToCart = By.xpath(propertyHandlerObj
					.readProperties("header_AddToCart"));
			header_MyPartslist = By.xpath(propertyHandlerObj
					.readProperties("header_MyPartslist"));
			header_SignInMenu = By.xpath(propertyHandlerObj
					.readProperties("header_SignInMenu"));
			header_SignInLink = By.xpath(propertyHandlerObj
					.readProperties("header_SignInLink"));
			header_CancelSearch = By.xpath(propertyHandlerObj
					.readProperties("header_CancelSearch"));
			// -------------------------------------------------------------------------------------------------------------
			gmProduct_Categories_CustomXpath = propertyHandlerObj
					.readProperties("gmProduct_Categories_CustomXpath");
			Product_MS_Costom_Keyword = propertyHandlerObj
					.readProperties("msProduct_Custom_Keyword");
			msProduct_AMP = By.xpath(propertyHandlerObj
					.readProperties("msProduct_AMP"));
			msProduct_Raychem = By.xpath(propertyHandlerObj
					.readProperties("msProduct_Raychem"));
			msProduct_Deutch = By.xpath(propertyHandlerObj
					.readProperties("msProduct_Deutch"));
			gmProduct_Connectors=By.xpath(propertyHandlerObj
					.readProperties("gmProduct_Connectors"));

			
			expanded_Footer=By.xpath(propertyHandlerObj
					.readProperties("expanded_Footer"));
			footer_Country_list=By.xpath(propertyHandlerObj
					.readProperties("footer_Country_list"));
			footer_Us_link=By.xpath(propertyHandlerObj
					.readProperties("footer_Us_link"));
			footer_China_link=By.xpath(propertyHandlerObj
					.readProperties("footer_China_link"));
			footer_follow_us=By.xpath(propertyHandlerObj
					.readProperties("footer_follow_us"));
			footer_Bottom_rail=By.xpath(propertyHandlerObj
					.readProperties("footer_Bottom_rail"));
			footer_findUrCountry=By.xpath(propertyHandlerObj
					.readProperties("footer_findUrCountry"));
			searchExact_InternalNumber=By.xpath(propertyHandlerObj
					.readProperties("searchExact_InternalNumber"));

			gmIndustryAndSolution_MedicalAndHealthcare=By.xpath(propertyHandlerObj
					.readProperties("gmIndustryAndSolution_MedicalAndHealthcare"));
			

			viewAll_Resource=By.xpath(propertyHandlerObj
					.readProperties("viewAll_Resource"));

			data_Export=By.xpath(propertyHandlerObj
					.readProperties("data_Export"));

			part_Number_Txt=By.xpath(propertyHandlerObj
					.readProperties("part_Number_Txt"));

			content_OutPut_Dropdown=By.xpath(propertyHandlerObj
					.readProperties("content_OutPut_Dropdown"));

			product_Attribute=By.xpath(propertyHandlerObj
					.readProperties("product_Attribute"));

			exportToExcel=By.xpath(propertyHandlerObj
					.readProperties("exportToExcel"));
			submitSpreadSheet=By.xpath(propertyHandlerObj
					.readProperties("submitSpreadSheet"));
			languageOutPutBar=By.xpath(propertyHandlerObj
					.readProperties("languageOutPutBar"));
			viewYourDownloadsLink=By.xpath(propertyHandlerObj
					.readProperties("viewYourDownloadsLink"));
			excelAndProductFileLInk=By.xpath(propertyHandlerObj
					.readProperties("excelAndProductFileLInk"));
			resourcesLink=By.xpath(propertyHandlerObj
					.readProperties("resourcesLink"));
			header_SignInLink_AfterLogin=By.xpath(propertyHandlerObj
					.readProperties("header_SignInLink_AfterLogin"));
			
			footer_Feedback=By.xpath(propertyHandlerObj
					.readProperties("footer_Feedback"));
			footer_Facebook=By.xpath(propertyHandlerObj
					.readProperties("footer_Facebook"));
			footer_Linkedin=By.xpath(propertyHandlerObj
					.readProperties("footer_Linkedin"));
			footer_twitter=By.xpath(propertyHandlerObj
					.readProperties("footer_twitter"));
			footer_Instagram=By.xpath(propertyHandlerObj.readProperties("footer_Instagram"));
			footer_YouTube=By.xpath(propertyHandlerObj.readProperties("footer_YouTube"));
			footer_GooglePlus=By.xpath(propertyHandlerObj.readProperties("footer_GooglePlus"));
			
			menuItem_OrderStatus = By.xpath(propertyHandlerObj.readProperties("menuItem_OrderStatus"));
			link_MenuItem_ViewAll_AfterLogin = By.xpath(propertyHandlerObj.readProperties("link_MenuItem_ViewAll_AfterLogin"));
			link_ShipAndDebit = By.xpath(propertyHandlerObj.readProperties("link_ShipAndDebit"));
			link_Pricing_And_Availability = By.xpath(propertyHandlerObj.readProperties("link_Pricing_And_Availability"));
			
			
			header_YourAcct_Link = By.xpath(propertyHandlerObj.readProperties("header_YourAcct_Link"));
			yourAcct_ViewOrderHistory_Btn = By.xpath(propertyHandlerObj.readProperties("yourAcct_ViewOrderHistory_Btn"));
			yourAcct_ViewOrderDetails_Prod1_Link = By.xpath(propertyHandlerObj.readProperties("yourAcct_ViewOrderDetails_Prod1_Link"));
			yourAcct_ProfileTab_Link = By.xpath(propertyHandlerObj.readProperties("yourAcct_ProfileTab_Link"));
			yourAcct_SubscriptionsTab_Link = By.xpath(propertyHandlerObj.readProperties("yourAcct_SubscriptionsTab_Link"));
			yourAcct_AddressTab_Link = By.xpath(propertyHandlerObj.readProperties("yourAcct_AddressTab_Link"));
			yourAcct_PaymentMethodTab_Link = By.xpath(propertyHandlerObj.readProperties("yourAcct_PaymentMethodTab_Link"));
			gmIndustrySoln_CustomXpath=propertyHandlerObj.readProperties("gmIndustrySoln_CustomXpath");
			
			footer_findUrCountry_Element= By.xpath(propertyHandlerObj.readProperties("footer_findUrCountry_Element"));
			
			
			salesforce_username= By.xpath(propertyHandlerObj.readProperties("salesforce_username"));
			salesforce_password= By.xpath(propertyHandlerObj.readProperties("salesforce_password"));
			salesforce_logibButton= By.xpath(propertyHandlerObj.readProperties("salesforce_logibButton"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// CLOSE POP UP
	public boolean closePopUp() {
		boolean popUpClosed = false;

		try {
			
			globalFunctionObj.pause(globalFunctionObj.longThinkTime);
			try {
				//action.moveToElement((WebElement)popUpCloseBtn);
				globalFunctionObj.moveTo_Element(popUpCloseBtn);
				globalFunctionObj.get_WebDriver().findElement(popUpCloseBtn).click();
				//action.moveToElement((WebElement)close_EnhancementMsg);
				// globalFunctionObj.get_WebDriver().findElement(close_EnhancementMsg).click();
				popUpClosed = true;
			} catch (Exception e){
				// e.printStackTrace();
			}
			
			try {
				globalFunctionObj.moveTo_Element(popUp_iframe);
				globalFunctionObj.get_WebDriver().findElement(popUp_iframe).click();
				popUpClosed = true;
			}
			catch (Exception e){
				// e.printStackTrace();
			}
			
			try {
				globalFunctionObj.moveTo_Element(close_EnhancementMsg);
				globalFunctionObj.get_WebDriver().findElement(close_EnhancementMsg).click();
				globalFunctionObj.get_WebDriver().findElement(cookiesConsentBtn).click();
				globalFunctionObj.get_WebDriver().findElement(close_EnhancementMsg).click();
				popUpClosed = true;
			} catch (Exception e){
				// e.printStackTrace();
			}
			try {
				globalFunctionObj.get_WebDriver().findElement(close_EnhancementMsg).click();
				globalFunctionObj.moveTo_Element(popUpCloseBtn);
				globalFunctionObj.get_WebDriver().findElement(popUpCloseBtn).click();
				globalFunctionObj.get_WebDriver().findElement(close_EnhancementMsg).click();
				globalFunctionObj.moveTo_Element(popUpCloseBtn);
				globalFunctionObj.get_WebDriver().findElement(popUpCloseBtn).click();
				popUpClosed = true;
			} catch (Exception e){
				// e.printStackTrace();
			}
		
			closePopUp_New();
			
		} catch (Exception e) {
			// e.printStackTrace();
		}

		return popUpClosed;
	}
	
	private void closePopUp_WindowNew (){
		try {
			globalFunctionObj.pause(5000);
			globalFunctionObj.switchTo_Window();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private boolean closePopUp_New(){
		boolean popUpClosed = false;
		try {

			if (globalFunctionObj.checkIfElementEnabled(popUp_iframe)) {
				
				System.out.println("POP UP FOUND");
				
				// SWITCH TO FRAME
				globalFunctionObj.pause(4000);
				globalFunctionObj.get_WebDriver().switchTo().frame(globalFunctionObj.get_WebDriver().findElement(popUp_iframe));
				globalFunctionObj.pause(2000);
				//action = new Actions(webDriver);
				globalFunctionObj.moveTo_ClickElement(popUp_agree_and_procced);
				
				System.out.println("AGREE CLOSED");
				globalFunctionObj.pause(2000);
				
				// CLICK ON AGREE AND CONTINUE
				System.out.println("AGREE CLOSED - AGAIN");
				globalFunctionObj.get_WebDriver().findElement(popUp_agree_and_procced).click();
				globalFunctionObj.pause(2000);
				
				// CLICK ON CLSOE BTN
				globalFunctionObj.moveTo_ClickElement(popUp_agree_and_procced_close);
				System.out.println("CLOSED CLICKED");
				globalFunctionObj.pause(2000);
				globalFunctionObj.get_WebDriver().findElement(popUp_agree_and_procced_close).click();

				globalFunctionObj.get_WebDriver().switchTo().defaultContent();
				System.out.println("NOW DEFALT");
				
				globalFunctionObj.get_WebDriver().findElement(popUpCloseBtn).click();
				globalFunctionObj.get_WebDriver().findElement(cookiesConsentBtn).click();
				globalFunctionObj.get_WebDriver().findElement(popUpCloseBtn).click();
				
			}
			
		} catch (Exception e) {
			popUpClosed = false;
			// e.printStackTrace();
		}
		return popUpClosed;
	}

	public boolean enterKeywordInSearchBox_ClickSearchButton(String searchKeyword) {
		boolean entered = false;
		try {
			// webDriver.findElement(searchBox).sendKeys(searchKeyword);
			// Thread.sleep(2000);
			// System.out.println(" search button"+searchKeyword);
			WebElement webElement = globalFunctionObj.getWait().until(ExpectedConditions
					.visibilityOfElementLocated(searchBox));
			webElement.clear();
			webElement.sendKeys(searchKeyword);
			
			globalFunctionObj.pause(2000);
			
			globalFunctionObj.clickOnThisElement(searchbutton);
			
			// wait.until(ExpectedConditions.visibilityOfElementLocated(searchbutton));
			// webElement.sendKeys(searchKeyword);
			// System.out.println("click on search button");
			// webDriver.findElement(searchbutton).click();
			entered = true;

		} catch (Exception e) {
			entered = false;
			//e.printStackTrace();
		}
		System.out.println("entered :: " + entered);
		return entered;
	}
	public boolean enterKeywordInSearchBox_PressEnter(String searchKeyword) {
		boolean entered = false;
		try {
			globalFunctionObj.clear_TextBox(searchBox);
			globalFunctionObj.SendOnThisElement(searchBox, searchKeyword);
			globalFunctionObj.pause(3000);
			globalFunctionObj.operation_KeyPress_ENTER();
			globalFunctionObj.pause(5000);
			//action.sendKeys(Keys.ENTER);
			//action.perform();
			entered = true;
			
		} catch (Exception e) {
			entered = false;
			e.printStackTrace();
			// SET ERROR MESSAGE IN GLOBAL VAR
		}
		return entered;
	}
	public void enterKeywordInSearchBox_TypeAhead(String searchKeyword) {
		try {
			globalFunctionObj.SendOnThisElement(searchBox, searchKeyword);
			globalFunctionObj.pause_Long();
			// webDriver.findElement(searchBox).sendKeys(searchKeyword);
			globalFunctionObj.operation_KeyPress_SPACE();
			globalFunctionObj.pause_Long();
			//action.sendKeys(Keys.SPACE);
			//action.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//===============================================copied from old by adhir==================================================
	public boolean clickOn_CustomIndustrySoln_Element(String keyword){
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			
			customElementLocator = globalFunctionObj.getUpdatedLocator(gmIndustrySoln_CustomXpath, keyword);
			System.out.println(customElementLocator);
			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);
			
			globalFunctionObj.moveTo_ClickElement(byObj);
			System.out.println(customElementLocator);
			
				//globalFunctionObj.get_WebDriver().findElement(byObj).click();
				clicked = true;
		
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}
	
	// CEHCK IF ELEMENT IS ENABLED
	public boolean checkIfElementEnabled(By elementByObj){
		boolean elementEnabled = false;
		WebElement webElement=null;
		try {
			/// issue need to solve
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

	public boolean clickOn_CustomMostSearched_ProductElement(String keyword){
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(Product_MS_Costom_Keyword, keyword);
			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);

			
				globalFunctionObj.get_WebDriver().findElement(byObj).click();
				clicked = true;
			
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}
	
	
	public boolean clickOn_CustomCategory_ProductElement(String keyword){
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(gmProduct_Categories_CustomXpath, keyword);
			System.out.println(customElementLocator);
			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);

			
				System.out.println(	globalFunctionObj.get_WebDriver().findElement(byObj).getText());
				
				globalFunctionObj.get_WebDriver().findElement(byObj).click();
			//	globalFunctionObj.moveTo_ClickElement(byObj);
				clicked = true;
		
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}

}
