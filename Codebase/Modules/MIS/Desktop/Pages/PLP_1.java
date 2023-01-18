package Modules.MIS.Desktop.Pages;
/*package Modules.TE.Desktop.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.GlobalVariable;
import FunctionLibrary.PropertyHandler;

//PRODUCT LISTING PAGE - PLP
public class PLP {

	// VARS

	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private GlobalFunction globalFunctionObj = null;
	
	// TE PLP PAGE OBJBECTS
	private By resultProductTab = null;
	private By resultInformationTab = null;
	private By resultSubmenuList = null;
	private By resultSubmenuElementFirst = null;
	private By viewAllLink = null;
	private By plpPageProductTab = null;
	private By categoryLink = null;
	private By productTabs = null;
	private By subCatElement = null;

	private By resultProductElement = null;
	private By resultInformationElement = null;

	private By facet_Industry = null;
	private By facet_Applications = null;
	private By facet_ProductFamily = null;
	private By facet_Standards = null;
	private By facet_Series = null;

	// UPDATED BY CK
	private By facet_Industry_Ele_1 = null;
	private By facet_Applications_Ele_1 = null;
	private By facet_ProductFamily_Ele_1 = null;
	private By facet_Standards_Ele_1 = null;
	private By facet_Series_Ele_1 = null;
	
	private By prodCompare_Checkbox_First = null;
	private By prodCompare_Checkbox_Second = null;
	private By prodComapre_Button = null;

	private By prodCompare_SimilarFeat_Heading = null;
	private By prodCompare_SimilarFeat_Value = null;

	private By prodCompare_DifferentFeat_Heading = null;
	private By prodCompare_DifferentFeat_Value = null;
	private By viewall_LinkChinese=null;
	// ------------rishika--------------------------------------
	private By IEC_PowerInletFilter = null;
	private By lighting_Assemblies = null;
	private By lighting_connectwithus = null;
	private By lighting_Call = null;

	private By subSea_Communications = null;
	private By communications_Connectwithus = null;
	private By antennas = null;
	private By antennas_connectwithus=null;
	private By Product_55FH = null;
	
	
	private By applyBtnProduct=null;
	private By connectorStyle = null;
	private By receptacleConnectorStyledd = null;
	private By plugConnectorDropDown = null;
	private By applyConnectorStyle = null;
	private By industryFaceAeroSpaceDropDown = null;
	private By applicationAerospaceDropdown = null;
	private By product_ConnectWithUs = null;
	private By partnumber = null;
	private By searchMatchLink = null;
	private By crossRefProducts = null;
	private By submitSpreadsheetRequest = null;
	// -------------------------------------------------------------
	// private By prodCompare_SimilarFeat_FirstElement = null;
	// private By prodCompare_DifferentFeat_FirstElement= null;

	private String subCategory_CustomXpath = null;
	private String facet_Industry_List_CustXpath = null;
	private String facet_Applications_List_CustXpath = null;
	private String facet_ProductFamily_List_CustXpath = null;
	private String facet_Standards_List_CustXpath = null;
	private String facet_Series_List_CustXpath = null;
	
	private By subNav_Element_2 = null;
	private String SUBNAV_FIRST_ELE=null;
	
	private By categoryNav_View_Category;
	private By categoryNav_View_Product;
	
	private By searchHeader_View_Category;
	private By searchHeader_View_Product;
	
	private String facet_Industry_Ele_Custom = null;
	private String facet_Applications_Ele_Custom = null;
	private String facet_ProductFamily_Ele_Custom = null;
	private String facet_Standards_Ele_Custom = null;
	private String facet_Series_Ele_Custom = null;
	
	private By aerospaceDropDown=null;
	private By aeroSpaceAutomation = null;

	private By searchTypeAheadElement=null;
	private By heatShrinkTube = null;
	private By product = null;
	
	private By viewProduct_PLP =null;
	private By productListing_View_Category=null;
	private By productListing_View_Product=null;

	
	// ----------------------------------------------------- GETTER SETTER
	// -----------------------------------------------------
	
	public GlobalFunction getGlobalFunctionObj() {
		return globalFunctionObj;
	}

	public By getViewProduct_PLP() {
		return viewProduct_PLP;
	}

	public By getProductListing_View_Category() {
		return productListing_View_Category;
	}

	public By getProductListing_View_Product() {
		return productListing_View_Product;
	}

	public String getFacet_ProductFamily_Ele_Custom() {
		return facet_ProductFamily_Ele_Custom;
	}

	public String getFacet_Standards_Ele_Custom() {
		return facet_Standards_Ele_Custom;
	}

	public String getFacet_Series_Ele_Custom() {
		return facet_Series_Ele_Custom;
	}

	public By getSearchHeader_View_Category() {
		return searchHeader_View_Category;
	}

	public By getSearchHeader_View_Product() {
		return searchHeader_View_Product;
	}

	public String getFacet_Industry_Ele_Custom() {
		return facet_Industry_Ele_Custom;
	}

	public String getFacet_Applications_Ele_Custom() {
		return facet_Applications_Ele_Custom;
	}

	public By getFacet_Industry_Ele_1() {
		return facet_Industry_Ele_1;
	}

	public By getFacet_Applications_Ele_1() {
		return facet_Applications_Ele_1;
	}

	public By getFacet_ProductFamily_Ele_1() {
		return facet_ProductFamily_Ele_1;
	}

	public By getFacet_Standards_Ele_1() {
		return facet_Standards_Ele_1;
	}

	public By getFacet_Series_Ele_1() {
		return facet_Series_Ele_1;
	}

	public String getSubCategory_CustomXpath() {
		return subCategory_CustomXpath;
	}

	public By getResultProductTab() {
		return resultProductTab;
	}

	public By getSubNav_Element_2() {
		return subNav_Element_2;
	}

	public By getResultInformationTab() {
		return resultInformationTab;
	}

	public By getResultSubmenuList() {
		return resultSubmenuList;
	}

	public By getResultSubmenuElementFirst() {
		return resultSubmenuElementFirst;
	}

	public By getAntennas_connectwithus() {
		return antennas_connectwithus;
	}

	public By getResultProductElement() {
		return resultProductElement;
	}

	public By getResultInformationElement() {
		return resultInformationElement;
	}

	public By getFacet_Industry() {
		return facet_Industry;
	}

	public By getViewall_LinkChinese() {
		return viewall_LinkChinese;
	}

	public By getFacet_Applications() {
		return facet_Applications;
	}

	public By getFacet_ProductFamily() {
		return facet_ProductFamily;
	}

	public By getFacet_Standards() {
		return facet_Standards;
	}

	public By getFacet_Series() {
		return facet_Series;
	}

	public By getViewAllLink() {
		return viewAllLink;
	}
	

	public By getPlpPageProductTab() {
		return plpPageProductTab;
	}

	public By getCategoryLink() {
		return categoryLink;
	}

	public By getProductTabs() {
		return productTabs;
	}

	public By getProdCompare_Checkbox_First() {
		return prodCompare_Checkbox_First;
	}

	public By getProdCompare_Checkbox_Second() {
		return prodCompare_Checkbox_Second;
	}

	public By getProdComapre_Button() {
		return prodComapre_Button;
	}

	public By getProdCompare_SimilarFeat_Heading() {
		return prodCompare_SimilarFeat_Heading;
	}

	public By getProdCompare_SimilarFeat_Value() {
		return prodCompare_SimilarFeat_Value;
	}

	public By getProdCompare_DifferentFeat_Heading() {
		return prodCompare_DifferentFeat_Heading;
	}

	public By getProdCompare_DifferentFeat_Value() {
		return prodCompare_DifferentFeat_Value;
	}

	public By getProductFacet5mmpart() {
		return Product_55FH;
	}
    public By getApplyBtnProduct() {
    	return applyBtnProduct;
    }
	// ------------------------------------------------------------------
	public By getLighting_Assemblies() {
		return lighting_Assemblies;
	}

	public By getLighting_connectwithus() {
		return lighting_connectwithus;
	}

	public By getLighting_Call() {
		return lighting_Call;
	}

	public By getSubSea_Communications() {
		return subSea_Communications;
	}

	public By getCommunications_Connectwithus() {
		return communications_Connectwithus;
	}

	public By getIEC_PowerInletFilter() {
		return IEC_PowerInletFilter;
	}
	
	public By getAntennas() {
		return antennas;
	}
	
	public By getConnectorStyle() {
		return connectorStyle;
	}
	public By getPlugConnectorDropDown() {
		return plugConnectorDropDown;
	}


	public By getApplyConnectorStyle() {
		return applyConnectorStyle;
	}
	public By getReceptacleConnectorStyledd() {
		return receptacleConnectorStyledd;
	}

	public By getIndustryFaceAeroSpaceDropDown() {
		return industryFaceAeroSpaceDropDown;
	}

	public By getApplicationAerospaceDropdown() {
		return applicationAerospaceDropdown;
	}

	public By getAeroSpaceDropDown() {
		return industryFaceAeroSpaceDropDown;
	}

	public By getCategoryNav_View_Category() {
		return categoryNav_View_Category;
	}

	public By getCategoryNav_View_Product() {
		return categoryNav_View_Product;
	}

	public By getPartNumber() {
		return partnumber;
	}

	public By getSearchMatchLink() {
		return searchMatchLink;
	}

	public By getCrossRefProducts() {
		return crossRefProducts;
	}
	public By getSubmitSpreadsheetRequest() {
		return submitSpreadsheetRequest;
	}
	// ------------------------------------------------------------------------
	public String getFacet_Industry_List_CustXpath() {
		return facet_Industry_List_CustXpath;
	}

	public String getFacet_Applications_List_CustXpath() {
		return facet_Applications_List_CustXpath;
	}

	public String getFacet_ProductFamily_List_CustXpath() {
		return facet_ProductFamily_List_CustXpath;
	}

	public String getFacet_Standards_List_CustXpath() {
		return facet_Standards_List_CustXpath;
	}

	public String getFacet_Series_List_CustXpath() {
		return facet_Series_List_CustXpath;
	}

	public String getSUBNAV_FIRST_ELE() {
		return SUBNAV_FIRST_ELE;
	}

	public By getAerospaceDropDown() {
		return aerospaceDropDown;
	}
	public By getAeroSpaceAutomation() {
		return aeroSpaceAutomation;
	}
	
	public By getProduct() {
		return product;
	}
	public By getSubCatElement() {
		return subCatElement;
	}

	public By getProduct_ConnectWithUs() {
		return product_ConnectWithUs;
	}
	// --------------------------------------------------- GETTER SETTER END
		// ---------------------------------------------------

	public By getProduct_55FH() {
		return Product_55FH;
	}

	public By getSearchTypeAheadElement() {
		return searchTypeAheadElement;
	}
	
	public By getHeatShrinkTube() {
		return heatShrinkTube;
	} 
	//--------------------------------------------GETTER END------------------------------------

	// CTOR
	public PLP(String localeChoice, WebDriver webDriver, GlobalFunction globalFunctionObj) {
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	private void setup(String localeChoice) {
		try {

			if (localeChoice != null && localeChoice != "") {

				propertyHandlerObj = globalFunctionObj.getPropertyFile(
						localeChoice, "plp");
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

			resultProductTab = By.xpath(propertyHandlerObj
					.readProperties("resultProductTab"));
			resultInformationTab = By.xpath(propertyHandlerObj
					.readProperties("resultInformationTab"));
			resultProductElement = By.xpath(propertyHandlerObj
					.readProperties("resultProductElement"));
			resultInformationElement = By.xpath(propertyHandlerObj
					.readProperties("resultInformationElement"));

			subNav_Element_2 = By.xpath(propertyHandlerObj
					.readProperties("subNav_Element_2"));

			SUBNAV_FIRST_ELE = propertyHandlerObj
			.readProperties("SUBNAV_FIRST_ELE");
			
			facet_Industry = By.xpath(propertyHandlerObj
					.readProperties("facet_Industry"));
			facet_Applications = By.xpath(propertyHandlerObj
					.readProperties("facet_Applications"));
			facet_ProductFamily = By.xpath(propertyHandlerObj
					.readProperties("facet_ProductFamily"));
			facet_Standards = By.xpath(propertyHandlerObj
					.readProperties("facet_Standards"));
			facet_Series = By.xpath(propertyHandlerObj
					.readProperties("facet_Series"));

			facet_Industry_Ele_1 = By.xpath(propertyHandlerObj
					.readProperties("facet_Industry_Ele_1"));
			facet_Applications_Ele_1 = By.xpath(propertyHandlerObj
					.readProperties("facet_Applications_Ele_1"));
			facet_ProductFamily_Ele_1 = By.xpath(propertyHandlerObj
					.readProperties("facet_ProductFamily_Ele_1"));
			facet_Standards_Ele_1 = By.xpath(propertyHandlerObj
					.readProperties("facet_Standards_Ele_1"));
			facet_Series_Ele_1 = By.xpath(propertyHandlerObj
					.readProperties("facet_Series_Ele_1"));
			
			facet_Industry_List_CustXpath = propertyHandlerObj
					.readProperties("facet_Industry_List_CustXpath");
			facet_Applications_List_CustXpath = propertyHandlerObj
					.readProperties("facet_Applications_List_CustXpath");
			facet_ProductFamily_List_CustXpath = propertyHandlerObj
					.readProperties("facet_ProductFamily_List_CustXpath");
			facet_Standards_List_CustXpath = propertyHandlerObj
					.readProperties("facet_Standards_List_CustXpath");
			facet_Series_List_CustXpath = propertyHandlerObj
					.readProperties("facet_Series_List_CustXpath");

			viewAllLink = By.xpath(propertyHandlerObj
					.readProperties("viewAllLink"));
			
			plpPageProductTab = By.xpath(propertyHandlerObj
					.readProperties("plpPageProductTab"));
			categoryLink = By.xpath(propertyHandlerObj
					.readProperties("categoryLink"));
			productTabs = By.xpath(propertyHandlerObj
					.readProperties("productTabs"));

			prodCompare_Checkbox_First = By.xpath(propertyHandlerObj
					.readProperties("prodCompare_Checkbox_First"));
			prodCompare_Checkbox_Second = By.xpath(propertyHandlerObj
					.readProperties("prodCompare_Checkbox_Second"));
			prodComapre_Button = By.xpath(propertyHandlerObj
					.readProperties("prodComapre_Button"));

			prodCompare_SimilarFeat_Heading = By.xpath(propertyHandlerObj
					.readProperties("prodCompare_SimilarFeat_Heading"));
			prodCompare_SimilarFeat_Value = By.xpath(propertyHandlerObj
					.readProperties("prodCompare_SimilarFeat_Value"));

			prodCompare_DifferentFeat_Heading = By.xpath(propertyHandlerObj
					.readProperties("prodCompare_DifferentFeat_Heading"));
			prodCompare_DifferentFeat_Value = By.xpath(propertyHandlerObj
					.readProperties("prodCompare_DifferentFeat_Value"));
			
			product_ConnectWithUs =  By.xpath(propertyHandlerObj
					.readProperties("product_ConnectWithUs"));
			// -------------------------------------------------------------------------------------------------------
			IEC_PowerInletFilter = By.xpath(propertyHandlerObj
					.readProperties("IEC_PowerInletFilter"));
			lighting_Assemblies = By.xpath(propertyHandlerObj
					.readProperties("lighting_Assemblies"));
			lighting_connectwithus = By.xpath(propertyHandlerObj
					.readProperties("lighting_connectwithus"));
			lighting_Call = By.xpath(propertyHandlerObj
					.readProperties("lighting_Call"));
			subSea_Communications = By.xpath(propertyHandlerObj
					.readProperties("subSea_Communications"));
			communications_Connectwithus = By.xpath(propertyHandlerObj
					.readProperties("communications_Connectwithus"));
			antennas=By.xpath(propertyHandlerObj
					.readProperties("antennas"));
			antennas_connectwithus=By.xpath(propertyHandlerObj
					.readProperties("antennas_connectwithus"));
			Product_55FH= By.xpath(propertyHandlerObj
					.readProperties("Product_55FH"));
			applyBtnProduct=By.xpath(propertyHandlerObj
					.readProperties("applyBtnProduct"));
			connectorStyle=By.xpath(propertyHandlerObj
					.readProperties("connectorStyle"));
			receptacleConnectorStyledd=By.xpath(propertyHandlerObj
					.readProperties("receptacleConnectorStyledd"));
			plugConnectorDropDown=By.xpath(propertyHandlerObj
					.readProperties("plugConnectorDropDown"));
			applyConnectorStyle=By.xpath(propertyHandlerObj
					.readProperties("applyConnectorStyle"));
			partnumber=By.xpath(propertyHandlerObj
					.readProperties("partnumber"));
			searchMatchLink=By.xpath(propertyHandlerObj
					.readProperties("searchMatchLink"));
			crossRefProducts=By.xpath(propertyHandlerObj
					.readProperties("crossRefProducts"));
			searchTypeAheadElement=By.xpath(propertyHandlerObj
					.readProperties("searchTypeAheadElement"));
			submitSpreadsheetRequest=By.xpath(propertyHandlerObj
					.readProperties("submitSpreadsheetRequest"));
			heatShrinkTube=By.xpath(propertyHandlerObj
					.readProperties("heatShrinkTube"));
			product=By.xpath(propertyHandlerObj
					.readProperties("product"));

			facet_Industry_Ele_Custom=propertyHandlerObj.readProperties("facet_Industry_Ele_Custom");
			facet_Applications_Ele_Custom=propertyHandlerObj.readProperties("facet_Applications_Ele_Custom");
			facet_ProductFamily_Ele_Custom=propertyHandlerObj.readProperties("facet_ProductFamily_Ele_Custom");
			facet_Standards_Ele_Custom=propertyHandlerObj.readProperties("facet_Standards_Ele_Custom");
			facet_Series_Ele_Custom=propertyHandlerObj.readProperties("facet_Series_Ele_Custom");
			
			searchHeader_View_Category=By.xpath(propertyHandlerObj
					.readProperties("searchHeader_View_Category"));
			searchHeader_View_Product=By.xpath(propertyHandlerObj
					.readProperties("searchHeader_View_Product"));
			
			categoryNav_View_Category = By.xpath(propertyHandlerObj
					.readProperties("categoryNav_View_Category"));
			categoryNav_View_Product = By.xpath(propertyHandlerObj
					.readProperties("categoryNav_View_Product"));
			
			//----------------------------------NEW ElEMENTS------------------------------------------------------			
			   
			
			 viewProduct_PLP=By.xpath(propertyHandlerObj
						.readProperties("viewProduct_PLP"));
			 productListing_View_Category=By.xpath(propertyHandlerObj
						.readProperties("productListing_View_Category"));
			 productListing_View_Product=By.xpath(propertyHandlerObj
						.readProperties("productListing_View_Product"));
			 
			// -------------------------------------------------------------------------------------------------------------
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
	
	// NEW FUNC
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

	public String getResult_ProductTab() {
		String actualProductResult = null;
		WebElement webElemenet = null;
		try {
			
			webElemenet = checkIfElementEnabled_1(resultProductElement);
			
			if (webElemenet != null) {
				actualProductResult = webElemenet.getText();
			}else {
				actualProductResult = "";
			}
		} catch (Exception e) {
			actualProductResult = "";
			e.printStackTrace();
		}
		return actualProductResult;
	}

	public String getResult_InformationTab() {
		String actualProductResult = null;
		WebElement webElemenet = null;
		try {
			
			webElemenet = checkIfElementEnabled_1(resultInformationElement);
			
			if (webElemenet != null) {
				actualProductResult = webElemenet.getText();
			}else {
				actualProductResult = "";
			}
		} catch (Exception e) {
			actualProductResult = "";
			e.printStackTrace();
		}
		return actualProductResult;
	}

	public String getSubmenuListData(String xPath) {
		String actualSubmenuListData = "";
		try {
			String xpath = xPath;
			String[] first_xpath = xpath.split("--replace--");
			String pathToCalculateSize = first_xpath[0].substring(0,
					(first_xpath[0].length() - 1));
			System.out.println(pathToCalculateSize);

			List<WebElement> liElements = webDriver.findElements(By
					.xpath(pathToCalculateSize));

			for (int i = 1; i < liElements.size() + 1; i++) {
				WebElement linkElement = webDriver.findElement(By
						.xpath(first_xpath[0] + i + first_xpath[1]));

				actualSubmenuListData += linkElement.getText();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actualSubmenuListData;
	}

	public boolean clickProductTab() {
		boolean clicked = false;
		WebElement webElemenet = null;
		try {
			
			webElemenet = checkIfElementEnabled_1(resultProductTab);
			
			if (webElemenet != null) {
				webElemenet.click();
				clicked = true;
			}else {
				clicked = false;
			}
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickInformationTab() {
		boolean clicked = false;
		WebElement webElemenet = null;
		try {
			
			webElemenet = checkIfElementEnabled_1(resultInformationTab);
			
			if (webElemenet != null) {
				webElemenet.click();
				clicked = true;
			}else {
				clicked = false;
			}
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public String get_SubCategory_List() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(webDriver, getSubCategory_CustomXpath());
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public boolean verifyViewAllOrProductTabDisplayed() {

		boolean elementVisible = webDriver.findElement(viewAllLink)
				.isDisplayed();
		if (elementVisible == true) {
			webDriver.findElement(viewAllLink).click();
			globalFunctionObj.pause(2000);
			webDriver.findElement(plpPageProductTab).click();

			return true;
		}

		boolean productTab = webDriver.findElement(productTabs).isDisplayed();
		if (productTab == true) {
			webDriver.findElement(productTabs).click();
			globalFunctionObj.pause(2000);
			webDriver.findElement(categoryLink).click();
			return true;
		} else
			return false;
	}

	// -------------------------- CLICK ON FACET ---------------------------
	public boolean clickOnFacet_Application() {
		boolean clicked = false;
		try {
			webDriver.findElement(facet_Applications).click();
			clicked = true;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickOnFacet_Industry() {
		boolean clicked = false;
		try {
			webDriver.findElement(facet_Industry).click();
			clicked = true;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickOnFacet_ProductFamily() {
		boolean clicked = false;
		try {
			webDriver.findElement(facet_ProductFamily).click();
			clicked = true;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickOnFacet_Series() {
		boolean clicked = false;
		try {
			webDriver.findElement(facet_Series).click();
			clicked = true;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickOnFacet_Standard() {
		boolean clicked = false;
		try {
			webDriver.findElement(facet_Standards).click();
			clicked = true;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickOnThisElement(By elementByObj) {

		boolean clicked = false;
		WebElement webElemenet = null;
		try {
			
			webElemenet = checkIfElementEnabled_1(elementByObj);
			if (webElemenet != null) {
				webElemenet.click();
				clicked = true;
			}else {
				clicked = false;
			}
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
		
	}

	// -------------------------- CLICK ON FACET END ---------------------------

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

	public boolean clickOnThisElement(String customElementLocator,
			String keyword) {
		boolean clicked = false;
		By byObj = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(
					customElementLocator, keyword);
			byObj = globalFunctionObj
					.createByObjectForLocator(customElementLocator);

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

	// --------------------------- GET FACET LIST ---------------------------
	public String getFacet_IndustryList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(webDriver,
					getFacet_Industry_List_CustXpath());
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_ApplicationList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(webDriver,
					getFacet_Applications_List_CustXpath());
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_ProductFamilyList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(webDriver,
					getFacet_ProductFamily_List_CustXpath());
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_SeriesList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(webDriver,
					getFacet_Series_List_CustXpath());
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_StandardList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(webDriver,
					getFacet_Standards_List_CustXpath());
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}
	// --------------------------- GET FACET LIST END
	// ---------------------------
	
	
	public boolean clickOn_FacetIndustry_CustomElement(String keyword){
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(facet_Industry_Ele_Custom, keyword);
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
	
	public boolean clickOn_FacetApplications_CustomElement(String keyword){
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(facet_Applications_Ele_Custom, keyword);
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
	
	public boolean checkIf_FacetApplication_CustomElement_Present(String Keyword){
		boolean present = false;
		By byObj = null;
		String customElementLocator = null;
		try {
			
			System.out.println("\n\tfacet_Applications_Ele_Custom :: " + facet_Applications_Ele_Custom);
			System.out.println("\n\tKeyword :: " + Keyword);
			
			customElementLocator = globalFunctionObj.getUpdatedLocator(facet_Applications_Ele_Custom, Keyword);
			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);

			if (checkIfElementEnabled(byObj)) {
				present = true;
			}
		} catch (Exception e) {
			present = false;
			e.printStackTrace();
		}
		return present;
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
		Actions builder = new Actions(webDriver);
        builder.moveToElement((WebElement) elementByObj).build().perform();
	}

}
*/