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
import FunctionLibrary.PropertyHandler;

//PRODUCT GROUP PAGE - PGP
public class PGP {

	// VARS
	
	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;
	
	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private GlobalFunction globalFunctionObj = null;
	
	// TE HOME PAGE OBJBECTS
	private By viewall_Link = null;
	private By viewall_Pic_Link = null;
	private By products_Tab = null;
	private By category_Link = null;

	private By medicalAndHealthcare_ApplicationsTab=null;
	private By medicalAndHealthcare_Applications_Comfort=null;
	private By medicalAndHealthcare_ConnectWithUs=null;
	private By medicalAndHealthcare_Contact_ConfirmationMessage = null;
	//----------------------------------------------------- GETTER SETTER -----------------------------------------------------

	public By getMedicalAndHealthcare_ApplicationsTab() {
		return medicalAndHealthcare_ApplicationsTab;
	}

	public By getMedicalAndHealthcare_Applications_Comfort() {
		return medicalAndHealthcare_Applications_Comfort;
	}

	public By getMedicalAndHealthcare_ConnectWithUs() {
		return medicalAndHealthcare_ConnectWithUs;
	}
	public By getMedicalAndHealthcare_Contact_ConfirmationMessage() {
		return medicalAndHealthcare_Contact_ConfirmationMessage;
	}
	
	public By getViewall_Link() {
		return viewall_Link;
	}

	public By getViewall_Pic_Link() {
		return viewall_Pic_Link;
	}

	public By getProducts_Tab() {
		return products_Tab;
	}

	public By getCategory_Link() {
		return category_Link;
	}
	//--------------------------------------------------- GETTER SETTER END ---------------------------------------------------


	// CTOR
	public PGP(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}
	
	// SETUP
	private void setup(String localeChoice){
		try {
			if(localeChoice != null && localeChoice != ""){
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "pgp");
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
			
			viewall_Link = By.xpath(propertyHandlerObj.readProperties("viewall_Link"));
			viewall_Pic_Link = By.xpath(propertyHandlerObj.readProperties("viewall_Pic_Link"));
			products_Tab = By.xpath(propertyHandlerObj.readProperties("products_Tab"));
			
			medicalAndHealthcare_ApplicationsTab = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_ApplicationsTab"));
			medicalAndHealthcare_Applications_Comfort = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_Applications_Comfort"));
			medicalAndHealthcare_ConnectWithUs = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_ConnectWithUs"));
			medicalAndHealthcare_Contact_ConfirmationMessage = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_Contact_ConfirmationMessage"));

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
	
	public String getElementText(By elementByObj){
		String elementText = "";
		try {
			if(checkIfElementEnabled(elementByObj)){
				elementText = webDriver.findElement(elementByObj).getText();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elementText;
	}
	
	public String getList(String customXpath){
		String actualSubmenuListData = "";
		try{
		String xpath=customXpath;
		String[] first_xpath=xpath.split("--replace--");
		String pathToCalculateSize=first_xpath[0].substring(0,(first_xpath[0].length()-1));
		System.out.println(pathToCalculateSize);

		List<WebElement> liElements = webDriver.findElements(By.xpath(pathToCalculateSize));

        	for (int i = 1; i < liElements.size()+1; i++) {
           		 WebElement linkElement = webDriver.findElement(By.xpath(first_xpath[0] + i+first_xpath[1]));
           
           		actualSubmenuListData+=linkElement.getText();
        		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return actualSubmenuListData;
	}

} // CLASS END
*/