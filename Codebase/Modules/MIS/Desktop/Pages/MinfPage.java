package Modules.MIS.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

public class MinfPage {

	// VARS

		// SAF OBJECTS
		public PropertyHandler propertyHandlerObj = null;

		// MIS REGPage PAGE OBJBECTS
		public GlobalFunction globalFunctionObj = null;

		public By login_Link = null;
		public By login_SecondLink = null;
		public By login_UserName = null;
		public By login_Password = null;
		public By login_Button = null;
		public By secureCheckout_Checkout_Btn = null;
		public By popUpCloseBtn = null;
		
		// CTOR
		public MinfPage(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj) {
			this.globalFunctionObj=globalFunctionObj;
			setup(localeChoice);
		}

		// SETUP
		public void setup(String localeChoice) {
			try {
				if (localeChoice != null && localeChoice != "") {

					propertyHandlerObj = globalFunctionObj.getPropertyFile(
							localeChoice, "minf");
					
					initializepageObjects();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void initializepageObjects() {
			try {
				
				
				login_Link = By.xpath(propertyHandlerObj.readProperties("login_Link"));
				login_SecondLink = By.xpath(propertyHandlerObj.readProperties("login_SecondLink"));
				login_UserName = By.xpath(propertyHandlerObj.readProperties("login_UserName"));
				login_Password = By.xpath(propertyHandlerObj.readProperties("login_Password"));
				login_Button = By.xpath(propertyHandlerObj.readProperties("login_Button"));
				
								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
				
		public boolean enterKeywordInSearchBox_PressEnter(String searchKeyword) {
			boolean entered = false;
			try {
				globalFunctionObj.clear_TextBox(login_Link);
				globalFunctionObj.SendOnThisElement(login_Link, searchKeyword);
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
				globalFunctionObj.SendOnThisElement(login_Link, searchKeyword);
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
		
		
		
		

		
		
		
		





}
