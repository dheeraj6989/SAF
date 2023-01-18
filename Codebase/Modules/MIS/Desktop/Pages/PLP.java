package Modules.MIS.Desktop.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.GlobalVariable;
import FunctionLibrary.PropertyHandler;

//PRODUCT LISTING PAGE - PLP
public class PLP {

	// VARS

	

	

	// SAF OBJECTS
	public PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;
	public Components componentsobj= null;
	// TE PLP PAGE OBJBECTS
	public By resultProductTab = null;
	public By resultInformationTab = null;
	public By resultSubmenuList = null;
	public By resultSubmenuElementFirst = null;
	public By viewAllLink = null;
	public By plpPageProductTab = null;
	public By categoryLink = null;
	public By productTabs = null;
	public By subCatElement = null;
	public By resultProductElement_for_comptitor=null;

	public By resultProductElement = null;
	public By resultInformationElement = null;

	public By facet_Industry = null;
	public By facet_Applications = null;
	public By facet_ProductFamily = null;
	public By facet_Standards = null;
	public By facet_Series = null;

	// UPDATED BY CK
	public By facet_Industry_Ele_1 = null;
	public By facet_Applications_Ele_1 = null;
	public By facet_ProductFamily_Ele_1 = null;
	public By facet_Standards_Ele_1 = null;
	public By facet_Series_Ele_1 = null;
	
	public By prodCompare_Checkbox_First = null;
	public By prodCompare_Checkbox_Second = null;
	public By prodComapre_Button = null;

	public By prodCompare_SimilarFeat_Heading = null;
	public By prodCompare_SimilarFeat_Value = null;

	public By prodCompare_DifferentFeat_Heading = null;
	public By prodCompare_DifferentFeat_Value = null;
	public By viewall_LinkChinese=null;
	// ------------rishika--------------------------------------
	public By IEC_PowerInletFilter = null;
	public By lighting_Assemblies = null;
	public By lighting_connectwithus = null;
	public By lighting_Call = null;

	public By subSea_Communications = null;
	public By communications_Connectwithus = null;
	public By antennas = null;
	public By antennas_connectwithus=null;
	public By Product_55FH = null;
	
	public By applyButtonConnectorSytle=null;
	public By applyBtnProduct=null;
	public By connectorStyle = null;
	public By receptacleConnectorStyledd = null;
	public By plugConnectorDropDown = null;
	public By applyConnectorStyle = null;
	public By industryFaceAeroSpaceDropDown = null;
	public By applicationAerospaceDropdown = null;
	public By product_ConnectWithUs = null;
	public By partnumber = null;
	public By searchMatchLink = null;
	public By crossRefProducts = null;
	public By submitSpreadsheetRequest = null;
	public By search_Result_Product_Element=null;
	// -------------------------------------------------------------
	// public By prodCompare_SimilarFeat_FirstElement = null;
	// public By prodCompare_DifferentFeat_FirstElement= null;

	public String subCategory_CustomXpath = null;
	public String facet_Industry_List_CustXpath = null;
	public String facet_Applications_List_CustXpath = null;
	public String facet_ProductFamily_List_CustXpath = null;
	public String facet_Standards_List_CustXpath = null;
	public String facet_Series_List_CustXpath = null;
	
	public By subNav_Element_2 = null;
	public String SUBNAV_FIRST_ELE=null;
	
	public By categoryNav_View_Category;
	public By categoryNav_View_Product;
	
	public By searchHeader_View_Category;
	public By searchHeader_View_Product;
	
	public String facet_Industry_Ele_Custom = null;
	public String facet_Applications_Ele_Custom = null;
	public String facet_ProductFamily_Ele_Custom = null;
	public String facet_Standards_Ele_Custom = null;
	public String facet_Series_Ele_Custom = null;
	
	public By aerospaceDropDown=null;
	public By aeroSpaceAutomation = null;

	public By searchTypeAheadElement=null;
	public By heatShrinkTube = null;
	public By product = null;
	
	public By viewProduct_PLP =null;
	public By productListing_View_Category=null;
	public By productListing_View_Product=null;
	public String clickOnFacet=null;
	public By clickOnAmp=null;
	public By products_resultsByCategory =null;
	//updated By Dheeraj.........
	public By ApplicationTooling=null;
	public By Connectors=null;
	public By productTab_HomePage=null;
	public By Connectors_product_CAT_AM7801_T618=null;
	public By ApplicationTooling_product_CRIMP_tOOL=null;
	public By facet_Contact_Current_Rating=null;
	public By input_min_facet_contact_current_rating=null;
	public By input_max_facet_contact_current_rating=null;
	public By button_apply_facet_contact_current_rating=null;
	public By Connectors_product_CAT_AM7801_T618_Piclink=null;

	public By clickonFacetFilter=null;
	public By clickonApplyButton=null;
	public By result_facet=null;
	
	//----------------------------------------new element added
	
	// B Pages PLP @ Author Ravi
	public By B_ConnectorsCategory = null;
	public By B_INFORMATION_Tab = null;
	public By B_PRODUCTS_Tab = null;
	public By B_SamplesAvailable_CheckBox = null;
	public By B_PartNumber = null;
	public By B_UnitsEnglish = null;
	public By B_UnitsMetric = null;
	public By B_Categories = null;
	public By B_ClearSelectedFilters = null;
	public By B_ApplyFilterCategories = null;
	public By B_ApplyFilter = null;
	public By B_SearchWithinResults = null;
	public By B_SearchIcon = null;
	public By B_CompareCheckBox1 = null;
	public By B_CompareCheckBox2 = null;
	public By B_CompareLink = null;
	public By B_ExcelDownload = null; 
	public By B_ADDPRODUCTS = null;
	public By B_Close_ADDPRODUCTS = null;
	public By B_HorizontalScroll = null;
	public By B_SaveAllToListDropDown = null;
	public By B_TemporaryList = null;
	public By B_NumberOfPositionsCheckbox = null;
	public By B_CenterlineCheckbox = null;
	public By B_SealableCheckbox = null;
	public By B_ConnectorContactTerminmatesCheckbox = null;
	public By B_EditFiledADDPRODUCTS = null;
	public By B_COMPAREPRODUCTS = null;
	public By B_NextIcon = null;
	public By B_PreviousIcon = null;
	public By B_CenterlinePitchText = null;
	public By B_Ampseal_CloseIcon = null;
	public By B_DifferingFeatures = null;
	public By B_SimilarFeatures = null;
	public By B_Features = null;
	public By B_PRODUCTResults = null;
	public By B_Inventory_CheckBox = null;
	
	// B Pages SRP @ Author Ravi
	
	public By B_SRP_PRODUCTS_Tab = null;
	public By B_SRP_PartNumber = null;
	public By B_SRP_ApplyCategories = null;
	public By B_SRP_CompareCheckBox1 = null;
	public By B_SRP_CompareCheckBox2 = null;
	public By B_SRP_CompareLink = null;
	public By B_SRP_ConnectorSystem = null;
	public By B_SRP_NumberOfPositions = null;
	public By B_SRP_Centerline = null;
	public By B_SRP_Sealable = null;
	public By B_SRP_ConnectorContactTerminatesTo = null;
	public By B_SRP_Close_ADDPRODUCTS = null;
	public By B_SRP_EditFiledADDPRODUCTS = null;
	public By B_SRP_COMPAREPRODUCTS = null;
	public By B_SRP_NextIcon = null;
	public By B_SRP_PreviousIcon = null;
	public By B_Features_SRP = null;
	public By B_BUYONTECOM = null;
	public By B_ApplyFilter_SRP = null;
	
	
	// B Pages German 
	
	public By B_INFORMATION_Tab_de = null;
	
	//Ravi 10th May 
	
	public By B_Product_Results = null;
	public By B_ProductFamiliesFacet = null;
	public By B_SeriesFacet = null;
	public By B_StandardsFacet = null;
	public By B_ProductNameDescription = null;
	public By B_ViewAllConnectorsLink = null;
	public By B_CompatiblePartsTooling = null;
	public By B_ShowFilters = null;
	public By B_AddToListMDP = null;
	public By B_TempListMDP = null;

	public By resultProductElement_for_Competitor;
	
	public By plp_OverView_Tab=null;
	public By plp_Related_Material=null;

	
	
	


	
//gatters added by dheeraj
	
	public By getConnectors_product_CAT_AM7801_T618() {
		return Connectors_product_CAT_AM7801_T618;
	}

	public By getResultProductElement_for_Competitor() {
		return resultProductElement_for_Competitor;
	}

	

	public By getApplicationTooling() {
		return ApplicationTooling;
	}
	
	public By getConnectors() {
		return Connectors;
	}
	
	
	
	
	// CTOR
	public PLP(String localeChoice, WebDriver webDriver, GlobalFunction globalFunctionObj) {
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	public void setup(String localeChoice) {
		try {

			if (localeChoice != null && localeChoice != "") {
				propertyHandlerObj = globalFunctionObj.getPropertyFile(
						localeChoice, "plp");
				initializepageObjects();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializepageObjects() {
		try {

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
			clickOnAmp= By.xpath(propertyHandlerObj
					.readProperties("clickOnAmp"));
			products_resultsByCategory= By.xpath(propertyHandlerObj
					.readProperties("products_resultsByCategory"));
			//----------------------------------NEW ElEMENTS------------------------------------------------------			
			   
			
			 viewProduct_PLP=By.xpath(propertyHandlerObj
						.readProperties("viewProduct_PLP"));
			 productListing_View_Category=By.xpath(propertyHandlerObj
						.readProperties("productListing_View_Category"));
			 productListing_View_Product=By.xpath(propertyHandlerObj
						.readProperties("productListing_View_Product"));
			 subCategory_CustomXpath=propertyHandlerObj
						.readProperties("subCategory_CustomXpath");
			 clickOnFacet=propertyHandlerObj
						.readProperties("clickOnFacet");
			 
			 //added by dheeraj
			 applyButtonConnectorSytle=By.xpath(propertyHandlerObj
						.readProperties("applyButtonConnectorSytle"));
			 ApplicationTooling = By.xpath(propertyHandlerObj
						.readProperties("ApplicationTooling"));
			 Connectors = By.xpath(propertyHandlerObj
						.readProperties("Connectors"));
			 Connectors_product_CAT_AM7801_T618 = By.xpath(propertyHandlerObj
						.readProperties("Connectors_product_CAT_AM7801_T618"));
			 ApplicationTooling_product_CRIMP_tOOL = By.xpath(propertyHandlerObj
						.readProperties("ApplicationTooling_product_CRIMP_tOOL"));
			 facet_Contact_Current_Rating = By.xpath(propertyHandlerObj
						.readProperties("facet_Contact_Current_Rating"));
			 input_min_facet_contact_current_rating = By.xpath(propertyHandlerObj
						.readProperties("input_min_facet_contact_current_rating"));
			 input_max_facet_contact_current_rating = By.xpath(propertyHandlerObj
						.readProperties("input_max_facet_contact_current_rating"));
			 button_apply_facet_contact_current_rating = By.xpath(propertyHandlerObj
						.readProperties("button_apply_facet_contact_current_rating"));
			 Connectors_product_CAT_AM7801_T618_Piclink = By.xpath(propertyHandlerObj
						.readProperties("Connectors_product_CAT_AM7801_T618_Piclink"));
			
			 search_Result_Product_Element=By.xpath(propertyHandlerObj
						.readProperties("search_Result_Product_Element"));
			 resultProductElement_for_comptitor=By.xpath(propertyHandlerObj
						.readProperties("resultProductElement_for_comptitor"));
	/*		 clickonFacetFilter=By.xpath(propertyHandlerObj
						.readProperties("clickonFacetFilter"));
			 clickonApplyButton=By.xpath(propertyHandlerObj
						.readProperties("clickonApplyButton"));
			 result_facet=By.xpath(propertyHandlerObj
						.readProperties("result_facet"));*/
			// -------------------------------------------------------------------------------------------------------------

			 
				// -------------------------------------------------------------------------------------------------------------
				
			// B Pages PLP @ Author Ravi 
			 B_INFORMATION_Tab = By.xpath(propertyHandlerObj.readProperties("B_INFORMATION_Tab"));
			 B_PRODUCTS_Tab = By.xpath(propertyHandlerObj.readProperties("B_PRODUCTS_Tab"));
			 B_SamplesAvailable_CheckBox = By.xpath(propertyHandlerObj.readProperties("B_SamplesAvailable_CheckBox")); 
			 B_PartNumber = By.xpath(propertyHandlerObj.readProperties("B_PartNumber")); 
			 B_UnitsEnglish = By.xpath(propertyHandlerObj.readProperties("B_UnitsEnglish"));
			 B_UnitsMetric = By.xpath(propertyHandlerObj.readProperties("B_UnitsMetric"));
			 B_Categories = By.xpath(propertyHandlerObj.readProperties("B_Categories"));
			 B_ClearSelectedFilters = By.xpath(propertyHandlerObj.readProperties("B_ClearSelectedFilters"));
			 B_ApplyFilterCategories = By.xpath(propertyHandlerObj.readProperties("B_ApplyFilterCategories"));
			 B_ApplyFilter = By.xpath(propertyHandlerObj.readProperties("B_ApplyFilter"));
			 B_SearchWithinResults = By.xpath(propertyHandlerObj.readProperties("B_SearchWithinResults"));
			 B_SearchIcon = By.xpath(propertyHandlerObj.readProperties("B_SearchIcon"));
			 B_CompareCheckBox1 = By.xpath(propertyHandlerObj.readProperties("B_CompareCheckBox1"));
			 B_CompareCheckBox2 = By.xpath(propertyHandlerObj.readProperties("B_CompareCheckBox2"));
			 B_CompareLink = By.xpath(propertyHandlerObj.readProperties("B_CompareLink"));
			 B_ExcelDownload = By.xpath(propertyHandlerObj.readProperties("B_ExcelDownload"));
			 B_ADDPRODUCTS = By.xpath(propertyHandlerObj.readProperties("B_ADDPRODUCTS"));
			 B_HorizontalScroll = By.xpath(propertyHandlerObj.readProperties("B_HorizontalScroll"));
			 B_SaveAllToListDropDown = By.xpath(propertyHandlerObj.readProperties("B_SaveAllToListDropDown"));
			 B_TemporaryList = By.xpath(propertyHandlerObj.readProperties("B_TemporaryList"));
			 B_NumberOfPositionsCheckbox = By.xpath(propertyHandlerObj.readProperties("B_NumberOfPositionsCheckbox"));
			 B_CenterlineCheckbox = By.xpath(propertyHandlerObj.readProperties("B_CenterlineCheckbox"));
			 B_SealableCheckbox = By.xpath(propertyHandlerObj.readProperties("B_SealableCheckbox"));
			 B_ConnectorContactTerminmatesCheckbox = By.xpath(propertyHandlerObj.readProperties("B_ConnectorContactTerminmatesCheckbox"));
			 B_EditFiledADDPRODUCTS = By.xpath(propertyHandlerObj.readProperties("B_EditFiledADDPRODUCTS"));
			 B_COMPAREPRODUCTS = By.xpath(propertyHandlerObj.readProperties("B_COMPAREPRODUCTS"));
			 B_PreviousIcon = By.xpath(propertyHandlerObj.readProperties("B_PreviousIcon"));
			 B_NextIcon = By.xpath(propertyHandlerObj.readProperties("B_NextIcon"));
			 B_CenterlinePitchText = By.xpath(propertyHandlerObj.readProperties("B_CenterlinePitchText")); 
			 B_Ampseal_CloseIcon = By.xpath(propertyHandlerObj.readProperties("B_Ampseal_CloseIcon"));
			 B_Features = By.xpath(propertyHandlerObj.readProperties("B_Features"));
			 B_DifferingFeatures = By.xpath(propertyHandlerObj.readProperties("B_DifferingFeatures"));
			 B_SimilarFeatures = By.xpath(propertyHandlerObj.readProperties("B_SimilarFeatures"));
			 B_PRODUCTResults = By.xpath(propertyHandlerObj.readProperties("B_PRODUCTResults"));
			 B_Inventory_CheckBox = By.xpath(propertyHandlerObj.readProperties("B_Inventory_CheckBox"));
			 
			 //B Pages SRP @ Author Ravi 
			 
			 B_SRP_PRODUCTS_Tab = By.xpath(propertyHandlerObj.readProperties("B_SRP_PRODUCTS_Tab"));
			 B_SRP_PartNumber = By.xpath(propertyHandlerObj.readProperties("B_SRP_PartNumber"));
			 B_SRP_ApplyCategories = By.xpath(propertyHandlerObj.readProperties("B_SRP_ApplyCategories"));
			 B_SRP_CompareCheckBox1 = By.xpath(propertyHandlerObj.readProperties("B_SRP_CompareCheckBox1")); 
			 B_SRP_CompareCheckBox2 = By.xpath(propertyHandlerObj.readProperties("B_SRP_CompareCheckBox2"));
			 B_SRP_CompareLink = By.xpath(propertyHandlerObj.readProperties("B_SRP_CompareLink"));
			 B_SRP_ConnectorSystem = By.xpath(propertyHandlerObj.readProperties("B_SRP_ConnectorSystem"));
			 B_SRP_NumberOfPositions = By.xpath(propertyHandlerObj.readProperties("B_SRP_NumberOfPositions"));
			 B_SRP_Centerline = By.xpath(propertyHandlerObj.readProperties("B_SRP_Centerline"));
			 B_SRP_Sealable = By.xpath(propertyHandlerObj.readProperties("B_SRP_Sealable"));
			 B_SRP_ConnectorContactTerminatesTo = By.xpath(propertyHandlerObj.readProperties("B_SRP_ConnectorContactTerminatesTo"));
			 B_SRP_Close_ADDPRODUCTS = By.xpath(propertyHandlerObj.readProperties("B_SRP_Close_ADDPRODUCTS"));
			 B_SRP_EditFiledADDPRODUCTS = By.xpath(propertyHandlerObj.readProperties("B_SRP_EditFiledADDPRODUCTS"));
			 B_SRP_NextIcon = By.xpath(propertyHandlerObj.readProperties("B_SRP_NextIcon"));
			 B_SRP_PreviousIcon = By.xpath(propertyHandlerObj.readProperties("B_SRP_PreviousIcon"));
			 B_Features_SRP = By.xpath(propertyHandlerObj.readProperties("B_Features_SRP"));
			 B_BUYONTECOM = By.xpath(propertyHandlerObj.readProperties("B_BUYONTECOM"));
			 B_ApplyFilter_SRP = By.xpath(propertyHandlerObj.readProperties("B_ApplyFilter_SRP"));
			 
			 //B Pages German 
			 
			 B_INFORMATION_Tab_de = By.xpath(propertyHandlerObj.readProperties("B_INFORMATION_Tab_de"));
			 
			 // Ravi 10th May 
			 B_Product_Results = By.xpath(propertyHandlerObj.readProperties("B_Product_Results"));
			 B_ProductFamiliesFacet = By.xpath(propertyHandlerObj.readProperties("B_ProductFamiliesFacet"));
			 B_SeriesFacet = By.xpath(propertyHandlerObj.readProperties("B_SeriesFacet"));
			 B_StandardsFacet = By.xpath(propertyHandlerObj.readProperties("B_StandardsFacet"));
			 B_ProductNameDescription = By.xpath(propertyHandlerObj.readProperties("B_ProductNameDescription"));
			 B_ViewAllConnectorsLink = By.xpath(propertyHandlerObj.readProperties("B_ViewAllConnectorsLink"));
			 B_ConnectorsCategory = By.xpath(propertyHandlerObj.readProperties("B_ConnectorsCategory"));
			 B_CompatiblePartsTooling = By.xpath(propertyHandlerObj.readProperties("B_CompatiblePartsTooling"));
			 B_ShowFilters = By.xpath(propertyHandlerObj.readProperties("B_ShowFilters"));
			 B_AddToListMDP = By.xpath(propertyHandlerObj.readProperties("B_AddToListMDP"));
			 B_TempListMDP = By.xpath(propertyHandlerObj.readProperties("B_TempListMDP"));
			 plp_OverView_Tab = By.xpath(propertyHandlerObj.readProperties("plp_OverView_Tab"));
			 plp_Related_Material = By.xpath(propertyHandlerObj.readProperties("plp_Related_Material"));
			 
			 } catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getResult_ProductTab() {
		String actualProductResult = null;
		WebElement webElemenet = null;
		try {
			
		
				System.out.println("inside actual result tab");
				actualProductResult =globalFunctionObj.get_WebDriver().findElement(resultProductElement).getText();
				System.out.println("actualProductResult"+actualProductResult);
				
			}
		
		 catch (Exception e) {
						e.printStackTrace();
		}
		return actualProductResult;
	}
	
	
	public String getResult_ProductTab_for_comptitor() {
		String actualProductResult = null;
		WebElement webElemenet = null;
		try {
			
		
				System.out.println("inside actual result tab");
				actualProductResult =globalFunctionObj.get_WebDriver().findElement(resultProductElement_for_comptitor).getText();
				System.out.println("actualProductResult"+actualProductResult);
				
			}
		
		 catch (Exception e) {
						e.printStackTrace();
		}
		return actualProductResult;
	}
	
	public String get_text_for_comptitor() {
		String actualProductResult = null;
		WebElement webElemenet = null;
		try {
			
		
				System.out.println("inside actual result tab");
				actualProductResult =globalFunctionObj.get_WebDriver().findElement(crossRefProducts).getText();
				System.out.println("actualProductResult"+actualProductResult);
				
			}
		
		 catch (Exception e) {
						e.printStackTrace();
		}
		return actualProductResult;
	}
	
	public String get_partno_for_comptitor() {
		String actualProductResult = null;
		WebElement webElemenet = null;
		try {
			
		
				System.out.println("inside actual result tab");
				actualProductResult =globalFunctionObj.get_WebDriver().findElement(partnumber).getAttribute("value");
				System.out.println("actualProductResult"+actualProductResult);
				
			}
		
		 catch (Exception e) {
						e.printStackTrace();
		}
		return actualProductResult;
	}
	
	
	
	
	
	
	public String getResult_InformationTab() {
		String actualProductResult = null;
		WebElement webElemenet = null;
		try {
			System.out.println("inside actual information tab");
			globalFunctionObj.pause(3000);
			actualProductResult =globalFunctionObj.get_WebDriver().findElement(resultInformationElement).getText();
			System.out.println("actualProductResult"+actualProductResult);
			
			/*//webElemenet = globalFunctionObj.checkIfElementEnabled_1(resultInformationElement);
			webElemenet=globalFunctionObj.get_WebDriver().findElement(resultInformationElement);
			
			if (webElemenet != null) {
				actualProductResult = webElemenet.getText();
			}else {
				actualProductResult = "";
			}*/
		} catch (Exception e) {
			actualProductResult = "";
			e.printStackTrace();
		}
		return actualProductResult;
		
	}
	
	// -------------------------- CLICK ON FACET ---------------------------
	public boolean clickOnFacet_Application() {
		boolean clicked = false;
		try {
			globalFunctionObj.get_WebDriver().findElement(facet_Applications).click();
			
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
			
			globalFunctionObj.get_WebDriver().findElement(facet_Industry).click();
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
			globalFunctionObj.get_WebDriver().findElement(facet_ProductFamily).click();
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
			globalFunctionObj.get_WebDriver().findElement(facet_Series).click();
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
			globalFunctionObj.get_WebDriver().findElement(facet_Standards).click();
			clicked = true;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}
	// --------------------------- GET FACET LIST ---------------------------
	public String getFacet_IndustryList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(globalFunctionObj.get_WebDriver(),facet_Industry_List_CustXpath);
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_ApplicationList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(globalFunctionObj.get_WebDriver(), facet_Applications_List_CustXpath);
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_ProductFamilyList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(globalFunctionObj.get_WebDriver(),facet_ProductFamily_List_CustXpath);
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_SeriesList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(globalFunctionObj.get_WebDriver(),facet_Series_List_CustXpath);
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}

	public String getFacet_StandardList() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(globalFunctionObj.get_WebDriver(),facet_Standards_List_CustXpath);
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		return actualData;
	}
	// --------------------------- GET FACET LIST END


	public String getSubmenuListData(String xPath) {
		String actualSubmenuListData = "";
		try {
			String xpath = xPath;
			String[] first_xpath = xpath.split("--replace--");
			String pathToCalculateSize = first_xpath[0].substring(0,
					(first_xpath[0].length() - 1));
			System.out.println(pathToCalculateSize);

			List<WebElement> liElements = globalFunctionObj.get_WebDriver().findElements(By
					.xpath(pathToCalculateSize));

			for (int i = 1; i < liElements.size() + 1; i++) {
				WebElement linkElement = globalFunctionObj.get_WebDriver().findElement(By
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
			//clicked = globalFunctionObj.checkIfElementEnabled(resultProductTab);
			clicked = globalFunctionObj.clickOnThisElement(resultProductTab);
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
			//clicked = globalFunctionObj.checkIfElementEnabled(resultInformationTab);
			clicked = globalFunctionObj.clickOnThisElement(resultInformationTab);;
		} catch (Exception e) {
			clicked = false;
			//e.printStackTrace();
		}
		return clicked;
	}

	public String get_SubCategory_List() {
		String actualData = "";
		try {
			actualData = globalFunctionObj.getDataList(globalFunctionObj.get_WebDriver(), subCategory_CustomXpath);
		} catch (Exception e) {
			e.printStackTrace();
			actualData = "";
		}
		System.out.println("actualdata"+actualData);
		return actualData;
	}

	public boolean verifyViewAllOrProductTabDisplayed() {

		boolean elementVisible = globalFunctionObj.checkIfElement_Displayed(viewAllLink);
		if (elementVisible == true) {
			globalFunctionObj.get_WebDriver().findElement(viewAllLink).click();
			globalFunctionObj.pause(2000);
			globalFunctionObj.get_WebDriver().findElement(plpPageProductTab).click();

			return true;
		}

		boolean productTab = globalFunctionObj.checkIfElement_Displayed(productTabs);
		if (productTab == true) {
			globalFunctionObj.get_WebDriver().findElement(productTabs).click();
			globalFunctionObj.pause(2000);
			globalFunctionObj.get_WebDriver().findElement(categoryLink).click();
			return true;
		} else
			return false;
	} // FUNC END







	
	
}
