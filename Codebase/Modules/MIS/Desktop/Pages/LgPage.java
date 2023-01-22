package Modules.MIS.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

public class LgPage {

	// VARS

		// SAF OBJECTS
		public PropertyHandler propertyHandlerObj = null;

		// MIS Login PAGE OBJBECTS
		public GlobalFunction globalFunctionObj = null;
		public By title=null;
		public By login_button=null;
		public By error_message=null;
		// CTOR
		public LgPage(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj) {
			this.globalFunctionObj=globalFunctionObj;
			setup(localeChoice);
		}

		// SETUP
		public void setup(String localeChoice) {
			try {
				if (localeChoice != null && localeChoice != "") {

					propertyHandlerObj = globalFunctionObj.getPropertyFile(
							localeChoice, "lg");
					
					initializepageObjects();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void initializepageObjects() {
			try {
				
				
				title = By.xpath(propertyHandlerObj.readProperties("title"));
				login_button = By.xpath(propertyHandlerObj.readProperties("login_button"));
				error_message= By.xpath(propertyHandlerObj.readProperties("error_message"));
								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
				
		/*
		 * public boolean enterKeywordInSearchBox_PressEnter(String searchKeyword) {
		 * boolean entered = false; try { globalFunctionObj.clear_TextBox(login_Link);
		 * globalFunctionObj.SendOnThisElement(login_Link, searchKeyword);
		 * globalFunctionObj.pause(3000); globalFunctionObj.operation_KeyPress_ENTER();
		 * globalFunctionObj.pause(5000); //action.sendKeys(Keys.ENTER);
		 * //action.perform(); entered = true;
		 * 
		 * } catch (Exception e) { entered = false; e.printStackTrace(); // SET ERROR
		 * MESSAGE IN GLOBAL VAR } return entered; }
		 */
		/*
		 * public void enterKeywordInSearchBox_TypeAhead(String searchKeyword) { try {
		 * globalFunctionObj.SendOnThisElement(login_Link, searchKeyword);
		 * globalFunctionObj.pause_Long(); //
		 * webDriver.findElement(searchBox).sendKeys(searchKeyword);
		 * globalFunctionObj.operation_KeyPress_SPACE(); globalFunctionObj.pause_Long();
		 * //action.sendKeys(Keys.SPACE); //action.perform(); } catch (Exception e) {
		 * e.printStackTrace(); } }
		 */
		
		
		

		
		
		
		





}
