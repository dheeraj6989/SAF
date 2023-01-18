package Modules.MIS.Desktop.Pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	public PropertyHandler propertyHandlerObj = null;

	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;

	public By heading_OrderStatus = null;
	public By heading_Reporting = null;
	public By heading_AccountInfo = null;
	public By heading_SearhcBy = null;
	public By checkBox_AllContent = null;
	public By checkBox_TEOrderNo = null;
	public By checkBox_PurchaseOrder = null;
	public By checkBox_TEPartNo = null;
	public By checkBox_CustomerPartNo = null;
	public By checkBox_InvoiceNo = null;
	public By checkBox_ShipmentNo = null;

	// MIN ELEMENTS
	public By heading_Results = null;
	public By msg_DidYouKnow_CloseBtn = null;
	public By link_OrderOnlineSample = null;
	public By link_QuickReferenceGuide = null;
	public By link_GenerateOpenOrder = null;
	public By link_GenerateShipmentReport = null;
	public By link_ManageMyDownloads = null;
	public By table_Results = null;
	public By checkbox_ReportTypeFormat_PopUp_XLS = null;
	public By btn_ReportTypeFormat_PopUp_Submit = null;
	public By msg_ReportTypeFormat_PopUp_Success = null;
	public By btn_ReportTypeFormat_PopUp_Close = null;
	public By ele_MyDownlaod_TableElement_1 = null;
	public By btn_ConfirmRemove_PopUp_MyDownlaod = null;
	public By msg_MyDownload_Table_NoJobs = null;
	public By textbox_AccountSearch = null;

	// ISD ELEMENTS
	public By tab_ShipDebit_ClaimStatus = null;
	public By tab_ShipDebit_CreateUploadClaim = null;
	public By tab_ShipDebit_Agreements = null;
	public By heading_ShipDebit_Results = null;
	public By ele_ShipDebit_Results_TableElement_1 = null;
	public By checkBox_ShipDebit_AllClaims = null;
	public By checkBox_ShipDebit_DebitMemoClaim = null;
	public By link_ShipDebit_ClearForm = null;
	public By tableHeading_ShipDebit_DebitMemoNo = null;
	public By tableHeading_ShipDebit_RefId = null;
	public By tableHeading_ShipDebit_CreditCurrency = null;
	public By ele_ShipDebit_ProductHeadResult = null;
	
	public By heading_ShipDebit_Agreement_SearchBy = null;
	public By heading_ShipDebit_Agreement_Results = null;
	public By radiobtn_ShipDebit_Agreement_SearchBy_AllAgreements = null;
	public By radiobtn_ShipDebit_Agreement_SearchBy_AgreementNumber = null;
	public By radiobtn_ShipDebit_Agreement_SearchBy_POSCustomerNumber = null;
	public By ele_ShipDebit_Agreement_TEAgreementNo_TableElement_1 = null;
	public By btn_ShipDebit_Agreement_BackToInquiryResults = null;
	
	public By ele_Heading_AgreementForm_AgreementDetailsResult = null;
	public By ele_Heading_AgreementForm_AgreementNumber = null;
	public By ele_Value_AgreementForm_AgreementNumber = null;
	public By link_AgreementForm_DownloadAgreementDetails = null;
	public By btn_agreementForm_ClearFilter = null;

	// CREATE & UPLOAD CLAIM
	public By tb_ShipDebit_ClaimUplaod_CustInvoiceNo = null;
	public By tb_ShipDebit_ClaimUplaod_AgreementeNo = null;
	public By tb_ShipDebit_ClaimUplaod_DebitMemoNo = null;
	public By tb_ShipDebit_ClaimUplaod_EndCustId = null;
	public By tb_ShipDebit_ClaimUplaod_EndCustName = null;
	public By tb_ShipDebit_ClaimUplaod_TycoPartNo = null;
	public By tb_ShipDebit_ClaimUplaod_SubmittedPartNo = null;
	public By tb_ShipDebit_ClaimUplaod_DistributorCost = null;
	public By tb_ShipDebit_ClaimUplaod_AgreementCost = null;
	public By tb_ShipDebit_ClaimUplaod_ResaleCost = null;
	public By tb_ShipDebit_ClaimUplaod_ShipedDate = null;
	public By tb_ShipDebit_ClaimUplaod_ShipedQty = null;
	public By tb_ShipDebit_ClaimUplaod_TEInvoiceNo = null;
	public By select_ShipDebit_ClaimUplaod_UnitOfMesure = null;
	public By select_ShipDebit_ClaimUplaod_CurrencyCode = null;
	public By select_ShipDebit_ClaimUplaod_DistributorRange = null;
	public By select_ShipDebit_ClaimUplaod_AgreementRange = null;
	public By select_ShipDebit_ClaimUplaod_ResaleRange = null;
	public By ele_ShipDebit_ClaimUplaod_PopUp_Successfull = null;
	public By btn_ShipDebit_ClaimUplaod_PopUp_Close = null;
	public By btn_ShipDebit_ClaimUpload_CreateClaim = null;
	
	public By link_PriceAvail_SubmitSpreedsheet = null;
	public By btn_PriceAvail_SubmitSpreedsheet_Browse = null;
	public By btn_PriceAvail_SubmitSpreedsheet_Upload = null;
	public By tb_PriceAvail_NameThisRequest  = null;
	public By ele_PriceAvail_SubmitSpreedsheet_ErrorMsg = null;

	public By requestForQuoteLink=null;
	public By radioBtn_QuoteNumber=null;
	public By input_Textbox=null;
	public By radioBtn_CostumerpartNumber=null;
	public By radioBtn_TEPartNumber=null;
	public By radioBtn_Inprocess=null;
	public By radionBtn_QTEStandardRequest=null;
	public By btn_Search=null;
	public By span_RequestToQuote=null;
	public By button_Continue=null;
	public By collapse_Requester=null;
	public By input_RequesterPhone=null;
	public By input_TePartNumber=null;
	public By button_Next=null;
	public By partAddedHeader=null;
	public By finalNextButton=null;
	public By okPOPUp=null;
	public By uploadSpreadSheet=null;
	public By input_SpreadSheetBrowseBtn=null;
	public By attachmentLink=null;
	public By browserBtn_AttachmentLink=null;
	public By uploadButton=null;
	public By input_partnumber2=null;
	public By input_partnumber3=null;
	public By input_partnumber4=null;
	public By addmorePartNumberButton=null;
	public By select_DropDown_TEPArtNUmber =null;
	public By submitBtn_Attachment=null;
	public By done_Btn=null;

	
	public By link_FastOrderEntry= null;
	public By textFiled_MultipleAddress=null;
	public By header_ShipToAddress=null;
	public By select_OrderId=null;
	public By input_OrderDate=null;
	public By input_PO_Number=null;
	public By header_request_Date=null;
	public By header_request_Quantity=null;
	public By dropdown_OrderType=null;
	public By img_close=null;
	public By popup_Remove_par_Numb_er=null;
	
	
	public By input_ReqDate_1=null;
	public By input_Po_Number1=null;
	public By input_part_Number_1=null;
	public By input_Quaintity_1=null;
	public By btn_VerifyOrder=null;
	public By close_popUp= null;
	
	
	

	//---------------------------GETTER END----------------------------------
	// CTOR
	public SelfServicePage(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}

	// SETUP
	public void setup(String localeChoice){
		try {

			if(localeChoice != null && localeChoice != ""){

				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "selfservice");
				initializepageObjects();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initializepageObjects(){
		try {

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
			requestForQuoteLink= By.xpath(propertyHandlerObj.readProperties("requestForQuoteLink"));
			radioBtn_QuoteNumber= By.xpath(propertyHandlerObj.readProperties("radioBtn_QuoteNumber"));
					input_Textbox= By.xpath(propertyHandlerObj.readProperties("input_Textbox"));
					radioBtn_CostumerpartNumber= By.xpath(propertyHandlerObj.readProperties("radioBtn_CostumerpartNumber"));
					radioBtn_TEPartNumber= By.xpath(propertyHandlerObj.readProperties("radioBtn_TEPartNumber"));
					radioBtn_Inprocess= By.xpath(propertyHandlerObj.readProperties("radioBtn_Inprocess"));
					radionBtn_QTEStandardRequest= By.xpath(propertyHandlerObj.readProperties("radionBtn_QTEStandardRequest"));
					btn_Search= By.xpath(propertyHandlerObj.readProperties("btn_Search"));
					span_RequestToQuote= By.xpath(propertyHandlerObj.readProperties("span_RequestToQuote"));
					button_Continue= By.xpath(propertyHandlerObj.readProperties("button_Continue"));
					collapse_Requester= By.xpath(propertyHandlerObj.readProperties("collapse_Requester"));
					input_RequesterPhone= By.xpath(propertyHandlerObj.readProperties("input_RequesterPhone"));
					input_TePartNumber= By.xpath(propertyHandlerObj.readProperties("input_TePartNumber"));
					button_Next= By.xpath(propertyHandlerObj.readProperties("button_Next"));
					partAddedHeader= By.xpath(propertyHandlerObj.readProperties("partAddedHeader"));
					finalNextButton= By.xpath(propertyHandlerObj.readProperties("finalNextButton"));
					okPOPUp= By.xpath(propertyHandlerObj.readProperties("okPOPUp"));
					uploadSpreadSheet= By.xpath(propertyHandlerObj.readProperties("uploadSpreadSheet"));
					 input_SpreadSheetBrowseBtn= By.xpath(propertyHandlerObj.readProperties("input_SpreadSheetBrowseBtn"));
					uploadButton= By.xpath(propertyHandlerObj.readProperties("uploadButton"));
					 input_partnumber2= By.xpath(propertyHandlerObj.readProperties("input_partnumber2"));
					 input_partnumber3= By.xpath(propertyHandlerObj.readProperties("input_partnumber3"));
					input_partnumber4= By.xpath(propertyHandlerObj.readProperties("input_partnumber4"));
					addmorePartNumberButton= By.xpath(propertyHandlerObj.readProperties("addmorePartNumberButton"));
					select_DropDown_TEPArtNUmber= By.xpath(propertyHandlerObj.readProperties("select_DropDown_TEPArtNUmber"));
					attachmentLink= By.xpath(propertyHandlerObj.readProperties("attachmentLink"));
					browserBtn_AttachmentLink= By.xpath(propertyHandlerObj.readProperties("browserBtn_AttachmentLink"));
					submitBtn_Attachment=By.xpath(propertyHandlerObj.readProperties("submitBtn_Attachment"));
					done_Btn=By.xpath(propertyHandlerObj.readProperties("done_Btn"));
					
	///FOE Profiles
					link_FastOrderEntry= By.xpath(propertyHandlerObj.readProperties("link_FastOrderEntry"));
					textFiled_MultipleAddress= By.xpath(propertyHandlerObj.readProperties("textFiled_MultipleAddress"));
					header_ShipToAddress= By.xpath(propertyHandlerObj.readProperties("header_ShipToAddress"));
					select_OrderId= By.xpath(propertyHandlerObj.readProperties("select_OrderId"));
					input_OrderDate= By.xpath(propertyHandlerObj.readProperties("input_OrderDate"));
					input_PO_Number= By.xpath(propertyHandlerObj.readProperties("input_PO_Number"));
					header_request_Date= By.xpath(propertyHandlerObj.readProperties("header_request_Date"));
					header_request_Quantity= By.xpath(propertyHandlerObj.readProperties("header_request_Quantity"));
					dropdown_OrderType= By.xpath(propertyHandlerObj.readProperties("dropdown_OrderType"));
					input_ReqDate_1=By.xpath(propertyHandlerObj.readProperties("input_ReqDate_1"));
					input_Po_Number1=By.xpath(propertyHandlerObj.readProperties("input_Po_Number1"));
					input_part_Number_1=By.xpath(propertyHandlerObj.readProperties("input_part_Number_1"));
					input_Quaintity_1=By.xpath(propertyHandlerObj.readProperties("input_Quaintity_1"));
					btn_VerifyOrder=By.xpath(propertyHandlerObj.readProperties("btn_VerifyOrder"));
					img_close=By.xpath(propertyHandlerObj.readProperties("img_close"));
							popup_Remove_par_Numb_er=By.xpath(propertyHandlerObj.readProperties("popup_Remove_par_Numb_er"));
							close_popUp=By.xpath(propertyHandlerObj.readProperties("close_popUp"));		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getCurrentDate(){
		
//		String currentDate="";
		
		
		 LocalDate localDate = LocalDate.now();
	        System.out.println(DateTimeFormatter.ofPattern("yyy-MM-dd").format(localDate)); //2016/11/16 12:08:43
		String testdata=localDate.toString();
		return testdata;
	}
}
