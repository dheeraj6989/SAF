package Modules.MIS.Desktop.Pages;
/*package Modules.TE.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

// PRODUCT NAVIGATION PAGE - PNP
public class PNP {

	// SAF OBJECTS
	private PropertyHandler propertyHandlerObj = null;
	
	// SELENIUM OBJECTS
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;;
	private Actions action = null;
	private GlobalFunction globalFunctionObj = null;
	
	//TE PNP OBJECTS
	private By viewAll_PictureLink = null;
	private By viewAll_SimpleLink = null;
	
	private By tabNavigaion_Products = null;
	private By prodCategory_AutomotiveTruckBusOffRoad = null;
	private By tabNavigaion_Overview = null;
	
	private By subNavigation = null;
	
	
	//GETTERS----
	public By getViewAll_PictureLink() {
		return viewAll_PictureLink;
	}

	public By getViewAll_SimpleLink() {
		return viewAll_SimpleLink;
	}

	public By getTabNavigaion_Products() {
		return tabNavigaion_Products;
	}

	public By getProdCategory_AutomotiveTruckBusOffRoad() {
		return prodCategory_AutomotiveTruckBusOffRoad;
	}
	
	public By getTabNavigaion_Overview() {
		return tabNavigaion_Overview;
	}
	public By getsubNavigation(){
		return subNavigation;
	}
//---------------------------GETTER END----------------------------------
	// CTOR
	public PNP(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.webDriver = webDriver;
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}
	
	// SETUP
	private void setup(String localeChoice){
		try {
			
			if(localeChoice != null && localeChoice != ""){
				
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "pnp");
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

			viewAll_PictureLink = By.xpath(propertyHandlerObj.readProperties("viewAll_PictureLink"));
			viewAll_SimpleLink = By.xpath(propertyHandlerObj.readProperties("viewAll_SimpleLink"));
			//prodCategory_AutomotiveTruckBusOffRoad = By.xpath(propertyHandlerObj.readProperties("prodCategory_AutomotiveTruckBusOffRoad"));
			tabNavigaion_Products = By.xpath(propertyHandlerObj.readProperties("tabNavigaion_Products"));
			tabNavigaion_Overview = By.xpath(propertyHandlerObj.readProperties("tabNavigaion_Overview"));
			
			subNavigation= By.xpath(propertyHandlerObj.readProperties("subNavigation"));
			
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
	
}
*/