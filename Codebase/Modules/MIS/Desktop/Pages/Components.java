package Modules.MIS.Desktop.Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.thoughtworks.selenium.webdriven.commands.Click;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.GlobalVariable;
import Modules.MIS.Desktop.Pages.*;

public class Components {

	private WebDriver webDriver = null;
	private GlobalFunction globalFunction = null;
	private Page page = null;
	
	public Components(Page page){
		
		this.webDriver = page.getWebDriver();
		this.globalFunction = page.getGlobalFunction();
		this.page = page;
	}
	
	public void close_DCT_LIVECHAT_POPUP(){
		try {
			globalFunction.pause_Long();
			globalFunction.clickOnThisElement(page.pdp.Chat_Close_Btn);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public boolean perform_Login(String username, String password, boolean check_RememberMe) throws Exception {
		boolean operationFlag = false;
		globalFunction.clickOnThisElement(page.homePage.login_Link);
		globalFunction.pause_Short();
		// OLDER VERSION HAD 2nd LOGIN LINK IN DROP DOWN
		// globalFunction.clickOnThisElement(page.homePage.login_SecondLink);
		// globalFunction.pause_Long();
		globalFunction.SendOnThisElement(page.homePage.login_UserName, username);
		globalFunction.SendOnThisElement(page.homePage.login_Password, password);
		if(check_RememberMe){
			// globalFunction.clickOnThisElement(page.homePage.login_Button);
		}
		globalFunction.clickOnThisElement(page.homePage.login_Button);
		operationFlag = true;
		return operationFlag;
	}

	public boolean perform_AddNew_Address_Checkout(String FN, String LN, String phNO, String CMPNY, String ADDRESS, String CITY
			, String STATE, String ZIP, String Address1){
		boolean operationFlag = false;
		try {
			
			// CLICK ADD ADDRES
			globalFunction.clickOnThisElement(page.pdp.checkout_ShipInfo_NewAddress_Link);
			globalFunction.pause(10000);
			
			// DETAIL
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_FName_Tb, FN);
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_LName_Tb, FN);
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_PhNo_Tb, phNO);
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_CmpName_Tb, CMPNY);
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_Address_Tb, ADDRESS);
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_Address_Tb1, Address1);
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_City_Tb, CITY);
			
			globalFunction.selectElement_ByVisibleText(page.pdp.checkout_AddNewAddress_State_Select, STATE);
			globalFunction.SendOnThisElement(page.pdp.checkout_AddNewAddress_ZIP_Tb, ZIP);
			globalFunction.clickOnThisElement(page.pdp.checkout_AddNewAddress_AddNewAddress_Btn);
			globalFunction.pause(10000);
			
			operationFlag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return operationFlag;
	}
	
	public boolean perform_AddNew_Payment_Checkout(String CRD_NAME, String CRD_NO, String CRD_TYPE, String P_MNTH
			, String P_YEAR, String CVV){
		try {
			
			String payment_Link = "//div[@class='dummy-payment']/descendant::a[contains(.,'New Payment Method')]";
			
			// globalFunction.scroll_Vertical(50);
			// CLICK PAYMTN
			globalFunction.clickOnThisElement(By.xpath(payment_Link));
			globalFunction.pause(7000);
			globalFunction.switchTo_DefaultContent();
						
			try {
				// OLD UI HAD A FRAME
				// globalFunction.switchTo_Frame(page.pdp.checkout_PayInfo_iFrame);
				// CARD NAME
				globalFunction.SendOnThisElement(page.pdp.checkout_PayInfo_NameOnCard_Tb, CRD_NAME);
				// TYPE
				globalFunction.selectElement_ByVisibleText(page.pdp.checkout_PayInfo_CardType_Select, CRD_TYPE);
				// NO
				globalFunction.SendOnThisElement_CLEAR_DATA(page.pdp.checkout_PayInfo_CardNo_Tb, CRD_NO);
				// MONTH
				globalFunction.selectElement_ByVisibleText(page.pdp.checkout_PayInfo_ExpDate_Month_Select, P_MNTH);
				// YEAR
				globalFunction.selectElement_ByVisibleText(page.pdp.checkout_PayInfo_ExpDate_Year_Select, P_YEAR);
				
				// globalFunction.scroll_Vertical(50);
				// globalFunction.moveTo_Element(page.pdp.checkout_PayInfo_CVV_Tb);
				// globalFunction.moveTo_Element(page.pdp.checkout_PayInfo_CVV_Tb);
				globalFunction.SendOnThisElement(page.pdp.checkout_PayInfo_CVV_Tb, CVV);
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			globalFunction.switchTo_DefaultContent();
			globalFunction.switchTo_DefaultWindow();
			globalFunction.pause(3000);
			
			// globalFunction.scroll_Vertical(20);
			
			// CHECKBOX
			globalFunction.moveTo_Element(page.pdp.checkout_PayInfo_BillingType_Cb);
			globalFunction.clickOnThisElement(page.pdp.checkout_PayInfo_BillingType_Cb);

			// BUTTON
			globalFunction.moveTo_Element(page.pdp.checkout_AddPayment_Btn);
			globalFunction.clickOnThisElement(page.pdp.checkout_AddPayment_Btn);
			globalFunction.pause(10000);
			
			globalFunction.switchTo_DefaultWindow();
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
			
		}
	} // PAYMENT
	
	public String get_Updated_ProductQty_DIST_INVENTORY(){
		String updated_ProdQty = "2";
		int updated_ProdQtyInt = 2;
		try {
			updated_ProdQty = globalFunction.getTextBox_Value(page.pdp.DistInventory_CartQty_Tb);
			if(updated_ProdQty != "" && updated_ProdQty != null){
				updated_ProdQtyInt = Integer.parseInt(updated_ProdQty.trim());
				updated_ProdQtyInt += 1;
				updated_ProdQty = Integer.toString(updated_ProdQtyInt);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return updated_ProdQty;
	}

	public void open_Mail(String email_address){
		try {
			globalFunction.pause(5000);
			globalFunction.SendOnThisElement(page.pdp.openEmailAccount, email_address);
			globalFunction.pause(5000);
			globalFunction.clickOnThisElement(page.pdp.goBtn);
			globalFunction.pause(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void navigate_Open_Mail(String email_address){
		globalFunction.open_URL(GlobalVariable.mailinator_URL);
		open_Mail(email_address);
	}
	
	public void check_Mail_EndToEnd(String email_address){
		try {
			navigate_Open_Mail(email_address);
			check_Mail_Content();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void check_Mail_Content(){
		boolean operationFlag = false;
		try {
			globalFunction.pause(5000);
			
			operationFlag = globalFunction.checkIfElement_Displayed(page.pdp.mailtitle);
			if(operationFlag){
				// CLICK ON TE MAIL
				globalFunction.clickOnThisElement(page.pdp.mailtitle);
				globalFunction.pause(5000);
				globalFunction.switchTo_Frame(page.pdp.mailbodyFrame);
				globalFunction.scroll_Vertical(600);

				// CLICK ON VIEW ORDER DETAILS
				globalFunction.clickOnThisElement(page.pdp.mailinator_ViewOrderDetails);
				globalFunction.pause(5000);
				globalFunction.switchTo_Window();
				globalFunction.close_NewOpenWindow();

				globalFunction.switchTo_DefaultWindow();
				globalFunction.pause(5000);
				globalFunction.switchTo_Frame(page.pdp.mailbodyFrame);
				//	globalFunction.scroll_Vertical(500);
				globalFunction.clickOnThisElement(page.pdp.connectWithUs);

				globalFunction.pause(5000);
				globalFunction.switchTo_Window();
				globalFunction.close_NewOpenWindow();

				globalFunction.switchTo_DefaultWindow();
				globalFunction.pause(5000);
				globalFunction.pause(5000);
				globalFunction.switchTo_Frame(page.pdp.mailbodyFrame);
				globalFunction.scroll_Vertical(1400);
				globalFunction.pause(5000);
				globalFunction.clickOnThisElement(page.pdp.shopatTeStore);
				globalFunction.pause(5000);
				globalFunction.close_NewOpenWindow();

				globalFunction.switchTo_DefaultWindow();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int get_TE_STOCK_ProdQTY(){
		int te_stock_prod_qty = 0;
		String te_stock_prod_qty_str = "0";
		try {
			te_stock_prod_qty_str = globalFunction.cleanString_Simple(globalFunction.getTextForThisElement(page.pdp.priceArea_StockQty_Ele));
			if(te_stock_prod_qty_str != "" && te_stock_prod_qty_str != null){
				te_stock_prod_qty = Integer.parseInt(te_stock_prod_qty_str);
			}
		} catch (Exception e) {
			System.out.println("ERROR :: get_TE_STOCK_ProdQTY :: " + e.getMessage());
		}
		return te_stock_prod_qty;
	}
	
	private int get_FinalQTY(int STOCK, int MOQ){
		int final_qty_int = 1;
		/*if STOCK > MOQ
		then QTY = QTY + 1
		
		if STOCK >= MOQ
		then QTY = QTY
		
		if STOCK == 0
		then DO NO ADD TO CART*/
		
		if(STOCK > MOQ){
			final_qty_int += 1;
		} else if(STOCK >= MOQ){
			// final_qty_int = QTY
		} else {
			final_qty_int = 0;
		}
		return final_qty_int;
	}
	
	// BREAKCRUMS HEADER
	public String getQTY_stock_BC_HEADER(){
		int stock_int = 1;
		int final_qty_int = 1;
		
		String stock_str = "1";
		String final_qty_str = "1";
		
		try {
			// GET STOCK
			stock_int = get_TE_STOCK_ProdQTY();
			
			// GET QTY
			final_qty_str = globalFunction.cleanString_Simple(globalFunction.getTextBox_Value(page.pdp.prodQty_bcHeader));
			if(final_qty_str != "" && final_qty_str != null)
				final_qty_int = Integer.parseInt(final_qty_str);
			
			if(stock_int > 1)
				final_qty_int += 1;

		} catch (Exception e) {
			System.out.println("ERROR :: getQTY_stock_moq_PRICE_BREAK :: " + e.getMessage());
		} finally {
			final_qty_str = Integer.toString(final_qty_int);
		}
		System.out.println("---->> getQTY_stock_BC_HEADER :: stock_int :: " + stock_int);
		System.out.println("---->> getQTY_stock_BC_HEADER :: final_qty_str :: " + final_qty_str);
		return final_qty_str;
	} // FUNC END
	
	public String getQTY_stock_moq_DIST_INVENTORY(){
		int stock_int = 1;
		int moq_int = 1;
		int final_qty_int = 1;
		
		String stock_str = "1";
		String moq_str = "1";
		String final_qty_str = "1";
		
		try {
			// GET QTY
			final_qty_str = globalFunction.cleanString_Simple(globalFunction.getTextBox_Value(page.pdp.DistInventory_CartQty_Tb));
			if(final_qty_str != "" && final_qty_str != null){
				final_qty_int = Integer.parseInt(final_qty_str);
			}
			// GET STOCK
			stock_str = globalFunction.cleanString_Simple(globalFunction.getTextBox_Value(page.pdp.distInfo_ProdInfo_Stock));
			if(stock_str != "" && stock_str != null){
				stock_int = Integer.parseInt(stock_str);
			}
			// GET MOQ
			moq_str = globalFunction.cleanString_Simple(globalFunction.getTextBox_Value(page.pdp.distInfo_ProdInfo_MOQ));
			if(moq_str != "" && moq_str != null){
				moq_int = Integer.parseInt(moq_str);
			}
			final_qty_int = get_FinalQTY(stock_int, moq_int);
			
		} catch (Exception e) {
			System.out.println("ERROR :: getQTY_stock_moq_DIST_INVENTORY :: " + e.getMessage());
		} finally {
			final_qty_str = Integer.toString(final_qty_int);
		}
		System.out.println("---->> getQTY_stock_moq_DIST_INVENTORY :: stock_int :: " + stock_int);
		System.out.println("---->> getQTY_stock_moq_DIST_INVENTORY :: final_qty_str :: " + final_qty_str);
		return final_qty_str;
	} // FUNC END
	
	
	public String getQTY_stock_moq_PRICE_BREAK(){
		int stock_int = 1;
		int moq_int = 1;
		int final_qty_int = 1;
		
		String stock_str = "1";
		String moq_str = "1";
		String final_qty_str = "1";
		
		try {
			// GET QTY
			final_qty_str = globalFunction.cleanString_Simple(globalFunction.getTextBox_Value(page.pdp.prodQty_priceBreak));
			if(final_qty_str != "" && final_qty_str != null){
				final_qty_int = Integer.parseInt(final_qty_str);
			}
			// GET STOCK
			stock_str = globalFunction.cleanString_Simple(globalFunction.getTextBox_Value(page.pdp.priceBreak_ProdInfo_Stock));
			if(stock_str != "" && stock_str != null){
				stock_int = Integer.parseInt(stock_str);
			}
			// GET MOQ
			moq_str = globalFunction.cleanString_Simple(globalFunction.getTextBox_Value(page.pdp.priceBreak_ProdInfo_MOQ));
			if(moq_str != "" && moq_str != null){
				moq_int = Integer.parseInt(moq_str);
			}
			final_qty_int = get_FinalQTY(stock_int, moq_int);
			
		} catch (Exception e) {
			System.out.println("ERROR :: getQTY_stock_moq_PRICE_BREAK :: " + e.getMessage());
		} finally{
			final_qty_str = Integer.toString(final_qty_int);
		}
		System.out.println("---->> getQTY_stock_moq_PRICE_BREAK :: stock_int :: " + stock_int);
		System.out.println("---->> getQTY_stock_moq_PRICE_BREAK :: final_qty_str :: " + final_qty_str);
		return final_qty_str;
	} // FUNC END
	
	
	public boolean click_OnAllFacets(String xPath) {
		try {
			String xpath = xPath;
			String[] first_xpath = xpath.split("--replace--");
			String pathToCalculateSize = first_xpath[0].substring(0,
					(first_xpath[0].length() - 1));
			System.out.println(pathToCalculateSize);

			List<WebElement> liElements = globalFunction.get_WebDriver().findElements(By
					.xpath(pathToCalculateSize));

			for (int i = 1; i < liElements.size() + 1; i++) {
				WebElement linkElement = globalFunction.get_WebDriver().findElement(By
						.xpath(first_xpath[0] + i + first_xpath[1]));
				linkElement.click();
				globalFunction.pause(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
} // CLASS END
