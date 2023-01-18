package Modules.MIS.Desktop.Pages;



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
	public PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;

	// TE PLP PAGE OBJBECTS
	public By resultProductTab = null;
	public By resultInformationTab = null;
	public By primaryImage=null;
	public By pdfLink=null;
	public By productDisplay=null;
	public By productFamily=null;
	public By primaryFeatueA=null;
	public By primaryFeatueB=null;
	public By primaryFeatueC=null;
	public By primaryFeatueD=null;
	public By primaryFeatueE=null;
	public By internalNumDisplay=null;
	public By seeAllFeature=null;
	public By seeAllDocumentation=null;
	public By productTypeFeatureOne=null;
	public By productTypeFeatureTwo=null;
	public By productTypeFeatureThree=null;
	public By productTypeFeatureFour=null;
	public By col_2_heading1Feature=null;
	public By col_2_featureValue1=null;
	public By col_2_featureTitle2=null;
	public By col_2_featureValue2=null;
	public By col_3_featureTitle=null;
	public By col_3_featureValue=null;
	public By col_3_featureTitle2=null;
	public By col_3_featureValue2=null;
	public By col_4_featureTitle1=null;
	public By col_4_featureValue1=null;
	public By col_5_featureTitle=null;
	public By col_5_featureValue=null;
	public By col_6_featureTitle=null;
	public By col_6_featureValue=null;
	public By col_7_featureTitle=null;
	public By col_7_featureValue=null;
	public By col_8_featureTitle=null;
	public By col_8_featureValue=null;
	public By col_9_featureTitle=null;
	public By col_9_featureValue=null;
	public By col_10_featureTitle=null;
	public By col_10_featureValue=null;
	public By col_11_featureTitle=null;
	public By col_11_featureValue=null;
	public By documentLink=null;
	public By doc_NC_1=null;
	public By doc_NC_2=null;
	public By doc_NC_3=null;
	public By saveToLink=null;
	public By popUP_NC=null;
	public By closePopUp_NC=null;
	public By countryDropDown=null;
	public By searchBtn=null;
	public By firstDisWebLink=null;
	public By cart_continue_checkout_2=null;


	//-------------------------------------NEW ELEMENTS-------------------------------
	public By section_REAC_SvHC_Compliance=null;
	public By contains_no_REACH_October_2008_SvHCLink =null;
	public By contains_no_REACH_October_2008_SvHCHelpPop=null;
	public By contains_no_REACH_June_2012_SvHCLink=null;
	public By contains_no_REACH_June_2012_SvHCHelpPopup=null;
	public By contains_REACH_January_2017_SvHCLink=null;
	public By contains_REACH_January_2017_SvHCSubstanceChart=null;
	public By contains_REACH_January_2017_SvHCHelpPopup=null;
	public By section_Halogen_Content=null;
	public By halogen_Content_StatusLink=null;
	public By halogen_Content_StatusHelpPopup=null;
	public By section_Solder_Process_Capability=null;
	public By solder_Process_CapabilityText=null;
	public By section_Statement_of_Compliance=null;
	public By statement_of_ComplianceLink=null;
	public By statement_of_CompliancePDFHeading=null;
	public By section_Compliance_Documents=null;
	public By documentationTabLink=null;
	public By section_Disclaimer=null;
	public By disclaimerText=null;
	public By partNo_145154_1_Product=null;
	public By EU_RoHS_Status_Link=null;
	public By EU_ELV_Status_Link=null;
	public By EU_RoHS_Compliant_with_Exemptions=null;
	public By EU_RoHS_Compliant_with_Exemptions_Content=null;
	public By cancel_Button=null;
	public By Not_EU_ELV_Compliant=null;
	public By Not_EU_ELV_Compliant_Content=null;
	public By documentationTab=null;
	public By product_ComplianceTab=null;
	public By EU_RoHS_Compliance=null;
	public By EU_RoHS_Compliance_Status_Compliant=null;
	public By EU_RoHS_Compliance_Exemptions_Information=null;
	public By EU_RoHS_Compliance_Exemptions_AlternateLink=null;
	public By PCI_and_PCI_Express_Connectors_Page=null;
	public By EU_ELV_Compliance_Status_Compliant = null;
	public By EU_RoHS_Status_Help_PopUp=null;
	public By EU_ELV_Status_Help_PopUp=null;
	public By EU_RoHS_exemptions_CompliantwithExemptions=null;
	public By EU_RoHS_substances_NotCompliant=null;
	public By EU_RoHS_Alternate_Link=null;
	public By EU_RoHS_Alternate_PDP_Heading=null;
	public By EU_ELV_exemptions_CompliantwithExemptions=null;
	public By EU_ELV_substances_NotCompliant=null;

	public By section_China_RoHS_Compliance=null;
	public By section_EU_ELV_Compliance=null;

	//-----------------------------TC_TE_PDP_en Elements----------------------------

	public By heading_TEConnectivity=null;
	public By product_Title=null;
	public By product_Image=null;
	public By product_Family_Link=null;
	public By product_Series_Link=null;
	public By product_Description=null;
	public By product_TopFeature1_Title=null;
	public By product_TopFeature1_Value=null;
	public By product_TopFeature2_Title=null;
	public By product_TopFeature2_Value=null;
	public By product_TopFeature3_Title=null;
	public By product_TopFeature3_Value=null;
	public By product_TopFeature4_Title=null;
	public By product_TopFeature4_Value=null;
	public By product_TopFeature5_Title=null;
	public By product_TopFeature5_Value=null;
	public By data_Sheet_Link=null;
	public By product_Name_On_DataSheet=null;
	public By see_All_Features_Link=null;
	public By product_Type_Features=null;
	public By see_All_Related_Materials_Link=null;
	public By catalogPages_Or_DataSheets=null;
	public By product_Compliance=null;
	public By productCatalog_PDFLink=null;
	public By product_Drawing=null;
	public By CADFile_3D_Model=null;
	public By similarProducts_Link=null;
	public By saveToList_Link=null;
	public By temporaryList_Link=null;
	public By saved_ConfirmationTick=null;
	public By overview_Tab=null;
	public By features_Tab=null;
	public By relatedMaterials_Tab=null;
	public By complianceInformation_Link = null;
	public By PDFheading_StatementOfCompliance = null;
	public By benifits_Module = null;
	public By Applications_Module = null;
	public By description_ProductDrawing = null;
	public By description_3DPDF = null;
	public By seeAllDocumentation_Link = null;
	public By documenation_Tab = null;
	public By compatible_Products = null;
	public By checkForTooling_Link = null;
	public By getSample_Link = null;
	public By productCompliance_Tab = null;

	//-------------------------------------MDP ELEMENTS-------------------------------
	public By moreInfo_Link = null;
	public By productResult = null;
	public By mdp_view_all_products = null;
	public By availability_tab = null;
	public By bulk_pricing_tab = null;
	public By dist_inventory_tab = null;
	public By mdp_view_all_table = null;
	public String custom_ProductTable_ProductCol = null;
	//--------------------------------------GETTERS----------------------------------------

	public By prod_Status_Ele = null;
	public By get_Sample_Link = null;
	public By compatiblePart_Link = null;
	public By request_Price_Link = null;
	public By documents_Link = null;
	public By features_Link = null;
	public By complience_Link = null;

	//-------------------------------------DCT ELEMENTS-------------------------------
	public By priceArea_StockQty_Ele = null;
	public By Chat_Close_Btn = null;
	public By error_div = null;
	public By Distributor_Inventory_Link = null;
	public By DistInventory_CartQty_Tb = null;
	public By DistInventory_AddToCart_Btn = null;
	public By DistInventory_UpdateCartQty_Link = null;
	public By Cart_ContinueCheckout_Link = null;
	public By ShoppingCart_ContinueCheckout_Link = null;
	public By Checkout_Accept_Cb = null;
	public By Checkout_Place_Orer_Btn = null;
	public By buyNow_Btn = null;
	public By Cart_RemoveProd_1_Link = null;

	public By priceArea_Price_Ele = null;
	public By priceArea_Stock_Ele = null;

	public By checkout_ShipInfo_NewAddress_Link = null;
	public By checkout_AddNewAddress_FName_Tb = null;
	public By checkout_AddNewAddress_LName_Tb = null;
	public By checkout_AddNewAddress_PhNo_Tb = null;
	public By checkout_AddNewAddress_CmpName_Tb = null;
	public By checkout_AddNewAddress_Address_Tb = null;
	public By checkout_AddNewAddress_Address_Tb1 = null;
	public By checkout_AddNewAddress_City_Tb = null;
	public By checkout_AddNewAddress_State_Select = null;
	public By checkout_AddNewAddress_ZIP_Tb = null;
	public By checkout_AddNewAddress_AddNewAddress_Btn = null;

	public By checkout_PayInfo_NewPaymentInfo_Btn = null;
	public By checkout_PayInfo_iFrame = null;
	public By checkout_PayInfo_NameOnCard_Tb = null;
	public By checkout_PayInfo_CardNo_Tb = null;
	public By checkout_PayInfo_CardType_Select = null;
	public By checkout_PayInfo_ExpDate_Month_Select = null;
	public By checkout_PayInfo_ExpDate_Year_Select = null;
	public By checkout_PayInfo_CVV_Tb = null;
	public By checkout_PayInfo_BillingType_Cb = null;
	public By checkout_AddPayment_Btn = null;

	public By checkout_OrderComplete_PurchaseComplete_Ele = null;
	public By checkout_OrderComplete_TEOrderNo = null;
	
	// MAILINATOR
	public By mailtitle= null;
	public By openEmailAccount= null;
	public By goBtn= null;
	public By mailinator_ViewOrderDetails=null;
	public By mailbodyFrame=null;
	public By connectWithUs=null;
	public By shopatTeStore=null;
	
	//---------------- D C T ------------------------------------------------------------ D C T ----------
	public By addPassword_1_Tb = null;
	public By addPassword_2_Tb = null;
	
	public By prodQty_bcHeader = null;
	public By prodQty_priceBreak = null;
	public By addToCart_bcHeader = null;
	public By addToCart_priceBreak = null;
	public By bc_no_1 = null;
	public By bc_no_2 = null;
	public By bc_no_3 = null;
	public By bc_no_4 = null;
	public By compatible_Products_Ele_1 = null;
	public By alsoInSeries1_Header = null;
	public By alsoInSeries1_Ele_1 = null;
	public By alsoInSeries2_Header = null;
	public By alsoInSeries2_Ele_1 = null;
	public By custAlsoBought_Header = null;
	public By custAlsoBought_Ele_1 = null;
	public By link_seeAllProdBreak = null;
	public By dct_LiveChat_PopUp = null;

	public By checkout_1_AddedToCart_Ele = null;
	public By shoppingCart_Qty = null;
	public By distInfo_ProdInfo_Stock = null;
	public By distInfo_ProdInfo_MOQ = null;
	public By priceBreak_ProdInfo_Stock = null;
	public By priceBreak_ProdInfo_MOQ = null;
	public By priceBreak_Link = null;
	//added by dheeraj
	public By Product_CrimpTOOL=null;
	
	
	//added by adhir
	
	public By hybrisUserName=null;
	public  By hybrisSubmit=null;
	public By hybrisPassword=null;

	public By hybrisOrder=null;
	
	public By hybrisOrders=null;
	public By hyrbisSearchTextBOx=null;
	public By hybris_Search=null;
	public By hybris_First=null;
	public By hybris_payment=null;
	public By hybris_Address=null;
	
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

	// CTOR
	public PDP(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	public void setup(String localeChoice){
		try {

			if(localeChoice != null && localeChoice != ""){

				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "PDP");
				initializepageObjects();				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void initializepageObjects(){
		try {

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

//added by dheeraj
			Product_CrimpTOOL = By.xpath(propertyHandlerObj
					.readProperties("Product_CrimpTOOL"));
			
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
			cart_continue_checkout_2= By.xpath(propertyHandlerObj.readProperties("cart_continue_checkout_2"));
			//------------------------------------------- MDP -------------------------------------------

			//------------------------------------------- DCT -------------------------------------------
			priceArea_StockQty_Ele = By.xpath(propertyHandlerObj.readProperties("priceArea_StockQty_Ele"));
			Chat_Close_Btn = By.xpath(propertyHandlerObj.readProperties("Chat_Close_Btn"));
			error_div = By.xpath(propertyHandlerObj.readProperties("error_div"));
			Distributor_Inventory_Link = By.xpath(propertyHandlerObj.readProperties("Distributor_Inventory_Link"));
			DistInventory_CartQty_Tb = By.xpath(propertyHandlerObj.readProperties("DistInventory_CartQty_Tb"));
			DistInventory_AddToCart_Btn = By.xpath(propertyHandlerObj.readProperties("DistInventory_AddToCart_Btn"));
			DistInventory_UpdateCartQty_Link = By.xpath(propertyHandlerObj.readProperties("DistInventory_UpdateCartQty_Link"));
			Cart_ContinueCheckout_Link = By.xpath(propertyHandlerObj.readProperties("Cart_ContinueCheckout_Link"));
			ShoppingCart_ContinueCheckout_Link = By.xpath(propertyHandlerObj.readProperties("ShoppingCart_ContinueCheckout_Link"));
			Checkout_Accept_Cb = By.xpath(propertyHandlerObj.readProperties("Checkout_Accept_Cb"));
			Checkout_Place_Orer_Btn = By.xpath(propertyHandlerObj.readProperties("Checkout_Place_Orer_Btn"));
			buyNow_Btn = By.xpath(propertyHandlerObj.readProperties("buyNow_Btn"));
			Cart_RemoveProd_1_Link = By.xpath(propertyHandlerObj.readProperties("Cart_RemoveProd_1_Link"));

			prod_Status_Ele =  By.xpath(propertyHandlerObj.readProperties("prod_Status_Ele"));
			get_Sample_Link = By.xpath(propertyHandlerObj.readProperties("get_Sample_Link"));
			compatiblePart_Link = By.xpath(propertyHandlerObj.readProperties("compatiblePart_Link"));
			request_Price_Link = By.xpath(propertyHandlerObj.readProperties("request_Price_Link"));
			documents_Link = By.xpath(propertyHandlerObj.readProperties("documents_Link"));
			features_Link = By.xpath(propertyHandlerObj.readProperties("features_Link"));
			complience_Link = By.xpath(propertyHandlerObj.readProperties("complience_Link"));

			priceArea_Price_Ele = By.xpath(propertyHandlerObj.readProperties("priceArea_Price_Ele"));
			priceArea_Stock_Ele = By.xpath(propertyHandlerObj.readProperties("priceArea_Stock_Ele"));


			// -------------------CHECKOUT_PAGE - ADDRESS-----------------------------------
			checkout_ShipInfo_NewAddress_Link = By.xpath(propertyHandlerObj.readProperties("checkout_ShipInfo_NewAddress_Link"));
			checkout_AddNewAddress_FName_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_FName_Tb"));
			checkout_AddNewAddress_LName_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_LName_Tb"));
			checkout_AddNewAddress_PhNo_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_PhNo_Tb"));
			checkout_AddNewAddress_CmpName_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_CmpName_Tb"));
			checkout_AddNewAddress_Address_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_Address_Tb"));
			checkout_AddNewAddress_Address_Tb1 = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_Address_Tb1"));
			checkout_AddNewAddress_City_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_City_Tb"));
			checkout_AddNewAddress_State_Select = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_State_Select"));
			checkout_AddNewAddress_ZIP_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_ZIP_Tb"));
			checkout_AddNewAddress_AddNewAddress_Btn = By.xpath(propertyHandlerObj.readProperties("checkout_AddNewAddress_AddNewAddress_Btn"));
			
			// -------------------CHECKOUT_PAGE - PAYMENT-----------------------------------
			checkout_PayInfo_NewPaymentInfo_Btn = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_NewPaymentInfo_Btn"));
			checkout_PayInfo_iFrame = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_iFrame"));
			checkout_PayInfo_NameOnCard_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_NameOnCard_Tb"));
			checkout_PayInfo_CardNo_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_CardNo_Tb"));
			checkout_PayInfo_CardType_Select = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_CardType_Select"));
			checkout_PayInfo_ExpDate_Month_Select = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_ExpDate_Month_Select"));
			checkout_PayInfo_ExpDate_Year_Select = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_ExpDate_Year_Select"));
			checkout_PayInfo_CVV_Tb = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_CVV_Tb"));
			checkout_PayInfo_BillingType_Cb = By.xpath(propertyHandlerObj.readProperties("checkout_PayInfo_BillingType_Cb"));
			checkout_AddPayment_Btn = By.xpath(propertyHandlerObj.readProperties("checkout_AddPayment_Btn"));
			
			// -------------------CHECKOUT_PAGE - COMLTE - ORDER DETALS-----------------------------------
			checkout_OrderComplete_PurchaseComplete_Ele = By.xpath(propertyHandlerObj.readProperties("checkout_OrderComplete_PurchaseComplete_Ele"));
			checkout_OrderComplete_TEOrderNo = By.xpath(propertyHandlerObj.readProperties("checkout_OrderComplete_TEOrderNo"));
			
			//------------------------ mailinator -----------------------------------------------------------
			openEmailAccount= By.xpath(propertyHandlerObj.readProperties("openEmailAccount"));
			mailtitle= By.xpath(propertyHandlerObj.readProperties("mailtitle"));
			goBtn= By.xpath(propertyHandlerObj.readProperties("goBtn"));
			mailinator_ViewOrderDetails= By.xpath(propertyHandlerObj.readProperties("mailinator_ViewOrderDetails"));
			mailbodyFrame= By.xpath(propertyHandlerObj.readProperties("mailbodyFrame"));
			connectWithUs=By.xpath(propertyHandlerObj.readProperties("connectWithUs"));
			shopatTeStore=By.xpath(propertyHandlerObj.readProperties("shopatTeStore"));
			
			//---------------- D C T ------------------------------------------------------------ D C T ----------
			addPassword_1_Tb=By.xpath(propertyHandlerObj.readProperties("addPassword_1_Tb"));
			addPassword_2_Tb=By.xpath(propertyHandlerObj.readProperties("addPassword_2_Tb"));
			prodQty_bcHeader = By.xpath(propertyHandlerObj.readProperties("prodQty_bcHeader"));
			prodQty_priceBreak = By.xpath(propertyHandlerObj.readProperties("prodQty_priceBreak"));
			addToCart_bcHeader = By.xpath(propertyHandlerObj.readProperties("addToCart_bcHeader"));
			addToCart_priceBreak = By.xpath(propertyHandlerObj.readProperties("addToCart_priceBreak"));
			bc_no_1 = By.xpath(propertyHandlerObj.readProperties("bc_no_1"));
			bc_no_2 = By.xpath(propertyHandlerObj.readProperties("bc_no_2"));
			bc_no_3 = By.xpath(propertyHandlerObj.readProperties("bc_no_3"));
			bc_no_4 = By.xpath(propertyHandlerObj.readProperties("bc_no_4"));
			compatible_Products_Ele_1 = By.xpath(propertyHandlerObj.readProperties("compatible_Products_Ele_1"));
			alsoInSeries1_Header = By.xpath(propertyHandlerObj.readProperties("alsoInSeries1_Header"));
			alsoInSeries1_Ele_1 = By.xpath(propertyHandlerObj.readProperties("alsoInSeries1_Ele_1"));
			alsoInSeries2_Header = By.xpath(propertyHandlerObj.readProperties("alsoInSeries2_Header"));
			alsoInSeries2_Ele_1 = By.xpath(propertyHandlerObj.readProperties("alsoInSeries2_Ele_1"));
			custAlsoBought_Header = By.xpath(propertyHandlerObj.readProperties("custAlsoBought_Header"));
			custAlsoBought_Ele_1 = By.xpath(propertyHandlerObj.readProperties("custAlsoBought_Ele_1"));
			link_seeAllProdBreak = By.xpath(propertyHandlerObj.readProperties("link_seeAllProdBreak"));
			dct_LiveChat_PopUp = By.xpath(propertyHandlerObj.readProperties("dct_LiveChat_PopUp"));

			checkout_1_AddedToCart_Ele = By.xpath(propertyHandlerObj.readProperties("checkout_1_AddedToCart_Ele"));
			shoppingCart_Qty = By.xpath(propertyHandlerObj.readProperties("shoppingCart_Qty"));
			
			distInfo_ProdInfo_Stock = By.xpath(propertyHandlerObj.readProperties("distInfo_ProdInfo_Stock"));
			distInfo_ProdInfo_MOQ = By.xpath(propertyHandlerObj.readProperties("distInfo_ProdInfo_MOQ"));
			priceBreak_ProdInfo_Stock = By.xpath(propertyHandlerObj.readProperties("priceBreak_ProdInfo_Stock"));
			priceBreak_ProdInfo_MOQ = By.xpath(propertyHandlerObj.readProperties("priceBreak_ProdInfo_MOQ"));
			priceBreak_Link = By.xpath(propertyHandlerObj.readProperties("priceBreak_Link"));
			
			
			
				
			//added by adhir
			hybrisUserName = By.xpath(propertyHandlerObj.readProperties("hybrisUserName"));
			hybrisPassword = By.xpath(propertyHandlerObj.readProperties("hybrisPassword"));
			hybrisSubmit= By.xpath(propertyHandlerObj.readProperties("hybrisSubmit"));
			
			hybrisOrder=By.xpath(propertyHandlerObj.readProperties("hybrisOrder"));
					hybrisOrders=By.xpath(propertyHandlerObj.readProperties("hybrisOrders"));
			
			hyrbisSearchTextBOx = By.xpath(propertyHandlerObj.readProperties("hyrbisSearchTextBOx"));
			hybris_Search = By.xpath(propertyHandlerObj.readProperties("hybris_Search"));
			hybris_First = By.xpath(propertyHandlerObj.readProperties("hybris_First"));
			hybris_payment = By.xpath(propertyHandlerObj.readProperties("hybris_payment"));
			hybris_Address = By.xpath(propertyHandlerObj.readProperties("hybris_Address"));
			hybrisUserName = By.xpath(propertyHandlerObj.readProperties("hybrisUserName"));
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
