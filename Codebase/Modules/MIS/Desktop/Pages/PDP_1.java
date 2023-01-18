/*package Modules.TE.Desktop.Pages;


import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.GlobalVariable;
import FunctionLibrary.PropertyHandler;

//PRODUCT LISTING PAGE - PLP
public class PDP {

	// VARS

	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private WebElement webElement = null;
	private GlobalFunction globalFunctionObj = null;

	// TE PLP PAGE OBJBECTS
	private By resultProductTab = null;
	private By resultInformationTab = null;
	private By primaryImage=null;
	private By pdfLink=null;
	private By productDisplay=null;
	private By productFamily=null;
	private By primaryFeatueA=null;
	private By primaryFeatueB=null;
	private By primaryFeatueC=null;
	private By primaryFeatueD=null;
	private By primaryFeatueE=null;
	private By internalNumDisplay=null;
	private By seeAllFeature=null;
	private By seeAllDocumentation=null;
	private By productTypeFeatureOne=null;
	private By productTypeFeatureTwo=null;
	private By productTypeFeatureThree=null;
	private By productTypeFeatureFour=null;
	private By col_2_heading1Feature=null;
	private By col_2_featureValue1=null;
	private By col_2_featureTitle2=null;
	private By col_2_featureValue2=null;
	private By col_3_featureTitle=null;
	private By col_3_featureValue=null;
	private By col_3_featureTitle2=null;
	private By col_3_featureValue2=null;
	private By col_4_featureTitle1=null;
	private By col_4_featureValue1=null;
	private By col_5_featureTitle=null;
	private By col_5_featureValue=null;
	private By col_6_featureTitle=null;
	private By col_6_featureValue=null;
	private By col_7_featureTitle=null;
	private By col_7_featureValue=null;
	private By col_8_featureTitle=null;
	private By col_8_featureValue=null;
	private By col_9_featureTitle=null;
	private By col_9_featureValue=null;
	private By col_10_featureTitle=null;
	private By col_10_featureValue=null;
	private By col_11_featureTitle=null;
	private By col_11_featureValue=null;
	private By documentLink=null;
	private By doc_NC_1=null;
	private By doc_NC_2=null;
	private By doc_NC_3=null;
	private By saveToLink=null;
	private By popUP_NC=null;
	private By closePopUp_NC=null;
	private By countryDropDown=null;
	private By searchBtn=null;
	private By firstDisWebLink=null;


	//-------------------------------------NEW ELEMENTS-------------------------------
	private By section_REAC_SvHC_Compliance=null;
	private By contains_no_REACH_October_2008_SvHCLink =null;
	private By contains_no_REACH_October_2008_SvHCHelpPop=null;
	private By contains_no_REACH_June_2012_SvHCLink=null;
	private By contains_no_REACH_June_2012_SvHCHelpPopup=null;
	private By contains_REACH_January_2017_SvHCLink=null;
	private By contains_REACH_January_2017_SvHCSubstanceChart=null;
	private By contains_REACH_January_2017_SvHCHelpPopup=null;
	private By section_Halogen_Content=null;
	private By halogen_Content_StatusLink=null;
	private By halogen_Content_StatusHelpPopup=null;
	private By section_Solder_Process_Capability=null;
	private By solder_Process_CapabilityText=null;
	private By section_Statement_of_Compliance=null;
	private By statement_of_ComplianceLink=null;
	private By statement_of_CompliancePDFHeading=null;
	private By section_Compliance_Documents=null;
	private By documentationTabLink=null;
	private By section_Disclaimer=null;
	private By disclaimerText=null;
	private By partNo_145154_1_Product=null;
	private By EU_RoHS_Status_Link=null;
	private By EU_ELV_Status_Link=null;
	private By EU_RoHS_Compliant_with_Exemptions=null;
	private By EU_RoHS_Compliant_with_Exemptions_Content=null;
	private By cancel_Button=null;
	private By Not_EU_ELV_Compliant=null;
	private By Not_EU_ELV_Compliant_Content=null;
	private By documentationTab=null;
	private By product_ComplianceTab=null;
	private By EU_RoHS_Compliance=null;
	private By EU_RoHS_Compliance_Status_Compliant=null;
	private By EU_RoHS_Compliance_Exemptions_Information=null;
	private By EU_RoHS_Compliance_Exemptions_AlternateLink=null;
	private By PCI_and_PCI_Express_Connectors_Page=null;
	private By EU_ELV_Compliance_Status_Compliant = null;
	private By EU_RoHS_Status_Help_PopUp=null;
	private By EU_ELV_Status_Help_PopUp=null;
	private By EU_RoHS_exemptions_CompliantwithExemptions=null;
	private By EU_RoHS_substances_NotCompliant=null;
	private By EU_RoHS_Alternate_Link=null;
	private By EU_RoHS_Alternate_PDP_Heading=null;
	private By EU_ELV_exemptions_CompliantwithExemptions=null;
	private By EU_ELV_substances_NotCompliant=null;

	private By section_China_RoHS_Compliance=null;
	private By section_EU_ELV_Compliance=null;

	//-----------------------------TC_TE_PDP_en Elements----------------------------

	private By heading_TEConnectivity=null;
	private By product_Title=null;
	private By product_Image=null;
	private By product_Family_Link=null;
	private By product_Series_Link=null;
	private By product_Description=null;
	private By product_TopFeature1_Title=null;
	private By product_TopFeature1_Value=null;
	private By product_TopFeature2_Title=null;
	private By product_TopFeature2_Value=null;
	private By product_TopFeature3_Title=null;
	private By product_TopFeature3_Value=null;
	private By product_TopFeature4_Title=null;
	private By product_TopFeature4_Value=null;
	private By product_TopFeature5_Title=null;
	private By product_TopFeature5_Value=null;
	private By data_Sheet_Link=null;
	private By product_Name_On_DataSheet=null;
	private By see_All_Features_Link=null;
	private By product_Type_Features=null;
	private By see_All_Related_Materials_Link=null;
	private By catalogPages_Or_DataSheets=null;
	private By product_Compliance=null;
	private By productCatalog_PDFLink=null;
	private By product_Drawing=null;
	private By CADFile_3D_Model=null;
	private By similarProducts_Link=null;
	private By saveToList_Link=null;
	private By temporaryList_Link=null;
	private By saved_ConfirmationTick=null;
	private By overview_Tab=null;
	private By features_Tab=null;
	private By relatedMaterials_Tab=null;
	private By complianceInformation_Link = null;
	private By PDFheading_StatementOfCompliance = null;
	private By benifits_Module = null;
	private By Applications_Module = null;
	private By description_ProductDrawing = null;
	private By description_3DPDF = null;
	private By seeAllDocumentation_Link = null;
	private By documenation_Tab = null;
	private By compatible_Products = null;
	private By checkForTooling_Link = null;
	private By getSample_Link = null;
	private By productCompliance_Tab = null;

	//-------------------------------------MDP ELEMENTS-------------------------------
	private By moreInfo_Link = null;
	private By productResult = null;
	private By mdp_view_all_products = null;
	private By availability_tab = null;
	private By bulk_pricing_tab = null;
	private By dist_inventory_tab = null;
	private By mdp_view_all_table = null;
	private String custom_ProductTable_ProductCol = null;
	//--------------------------------------GETTERS----------------------------------------

	
	
	public By getPrimaryImage() {
		return primaryImage;
	}

	public By getMdp_view_all_table() {
		return mdp_view_all_table;
	}

	public By getMoreInfo_Link() {
		return moreInfo_Link;
	}

	public String getCustom_ProductTable_ProductCol() {
		return custom_ProductTable_ProductCol;
	}

	public By getProductResult() {
		return productResult;
	}

	public By getMdp_view_all_products() {
		return mdp_view_all_products;
	}

	public By getAvailability_tab() {
		return availability_tab;
	}

	public By getBulk_pricing_tab() {
		return bulk_pricing_tab;
	}

	public By getDist_inventory_tab() {
		return dist_inventory_tab;
	}

	public By getPdfLink() {
		return pdfLink;
	}

	public By getProductDisplay() {
		return productDisplay;
	}

	public By getProductFamily() {
		return productFamily;
	}

	public By getPrimaryFeatueA() {
		return primaryFeatueA;
	}

	public By getPrimaryFeatueB() {
		return primaryFeatueB;
	}

	public By getPrimaryFeatueC() {
		return primaryFeatueC;
	}

	public By getPrimaryFeatueD() {
		return primaryFeatueD;
	}

	public By getPrimaryFeatueE() {
		return primaryFeatueE;
	}

	public By getInternalNumDisplay() {
		return internalNumDisplay;
	}

	public By getSeeAllFeature() {
		return seeAllFeature;
	}

	public By getSeeAllDocumentation() {
		return seeAllDocumentation;
	}

	public By getProductTypeFeatureOne() {
		return productTypeFeatureOne;
	}

	public By getProductTypeFeatureTwo() {
		return productTypeFeatureTwo;
	}

	public By getProductTypeFeatureThree() {
		return productTypeFeatureThree;
	}

	public By getProductTypeFeatureFour() {
		return productTypeFeatureFour;
	}

	public By getcol_2_heading1Feature() {
		return col_2_heading1Feature;
	}

	public By getcol_2_featureValue1() {
		return col_2_featureValue1;
	}

	public By getcol_2_featureTitle2() {
		return col_2_featureTitle2;
	}

	public By getcol_2_featureValue2() {
		return col_2_featureValue2;
	}

	public By getcol_3_featureTitle() {
		return col_3_featureTitle;
	}

	public By getcol_3_featureValue() {
		return col_3_featureValue;
	}

	public By getcol_3_featureTitle2() {
		return col_3_featureTitle2;
	}

	public By getcol_3_featureValue2() {
		return col_3_featureValue2;
	}

	public By getcol_4_featureTitle1() {
		return col_4_featureTitle1;
	}

	public By getcol_4_featureValue1() {
		return col_4_featureValue1;
	}

	public By getcol_5_featureTitle() {
		return col_5_featureTitle;
	}

	public By getcol_5_featureValue() {
		return col_5_featureValue;
	}

	public By getcol_6_featureTitle() {
		return col_6_featureTitle;
	}

	public By getcol_6_featureValue() {
		return col_6_featureValue;
	}

	public By getcol_7_featureTitle() {
		return col_7_featureTitle;
	}

	public By getcol_7_featureValue() {
		return col_7_featureValue;
	}

	public By getcol_8_featureTitle() {
		return col_8_featureTitle;
	}

	public By getcol_8_featureValue() {
		return col_8_featureValue;
	}

	public By getcol_9_featureTitle() {
		return col_9_featureTitle;
	}
	public By getcol_9_featureValue() {
		return col_9_featureValue;
	}

	public By getcol_10_featureTitle() {
		return col_10_featureTitle;
	}

	public By getcol_10_featureValue() {
		return col_10_featureValue;
	}

	public By getcol_11_featureTitle() {
		return col_11_featureTitle;
	}

	public By getcol_11_featureValue() {
		return col_11_featureValue;
	}

	public By getDocumentLink() {
		return documentLink;
	}

	public By getDoc_NC_1() {
		return doc_NC_1;
	}

	public By getDoc_NC_2() {
		return doc_NC_2;
	}
	public By getDoc_NC_3() {
		return doc_NC_3;
	}

	public By getSaveToLink() {
		return saveToLink;
	}

	public By getPopUP_NC() {
		return popUP_NC;
	}

	public By getClosePopUp_NC() {
		return closePopUp_NC;
	}

	public By getCountryDropDown() {
		return countryDropDown;
	}

	public By getSearchBtn() {
		return searchBtn;
	}
	public By getfirstDisWebLink() {
		return firstDisWebLink;
	}


	public By getApplications_Module() {
		return Applications_Module;
	}

	public void setApplications_Module(By applications_Module) {
		Applications_Module = applications_Module;
	}

	public GlobalFunction getGlobalFunctionObj() {
		return globalFunctionObj;
	}

	public By getResultProductTab() {
		return resultProductTab;
	}

	public By getResultInformationTab() {
		return resultInformationTab;
	}

	public By getCol_2_heading1Feature() {
		return col_2_heading1Feature;
	}

	public By getCol_2_featureValue1() {
		return col_2_featureValue1;
	}

	public By getCol_2_featureTitle2() {
		return col_2_featureTitle2;
	}

	public By getCol_2_featureValue2() {
		return col_2_featureValue2;
	}

	public By getCol_3_featureTitle() {
		return col_3_featureTitle;
	}

	public By getCol_3_featureValue() {
		return col_3_featureValue;
	}

	public By getCol_3_featureTitle2() {
		return col_3_featureTitle2;
	}

	public By getCol_3_featureValue2() {
		return col_3_featureValue2;
	}

	public By getCol_4_featureTitle1() {
		return col_4_featureTitle1;
	}

	public By getCol_4_featureValue1() {
		return col_4_featureValue1;
	}

	public By getCol_5_featureTitle() {
		return col_5_featureTitle;
	}

	public By getCol_5_featureValue() {
		return col_5_featureValue;
	}

	public By getCol_6_featureTitle() {
		return col_6_featureTitle;
	}

	public By getCol_6_featureValue() {
		return col_6_featureValue;
	}

	public By getCol_7_featureTitle() {
		return col_7_featureTitle;
	}

	public By getCol_7_featureValue() {
		return col_7_featureValue;
	}

	public By getCol_8_featureTitle() {
		return col_8_featureTitle;
	}

	public By getCol_8_featureValue() {
		return col_8_featureValue;
	}

	public By getCol_9_featureTitle() {
		return col_9_featureTitle;
	}

	public By getCol_9_featureValue() {
		return col_9_featureValue;
	}

	public By getCol_10_featureTitle() {
		return col_10_featureTitle;
	}

	public By getCol_10_featureValue() {
		return col_10_featureValue;
	}

	public By getCol_11_featureTitle() {
		return col_11_featureTitle;
	}

	public By getCol_11_featureValue() {
		return col_11_featureValue;
	}

	public By getFirstDisWebLink() {
		return firstDisWebLink;
	}

	public By getSection_REAC_SvHC_Compliance() {
		return section_REAC_SvHC_Compliance;
	}

	public By getContains_no_REACH_October_2008_SvHCLink() {
		return contains_no_REACH_October_2008_SvHCLink;
	}

	public By getContains_no_REACH_October_2008_SvHCHelpPop() {
		return contains_no_REACH_October_2008_SvHCHelpPop;
	}

	public By getContains_no_REACH_June_2012_SvHCLink() {
		return contains_no_REACH_June_2012_SvHCLink;
	}

	public By getContains_no_REACH_June_2012_SvHCHelpPopup() {
		return contains_no_REACH_June_2012_SvHCHelpPopup;
	}

	public By getContains_REACH_January_2017_SvHCLink() {
		return contains_REACH_January_2017_SvHCLink;
	}

	public By getContains_REACH_January_2017_SvHCSubstanceChart() {
		return contains_REACH_January_2017_SvHCSubstanceChart;
	}

	public By getContains_REACH_January_2017_SvHCHelpPopup() {
		return contains_REACH_January_2017_SvHCHelpPopup;
	}

	public By getSection_Halogen_Content() {
		return section_Halogen_Content;
	}

	public By getHalogen_Content_StatusLink() {
		return halogen_Content_StatusLink;
	}

	public By getHalogen_Content_StatusHelpPopup() {
		return halogen_Content_StatusHelpPopup;
	}

	public By getSection_Solder_Process_Capability() {
		return section_Solder_Process_Capability;
	}

	public By getSolder_Process_CapabilityText() {
		return solder_Process_CapabilityText;
	}

	public By getSection_Statement_of_Compliance() {
		return section_Statement_of_Compliance;
	}

	public By getStatement_of_ComplianceLink() {
		return statement_of_ComplianceLink;
	}

	public By getStatement_of_CompliancePDFHeading() {
		return statement_of_CompliancePDFHeading;
	}

	public By getSection_Compliance_Documents() {
		return section_Compliance_Documents;
	}

	public By getDocumentationTabLink() {
		return documentationTabLink;
	}

	public By getSection_Disclaimer() {
		return section_Disclaimer;
	}

	public By getDisclaimerText() {
		return disclaimerText;
	}

	public By getPartNo_145154_1_Product() {
		return partNo_145154_1_Product;
	}

	public By getEU_RoHS_Status_Link() {
		return EU_RoHS_Status_Link;
	}

	public By getEU_ELV_Status_Link() {
		return EU_ELV_Status_Link;
	}

	public By getEU_RoHS_Compliant_with_Exemptions() {
		return EU_RoHS_Compliant_with_Exemptions;
	}

	public By getEU_RoHS_Compliant_with_Exemptions_Content() {
		return EU_RoHS_Compliant_with_Exemptions_Content;
	}

	public By getCancel_Button() {
		return cancel_Button;
	}

	public By getNot_EU_ELV_Compliant() {
		return Not_EU_ELV_Compliant;
	}

	public By getNot_EU_ELV_Compliant_Content() {
		return Not_EU_ELV_Compliant_Content;
	}

	public By getDocumentationTab() {
		return documentationTab;
	}

	public By getProduct_ComplianceTab() {
		return product_ComplianceTab;
	}

	public By getEU_RoHS_Compliance() {
		return EU_RoHS_Compliance;
	}

	public By getEU_RoHS_Compliance_Status_Compliant() {
		return EU_RoHS_Compliance_Status_Compliant;
	}

	public By getEU_RoHS_Compliance_Exemptions_Information() {
		return EU_RoHS_Compliance_Exemptions_Information;
	}

	public By getEU_RoHS_Compliance_Exemptions_AlternateLink() {
		return EU_RoHS_Compliance_Exemptions_AlternateLink;
	}

	public By getPCI_and_PCI_Express_Connectors_Page() {
		return PCI_and_PCI_Express_Connectors_Page;
	}

	public By getEU_ELV_Compliance_Status_Compliant() {
		return EU_ELV_Compliance_Status_Compliant;
	}

	public By getEU_RoHS_Status_Help_PopUp() {
		return EU_RoHS_Status_Help_PopUp;
	}

	public By getEU_ELV_Status_Help_PopUp() {
		return EU_ELV_Status_Help_PopUp;
	}

	public By getEU_RoHS_exemptions_CompliantwithExemptions() {
		return EU_RoHS_exemptions_CompliantwithExemptions;
	}

	public By getEU_RoHS_substances_NotCompliant() {
		return EU_RoHS_substances_NotCompliant;
	}

	public By getEU_RoHS_Alternate_Link() {
		return EU_RoHS_Alternate_Link;
	}

	public By getEU_RoHS_Alternate_PDP_Heading() {
		return EU_RoHS_Alternate_PDP_Heading;
	}

	public By getEU_ELV_exemptions_CompliantwithExemptions() {
		return EU_ELV_exemptions_CompliantwithExemptions;
	}

	public By getEU_ELV_substances_NotCompliant() {
		return EU_ELV_substances_NotCompliant;
	}

	public By getSection_China_RoHS_Compliance() {
		return section_China_RoHS_Compliance;
	}

	public By getSection_EU_ELV_Compliance() {
		return section_EU_ELV_Compliance;
	}

	public By getHeading_TEConnectivity() {
		return heading_TEConnectivity;
	}

	public By getProduct_Title() {
		return product_Title;
	}

	public By getProduct_Image() {
		return product_Image;
	}

	public By getProduct_Family_Link() {
		return product_Family_Link;
	}

	public By getProduct_Series_Link() {
		return product_Series_Link;
	}

	public By getProduct_Description() {
		return product_Description;
	}

	public By getProduct_TopFeature1_Title() {
		return product_TopFeature1_Title;
	}

	public By getProduct_TopFeature1_Value() {
		return product_TopFeature1_Value;
	}

	public By getProduct_TopFeature2_Title() {
		return product_TopFeature2_Title;
	}

	public By getProduct_TopFeature2_Value() {
		return product_TopFeature2_Value;
	}

	public By getProduct_TopFeature3_Title() {
		return product_TopFeature3_Title;
	}

	public By getProduct_TopFeature3_Value() {
		return product_TopFeature3_Value;
	}

	public By getProduct_TopFeature4_Title() {
		return product_TopFeature4_Title;
	}

	public By getProduct_TopFeature4_Value() {
		return product_TopFeature4_Value;
	}

	public By getProduct_TopFeature5_Title() {
		return product_TopFeature5_Title;
	}

	public By getProduct_TopFeature5_Value() {
		return product_TopFeature5_Value;
	}

	public By getData_Sheet_Link() {
		return data_Sheet_Link;
	}

	public By getProduct_Name_On_DataSheet() {
		return product_Name_On_DataSheet;
	}

	public By getSee_All_Features_Link() {
		return see_All_Features_Link;
	}

	public By getProduct_Type_Features() {
		return product_Type_Features;
	}

	public By getSee_All_Related_Materials_Link() {
		return see_All_Related_Materials_Link;
	}

	public By getCatalogPages_Or_DataSheets() {
		return catalogPages_Or_DataSheets;
	}

	public By getProduct_Compliance() {
		return product_Compliance;
	}

	public By getProductCatalog_PDFLink() {
		return productCatalog_PDFLink;
	}

	public By getProduct_Drawing() {
		return product_Drawing;
	}

	public By getCADFile_3D_Model() {
		return CADFile_3D_Model;
	}

	public By getSimilarProducts_Link() {
		return similarProducts_Link;
	}

	public By getSaveToList_Link() {
		return saveToList_Link;
	}

	public By getTemporaryList_Link() {
		return temporaryList_Link;
	}

	public By getSaved_ConfirmationTick() {
		return saved_ConfirmationTick;
	}

	public By getOverview_Tab() {
		return overview_Tab;
	}

	public By getFeatures_Tab() {
		return features_Tab;
	}

	public By getRelatedMaterials_Tab() {
		return relatedMaterials_Tab;
	}

	public By getComplianceInformation_Link() {
		return complianceInformation_Link;
	}

	public By getPDFheading_StatementOfCompliance() {
		return PDFheading_StatementOfCompliance;
	}

	public By getBenifits_Module() {
		return benifits_Module;
	}

	public By getDescription_ProductDrawing() {
		return description_ProductDrawing;
	}

	public By getDescription_3DPDF() {
		return description_3DPDF;
	}

	public By getSeeAllDocumentation_Link() {
		return seeAllDocumentation_Link;
	}

	public By getDocumenation_Tab() {
		return documenation_Tab;
	}

	public By getCompatible_Products() {
		return compatible_Products;
	}

	public By getCheckForTooling_Link() {
		return checkForTooling_Link;
	}

	public By getGetSample_Link() {
		return getSample_Link;
	}

	public By getProductCompliance_Tab() {
		return productCompliance_Tab;
	}

	public String getScreenShotFolderPath() {
		return screenShotFolderPath;
	}

	public String getScreenShotPath() {
		return screenShotPath;
	}

	public PropertyHandler getPropertyHandlerObj() {
		return propertyHandlerObj;
	}

	String screenShotFolderPath = "";
	String screenShotPath = "";
	static boolean status=true;

	// CTOR
	public PDP(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	private void setup(String localeChoice){
		try {

			if(localeChoice != null && localeChoice != ""){

				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "PDP");
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
			
			primaryImage = By.xpath(propertyHandlerObj.readProperties("primaryImage"));
			pdfLink=By.xpath(propertyHandlerObj.readProperties("pdfLink"));
			productDisplay=By.xpath(propertyHandlerObj.readProperties("productDisplay"));
			productFamily=By.xpath(propertyHandlerObj.readProperties("productFamily"));
			internalNumDisplay=By.xpath(propertyHandlerObj.readProperties("internalNumDisplay"));
			primaryFeatueA=By.xpath(propertyHandlerObj.readProperties("primaryFeatureA"));
			primaryFeatueB=By.xpath(propertyHandlerObj.readProperties("primaryFeatueB"));
			primaryFeatueC=By.xpath(propertyHandlerObj.readProperties("primaryFeatueC"));
			primaryFeatueD=By.xpath(propertyHandlerObj.readProperties("primaryFeatueD"));
			primaryFeatueE=By.xpath(propertyHandlerObj.readProperties("primaryFeatueE"));		
			seeAllFeature=By.xpath(propertyHandlerObj.readProperties("seeAllFeature"));


			seeAllDocumentation=By.xpath(propertyHandlerObj.readProperties("seeAllDocumentation"));
			productTypeFeatureOne=By.xpath(propertyHandlerObj.readProperties("productTypeFeatureOne"));
			productTypeFeatureTwo=By.xpath(propertyHandlerObj.readProperties("productTypeFeatureTwo"));
			productTypeFeatureThree=By.xpath(propertyHandlerObj.readProperties("productTypeFeatureThree"));
			productTypeFeatureFour=By.xpath(propertyHandlerObj.readProperties("productTypeFeatureFour"));
			col_2_heading1Feature=By.xpath(propertyHandlerObj.readProperties("col_2_heading1Feature"));
			col_2_featureValue1=By.xpath(propertyHandlerObj.readProperties("col_2_featureValue1"));
			col_2_featureTitle2	=By.xpath(propertyHandlerObj.readProperties("col_2_featureTitle2"));
			col_2_featureValue2=By.xpath(propertyHandlerObj.readProperties("col_2_featureValue2"));
			col_3_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_3_featureTitle"));
			col_3_featureValue=By.xpath(propertyHandlerObj.readProperties("col_3_featureValue"));
			col_3_featureTitle2=By.xpath(propertyHandlerObj.readProperties("col_3_featureTitle2"));
			col_3_featureValue2=By.xpath(propertyHandlerObj.readProperties("col_3_featureValue2"));
			col_4_featureTitle1=By.xpath(propertyHandlerObj.readProperties("col_4_featureTitle1"));
			col_4_featureValue1=By.xpath(propertyHandlerObj.readProperties("col_4_featureValue1"));
			col_5_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_5_featureTitle"));
			col_5_featureValue=By.xpath(propertyHandlerObj.readProperties("col_5_featureValue"));
			col_6_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_6_featureTitle"));
			col_6_featureValue=By.xpath(propertyHandlerObj.readProperties("col_6_featureValue"));
			col_7_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_7_featureTitle"));
			col_7_featureValue=By.xpath(propertyHandlerObj.readProperties("col_7_featureValue"));
			col_8_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_8_featureTitle"));
			col_8_featureValue=By.xpath(propertyHandlerObj.readProperties("col_8_featureValue"));
			col_9_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_9_featureTitle"));
			col_9_featureValue=By.xpath(propertyHandlerObj.readProperties("col_9_featureValue"));
			col_10_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_10_featureTitle"));
			col_10_featureValue=By.xpath(propertyHandlerObj.readProperties("col_10_featureValue"));
			col_11_featureTitle=By.xpath(propertyHandlerObj.readProperties("col_11_featureTitle"));
			col_11_featureValue=By.xpath(propertyHandlerObj.readProperties("col_11_featureValue"));
			documentLink=By.xpath(propertyHandlerObj.readProperties("documentLink"));
			doc_NC_1=By.xpath(propertyHandlerObj.readProperties("doc_NC_1"));
			doc_NC_2=By.xpath(propertyHandlerObj.readProperties("doc_NC_2"));
			doc_NC_3=By.xpath(propertyHandlerObj.readProperties("doc_NC_3"));
			saveToLink=By.xpath(propertyHandlerObj.readProperties("saveToLink"));
			popUP_NC=By.xpath(propertyHandlerObj.readProperties("popUP_NC"));
			closePopUp_NC=By.xpath(propertyHandlerObj.readProperties("closePopUp_NC"));
			countryDropDown=By.xpath(propertyHandlerObj.readProperties("countryDropDown"));
			firstDisWebLink=By.xpath(propertyHandlerObj.readProperties("firstDisWebLink"));
			searchBtn=By.xpath(propertyHandlerObj.readProperties("searchBtn"));


			//-------------------------------CHANGES DONE BY AVANI------------------------------------------------		

			section_REAC_SvHC_Compliance = By.xpath(propertyHandlerObj
					.readProperties("section_REAC_SvHC_Compliance"));
			contains_no_REACH_October_2008_SvHCLink = By.xpath(propertyHandlerObj
					.readProperties("contains_no_REACH_October_2008_SvHCLink"));
			contains_no_REACH_October_2008_SvHCHelpPop = By.xpath(propertyHandlerObj
					.readProperties("contains_no_REACH_October_2008_SvHCHelpPop"));
			contains_no_REACH_June_2012_SvHCLink = By.xpath(propertyHandlerObj
					.readProperties("contains_no_REACH_June_2012_SvHCLink"));
			contains_no_REACH_June_2012_SvHCHelpPopup = By.xpath(propertyHandlerObj
					.readProperties("contains_no_REACH_June_2012_SvHCHelpPopup"));
			contains_REACH_January_2017_SvHCLink = By.xpath(propertyHandlerObj
					.readProperties("contains_REACH_January_2017_SvHCLink"));
			contains_REACH_January_2017_SvHCSubstanceChart = By.xpath(propertyHandlerObj
					.readProperties("contains_REACH_January_2017_SvHCSubstanceChart"));
			contains_REACH_January_2017_SvHCHelpPopup = By.xpath(propertyHandlerObj
					.readProperties("contains_REACH_January_2017_SvHCHelpPopup"));
			section_Halogen_Content = By.xpath(propertyHandlerObj
					.readProperties("section_Halogen_Content"));
			halogen_Content_StatusLink = By.xpath(propertyHandlerObj
					.readProperties("halogen_Content_StatusLink"));
			halogen_Content_StatusHelpPopup = By.xpath(propertyHandlerObj
					.readProperties("halogen_Content_StatusHelpPopup"));
			section_Solder_Process_Capability = By.xpath(propertyHandlerObj
					.readProperties("section_Solder_Process_Capability"));
			solder_Process_CapabilityText = By.xpath(propertyHandlerObj
					.readProperties("solder_Process_CapabilityText"));
			section_Statement_of_Compliance = By.xpath(propertyHandlerObj
					.readProperties("section_Statement_of_Compliance"));
			statement_of_ComplianceLink = By.xpath(propertyHandlerObj
					.readProperties("statement_of_ComplianceLink"));
			statement_of_CompliancePDFHeading = By.xpath(propertyHandlerObj
					.readProperties("statement_of_CompliancePDFHeading"));
			section_Compliance_Documents = By.xpath(propertyHandlerObj
					.readProperties("section_Compliance_Documents"));
			documentationTabLink = By.xpath(propertyHandlerObj
					.readProperties("documentationTabLink"));
			documentationTab =  By.xpath(propertyHandlerObj
					.readProperties("documentationTab"));
			section_Disclaimer = By.xpath(propertyHandlerObj
					.readProperties("section_Disclaimer"));
			disclaimerText = By.xpath(propertyHandlerObj
					.readProperties("disclaimerText"));

			partNo_145154_1_Product = By.xpath(propertyHandlerObj
					.readProperties("partNo_145154_1_Product"));
			EU_RoHS_Status_Link = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Status_Link"));
			EU_ELV_Status_Link = By.xpath(propertyHandlerObj
					.readProperties("EU_ELV_Status_Link"));
			EU_RoHS_Compliant_with_Exemptions = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Compliant_with_Exemptions"));
			EU_RoHS_Compliant_with_Exemptions_Content = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Compliant_with_Exemptions_Content"));
			cancel_Button = By.xpath(propertyHandlerObj
					.readProperties("cancel_Button"));
			Not_EU_ELV_Compliant = By.xpath(propertyHandlerObj
					.readProperties("Not_EU_ELV_Compliant"));
			Not_EU_ELV_Compliant_Content = By.xpath(propertyHandlerObj
					.readProperties("Not_EU_ELV_Compliant_Content"));
			product_ComplianceTab = By.xpath(propertyHandlerObj
					.readProperties("product_ComplianceTab"));
			EU_RoHS_Compliance = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Compliance"));
			EU_RoHS_Compliance_Status_Compliant = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Compliance_Status_Compliant"));
			EU_RoHS_Compliance_Exemptions_Information = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Compliance_Exemptions_Information"));
			EU_RoHS_Compliance_Exemptions_AlternateLink = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Compliance_Exemptions_AlternateLink"));
			PCI_and_PCI_Express_Connectors_Page = By.xpath(propertyHandlerObj
					.readProperties("PCI_and_PCI_Express_Connectors_Page"));
			EU_ELV_Compliance_Status_Compliant = By.xpath(propertyHandlerObj
					.readProperties("EU_ELV_Compliance_Status_Compliant"));

			EU_RoHS_Status_Help_PopUp = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Status_Help_PopUp"));
			EU_ELV_Status_Help_PopUp = By.xpath(propertyHandlerObj
					.readProperties("EU_ELV_Status_Help_PopUp"));

			EU_RoHS_exemptions_CompliantwithExemptions = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_exemptions_CompliantwithExemptions"));
			EU_RoHS_substances_NotCompliant = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_substances_NotCompliant"));
			EU_RoHS_Alternate_Link = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Alternate_Link"));
			EU_RoHS_Alternate_PDP_Heading = By.xpath(propertyHandlerObj
					.readProperties("EU_RoHS_Alternate_PDP_Heading"));

			EU_ELV_exemptions_CompliantwithExemptions = By.xpath(propertyHandlerObj
					.readProperties("EU_ELV_exemptions_CompliantwithExemptions"));
			EU_ELV_substances_NotCompliant = By.xpath(propertyHandlerObj
					.readProperties("EU_ELV_substances_NotCompliant"));

			section_China_RoHS_Compliance = By.xpath(propertyHandlerObj
					.readProperties("section_China_RoHS_Compliance"));

			section_EU_ELV_Compliance = By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));

			//------------------------------PDP_Sensors_Multidata_en Elements------------------------		

			heading_TEConnectivity = By.xpath(propertyHandlerObj
					.readProperties("heading_TEConnectivity"));
			product_Title = By.xpath(propertyHandlerObj
					.readProperties("product_Title"));
			product_Image = By.xpath(propertyHandlerObj
					.readProperties("product_Image"));
			product_Family_Link = By.xpath(propertyHandlerObj
					.readProperties("product_Family_Link"));
			product_Series_Link = By.xpath(propertyHandlerObj
					.readProperties("product_Series_Link"));
			product_Description = By.xpath(propertyHandlerObj
					.readProperties("product_Description"));
			product_TopFeature1_Title = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature1_Title"));
			product_TopFeature1_Value = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature1_Value"));
			product_TopFeature2_Title = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature2_Title"));
			product_TopFeature2_Value = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature2_Value"));
			product_TopFeature3_Title = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature3_Title"));
			product_TopFeature3_Value = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature3_Value"));
			product_TopFeature4_Title = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature4_Title"));
			product_TopFeature4_Value = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature4_Value"));
			product_TopFeature5_Title =	By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature5_Title"));
			product_TopFeature5_Value = By.xpath(propertyHandlerObj
					.readProperties("product_TopFeature5_Value"));
			data_Sheet_Link = By.xpath(propertyHandlerObj
					.readProperties("data_Sheet_Link"));
			product_Name_On_DataSheet = By.xpath(propertyHandlerObj
					.readProperties("product_Name_On_DataSheet")); 
			see_All_Features_Link = By.xpath(propertyHandlerObj
					.readProperties("see_All_Features_Link"));
			product_Type_Features = By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));
			see_All_Related_Materials_Link = By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));
			catalogPages_Or_DataSheets = By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));
			product_Compliance = By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));
			productCatalog_PDFLink = By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));
			product_Drawing = By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));
			CADFile_3D_Model =  By.xpath(propertyHandlerObj
					.readProperties("section_EU_ELV_Compliance"));
			similarProducts_Link = By.xpath(propertyHandlerObj
					.readProperties("similarProducts_Link"));
			saveToList_Link = By.xpath(propertyHandlerObj
					.readProperties("saveToList_Link"));
			temporaryList_Link = By.xpath(propertyHandlerObj
					.readProperties("temporaryList_Link"));
			saved_ConfirmationTick = By.xpath(propertyHandlerObj
					.readProperties("saved_ConfirmationTick"));
			overview_Tab = By.xpath(propertyHandlerObj
					.readProperties("overview_Tab"));
			features_Tab = By.xpath(propertyHandlerObj
					.readProperties("features_Tab"));
			relatedMaterials_Tab = By.xpath(propertyHandlerObj
					.readProperties("relatedMaterials_Tab"));
			complianceInformation_Link = By.xpath(propertyHandlerObj
					.readProperties("complianceInformation_Link"));
			PDFheading_StatementOfCompliance = By.xpath(propertyHandlerObj
					.readProperties("PDFheading_StatementOfCompliance"));
			benifits_Module = By.xpath(propertyHandlerObj
					.readProperties("benifits_Module"));
			Applications_Module = By.xpath(propertyHandlerObj
					.readProperties("Applications_Module"));
			description_ProductDrawing = By.xpath(propertyHandlerObj
					.readProperties("description_ProductDrawing"));
			description_3DPDF = By.xpath(propertyHandlerObj
					.readProperties("description_3DPDF"));
			seeAllDocumentation_Link = By.xpath(propertyHandlerObj
					.readProperties("seeAllDocumentation_Link"));
			documenation_Tab = By.xpath(propertyHandlerObj
					.readProperties("documenation_Tab"));
			compatible_Products = By.xpath(propertyHandlerObj
					.readProperties("compatible_Products"));
			checkForTooling_Link = By.xpath(propertyHandlerObj
					.readProperties("checkForTooling_Link"));
			getSample_Link = By.xpath(propertyHandlerObj
					.readProperties("getSample_Link"));
			productCompliance_Tab = By.xpath(propertyHandlerObj
					.readProperties("productCompliance_Tab"));


			//------------------------------------------- MDP -------------------------------------------
			moreInfo_Link = By.xpath(propertyHandlerObj
					.readProperties("moreInfo_Link"));
			productResult = By.xpath(propertyHandlerObj
					.readProperties("productResult"));
			custom_ProductTable_ProductCol = propertyHandlerObj
					.readProperties("custom_ProductTable_ProductCol");
			mdp_view_all_products = By.xpath(propertyHandlerObj
					.readProperties("mdp_view_all_products"));
			availability_tab = By.xpath(propertyHandlerObj
					.readProperties("availability_tab"));
			bulk_pricing_tab = By.xpath(propertyHandlerObj
					.readProperties("bulk_pricing_tab"));
			dist_inventory_tab = By.xpath(propertyHandlerObj
					.readProperties("dist_inventory_tab"));
			mdp_view_all_table = By.xpath(propertyHandlerObj
					.readProperties("mdp_view_all_table"));
			//------------------------------------------- MDP -------------------------------------------

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

	public boolean clickOnThisElement(String elementLocator){
		boolean clicked = false;
		By byObj = null;
		try {

			byObj = By.xpath(elementLocator);

			if(checkIfElementEnabled(byObj)){
				webDriver.findElement(byObj).click();
				clicked = true;
			}
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}

	public boolean clickOnThisElement(String customElementLocator, String keyword){
		boolean clicked = false;
		By byObj = null;
		try {
			customElementLocator = globalFunctionObj.getUpdatedLocator(customElementLocator, keyword);

			byObj = globalFunctionObj.createByObjectForLocator(customElementLocator);

			if(checkIfElementEnabled(byObj)){
				webDriver.findElement(byObj).click();
				clicked = true;
			}
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}

	public boolean verifyText(By elementByObj ,String expectedProductResult){
		boolean productResultMatched = false;
		String actualProductResult = null;
		try {

			if(checkIfElementEnabled(elementByObj)){

				actualProductResult = webDriver.findElement(elementByObj).getText();
				actualProductResult = globalFunctionObj.cleanString_Simple(actualProductResult);

				if(actualProductResult != null){
					if(actualProductResult.contains(expectedProductResult)){
						productResultMatched = true;
					}
				}

			}

		} catch (Exception e) {
			productResultMatched = false;
		}
		return productResultMatched;
	}

	//CEHCK IF ELEMENT IS DISPLAYED
	public boolean checkIfElementDisplayed(By elementByObj) {
		boolean elementDisplayed = false;
		WebElement webElement = null;
		try {

			// wait.until(ExpectedConditions.visibilityOfElementLocated(
			// By.xpath(".//*[@id='oo_no_thanks']") ))

			webElement = wait.until(ExpectedConditions
					.visibilityOfElementLocated(elementByObj));
			if (webElement.isDisplayed() == Boolean.parseBoolean(("true").trim())) {
				elementDisplayed = true;
			} else {
				elementDisplayed = false;
			}

		} catch (Exception e) {
			elementDisplayed = false;
			// e.printStackTrace();
		}
		return elementDisplayed;

	}
	
	//CEHCK IF ELEMENT IS PRESENT
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
}
*/