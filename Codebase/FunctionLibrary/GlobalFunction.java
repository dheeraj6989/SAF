package FunctionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Modules.MIS.Desktop.Base.BaseTest;
import Modules.MIS.Desktop.Base.ExtentManager;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GlobalFunction {
	
	private  GlobalFunction globalFunction = null;
	private final String propertyFileName = "global";
	private int webDriverWait = 0;
	public int shortThinkTime;
	public int longThinkTime;
	private int execution_Environment_Flag = 0;
	public static String envoirment= null;
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;
	private PropertyHandler propertyHandlerObj = null;
	private JavascriptExecutor jse = null;
	private Actions action = null;
	private Alert alert = null;
	private ScreenshotUtility screenShotUtil = null;

	Set<String> winHandles;
	Iterator<String> iterHandles;
	String parentWinHandle = "";
	String childWinHandle = "";

	private static String prefix_int = "int";
	private static String prefix_prod = "prod";
	private static String prefix_qa= "qa";

	private static String suffix_en= "en";
	private static String suffix_sp= "sp";
	private static String suffix_po= "po";
	

	private static String seperator = "_";
	private static String string_appURL = "appURL";
	private static String string_execution_Environment_Flag = "execution_Environment_Flag";

	public Keys key_CTRL = Keys.CONTROL;
	public Keys key_ALT = Keys.ALT;
	public Keys key_DEL = Keys.DELETE;
	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;

	public GlobalFunction(){
		setup();
		
	}
	
	

	private void setup(){
		propertyHandlerObj = new PropertyHandler();
		propertyHandlerObj.setFileName(propertyFileName);
		execution_Environment_Flag = Integer.parseInt(propertyHandlerObj.readProperties(string_execution_Environment_Flag));
		webDriverWait = Integer.parseInt(propertyHandlerObj.readProperties("webDriverWait"));
		shortThinkTime = Integer.parseInt(propertyHandlerObj.readProperties("shortThinkTime"));
		longThinkTime = Integer.parseInt(propertyHandlerObj.readProperties("longThinkTime"));
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public WebDriver get_WebDriver(){
		return webDriver;
	}

	public PropertyHandler getPropertyFile(String localeChoice, String pageName){
		PropertyHandler propertyHandlerObj = null;
		try {
			
			propertyHandlerObj = new PropertyHandler();
			
			// GLOBAL
			if(localeChoice.equalsIgnoreCase("global") || pageName.equalsIgnoreCase("global")){
				propertyHandlerObj.setFileName(GlobalVariable.getGlobalsetuppropertyfile());
			}
			
				
			// ENGLISH LOCALE
			else if(localeChoice.equalsIgnoreCase("en")){
				if(pageName.equalsIgnoreCase("reg")){
					propertyHandlerObj.setFileName(GlobalVariable.getRegpagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("lg")){
					propertyHandlerObj.setFileName(GlobalVariable.getLgpagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("mfa")){
					propertyHandlerObj.setFileName(GlobalVariable.getmfapagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("minf")){
					propertyHandlerObj.setFileName(GlobalVariable.getminfpagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("psw")){
					propertyHandlerObj.setFileName(GlobalVariable.getpswpagepropertyfileEn());
				} 
				
			} 

			// GERMAN LOCALE
			else if(localeChoice.equalsIgnoreCase("sp")){
				if(pageName.equalsIgnoreCase("reg")){
					propertyHandlerObj.setFileName(GlobalVariable.getRegpagepropertyfileSp());
				} else if(pageName.equalsIgnoreCase("lg")){
					propertyHandlerObj.setFileName(GlobalVariable.getLgpagepropertyfileSp());
				} else if(pageName.equalsIgnoreCase("mfa")){
					propertyHandlerObj.setFileName(GlobalVariable.getmfapagepropertyfileSp());
				} else if(pageName.equalsIgnoreCase("minf")){
					propertyHandlerObj.setFileName(GlobalVariable.getminfpagepropertyfileSp());
				} else if(pageName.equalsIgnoreCase("psw")){
					propertyHandlerObj.setFileName(GlobalVariable.getpswpagepropertyfileSp());
				} 
				
			}
			
			// CHINESE LOCALE
			else if(localeChoice.equalsIgnoreCase("po")){
				if(pageName.equalsIgnoreCase("reg")){
					propertyHandlerObj.setFileName(GlobalVariable.getRegpagepropertyfilePo());
				} else if(pageName.equalsIgnoreCase("lg")){
					propertyHandlerObj.setFileName(GlobalVariable.getLgpagepropertyfilePo());
				} else if(pageName.equalsIgnoreCase("mfa")){
					propertyHandlerObj.setFileName(GlobalVariable.getmfapagepropertyfilePo());
				} else if(pageName.equalsIgnoreCase("minf")){
					propertyHandlerObj.setFileName(GlobalVariable.getminfpagepropertyfilePo());
				} else if(pageName.equalsIgnoreCase("psw")){
					propertyHandlerObj.setFileName(GlobalVariable.getpswpagepropertyfilePo());
				} 

			}
		
			
			
		}
			
		 catch (Exception e) {
			e.printStackTrace();
		}
		return propertyHandlerObj;
	}
	
	
	
	
	// SELET URL ACCRODING TO LOCALE AND EXECUTION ENVIRONMTN
		public String getURL_For_LocaleChoice(String localeChoice){
			String property_appURL = "";
			try {
				if(localeChoice != null){				
					if(execution_Environment_Flag == 1){		// PROD
						property_appURL = prefix_prod + seperator + string_appURL + seperator;
						if(localeChoice.equalsIgnoreCase(suffix_en)){
							property_appURL += suffix_en;
						} else if(localeChoice.equalsIgnoreCase(suffix_sp)){
							property_appURL += suffix_sp;
						} else if(localeChoice.equalsIgnoreCase(suffix_po)){
							property_appURL += suffix_po;
						} 
						} 
					else if(execution_Environment_Flag == 2){	// Int
						property_appURL = prefix_int + seperator + string_appURL + seperator;
						if(localeChoice.equalsIgnoreCase(suffix_en)){
							property_appURL += suffix_en;
						} else if(localeChoice.equalsIgnoreCase(suffix_sp)){
							property_appURL += suffix_sp;
						} else if(localeChoice.equalsIgnoreCase(suffix_po)){
							property_appURL += suffix_po;
						} 
					} else if(execution_Environment_Flag == 3){	// QA
						property_appURL = prefix_qa + seperator + string_appURL + seperator;
						System.out.println("flag"+property_appURL);
						if(localeChoice.equalsIgnoreCase(suffix_en)){
							property_appURL += suffix_en;
						} else if(localeChoice.equalsIgnoreCase(suffix_sp)){
							property_appURL += suffix_sp;
						} else if(localeChoice.equalsIgnoreCase(suffix_po)){
							property_appURL += suffix_po;
						} 
					}
					
					property_appURL = propertyHandlerObj.readProperties(property_appURL);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return property_appURL;
		}

		public String get_TestDataPath(){
			String folderPath = "";
			String testDataPath = "";
			String testDataPath_ENV = "";
			try {
				//folderPath = propertyHandlerObj.readProperties("safRootPath");
				folderPath = System.getProperty("user.dir");
				   System.out.println("Current working directory : " + folderPath);
				testDataPath = propertyHandlerObj.readProperties("testDataPath");
				System.out.println(testDataPath);

				if(execution_Environment_Flag == 1){ // PROD
					testDataPath_ENV = propertyHandlerObj.readProperties("testDataPath_PROD");

				} else if(execution_Environment_Flag == 2){	// INT
					testDataPath_ENV = propertyHandlerObj.readProperties("testDataPath_INT");

				} else if(execution_Environment_Flag == 3){	// QA
					testDataPath_ENV = propertyHandlerObj.readProperties("testDataPath_QA");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			folderPath += testDataPath + testDataPath_ENV;
			
			System.out.println(folderPath);
			return folderPath;
		}



	// MAP
	private DesiredCapabilities getDesiredCapabilities(Map<String, String> browserDetails){
		DesiredCapabilities desiredCaps = null;
		PropertyHandler propertyHandlerObj = null;

		String browser = null;
		
		try {

		browser = browserDetails.get("browser");
		propertyHandlerObj = getPropertyFile("global", "global");

			

				if(browser.equalsIgnoreCase("firefox")){  		// F I  R E F O X

					desiredCaps = DesiredCapabilities.firefox();
					File pathBinary = new File(propertyHandlerObj.readProperties("FirefoxBinaryPath"));
					FirefoxProfile firefoxPro = new FirefoxProfile();
					FirefoxBinary Binary = new FirefoxBinary(pathBinary);
					desiredCaps.setPlatform(Platform.ANY);

				} else if(browser.equalsIgnoreCase("chrome")){ 	 // C H R O M E

					System.setProperty("webdriver.chrome.driver",propertyHandlerObj.readProperties("ChromeDriverPath"));
					desiredCaps = new DesiredCapabilities().chrome();
					desiredCaps.setBrowserName("chrome");
								
					
					ChromeOptions options = new ChromeOptions();
									
					options.addArguments("--incognito");

					desiredCaps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					desiredCaps.setCapability(ChromeOptions.CAPABILITY, options);

				} else if(browser.equalsIgnoreCase("iexplorer")){  // I E

					System.setProperty("webdriver.ie.driver",propertyHandlerObj.readProperties("IEDriverPath"));
					desiredCaps=new DesiredCapabilities().internetExplorer();

				} // iexplorer IF END
				else if (browser.equalsIgnoreCase("js")){
					/*File pathBinary = new File(propertyHandlerObj.readProperties("jsBinarypath"));
					desiredCaps = new DesiredCapabilities().phantomjs();               
					desiredCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, pathBinary);
					desiredCaps.setCapability("page.settings.loadImages", false);
					desiredCaps.setCapability("trustAllSSLCertificates", true);
					WebDriver driver = new org.openqa.selenium.phantomjs.PhantomJSDriver(desiredCaps);*/

				}

		

		} catch (Exception e) {
			e.printStackTrace();
		}
		return desiredCaps;
}

	private WebDriverWait initializeWebDriverWait(){
		wait = new WebDriverWait(webDriver, webDriverWait);
		action = new Actions(webDriver);
		screenShotUtil = new ScreenshotUtility(webDriver);
		return wait;
	}

	// MAP
	public WebDriver openApplicationURL(Map<String, String> browserDetails) {

		DesiredCapabilities desiredCaps = null;
		String appURL = null;
		

		try {

			 appURL = browserDetails.get("appURL"); 
			 System.out.println(appURL);
			
			desiredCaps = getDesiredCapabilities(browserDetails);
			webDriver = new ChromeDriver(desiredCaps);

			// INITIALIZE WEB DRIVER WAIT and THINK TIME
			initializeWebDriverWait();
			jse = (JavascriptExecutor) webDriver;

			

			if(appURL != null && appURL != ""){
				webDriver.get(appURL);
			}

			webDriver.manage().window().maximize();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return webDriver;
	}

	
	
	
	

		
		
	
		// USE FROM OLD SAF
	public String getCurrentErrorMsg(String errorType){
		String errorMessage = null;
		return errorMessage;
	}

	public String getDataList(WebDriver webdriver , String xPath) {

		List<WebElement> liElements = null;
		String[] first_xpath = null;
		String pathToCalculateSize = null;

		String data="";

		try {

			first_xpath = xPath.split("-replace-");
			pathToCalculateSize = first_xpath[0].substring(0,(first_xpath[0].length()-1));
System.out.println(pathToCalculateSize);
			liElements = webdriver.findElements(By.xpath(pathToCalculateSize));

			for (int i = 1; i < liElements.size()+1; i++) {
				WebElement linkElement = webdriver.findElement(By.xpath(first_xpath[0] + i+first_xpath[1]));  
				data+=linkElement.getText();
			}

		}catch(Exception e){
			// e.printStackTrace();
		}

		return data;
	}

	public String getUpdatedLocator(String customXpath, String keyword) throws Exception {

		if(customXpath.contains("XLS-") && customXpath.contains("-XLS")){
			String path_PartOne = customXpath.split("XLS")[1];
			customXpath = customXpath.replaceAll("XLS", "");
			path_PartOne = path_PartOne.replaceAll("-","");
			customXpath = customXpath.replaceAll("-"+path_PartOne+"-", keyword);
		} else if(customXpath.contains("-replace-")){
			customXpath = customXpath.replaceAll("-replace-", keyword);
		}
		return customXpath;
	}

	public By createByObjectForLocator(String xpath){
		By byObj = null;
		try {
			byObj = By.xpath(xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return byObj;
	}

	public String cleanString_Simple(String inputString){
		try {
			if(inputString != null){
				inputString = inputString.replaceAll(",", "").replaceAll(" ","").trim();
			} else {
				inputString = "";
			}
		} catch (Exception e) {
			inputString = "";
			//e.printStackTrace();
		}
		return inputString;
	}

	public void pause(int timeMilliSec){
		try {
			Thread.sleep(timeMilliSec);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}

	public void pause_Short(){
		try {
			Thread.sleep(shortThinkTime);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}

	public void pause_Long(){
		try {
			Thread.sleep(longThinkTime);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}

	public boolean switchTo_Window() {
		boolean operationFlag = false;
		try {
			// SWITCH TO WINDOW
			winHandles = webDriver.getWindowHandles(); 
			iterHandles = winHandles.iterator(); 
			parentWinHandle = iterHandles.next();
			for(int i=1;i<1;i++){
				iterHandles.next();
			}
			childWinHandle = iterHandles.next();
			webDriver.switchTo().window(childWinHandle);
			operationFlag = true;
		} catch (Exception e) {
			operationFlag =false;
			//e.printStackTrace();
		}
		return operationFlag;
	}

	public boolean close_NewOpenWindow() {
		boolean operationFlag = false;
		try {
			webDriver.close();
			switchTo_DefaultWindow();
			operationFlag = true;
		} catch (Exception e) {
			operationFlag =false;
			//e.printStackTrace();
		}
		return operationFlag;
	}

	public boolean switchTo_DefaultWindow() {
		boolean operationFlag = false;
		try {

			if(parentWinHandle != null){
				webDriver.switchTo().window(parentWinHandle);
				operationFlag = true;
			}

		} catch (Exception e) {
			operationFlag =false;
			//e.printStackTrace();
		}
		return operationFlag;
	}

	public void scroll_Vertical(int scrollValue){
		try {
			jse.executeScript("scroll(0," + scrollValue + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scroll_Horizontal(int scrollValue) {
		try {
			jse.executeScript("scroll(" + scrollValue +",0)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scroll_TillWebElement(By byObj) {
		WebElement webElement = null;
		try {
			webElement = webDriver.findElement(byObj);
			((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement );
			pause(500); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

	
	
	public  boolean scroll_Page(By byObj, int scrollPoints)
	{
	    try
	    {  WebElement webElement = webDriver.findElement(byObj);     
	        Actions dragger = new Actions(webDriver);
	        // drag downwards
	        int numberOfPixelsToDragTheScrollbarDown = 10;
	        for (int i = 10; i < scrollPoints; i = i + numberOfPixelsToDragTheScrollbarDown)
	        {
	            dragger.moveToElement(webElement).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown).release(webElement).build().perform();
	        }
	        Thread.sleep(500);
	        return true;
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	        return false;
	    }
	}

	public int getCustomElement_Length(String xPath) {

		int length = 0;
		List<WebElement> liElements = null;
		String[] first_xpath = null;
		String pathToCalculateSize = null;

		try {

			first_xpath = xPath.split("-replace-");
			pathToCalculateSize = first_xpath[0].substring(0,(first_xpath[0].length()-1));
			liElements = webDriver.findElements(By.xpath(pathToCalculateSize));

			length = liElements.size();

		}catch(Exception e){
			//e.printStackTrace();
		}

		return length;
	}

	public void operation_KeyPress_SPACE_ENTER() {
		try {
			action.sendKeys(Keys.SPACE).build().perform();

			action.sendKeys(Keys.RETURN).build().perform();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

	public void operation_KeyPress_SPACE() {
		try {
			action.sendKeys(Keys.SPACE);
			action.build().perform();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

	public void operation_KeyPress_ENTER() {
		try {
			action.sendKeys(Keys.ENTER);
			action.build().perform();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

	// EXECUTE A FILE
	public boolean executeFile(String filePath) throws Exception {
		boolean operationFlag = false;
		if(filePath != null && filePath != ""){

			System.out.println("executeFile :: "  +filePath);
			Process p = Runtime.getRuntime().exec(filePath);
			Thread.sleep(3000);
			if(p != null){
				System.out.println("->> IF ALIVE :: " + p.isAlive());
			}
			operationFlag = true;
		} else {
			operationFlag = false;
		}
		return operationFlag;
	}

	public boolean verify_Excet_Text(String actualText, String expectedText){
		boolean verifyResult = false;
		System.out.println("\n\t-->> actualText :: " + actualText);
		System.out.println("\t-->> expected Text :: " + expectedText);
		if(actualText != null){
			if(actualText.equals(expectedText)){
				verifyResult = true;
			}
		}
		return verifyResult;
	}

	public boolean verify_Text(String actualText, String expectedText){
		boolean verifyResult = false;

		if(actualText != null){
			if(expectedText != null){
				actualText.trim().replaceAll(" ", "").replaceAll(" ", "");
				expectedText.trim().replaceAll(" ", "").replaceAll(" ", "");
				System.out.println("\n\t-->> actualText :: " + actualText);
				System.out.println("\t-->> expectedText :: " + expectedText);
				if(actualText.equalsIgnoreCase(expectedText)){
					verifyResult = true;
				}
			}
		}
		return verifyResult;
	}

	public boolean moveTo_Element(By elementByObj){
		boolean verifyResult = false;
		try {
			action.moveToElement(webDriver.findElement(elementByObj)).build().perform();
			verifyResult = true;
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return verifyResult;
	}

	public boolean moveTo_ClickElement(By elementByObj) throws Exception {
		boolean verifyResult = false;
		action.moveToElement(webDriver.findElement(elementByObj), 10, 20).click().build().perform();
		pause_Short();
		// webDriver.findElement(elementByObj).click();
		verifyResult = true;
		return verifyResult;
	}
	
	public boolean moveTo_ClickElement(By elementByObj, int xOffset, int yOffset ) throws Exception {
		boolean verifyResult = false;
		action.moveToElement(webDriver.findElement(elementByObj), xOffset, yOffset).click().build().perform();
		pause_Short();
		// webDriver.findElement(elementByObj).click();
		verifyResult = true;
		return verifyResult;
	}

	public boolean moveTo_ClickElement(String customLocator, String keyword) throws Exception {
		boolean verifyResult = false;
		String updatedLocator = "";
		updatedLocator = getUpdatedLocator(customLocator, keyword);
		action.moveToElement(webDriver.findElement(By.xpath(updatedLocator))).perform();
		pause_Short();
		System.out.println(updatedLocator);
		webDriver.findElement(By.xpath(updatedLocator)).click();
		verifyResult = true;
		return verifyResult;
	}

	public boolean moveTo_Element(String customXpath, String keyword) throws Exception {
		boolean verifyResult = false;
		By byObj = null;
		String customElementLocator = null;
		customElementLocator = getUpdatedLocator(customXpath, keyword);
		byObj = createByObjectForLocator(customElementLocator);
		action.moveToElement(webDriver.findElement(byObj)).build().perform();
		verifyResult = true;
		return verifyResult;
	}

	public boolean clickOnThisElement(By elementByObj) throws Exception {
		boolean operationFlag = true;
		try{webDriver.findElement(elementByObj).click();
		     
		}
		catch(Exception e) {
			operationFlag = false;
		}
		/*try {
			System.out.println("--->> elementByObj :: " + elementByObj);
			webDriver.findElement(elementByObj).click();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		return operationFlag;
	}
	
	
	public boolean isDisplayed(By elementByObj) {
		boolean status =false;
		List al =webDriver.findElements(elementByObj);
      if(al.size()!=0) {
			status=true; 
		}
      return status;
	}
	
	

	public boolean SendOnThisElement(By elementByObj, String value) throws Exception  {
		boolean operationFlag = false;
		webDriver.findElement(elementByObj).sendKeys(value);
		operationFlag = true;
		return operationFlag;
	}

	public boolean SendOnThisElement_CLEAR_DATA(By elementByObj, String value) throws Exception  {
		boolean operationFlag = false;
		webDriver.findElement(elementByObj).clear();
		webDriver.findElement(elementByObj).sendKeys(value);
		operationFlag = true;
		return operationFlag;
	}

	public String getElementText(By elementByObj) throws Exception {
		String elementText = "";
		elementText = webDriver.findElement(elementByObj).getText();
		return elementText;
	}

	public String getTextBox_Value(By elementByObj) throws Exception {
		String elementText = "";
		elementText = webDriver.findElement(elementByObj).getAttribute("value");
		return elementText;
	}

	// CEHCK IF ELEMENT IS ENABLED
	public boolean checkIfElementEnabled(By elementByObj){
		boolean elementEnabled = false;
		try {
			elementEnabled = webDriver.findElement(elementByObj).isEnabled();
			elementEnabled = true;
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return elementEnabled;
	}

	// CEHCK IF ELEMENT IS DISPLAYED
	public boolean checkIfElement_Displayed(By elementByObj){
		boolean elementEnabled = false;
		try {
			elementEnabled = webDriver.findElement(elementByObj).isDisplayed();
			elementEnabled = true;
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return elementEnabled;
	}

	public WebElement checkIfElementEnabled_1(By elementByObj)  {
		WebElement webElement=null;
		try {
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(elementByObj));
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return webElement;
	}

	public boolean checkIfElementEnabled(String elementLocator) {
		boolean elementEnabled = false;
		By byObj = null;
		WebElement webElement=null;
		try {
			byObj = createByObjectForLocator(elementLocator);
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

	public String get_FirstSelectedElement(By elementByObj) throws Exception {
		String selected = "";
		Select dropdown = null;
		dropdown = new Select(webDriver.findElement(elementByObj));
		selected = dropdown.getFirstSelectedOption().getText();
		return selected;
	}

	public boolean selectElement_ByVisibleText(By elementByObj, String value) throws Exception {
		boolean selected = false;
		Select dropdown = null;
		dropdown = new Select(webDriver.findElement(elementByObj));
		dropdown.selectByVisibleText(value);
		selected = true;
		return selected;
	}

	public boolean select_Element_from_dropdown(String option, By obj1, By obj2){
       boolean status =false;
		// Open the dropdown so the options are visible
		webDriver.findElement(obj1).click();
		globalFunction.pause(2000);
		
        // Get all of the options
        List<WebElement> options = webDriver.findElements(obj2);
        // Loop through the options and select the one that matches
        for (WebElement opt : options) {
            if (opt.getText().equals(option)) {
                opt.click();
                status=true; 
                break;
            }
            
        }
        return status;
}
	public boolean selectElement_ByIndex(By elementByObj, int value) throws Exception {
		boolean selected = false;
		Select dropdown = null;
		dropdown = new Select(webDriver.findElement(elementByObj));
		dropdown.selectByIndex(value);
		selected = true;
		return selected;
	}

	public boolean selectElement_ByValue(By elementByObj, String value) throws Exception {
		boolean selected = false;
		Select dropdown = null;
		dropdown = new Select(webDriver.findElement(elementByObj));
		dropdown.selectByValue(value);
		selected = true;
		return selected;
	}

	public List<WebElement> select_getAllOption(By elementByObj) throws Exception {
		List<WebElement> selectOptions = null;
		Select dropdown = null;
		dropdown = new Select(webDriver.findElement(elementByObj));
		selectOptions = dropdown.getOptions();
		return selectOptions;
	}

	public String select_getAllOption_List(By elementByObj) throws Exception {
		System.out.println("select_getAllOption_List CALLED = "  + elementByObj);
		String selectOptionList = "";
		List<WebElement> selectOptions = null;
		Select dropdown = null;
		dropdown = new Select(webDriver.findElement(elementByObj));
		selectOptions = dropdown.getOptions();

		if(selectOptions != null){
			for (WebElement webElement : selectOptions) {
				selectOptionList += webElement.getText() + ",";
			}
			selectOptionList = selectOptionList.substring(0, selectOptionList.length()-1);
		}
		System.out.println("selectOptionList  :: " + selectOptionList);
		return selectOptionList;
	}

	public boolean clickOnThisElement(String customXpath, String keyword) throws Exception {
		boolean clicked = false;
		By byObj = null;
		String customElementLocator = null;
		customElementLocator = getUpdatedLocator(customXpath, keyword);
		byObj = createByObjectForLocator(customElementLocator);
		clickOnThisElement(byObj);
		clicked = true;
		return clicked;
	}

	/**
	 * @param acceptAlert
	 * @see TRUE - ACCEPT ALERT
	 * @see FALSE - DECLINE ALERT
	 * @return boolean
	 */
	public boolean alert_Accept(boolean acceptAlert) throws Exception {
		boolean operationFlag = false;
		alert = webDriver.switchTo().alert();
		if(acceptAlert){
			alert.accept();
		} else  {
			alert.dismiss();
		}
		switchTo_DefaultContent();
		operationFlag = true;
		return operationFlag;
	}

	public boolean switchTo_Frame(By byObj) throws Exception {
		boolean operationFlag = false;
		webDriver.switchTo().frame(webDriver.findElement(byObj));
		operationFlag = true;
		return operationFlag;
	}

	public boolean switchTo_DefaultContent() {
		boolean operationFlag = false;
		webDriver.switchTo().defaultContent();
		operationFlag = true;
		return operationFlag;
	}


	public boolean clear_TextBox(By byObj) {
		boolean operationFlag = false;
		webDriver.findElement(byObj).clear();
		operationFlag = true;
		return operationFlag;
	}

	public boolean clickOnThisElement(By elementByObj, int coordinate_X, int coordinate_Y) throws Exception {
		boolean operationFlag = false;
		action.moveToElement(webDriver.findElement(elementByObj),coordinate_X,coordinate_Y).click().build().perform();
		operationFlag = true;
		return operationFlag;
	}

/*	public String takeScreenShot() {
		// file name of screen shot
		Date d = new Date();
		String TE_Report_Screenshot = d.toString().replace(":", "_").replace(" ", "_") + ".png";

		// Strore ScreenShot into the file
		File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		try {
			System.out.println(System.getProperty("user.dir"));
			FileUtils.copyFile(srcFile,
					new File(System.getProperty("user.dir") +"\\report"+"\\ScreenShots\\" + TE_Report_Screenshot));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// put ScreenShot into the report
		test.log(LogStatus.INFO , "ScreenShot--" + test
				.addScreenCapture(System.getProperty("user.dir")+ "\\ScreenShots\\" + TE_Report_Screenshot));
		return TE_Report_Screenshot;
	}
	*/
	
	public  String takeScreenShot() {
	    File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
	    String encodedBase64 = null;
	    FileInputStream fileInputStreamReader = null;
	    try {
	        fileInputStreamReader = new FileInputStream(scrFile);
	        byte[] bytes = new byte[(int)scrFile.length()];
	        fileInputStreamReader.read(bytes);
	        encodedBase64 = new String(Base64.encodeBase64(bytes));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return "data:image/png;base64,"+encodedBase64;
	}

	
	public boolean sendKeys(Keys keyPress, String keyPress_1) throws Exception {
		boolean operationFlag = false;
		webDriver.findElement(By.tagName("html")).sendKeys(Keys.chord(keyPress,keyPress_1));
		// keyAction.keyDown(Keys.ALT).keyDown(Keys.SHIFT).sendKeys("z").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();
		operationFlag = true;
		return operationFlag;
	}

	public boolean perform_DragAndDrop(By drag_Element, By drop_Element) throws Exception {
		boolean operationFlag = false;
		// webDriver.findElement(By.tagName("html")).sendKeys(Keys.chord(keyPress,keyPress_1));
		// keyAction.keyDown(Keys.ALT).keyDown(Keys.SHIFT).sendKeys("z").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();
		operationFlag = true;
		return operationFlag;
	}

	public boolean perform_Refresh(){
		boolean operationFlag = false;
		webDriver.navigate().refresh();
		operationFlag = true;
		return operationFlag;
	}

	public boolean open_URL(String URL){
		boolean operationFlag = false;
		webDriver.get(URL);
		operationFlag = true;
		return operationFlag;
	}

	public boolean moveTo_VerifyElement(By elementByObj, String expected_Result){
		boolean verifyResult = false;
		String actual_Result = "";
		try {

			//if(checkIfElementEnabled(elementByObj)){
			action.moveToElement(webDriver.findElement(elementByObj)).perform();
			//}

			pause(2000);

			actual_Result =  webDriver.findElement(elementByObj).getText();

			actual_Result = cleanString_Simple(actual_Result);
			expected_Result = cleanString_Simple(expected_Result);

			//System.out.println("\tactual_Result   :: >" + actual_Result + "<");
			//System.out.println("\texpected_Result :: >" + expected_Result + "<");

			if(actual_Result != null){
				if(actual_Result.equalsIgnoreCase(expected_Result)){
					verifyResult = true;
				}
			}

		} catch (Exception e) {
			//verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}

	public String getTextForThisElement(By elementByObj){
		String verifyResult = "";
		try {
			//	moveTo_Element(elementByObj);
			verifyResult = webDriver.findElement(elementByObj).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return verifyResult;
	}

	public boolean VerifyElement(By elementByObj, String expected_Result){
		boolean verifyResult = false;
		String actual_Result = "";

		try {

			if(checkIfElementEnabled(elementByObj)){
				actual_Result =  webDriver.findElement(elementByObj).getText();
			}

			actual_Result = this.cleanString_Simple(actual_Result);
			expected_Result = this.cleanString_Simple(expected_Result);

			if(actual_Result.equalsIgnoreCase(expected_Result)){
				verifyResult = true;
			}

		} catch (Exception e) {
			//verifyResult = false;
			//e.printStackTrace();
		}
		return verifyResult;
	}
	
	public boolean clickOnThisElement(String elementLocator) {
		boolean clicked = false;
		By byObj = null;
		try {

			byObj = By.xpath(elementLocator);
			if (checkIfElementEnabled(byObj)) {
				webDriver.findElement(byObj).click();
				clicked = true;
			}
		} catch (Exception e) {
			clicked = false;
			e.printStackTrace();
		}
		return clicked;
	}
	
	public boolean checkIfElementPresent(String elementLocator){
		boolean elementPresent = false;
		By byObj = null;
		WebElement webElement=null;
		try {
			byObj = createByObjectForLocator(elementLocator);
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
			if(webElement.isDisplayed()== Boolean.parseBoolean(("true").trim() ) ){
				elementPresent=true;
			}
			else{
				elementPresent=false;
			}
			
		} catch (Exception e) {
			elementPresent=false;
			//e.printStackTrace();
		}
		return elementPresent;
	}
	
	public void captureScreenshot(By byObj, String unique_name){
		screenShotUtil.captureScreenshot(byObj, unique_name);
	}

	public String generate_RandomChar(){
		String str = null;
		str = new BigInteger(5, new SecureRandom()).toString(32);
		return str;
	}
	
	public String generateUniqueEmailAddress(String dummyStr){
		String email = null;
		email = "test" + dummyStr + new BigInteger(50, new SecureRandom()).toString(32)+"@mailinator.com";
		return email;
	}
	
    public String genrateCurrentDateMailAddress(){
        String email;
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
        Date date = new Date();
        email = dateFormat.format(date).toString()+"@mailinator.com";
        return email;
     }
	
    public String get_Current_URL(){
    	return webDriver.getCurrentUrl();
    }
    
    
    public  void scrolltoElement(By ScrolltoThisElement) {
		WebElement webElement=null;
		webElement = webDriver.findElement(ScrolltoThisElement);
		Coordinates coordinate = ((Locatable) webElement)
		.getCoordinates();
		//coordinate.onPage();
		System.out.println(coordinate.toString());
		coordinate.onPage();
		coordinate.inViewPort();
		
		//highlightelement(ScrolltoThisElement);
		} 
    
	public  void highlightelement(By element) {

		WebElement webElement=null;
		webElement = webDriver.findElement(element);
	JavascriptExecutor js = (JavascriptExecutor) webDriver;
    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", webElement);

	} 
	
	
	public boolean Check_Https_url(String urlHttps) {
	    String url = urlHttps;
	    boolean status=false;
        String patter="^(https)://.*$";
	    if(url.matches(patter)){
	   status= true;
	    }
    return status; 
	}
	
	
	
	public  String getEnv() {
		String env = "";
		try {

			if (execution_Environment_Flag == 1) { // PROD
				env = "PROD";
			} else if (execution_Environment_Flag == 2) { // Int
				env = "INT";
			} else if (execution_Environment_Flag == 3) { // QA
				env = "QA";
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return env;
	}

	
	
} // CLASS END
