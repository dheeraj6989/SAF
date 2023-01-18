/*package Modules.TE.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.GlobalVariable;
import FunctionLibrary.PropertyHandler;

public class HomePage {

	// VARS

	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private GlobalFunction globalFunctionObj = null;

	// TE HOME PAGE OBJBECTS
	private By popUpCloseBtn = null;
	private By cookiesConsentBtn = null;
	private By close_EnhancementMsg = null;
	
	private By searchBox = null;
	private By searchbutton = null;
	private By globleMenu_Products = null;
	private By globleMenu_IndustryAndSolution = null;
	private By gmIndustryAndSolution_Automotive = null;

	private By gmProduct_Categories = null;
	private By gmProduct_MostSearched = null;
	private By gmProduct_Utilities = null;

	private By gmProduct_Antennas = null;
	private By gmProduct_ApplicationTooling = null;
	private By gmProduct_FibreOptics = null;
	private By gmProduct_EMIFilters = null;
	private By gmProduct_Sensors = null;
	
	private String gmProduct_Categories_CustomXpath = null;
	private String gmIndustrySoln_CustomXpath = null;
	
	// -------------------------------------------------------------------
	private By gmProduct_Aerospace = null;
	private By gmProduct_SensorSolutions = null;

	private By gmProduct_Connectors = null;
	private By header_Logo = null;
	private By header_AddToCart = null;
	private By header_MyPartslist = null;
	private By header_SignInMenu = null;
	private By header_SignInLink = null;
	private By header_CancelSearch = null;

	private By footer_AboutTEConnectivity = null;
	private By footer_ForPartners = null;
	private By footer_CustomerSupport = null;
	private By footer_Email = null;
	private By footer_CallUs = null;
	private By footer_LiveChat = null;

	private By footer_OurCompany = null;
	private By footer_Events = null;
	private By footer_TENewsCenter = null;
	private By footer_Careers = null;
	private By footer_Investors = null;
	private By footer_CorpResponsibility = null;
	private By footer_TermsAndCondition = null;

	private By footer_Distributors = null;
	private By footer_Suppliers = null;

	private By footer_ConnectWithUs = null;
	private By footer_FindAuthDistributors = null;
	private By footer_WhatsNewOnTE = null;
	private By footer_ShareFeedback = null;

	private By footer_AllCountry_Link = null;
	private String Product_MS_Costom_Keyword = null;

	// --------------------------------------------------------------------------

	private By msProduct_AMP = null;
	private By msProduct_Raychem = null;
	private By msProduct_Deutch = null;
	private By msProduct_Costom_Keyword = null;
	
	//-------------------------------------------------------------------------
	
	private By footer_Country_list = null;
	private By footer_Us_link = null;
	private By footer_China_link = null;
	private By footer_follow_us = null;
	private By footer_Bottom_rail = null;
	private By footer_findUrCountry = null;
	private By footer_findUrCountry_Element = null;
	private By searchExact_InternalNumber = null;
	
	private By expanded_Footer  =null;
	
	private By popUp_iframe  = null;
	private By popUp_agree_and_procced_close  =null;
	private By popUp_agree_and_procced = null;
	
	private By gmIndustryAndSolution_MedicalAndHealthcare = null;
	private By viewAll_Resource=null;
	private By data_Export=null;
	private By part_Number_Txt=null;
	private By content_OutPut_Dropdown=null;
	private By product_Attribute=null;
	private By exportToExcel=null;
	private By submitSpreadSheet=null;
	private By languageOutPutBar=null;
	private By viewYourDownloadsLink=null;
	private By excelAndProductFileLInk=null;
	private By resourcesLink=null;
	
	// NEW ELEMENT
	private By header_SignInLink_AfterLogin = null;
	private By menuItem_OrderStatus = null;
	private By link_MenuItem_ViewAll_AfterLogin = null;
	private By link_ShipAndDebit = null;
	private By link_Pricing_And_Availability = null;
	
	public By getLink_Pricing_And_Availability(){
		return link_Pricing_And_Availability;
	}
	public By getLink_MenuItem_ViewAll_AfterLogin() {
		return link_MenuItem_ViewAll_AfterLogin;
	}
	public By getLink_ShipAndDebit() {
		return link_ShipAndDebit;
	}
	public By getMenuItem_OrderStatus() {
		return menuItem_OrderStatus;
	}
	public By getResourcesLink() {
		return resourcesLink;
	}
	// ----------------------------------------------------- GETTER SETTER
	// -----------------------------------------------------
	public By getGmIndustryAndSolution_MedicalAndHealthcare() {
		return gmIndustryAndSolution_MedicalAndHealthcare;
	}
	public String getgmProduct_Categories_CustomXpath() {
		return gmProduct_Categories_CustomXpath;
	}

	
	
	public String getGmIndustrySoln_CustomXpath() {
		return gmIndustrySoln_CustomXpath;
	}

	public By getPopUp_agree_and_procced() {
		return popUp_agree_and_procced;
	}

	public By getPopUp_iframe() {
		return popUp_iframe;
	}

	public By getPopUp_agree_and_procced_close() {
		return popUp_agree_and_procced_close;
	}

	public By getCookiesConsentBtn() {
		return cookiesConsentBtn;
	}

	public By getPopUpCloseBtn() {
		return popUpCloseBtn;
	}

	public String getProduct_MS_Costom_Keyword() {
		return Product_MS_Costom_Keyword;
	}

	public By getClose_EnhancementMsg() {
		return close_EnhancementMsg;
	}
	public By getSearchBox() {
		return searchBox;
	}

	public By getSearchbutton() {
		return searchbutton;
	}

	public By getGlobleMenu_Products() {
		return globleMenu_Products;
	}

	public By getGlobleMenu_IndustryAndSolution() {
		return globleMenu_IndustryAndSolution;
	}

	public By getGmIndustryAndSolution_Automotive() {
		return gmIndustryAndSolution_Automotive;
	}

	public By getGmProduct_Categories() {
		return gmProduct_Categories;
	}

	public By getGmProduct_MostSearched() {
		return gmProduct_MostSearched;
	}

	public By getGmProduct_Utilities() {
		return gmProduct_Utilities;
	}

	public By getGmProduct_Antennas() {
		return gmProduct_Antennas;
	}

	public By getGmProduct_ApplicationTooling() {
		return gmProduct_ApplicationTooling;
	}

	public By getGmProduct_FibreOptics() {
		return gmProduct_FibreOptics;
	}

	public By getGmProduct_EMIFilters() {
		return gmProduct_EMIFilters;
	}

	public By getGmProduct_Sensors() {
		return gmProduct_Sensors;
	}

	public By getGmProduct_Aerospace() {
		return gmProduct_Aerospace;
	}

	public By getGmProduct_SensorSolutions() {
		return gmProduct_SensorSolutions;
	}

	public By getFooter_CustomerSupport() {
		return footer_CustomerSupport;
	}

	public By getFooter_ForPartners() {
		return footer_ForPartners;
	}

	public By getFooter_AboutTEConnectivity() {
		return footer_AboutTEConnectivity;
	}

	public By getFooter_Email() {
		return footer_Email;
	}

	public By getFooter_CallUs() {
		return footer_CallUs;
	}

	public By getFooter_LiveChat() {
		return footer_LiveChat;
	}

	public By getFooter_OurCompany() {
		return footer_OurCompany;
	}

	public By getFooter_Events() {
		return footer_Events;
	}

	public By getFooter_TENewsCenter() {
		return footer_TENewsCenter;
	}

	public By getFooter_Careers() {
		return footer_Careers;
	}

	public By getFooter_Investors() {
		return footer_Investors;
	}

	public By getFooter_CorpResponsibility() {
		return footer_CorpResponsibility;
	}

	public By getFooter_TermsAndCondition() {
		return footer_TermsAndCondition;
	}

	public By getFooter_Distributors() {
		return footer_Distributors;
	}

	public By getFooter_Suppliers() {
		return footer_Suppliers;
	}

	public By getFooter_ConnectWithUs() {
		return footer_ConnectWithUs;
	}

	public By getFooter_FindAuthDistributors() {
		return footer_FindAuthDistributors;
	}

	
	public By getFooter_Country_list() {
		return footer_Country_list;
	}

	public By getFooter_Us_link() {
		return footer_Us_link;
	}

	public By getFooter_China_link() {
		return footer_China_link;
	}

	public By getFooter_follow_us() {
		return footer_follow_us;
	}

	public By getFooter_Bottom_rail() {
		return footer_Bottom_rail;
	}

	public By getFooter_findUrCountry() {
		return footer_findUrCountry;
	}

	public By getFooter_findUrCountry_Element() {
		return footer_findUrCountry_Element;
	}

	public By getSearchExact_InternalNumber() {
		return searchExact_InternalNumber;
	}

	public By getExpanded_Footer() {
		return expanded_Footer;
	}

	public By getFooter_WhatsNewOnTE() {
		return footer_WhatsNewOnTE;
	}

	public By getFooter_ShareFeedback() {
		return footer_ShareFeedback;
	}

	public By getFooter_AllCountry_Link() {
		return footer_AllCountry_Link;
	}

	public PropertyHandler getPropertyHandlerObj() {
		return propertyHandlerObj;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public By getHeader_Logo() {
		return header_Logo;
	}

	public By getHeader_AddToCart() {
		return header_AddToCart;
	}

	public By getHeader_MyPartslist() {
		return header_MyPartslist;
	}

	public By getHeader_SignInMenu() {
		return header_SignInMenu;
	}

	public By getHeader_SignInLink() {
		return header_SignInLink;
	}

	public By getHeader_CancelSearch() {
		return header_CancelSearch;
	}

	public By getMsProduct_AMP() {
		return msProduct_AMP;
	}

	public By getMsProduct_Raychem() {
		return msProduct_Raychem;
	}

	public By getMsProduct_Deutch() {
		return msProduct_Deutch;
	}

	public By getMsProduct_Costom_Keyword() {
		return msProduct_Costom_Keyword;
	}
	public GlobalFunction getGlobalFunctionObj() {
		return globalFunctionObj;
	}
	public By getViewAll_Resource() {
		return viewAll_Resource;
	}
	public By getData_Export() {
		return data_Export;
	}
	public By getPart_Number_Txt() {
		return part_Number_Txt;
	}
	public By getContent_OutPut_Dropdown() {
		return content_OutPut_Dropdown;
	}
	public By getProduct_Attribute() {
		return product_Attribute;
	}
	public By getExportToExcel() {
		return exportToExcel;
	}
	public By getSubmitSpreadSheet() {
		return submitSpreadSheet;
	}
	public By getLanguageOutPutBar() {
		return languageOutPutBar;
	}
	public By getViewYourDownloadsLink() {
		return viewYourDownloadsLink;
	}
	public By getExcelAndProductFileLInk() {
		return excelAndProductFileLInk;
	}
	public By getHeader_SignInLink_AfterLogin() {
		return header_SignInLink_AfterLogin;
	}
	

	// --------------------------------------------------- GETTER SETTER END
	// ---------------------------------------------------

	public String getGmProduct_Categories_CustomXpath() {
		return gmProduct_Categories_CustomXpath;
	}

	public By getGmProduct_Connectors() {
		return gmProduct_Connectors;
	}

	// CTOR
	public HomePage(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj) {
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	private void setup(String localeChoice) {
		try {
			if (localeChoice != null && localeChoice != "") {

				propertyHandlerObj = globalFunctionObj.getPropertyFile(
						localeChoice, "home");
				
				wait = globalFunctionObj.getWait();
				initializepageObjects();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializepageObjects() {
		try {
			action = new Actions(webDriver);

			popUp_iframe = By.xpath(propertyHandlerObj.readProperties("popUp_iframe"));
			popUp_agree_and_procced_close = By.xpath(propertyHandlerObj.readProperties("popUp_agree_and_procced_close"));
			popUp_agree_and_procced = By.xpath(propertyHandlerObj.readProperties("popUp_agree_and_procced"));
			
			popUpCloseBtn = By.xpath(propertyHandlerObj.readProperties("popUpCloseBtn"));
			cookiesConsentBtn = By.xpath(propertyHandlerObj.readProperties("cookiesConsentBtn"));
			close_EnhancementMsg = By.xpath(propertyHandlerObj.readProperties("close_EnhancementMsg"));
			
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

			menuItem_OrderStatus = By.xpath(propertyHandlerObj.readProperties("menuItem_OrderStatus"));
			link_MenuItem_ViewAll_AfterLogin = By.xpath(propertyHandlerObj.readProperties("link_MenuItem_ViewAll_AfterLogin"));
			link_ShipAndDebit = By.xpath(propertyHandlerObj.readProperties("link_ShipAndDebit"));
			link_Pricing_And_Availability = By.xpath(propertyHandlerObj.readProperties("link_Pricing_And_Availability"));
			
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

	
	public WebElement checkIfElementEnabled_1(By elementByObj){
		WebElement webElement=null;
		try {
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(elementByObj));
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return webElement;
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
	
	// CLOSE POP UP
	public boolean closePopUp() {
		boolean popUpClosed = false;

		try {
			
			globalFunctionObj.pause(globalFunctionObj.longThinkTime);
			try {
				//action.moveToElement((WebElement)popUpCloseBtn);
				webDriver.findElement(popUpCloseBtn).click();
				//action.moveToElement((WebElement)close_EnhancementMsg);
				webDriver.findElement(close_EnhancementMsg).click();
				popUpClosed = true;
			} catch (Exception e){
				// e.printStackTrace();
			}
			try {
				action.moveToElement((WebElement)close_EnhancementMsg);
				webDriver.findElement(close_EnhancementMsg).click();
				webDriver.findElement(cookiesConsentBtn).click();
				webDriver.findElement(close_EnhancementMsg).click();
				popUpClosed = true;
			} catch (Exception e){
				// e.printStackTrace();
			}
			try {
				webDriver.findElement(close_EnhancementMsg).click();
				action.moveToElement((WebElement)popUpCloseBtn);
				webDriver.findElement(popUpCloseBtn).click();
				webDriver.findElement(close_EnhancementMsg).click();
				action.moveToElement((WebElement)popUpCloseBtn);
				webDriver.findElement(popUpCloseBtn).click();
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
	
	private boolean closePopUp_New(){
		boolean popUpClosed = false;
		try {
			
			// OLD CODE
			if (checkIfElementEnabled(popUp_iframe)) {
				
				System.out.println("POP UP FOUND");
				
				// SWITCH TO FRAME
				globalFunctionObj.pause(4000);
				webDriver.switchTo().frame(webDriver.findElement(popUp_iframe));
				globalFunctionObj.pause(2000);
				//action = new Actions(webDriver);
				action.moveToElement(webDriver.findElement(popUp_agree_and_procced)).build().perform();
				action.click();
				
				System.out.println("AGREE CLOSED");
				globalFunctionObj.pause(2000);
				
				if (checkIfElementEnabled(popUp_agree_and_procced)) {
					// CLICK ON AGREE AND CONTINUE
					System.out.println("AGREE CLOSED - AGAIN");
					webDriver.findElement(popUp_agree_and_procced).click();
					globalFunctionObj.pause(2000);
				}
				
				// CLICK ON CLSOE BTN
				if (checkIfElementEnabled(popUp_agree_and_procced_close)) {
					action.moveToElement(webDriver.findElement(popUp_agree_and_procced_close)).build().perform();
					action.click();
				}

				System.out.println("CLOSED CLICKED");
				globalFunctionObj.pause(2000);
				if (checkIfElementEnabled(popUp_agree_and_procced_close)) {
					webDriver.findElement(popUp_agree_and_procced_close).click();
				}

				webDriver.switchTo().defaultContent();
				System.out.println("NOW DEFALT");
			}
			
			if (checkIfElementEnabled(popUp_iframe)) {
				
				System.out.println("POP UP FOUND");
				
				// SWITCH TO FRAME
				globalFunctionObj.pause(4000);
				webDriver.switchTo().frame(webDriver.findElement(popUp_iframe));
				globalFunctionObj.pause(2000);
				//action = new Actions(webDriver);
				action.moveToElement(webDriver.findElement(popUp_agree_and_procced)).build().perform();
				action.click();
				
				System.out.println("AGREE CLOSED");
				globalFunctionObj.pause(2000);
				
				// CLICK ON AGREE AND CONTINUE
				System.out.println("AGREE CLOSED - AGAIN");
				webDriver.findElement(popUp_agree_and_procced).click();
				globalFunctionObj.pause(2000);
				
				// CLICK ON CLSOE BTN
				action.moveToElement(webDriver.findElement(popUp_agree_and_procced_close)).build().perform();
				action.click();
				System.out.println("CLOSED CLICKED");
				globalFunctionObj.pause(2000);
				webDriver.findElement(popUp_agree_and_procced_close).click();

				webDriver.switchTo().defaultContent();
				System.out.println("NOW DEFALT");
				
				webDriver.findElement(popUpCloseBtn).click();
				webDriver.findElement(cookiesConsentBtn).click();
				webDriver.findElement(popUpCloseBtn).click();
				
			}
			
		} catch (Exception e) {
			popUpClosed = false;
			// e.printStackTrace();
		}
		return popUpClosed;
	}

	public boolean enterKeywordInSearchBox_PressEnter(String searchKeyword) {
		boolean entered = false;
		try {

			WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
			webElement.sendKeys(searchKeyword);

			globalFunctionObj.pause(3000);
			
			action.sendKeys(Keys.ENTER);
			action.perform();
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
			// webDriver.findElement(searchBox).sendKeys(searchKeyword);
			WebElement webElement = wait.until(ExpectedConditions
					.visibilityOfElementLocated(searchBox));
			webElement.sendKeys(searchKeyword);

			action.sendKeys(Keys.SPACE);
			action.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean enterKeywordInSearchBox_ClickSearchButton(String searchKeyword) {
		boolean entered = false;
		try {
			// webDriver.findElement(searchBox).sendKeys(searchKeyword);
			// Thread.sleep(2000);
			// System.out.println(" search button"+searchKeyword);
			WebElement webElement = wait.until(ExpectedConditions
					.visibilityOfElementLocated(searchBox));
			webElement.sendKeys(searchKeyword);
			
			globalFunctionObj.pause(2000);
			
			WebElement test = webDriver.findElement(searchbutton);
			// wait.until(ExpectedConditions.visibilityOfElementLocated(searchbutton));
			// webElement.sendKeys(searchKeyword);
			// System.out.println("click on search button");
			// webDriver.findElement(searchbutton).click();
			test.click();
			entered = true;

		} catch (Exception e) {
			entered = false;
			//e.printStackTrace();
		}
		return entered;
	}

	public void enterTextInSearchBox(String searchKeyword) {
		try {
			webDriver.findElement(searchBox).sendKeys(searchKeyword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickSearchButton() {
		try {
			webDriver.findElement(searchbutton).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getElementText(By elementByObj) {
		String elementText = "";
		try {
			if (checkIfElementEnabled(elementByObj)) {
				elementText = webDriver.findElement(elementByObj).getText();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elementText;
	}

	public boolean clickOnThisElement(By elementByObj) {
		boolean clicked = false;
		try {
			globalFunctionObj.pause(500);
			webDriver.findElement(elementByObj).click();
			clicked = true;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;

	}

	public boolean clickOnThisElement(String elementLocator) {
		boolean clicked = false;
		By byObj = null;
		try {

			byObj = By.xpath(elementLocator);

			if (checkIfElementEnabled(byObj)) {
				webDriver.findElement(byObj).click();
				clicked = true;
			}
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
			
			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);

			if (checkIfElementEnabled(byObj)) {
				webDriver.findElement(byObj).click();
				clicked = true;
			}
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickOn_CustomIndustrySoln_Element(String keyword){
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(gmIndustrySoln_CustomXpath, keyword);
			
			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);

			if (checkIfElementEnabled(byObj)) {
				webDriver.findElement(byObj).click();
				clicked = true;
			}
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}
	
	
	public boolean clickOn_CustomMostSearched_ProductElement(String keyword){
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(Product_MS_Costom_Keyword, keyword);
			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);

			if (checkIfElementEnabled(byObj)) {
				webDriver.findElement(byObj).click();
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
	
	public void moveToElement(By elementByObj) {
		action.moveToElement((WebElement) elementByObj).build().perform();
	}
	
	public boolean moveTo_ClickElement(By elementByObj){
		boolean verifyResult = false;
		try {
			action.moveToElement(webDriver.findElement(elementByObj)).build().perform();
			globalFunctionObj.pause(2000);
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
			globalFunctionObj.pause(2000);
			webDriver.findElement(By.xpath(updatedLocator)).click();
			verifyResult = true;
		} catch (Exception e) {
			verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}

}
*/