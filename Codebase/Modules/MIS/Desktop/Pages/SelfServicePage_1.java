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

public class SelfServicePage {

	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private GlobalFunction globalFunctionObj = null;

	private By heading_OrderStatus = null;
	private By heading_Reporting = null;
	private By heading_AccountInfo = null;
	private By heading_SearhcBy = null;
	private By checkBox_AllContent = null;
	private By checkBox_TEOrderNo = null;
	private By checkBox_PurchaseOrder = null;
	private By checkBox_TEPartNo = null;
	private By checkBox_CustomerPartNo = null;
	private By checkBox_InvoiceNo = null;
	private By checkBox_ShipmentNo = null;

	// MIN ELEMENTS
	private By heading_Results = null;
	private By msg_DidYouKnow_CloseBtn = null;
	private By link_OrderOnlineSample = null;
	private By link_QuickReferenceGuide = null;
	private By link_GenerateOpenOrder = null;
	private By link_GenerateShipmentReport = null;
	private By link_ManageMyDownloads = null;
	private By table_Results = null;
	private By checkbox_ReportTypeFormat_PopUp_XLS = null;
	private By btn_ReportTypeFormat_PopUp_Submit = null;
	private By msg_ReportTypeFormat_PopUp_Success = null;
	private By btn_ReportTypeFormat_PopUp_Close = null;
	private By ele_MyDownlaod_TableElement_1 = null;
	private By btn_ConfirmRemove_PopUp_MyDownlaod = null;
	private By msg_MyDownload_Table_NoJobs = null;
	private By textbox_AccountSearch = null;

	// ISD ELEMENTS
	private By tab_ShipDebit_ClaimStatus = null;
	private By tab_ShipDebit_CreateUploadClaim = null;
	private By tab_ShipDebit_Agreements = null;
	private By heading_ShipDebit_Results = null;
	private By ele_ShipDebit_Results_TableElement_1 = null;
	private By checkBox_ShipDebit_AllClaims = null;
	private By checkBox_ShipDebit_DebitMemoClaim = null;
	private By link_ShipDebit_ClearForm = null;
	private By tableHeading_ShipDebit_DebitMemoNo = null;
	private By tableHeading_ShipDebit_RefId = null;
	private By tableHeading_ShipDebit_CreditCurrency = null;
	private By ele_ShipDebit_ProductHeadResult = null;
	
	private By heading_ShipDebit_Agreement_SearchBy = null;
	private By heading_ShipDebit_Agreement_Results = null;
	private By radiobtn_ShipDebit_Agreement_SearchBy_AllAgreements = null;
	private By radiobtn_ShipDebit_Agreement_SearchBy_AgreementNumber = null;
	private By radiobtn_ShipDebit_Agreement_SearchBy_POSCustomerNumber = null;
	private By ele_ShipDebit_Agreement_TEAgreementNo_TableElement_1 = null;
	private By btn_ShipDebit_Agreement_BackToInquiryResults = null;
	
	private By ele_Heading_AgreementForm_AgreementDetailsResult = null;
	private By ele_Heading_AgreementForm_AgreementNumber = null;
	private By ele_Value_AgreementForm_AgreementNumber = null;
	private By link_AgreementForm_DownloadAgreementDetails = null;
	private By btn_agreementForm_ClearFilter = null;

	// CREATE & UPLOAD CLAIM
	private By tb_ShipDebit_ClaimUplaod_CustInvoiceNo = null;
	private By tb_ShipDebit_ClaimUplaod_AgreementeNo = null;
	private By tb_ShipDebit_ClaimUplaod_DebitMemoNo = null;
	private By tb_ShipDebit_ClaimUplaod_EndCustId = null;
	private By tb_ShipDebit_ClaimUplaod_EndCustName = null;
	private By tb_ShipDebit_ClaimUplaod_TycoPartNo = null;
	private By tb_ShipDebit_ClaimUplaod_SubmittedPartNo = null;
	private By tb_ShipDebit_ClaimUplaod_DistributorCost = null;
	private By tb_ShipDebit_ClaimUplaod_AgreementCost = null;
	private By tb_ShipDebit_ClaimUplaod_ResaleCost = null;
	private By tb_ShipDebit_ClaimUplaod_ShipedDate = null;
	private By tb_ShipDebit_ClaimUplaod_ShipedQty = null;
	private By tb_ShipDebit_ClaimUplaod_TEInvoiceNo = null;
	private By select_ShipDebit_ClaimUplaod_UnitOfMesure = null;
	private By select_ShipDebit_ClaimUplaod_CurrencyCode = null;
	private By select_ShipDebit_ClaimUplaod_DistributorRange = null;
	private By select_ShipDebit_ClaimUplaod_AgreementRange = null;
	private By select_ShipDebit_ClaimUplaod_ResaleRange = null;
	private By ele_ShipDebit_ClaimUplaod_PopUp_Successfull = null;
	private By btn_ShipDebit_ClaimUplaod_PopUp_Close = null;
	private By btn_ShipDebit_ClaimUpload_CreateClaim = null;
	
	private By link_PriceAvail_SubmitSpreedsheet = null;
	private By btn_PriceAvail_SubmitSpreedsheet_Browse = null;
	private By btn_PriceAvail_SubmitSpreedsheet_Upload = null;
	private By tb_PriceAvail_NameThisRequest  = null;
	private By ele_PriceAvail_SubmitSpreedsheet_ErrorMsg = null;
	
	
	public By getLink_PriceAvail_SubmitSpreedsheet() {
		return link_PriceAvail_SubmitSpreedsheet;
	}
	public By getBtn_PriceAvail_SubmitSpreedsheet_Browse() {
		return btn_PriceAvail_SubmitSpreedsheet_Browse;
	}
	public By getBtn_PriceAvail_SubmitSpreedsheet_Upload() {
		return btn_PriceAvail_SubmitSpreedsheet_Upload;
	}
	public By getTb_PriceAvail_NameThisRequest() {
		return tb_PriceAvail_NameThisRequest;
	}
	public By getEle_PriceAvail_SubmitSpreedsheet_ErrorMsg() {
		return ele_PriceAvail_SubmitSpreedsheet_ErrorMsg;
	}
	public By getBtn_ShipDebit_ClaimUpload_CreateClaim(){
		return btn_ShipDebit_ClaimUpload_CreateClaim;	
	}
	public By getTb_ShipDebit_ClaimUplaod_ShipedDate(){
		return tb_ShipDebit_ClaimUplaod_ShipedDate;
	}
	public By getTb_ShipDebit_ClaimUplaod_CustInvoiceNo() {
		return tb_ShipDebit_ClaimUplaod_CustInvoiceNo;
	}

	public By getTb_ShipDebit_ClaimUplaod_AgreementeNo() {
		return tb_ShipDebit_ClaimUplaod_AgreementeNo;
	}

	public By getTb_ShipDebit_ClaimUplaod_DebitMemoNo() {
		return tb_ShipDebit_ClaimUplaod_DebitMemoNo;
	}

	public By getTb_ShipDebit_ClaimUplaod_EndCustId() {
		return tb_ShipDebit_ClaimUplaod_EndCustId;
	}

	public By getTb_ShipDebit_ClaimUplaod_EndCustName() {
		return tb_ShipDebit_ClaimUplaod_EndCustName;
	}

	public By getTb_ShipDebit_ClaimUplaod_TycoPartNo() {
		return tb_ShipDebit_ClaimUplaod_TycoPartNo;
	}

	public By getTb_ShipDebit_ClaimUplaod_SubmittedPartNo() {
		return tb_ShipDebit_ClaimUplaod_SubmittedPartNo;
	}

	public By getTb_ShipDebit_ClaimUplaod_DistributorCost() {
		return tb_ShipDebit_ClaimUplaod_DistributorCost;
	}

	public By getTb_ShipDebit_ClaimUplaod_AgreementCost() {
		return tb_ShipDebit_ClaimUplaod_AgreementCost;
	}

	public By getTb_ShipDebit_ClaimUplaod_ResaleCost() {
		return tb_ShipDebit_ClaimUplaod_ResaleCost;
	}

	public By getTb_ShipDebit_ClaimUplaod_ShipedQty() {
		return tb_ShipDebit_ClaimUplaod_ShipedQty;
	}

	public By getTb_ShipDebit_ClaimUplaod_TEInvoiceNo() {
		return tb_ShipDebit_ClaimUplaod_TEInvoiceNo;
	}

	public By getSelect_ShipDebit_ClaimUplaod_UnitOfMesure() {
		return select_ShipDebit_ClaimUplaod_UnitOfMesure;
	}

	public By getSelect_ShipDebit_ClaimUplaod_CurrencyCode() {
		return select_ShipDebit_ClaimUplaod_CurrencyCode;
	}

	public By getSelect_ShipDebit_ClaimUplaod_DistributorRange() {
		return select_ShipDebit_ClaimUplaod_DistributorRange;
	}

	public By getSelect_ShipDebit_ClaimUplaod_AgreementRange() {
		return select_ShipDebit_ClaimUplaod_AgreementRange;
	}

	public By getSelect_ShipDebit_ClaimUplaod_ResaleRange() {
		return select_ShipDebit_ClaimUplaod_ResaleRange;
	}

	public By getEle_ShipDebit_ClaimUplaod_PopUp_Successfull() {
		return ele_ShipDebit_ClaimUplaod_PopUp_Successfull;
	}

	public By getBtn_ShipDebit_ClaimUplaod_PopUp_Close() {
		return btn_ShipDebit_ClaimUplaod_PopUp_Close;
	}

	public By getEle_Heading_AgreementForm_AgreementDetailsResult() {
		return ele_Heading_AgreementForm_AgreementDetailsResult;
	}

	public By getEle_Heading_AgreementForm_AgreementNumber() {
		return ele_Heading_AgreementForm_AgreementNumber;
	}

	public By getEle_Value_AgreementForm_AgreementNumber() {
		return ele_Value_AgreementForm_AgreementNumber;
	}

	public By getLink_AgreementForm_DownloadAgreementDetails() {
		return link_AgreementForm_DownloadAgreementDetails;
	}

	public By getBtn_agreementForm_ClearFilter() {
		return btn_agreementForm_ClearFilter;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public Actions getAction() {
		return action;
	}

	public By getHeading_ShipDebit_Agreement_SearchBy() {
		return heading_ShipDebit_Agreement_SearchBy;
	}

	public By getHeading_ShipDebit_Agreement_Results() {
		return heading_ShipDebit_Agreement_Results;
	}

	public By getRadiobtn_ShipDebit_Agreement_SearchBy_AllAgreements() {
		return radiobtn_ShipDebit_Agreement_SearchBy_AllAgreements;
	}

	public By getRadiobtn_ShipDebit_Agreement_SearchBy_AgreementNumber() {
		return radiobtn_ShipDebit_Agreement_SearchBy_AgreementNumber;
	}

	public By getRadiobtn_ShipDebit_Agreement_SearchBy_POSCustomerNumber() {
		return radiobtn_ShipDebit_Agreement_SearchBy_POSCustomerNumber;
	}

	public By getEle_ShipDebit_Agreement_TEAgreementNo_TableElement_1() {
		return ele_ShipDebit_Agreement_TEAgreementNo_TableElement_1;
	}

	public PropertyHandler getPropertyHandlerObj() {
		return propertyHandlerObj;
	}

	public By getTab_ShipDebit_ClaimStatus() {
		return tab_ShipDebit_ClaimStatus;
	}

	public By getTab_ShipDebit_CreateUploadClaim() {
		return tab_ShipDebit_CreateUploadClaim;
	}

	public By getTab_ShipDebit_Agreements() {
		return tab_ShipDebit_Agreements;
	}

	public By getHeading_ShipDebit_Results() {
		return heading_ShipDebit_Results;
	}

	public By getEle_ShipDebit_Results_TableElement_1() {
		return ele_ShipDebit_Results_TableElement_1;
	}

	public By getCheckBox_ShipDebit_AllClaims() {
		return checkBox_ShipDebit_AllClaims;
	}

	public By getCheckBox_ShipDebit_DebitMemoClaim() {
		return checkBox_ShipDebit_DebitMemoClaim;
	}

	public By getLink_ShipDebit_ClearForm() {
		return link_ShipDebit_ClearForm;
	}

	public By getTableHeading_ShipDebit_DebitMemoNo() {
		return tableHeading_ShipDebit_DebitMemoNo;
	}

	public By getTableHeading_ShipDebit_RefId() {
		return tableHeading_ShipDebit_RefId;
	}

	public By getTableHeading_ShipDebit_CreditCurrency() {
		return tableHeading_ShipDebit_CreditCurrency;
	}

	public By getEle_ShipDebit_ProductHeadResult() {
		return ele_ShipDebit_ProductHeadResult;
	}

	public By getBtn_ShipDebit_Agreement_BackToInquiryResults() {
		return btn_ShipDebit_Agreement_BackToInquiryResults;
	}

	public By getTextbox_AccountSearch(){
		return textbox_AccountSearch;
	}

	public GlobalFunction getGlobalFunctionObj() {
		return globalFunctionObj;
	}

	public By getHeading_Results() {
		return heading_Results;
	}

	public By getMsg_DidYouKnow_CloseBtn() {
		return msg_DidYouKnow_CloseBtn;
	}

	public By getLink_OrderOnlineSample() {
		return link_OrderOnlineSample;
	}

	public By getLink_QuickReferenceGuide() {
		return link_QuickReferenceGuide;
	}

	public By getLink_GenerateOpenOrder() {
		return link_GenerateOpenOrder;
	}

	public By getLink_GenerateShipmentReport() {
		return link_GenerateShipmentReport;
	}

	public By getLink_ManageMyDownloads() {
		return link_ManageMyDownloads;
	}

	public By getTable_Results() {
		return table_Results;
	}

	public By getCheckbox_ReportTypeFormat_PopUp_XLS() {
		return checkbox_ReportTypeFormat_PopUp_XLS;
	}

	public By getBtn_ReportTypeFormat_PopUp_Submit() {
		return btn_ReportTypeFormat_PopUp_Submit;
	}

	public By getMsg_ReportTypeFormat_PopUp_Success() {
		return msg_ReportTypeFormat_PopUp_Success;
	}

	public By getBtn_ReportTypeFormat_PopUp_Close() {
		return btn_ReportTypeFormat_PopUp_Close;
	}

	public By getEle_MyDownlaod_TableElement_1() {
		return ele_MyDownlaod_TableElement_1;
	}

	public By getBtn_ConfirmRemove_PopUp_MyDownlaod() {
		return btn_ConfirmRemove_PopUp_MyDownlaod;
	}

	public By getMsg_MyDownload_Table_NoJobs() {
		return msg_MyDownload_Table_NoJobs;
	}

	public By getHeading_OrderStatus() {
		return heading_OrderStatus;
	}

	public By getHeading_Reporting() {
		return heading_Reporting;
	}
	public By getHeading_AccountInfo() {
		return heading_AccountInfo;
	}

	public By getHeading_SearhcBy() {
		return heading_SearhcBy;
	}

	public By getCheckBox_AllContent() {
		return checkBox_AllContent;
	}


	public By getCheckBox_TEOrderNo() {
		return checkBox_TEOrderNo;
	}


	public By getCheckBox_PurchaseOrder() {
		return checkBox_PurchaseOrder;
	}

	public By getCheckBox_TEPartNo() {
		return checkBox_TEPartNo;
	}


	public By getCheckBox_CustomerPartNo() {
		return checkBox_CustomerPartNo;
	}

	public By getCheckBox_InvoiceNo() {
		return checkBox_InvoiceNo;
	}

	public By getCheckBox_ShipmentNo() {
		return checkBox_ShipmentNo;
	}

	//---------------------------GETTER END----------------------------------
	// CTOR
	public SelfServicePage(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	private void setup(String localeChoice){
		try {

			if(localeChoice != null && localeChoice != ""){

				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "selfservice");
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

			heading_OrderStatus = By.xpath(propertyHandlerObj.readProperties("heading_OrderStatus"));
			heading_Reporting = By.xpath(propertyHandlerObj.readProperties("heading_Reporting"));
			heading_AccountInfo = By.xpath(propertyHandlerObj.readProperties("heading_AccountInfo"));
			heading_SearhcBy = By.xpath(propertyHandlerObj.readProperties("heading_SearhcBy"));
			checkBox_AllContent = By.xpath(propertyHandlerObj.readProperties("checkBox_AllContent"));
			checkBox_TEOrderNo = By.xpath(propertyHandlerObj.readProperties("checkBox_TEOrderNo"));
			checkBox_PurchaseOrder = By.xpath(propertyHandlerObj.readProperties("checkBox_PurchaseOrder"));
			checkBox_TEPartNo = By.xpath(propertyHandlerObj.readProperties("checkBox_TEPartNo"));
			checkBox_CustomerPartNo = By.xpath(propertyHandlerObj.readProperties("checkBox_CustomerPartNo"));
			checkBox_InvoiceNo = By.xpath(propertyHandlerObj.readProperties("checkBox_InvoiceNo"));
			checkBox_ShipmentNo = By.xpath(propertyHandlerObj.readProperties("checkBox_ShipmentNo"));

			heading_Results = By.xpath(propertyHandlerObj.readProperties("heading_Results"));
			msg_DidYouKnow_CloseBtn = By.xpath(propertyHandlerObj.readProperties("msg_DidYouKnow_CloseBtn"));
			link_OrderOnlineSample = By.xpath(propertyHandlerObj.readProperties("link_OrderOnlineSample"));
			link_QuickReferenceGuide = By.xpath(propertyHandlerObj.readProperties("link_QuickReferenceGuide"));
			link_GenerateOpenOrder = By.xpath(propertyHandlerObj.readProperties("link_GenerateOpenOrder"));
			link_GenerateShipmentReport = By.xpath(propertyHandlerObj.readProperties("link_GenerateShipmentReport"));
			link_ManageMyDownloads = By.xpath(propertyHandlerObj.readProperties("link_ManageMyDownloads"));
			table_Results = By.xpath(propertyHandlerObj.readProperties("table_Results"));
			checkbox_ReportTypeFormat_PopUp_XLS = By.xpath(propertyHandlerObj.readProperties("checkbox_ReportTypeFormat_PopUp_XLS"));
			btn_ReportTypeFormat_PopUp_Submit = By.xpath(propertyHandlerObj.readProperties("btn_ReportTypeFormat_PopUp_Submit"));
			msg_ReportTypeFormat_PopUp_Success = By.xpath(propertyHandlerObj.readProperties("msg_ReportTypeFormat_PopUp_Success"));
			btn_ReportTypeFormat_PopUp_Close = By.xpath(propertyHandlerObj.readProperties("btn_ReportTypeFormat_PopUp_Close"));
			ele_MyDownlaod_TableElement_1 = By.xpath(propertyHandlerObj.readProperties("ele_MyDownlaod_TableElement_1"));
			btn_ConfirmRemove_PopUp_MyDownlaod = By.xpath(propertyHandlerObj.readProperties("btn_ConfirmRemove_PopUp_MyDownlaod"));
			msg_MyDownload_Table_NoJobs = By.xpath(propertyHandlerObj.readProperties("msg_MyDownload_Table_NoJobs"));
			textbox_AccountSearch =  By.xpath(propertyHandlerObj.readProperties("textbox_AccountSearch"));

			// ISD ELEMENTS
			tab_ShipDebit_ClaimStatus = By.xpath(propertyHandlerObj.readProperties("tab_ShipDebit_ClaimStatus"));
			tab_ShipDebit_CreateUploadClaim = By.xpath(propertyHandlerObj.readProperties("tab_ShipDebit_CreateUploadClaim"));
			tab_ShipDebit_Agreements = By.xpath(propertyHandlerObj.readProperties("tab_ShipDebit_Agreements"));
			heading_ShipDebit_Results = By.xpath(propertyHandlerObj.readProperties("heading_ShipDebit_Results"));
			ele_ShipDebit_Results_TableElement_1 = By.xpath(propertyHandlerObj.readProperties("ele_ShipDebit_Results_TableElement_1"));
			checkBox_ShipDebit_AllClaims = By.xpath(propertyHandlerObj.readProperties("checkBox_ShipDebit_AllClaims"));
			checkBox_ShipDebit_DebitMemoClaim = By.xpath(propertyHandlerObj.readProperties("checkBox_ShipDebit_DebitMemoClaim"));
			link_ShipDebit_ClearForm = By.xpath(propertyHandlerObj.readProperties("link_ShipDebit_ClearForm"));
			tableHeading_ShipDebit_DebitMemoNo = By.xpath(propertyHandlerObj.readProperties("tableHeading_ShipDebit_DebitMemoNo"));
			tableHeading_ShipDebit_RefId = By.xpath(propertyHandlerObj.readProperties("tableHeading_ShipDebit_RefId"));
			tableHeading_ShipDebit_CreditCurrency = By.xpath(propertyHandlerObj.readProperties("tableHeading_ShipDebit_CreditCurrency"));
			ele_ShipDebit_ProductHeadResult = By.xpath(propertyHandlerObj.readProperties("ele_ShipDebit_ProductHeadResult"));
			
			heading_ShipDebit_Agreement_SearchBy = By.xpath(propertyHandlerObj.readProperties("heading_ShipDebit_Agreement_SearchBy"));
			heading_ShipDebit_Agreement_Results = By.xpath(propertyHandlerObj.readProperties("heading_ShipDebit_Agreement_Results"));
			radiobtn_ShipDebit_Agreement_SearchBy_AllAgreements = By.xpath(propertyHandlerObj.readProperties("radiobtn_ShipDebit_Agreement_SearchBy_AllAgreements"));
			radiobtn_ShipDebit_Agreement_SearchBy_AgreementNumber = By.xpath(propertyHandlerObj.readProperties("radiobtn_ShipDebit_Agreement_SearchBy_AgreementNumber"));
			radiobtn_ShipDebit_Agreement_SearchBy_POSCustomerNumber = By.xpath(propertyHandlerObj.readProperties("radiobtn_ShipDebit_Agreement_SearchBy_POSCustomerNumber"));
			ele_ShipDebit_Agreement_TEAgreementNo_TableElement_1 = By.xpath(propertyHandlerObj.readProperties("ele_ShipDebit_Agreement_TEAgreementNo_TableElement_1"));
			btn_ShipDebit_Agreement_BackToInquiryResults = By.xpath(propertyHandlerObj.readProperties("btn_ShipDebit_Agreement_BackToInquiryResults"));
			
			ele_Heading_AgreementForm_AgreementDetailsResult = By.xpath(propertyHandlerObj.readProperties("ele_Heading_AgreementForm_AgreementDetailsResult"));
			ele_Heading_AgreementForm_AgreementNumber = By.xpath(propertyHandlerObj.readProperties("ele_Heading_AgreementForm_AgreementNumber"));
			ele_Value_AgreementForm_AgreementNumber = By.xpath(propertyHandlerObj.readProperties("ele_Value_AgreementForm_AgreementNumber"));
			link_AgreementForm_DownloadAgreementDetails = By.xpath(propertyHandlerObj.readProperties("link_AgreementForm_DownloadAgreementDetails"));
			btn_agreementForm_ClearFilter = By.xpath(propertyHandlerObj.readProperties("btn_agreementForm_ClearFilter"));
			
			// CREATE & UPLOAD CLAIM
			tb_ShipDebit_ClaimUplaod_CustInvoiceNo = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_CustInvoiceNo"));
			tb_ShipDebit_ClaimUplaod_AgreementeNo = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_AgreementeNo"));
			tb_ShipDebit_ClaimUplaod_DebitMemoNo = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_DebitMemoNo"));
			tb_ShipDebit_ClaimUplaod_EndCustId = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_EndCustId"));
			tb_ShipDebit_ClaimUplaod_EndCustName = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_EndCustName"));
			tb_ShipDebit_ClaimUplaod_TycoPartNo = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_TycoPartNo"));
			tb_ShipDebit_ClaimUplaod_SubmittedPartNo = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_SubmittedPartNo"));
			tb_ShipDebit_ClaimUplaod_DistributorCost = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_DistributorCost"));
			tb_ShipDebit_ClaimUplaod_AgreementCost = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_AgreementCost"));
			tb_ShipDebit_ClaimUplaod_ResaleCost = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_ResaleCost"));
			tb_ShipDebit_ClaimUplaod_ShipedDate = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_ShipedDate"));
			tb_ShipDebit_ClaimUplaod_ShipedQty = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_ShipedQty"));
			tb_ShipDebit_ClaimUplaod_TEInvoiceNo = By.xpath(propertyHandlerObj.readProperties("tb_ShipDebit_ClaimUplaod_TEInvoiceNo"));
			select_ShipDebit_ClaimUplaod_UnitOfMesure = By.xpath(propertyHandlerObj.readProperties("select_ShipDebit_ClaimUplaod_UnitOfMesure"));
			select_ShipDebit_ClaimUplaod_CurrencyCode = By.xpath(propertyHandlerObj.readProperties("select_ShipDebit_ClaimUplaod_CurrencyCode"));
			select_ShipDebit_ClaimUplaod_DistributorRange = By.xpath(propertyHandlerObj.readProperties("select_ShipDebit_ClaimUplaod_DistributorRange"));
			select_ShipDebit_ClaimUplaod_AgreementRange = By.xpath(propertyHandlerObj.readProperties("select_ShipDebit_ClaimUplaod_AgreementRange"));
			select_ShipDebit_ClaimUplaod_ResaleRange = By.xpath(propertyHandlerObj.readProperties("select_ShipDebit_ClaimUplaod_ResaleRange"));
			ele_ShipDebit_ClaimUplaod_PopUp_Successfull = By.xpath(propertyHandlerObj.readProperties("ele_ShipDebit_ClaimUplaod_PopUp_Successfull"));
			btn_ShipDebit_ClaimUplaod_PopUp_Close = By.xpath(propertyHandlerObj.readProperties("btn_ShipDebit_ClaimUplaod_PopUp_Close"));
			btn_ShipDebit_ClaimUpload_CreateClaim = By.xpath(propertyHandlerObj.readProperties("btn_ShipDebit_ClaimUpload_CreateClaim"));
		
			// GPI Elements
			link_PriceAvail_SubmitSpreedsheet = By.xpath(propertyHandlerObj.readProperties("link_PriceAvail_SubmitSpreedsheet"));
			btn_PriceAvail_SubmitSpreedsheet_Browse = By.xpath(propertyHandlerObj.readProperties("btn_PriceAvail_SubmitSpreedsheet_Browse"));
			btn_PriceAvail_SubmitSpreedsheet_Upload = By.xpath(propertyHandlerObj.readProperties("btn_PriceAvail_SubmitSpreedsheet_Upload"));
			tb_PriceAvail_NameThisRequest = By.xpath(propertyHandlerObj.readProperties("tb_PriceAvail_NameThisRequest"));
			ele_PriceAvail_SubmitSpreedsheet_ErrorMsg = By.xpath(propertyHandlerObj.readProperties("ele_PriceAvail_SubmitSpreedsheet_ErrorMsg"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	// CEHCK IF ELEMENT IS ENABLED
	public boolean checkIfElementDisplayed(By elementByObj){
		boolean elementEnabled = false;
		try {

			elementEnabled = webDriver.findElement(elementByObj).isDisplayed();

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
	
	public boolean moveTo_Element(By elementByObj){
		boolean operationFlag = false;
		try {
			action.moveToElement(webDriver.findElement(elementByObj)).build().perform();
			operationFlag = true;

		} catch (Exception e) {
			operationFlag = false;
			//verifyResult = false;
			//e.printStackTrace();
		}
		return operationFlag;
	}
	
	// RETURNS TRUE IF ENABLED
	public boolean check_RadioButton_Enabled(By elementByObj){
		boolean enabled = false;
		try {
			enabled = webDriver.findElement(elementByObj).isSelected();

		} catch (Exception e) {
			enabled = false;
			//verifyResult = false;
			//e.printStackTrace();
		}
		return enabled;
	}

}
*/