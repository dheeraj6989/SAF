/*package FunctionLibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalFunction {

	private final String propertyFileName = "global";
	private int webDriverWait = 0;
	public int shortThinkTime;
	public int longThinkTime;
	private int execution_Environment_Flag = 0;
	
	private WebDriver webDriver = null;
	private WebDriverWait wait = null;
	private PropertyHandler propertyHandlerObj = null;
	private JavascriptExecutor jse = null;
	private Actions action = null;
	private Robot robot = null;
	
	Set<String> winHandles;
	Iterator<String> iterHandles;
	String parentWinHandle = "";
	String childWinHandle = "";
	
	private static String prefix_stage = "stage";
	private static String prefix_prod = "prod";
	private static String prefix_qa= "qa";
	
	private static String suffix_en= "en";
	private static String suffix_zh= "zh";
	private static String suffix_ja= "ja";
	private static String suffix_de= "de";
	
	private static String seperator = "_";
	private static String string_appURL = "appURL";
	private static String string_execution_Environment_Flag = "execution_Environment_Flag";
	
	
	public GlobalFunction(){
		setup();
	}
	
	private void setup(){
		try {
			propertyHandlerObj = new PropertyHandler();
			propertyHandlerObj.setFileName(propertyFileName);
			execution_Environment_Flag = Integer.parseInt(propertyHandlerObj.readProperties(string_execution_Environment_Flag));
			webDriverWait = Integer.parseInt(propertyHandlerObj.readProperties("webDriverWait"));
			shortThinkTime = Integer.parseInt(propertyHandlerObj.readProperties("shortThinkTime"));
			longThinkTime = Integer.parseInt(propertyHandlerObj.readProperties("longThinkTime"));
			
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public WebDriverWait getWait() {
		return wait;
	}
	
	public PropertyHandler getPropertyFile(String localeChoice, String pageName){
		PropertyHandler propertyHandlerObj = null;
		try {
			
			propertyHandlerObj = new PropertyHandler();
			
			// GLOBAL
			if(localeChoice.equalsIgnoreCase("global") || pageName.equalsIgnoreCase("global")){
				propertyHandlerObj.setFileName(GlobalVariable.getGlobalsetuppropertyfile());
			}
			
			// ELOQUA FORM SITE
			else if(pageName.equalsIgnoreCase("eloqua_form")){
				propertyHandlerObj.setFileName(GlobalVariable.getEloquaformpropertyfileEn());
			}
			
			// ENGLISH LOCALE
			else if(localeChoice.equalsIgnoreCase("en")){
				if(pageName.equalsIgnoreCase("home")){
					propertyHandlerObj.setFileName(GlobalVariable.getHomepagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("plp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPlppropertyfileEn());
				} else if(pageName.equalsIgnoreCase("pgp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPgppagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("pdp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPdppagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("pnp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPnppagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("eloqua")){
					propertyHandlerObj.setFileName(GlobalVariable.getEloquapagepropertyfileEn());
				} else if(pageName.equalsIgnoreCase("selfservice")){
					propertyHandlerObj.setFileName(GlobalVariable.getSelfservicepropertyfileEn());
				} 
				
			} 

			// GERMAN LOCALE
			else if(localeChoice.equalsIgnoreCase("de")){
				if(pageName.equalsIgnoreCase("home")){
					propertyHandlerObj.setFileName(GlobalVariable.getHomepagepropertyfileDe());
				} else if(pageName.equalsIgnoreCase("plp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPlppropertyfileDe());
				} else if(pageName.equalsIgnoreCase("pgp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPgppagepropertyfileDe());
				} else if(pageName.equalsIgnoreCase("pdp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPdppagepropertyfileDe());
				} else if(pageName.equalsIgnoreCase("pnp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPnppagepropertyfileDe());
				} else if(pageName.equalsIgnoreCase("eloqua")){
					propertyHandlerObj.setFileName(GlobalVariable.getEloquapagepropertyfileDe());
				} else if(pageName.equalsIgnoreCase("selfservice")){
					propertyHandlerObj.setFileName(GlobalVariable.getSelfservicepropertyfileDe());
				} 

				
			}
			
			// CHINESE LOCALE
			else if(localeChoice.equalsIgnoreCase("zh")){
				if(pageName.equalsIgnoreCase("home")){
					propertyHandlerObj.setFileName(GlobalVariable.getHomepagepropertyfileZh());
				} else if(pageName.equalsIgnoreCase("plp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPlppropertyfileZh());
				} else if(pageName.equalsIgnoreCase("pgp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPgppagepropertyfileZh());
				} else if(pageName.equalsIgnoreCase("pdp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPdppagepropertyfileZh());
				} else if(pageName.equalsIgnoreCase("pnp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPnppagepropertyfileZh());
				} else if(pageName.equalsIgnoreCase("eloqua")){
					propertyHandlerObj.setFileName(GlobalVariable.getEloquapagepropertyfileZh());
				} else if(pageName.equalsIgnoreCase("selfservice")){
					propertyHandlerObj.setFileName(GlobalVariable.getSelfservicepropertyfileZh());
				} 

			}
			
			// JAPANESE LOCALE
			else if(localeChoice.equalsIgnoreCase("ja")){
				if(pageName.equalsIgnoreCase("home")){
					propertyHandlerObj.setFileName(GlobalVariable.getHomepagepropertyfileJa());
				} else if(pageName.equalsIgnoreCase("plp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPlppropertyfileJa());
				} else if(pageName.equalsIgnoreCase("pgp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPgppagepropertyfileJa());
				} else if(pageName.equalsIgnoreCase("pdp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPdppagepropertyfileJa());
				} else if(pageName.equalsIgnoreCase("pnp")){
					propertyHandlerObj.setFileName(GlobalVariable.getPnppagepropertyfileJa());
				}else if(pageName.equalsIgnoreCase("eloqua")){
					propertyHandlerObj.setFileName(GlobalVariable.getEloquapagepropertyfileJa());
				} else if(pageName.equalsIgnoreCase("selfservice")){
					propertyHandlerObj.setFileName(GlobalVariable.getSelfservicepropertyfileJa());
				} 

			}
		}
			
		 catch (Exception e) {
			e.printStackTrace();
		}
		return propertyHandlerObj;
	}
	
	// MAP
	private DesiredCapabilities getDesiredCapabilities(Map<String, String> browserDetails){
		DesiredCapabilities desiredCaps = null;
		PropertyHandler propertyHandlerObj = null;
		
		String mstrTC_Name = null;
		String device_new = null;
		String browser = null;
		String browser_version = null;
		String os = null;
		String os_version = null;
		String resolution = null;
		
		String proxyHost = null;
		String proxyPort = null;
		
		try {
			
			mstrTC_Name = browserDetails.get("mstrTC_Name");
			device_new = browserDetails.get("device_new");
			browser = browserDetails.get("browser");
			browser_version = browserDetails.get("browser_version");
			os = browserDetails.get("os");
			os_version = browserDetails.get("os_version");
			resolution = browserDetails.get("resolution");

			proxyHost = browserDetails.get("proxyHost");
			proxyPort = browserDetails.get("proxyPort");
			
			propertyHandlerObj = getPropertyFile("global", "global");
			
			if(device_new.equalsIgnoreCase("BrowserStack")){
			
				//String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
				
				//For HTTP
				//System.getProperties().put("http.proxyHost", proxyHost);
				//System.getProperties().put("http.proxyPort", proxyPort);
				//System.getProperties().put("http.proxyHost", "restrictedproxy.tycoelectronics.com");
				//System.getProperties().put("http.proxyPort", "80");
				//System.getProperties().put("http.proxyUser", "<USER>");
				//System.getProperties().put("http.proxyPassword", "<PASSWORD>");

				//For HTTPS
				//System.getProperties().put("https.proxyHost", proxyHost);
				//System.getProperties().put("https.proxyPort", proxyPort);
				//System.getProperties().put("https.proxyHost", "restrictedproxy.tycoelectronics.com");
				//System.getProperties().put("https.proxyPort", "80");
				//System.getProperties().put("https.proxyUser", "<USER>");
				//System.getProperties().put("https.proxyPassword", "<PASSWORD>");
				
				desiredCaps = new DesiredCapabilities();
				desiredCaps.setCapability("browser", browser);
				desiredCaps.setCapability("browser_version", browser_version);
				desiredCaps.setCapability("os", os);
				desiredCaps.setCapability("os_version", os_version);
				desiredCaps.setCapability("resolution", resolution);
				//desiredCaps.setCapability("name", mstrTC_Name+"_"+browser+"_"+os+"_"+timeStamp);
				desiredCaps.setCapability("name", mstrTC_Name+"_"+browser+"_"+os);
				desiredCaps.setCapability("browserstack.debug", "true");
				
			} else {
			
				if(browser.equalsIgnoreCase("firefox")){  		// F I R E F O X
			
					desiredCaps = DesiredCapabilities.firefox();
					File pathBinary = new File(propertyHandlerObj.readProperties("FirefoxBinaryPath"));
					FirefoxProfile firefoxPro = new FirefoxProfile();
					FirefoxBinary Binary = new FirefoxBinary(pathBinary);
					desiredCaps.setPlatform(Platform.ANY);
				
				} else if(browser.equalsIgnoreCase("chrome")){ 	 // C H R O M E
			
					//System.setProperty("webdriver.chrome.driver",propertyHandlerObj.readProperties("ChromeDriverPath"));
					desiredCaps = new DesiredCapabilities().chrome();
					desiredCaps.setBrowserName("chrome");
					
					// NEW TEST
					String downloadFilepath = "D:\\Chinmay";
					
					HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
					chromePrefs.put("profile.default_content_settings.popups", 0);
					chromePrefs.put("download.default_directory", downloadFilepath);
					
					ChromeOptions options = new ChromeOptions();
					HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
					options.setExperimentalOption("prefs", chromePrefs);
					options.addArguments("--test-type");
					
					desiredCaps.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
					desiredCaps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					desiredCaps.setCapability(ChromeOptions.CAPABILITY, options);
				
				} else if(browser.equalsIgnoreCase("iexplorer")){  // I E
					
					System.setProperty("webdriver.ie.driver",propertyHandlerObj.readProperties("IEDriverPath"));
					desiredCaps=new DesiredCapabilities().internetExplorer();
				
				} // iexplorer IF END
				
			} // BrowserStack IF END

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desiredCaps;
	}
	
	private WebDriverWait initializeWebDriverWait(){
		wait = new WebDriverWait(webDriver, webDriverWait);
		action = new Actions(webDriver);
		return wait;
	}

	// MAP
	public WebDriver openApplicationURL(Map<String, String> browserDetails){
		
		DesiredCapabilities desiredCaps = null;
		String hubURL = null;
		
		String appURL = null;
		String ip = null;
		String port_no = null;
		
		try {
			
			appURL = browserDetails.get("appURL");
			ip = browserDetails.get("ip");
			port_no = browserDetails.get("port");
			
			hubURL = "http://" + ip + ":" + port_no + "/wd/hub";
			
			desiredCaps = getDesiredCapabilities(browserDetails);
			webDriver = new RemoteWebDriver(new URL(hubURL),desiredCaps);
		
			System.out.println("\n\t hubURL :: " + hubURL);
			
			// INITIALIZE WEB DRIVER WAIT and THINK TIME
			initializeWebDriverWait();
			jse = (JavascriptExecutor) webDriver;
			
			if( !(browserDetails.get("device_new").equalsIgnoreCase("BrowserStack")) ){
				// ----------- TO EXTRACT NODE IP -----------
				
				HttpHost host = new HttpHost(browserDetails.get("ip"), Integer.parseInt(browserDetails.get("port")));
				HttpClient client = HttpClientBuilder.create().build();
				URL testSessionApi = new URL("http://" + browserDetails.get("ip") + ":" + browserDetails.get("port") + "/grid/api/testsession?session=" + ((RemoteWebDriver)webDriver).getSessionId()); 
				BasicHttpEntityEnclosingRequest r = new BasicHttpEntityEnclosingRequest("POST", testSessionApi.toExternalForm()); 
				HttpResponse response = client.execute(host,r);
				JSONObject object;

				object = new JSONObject(EntityUtils.toString(response.getEntity()));
				String proxyID = (String) object.get("proxyId");
				String node = (proxyID.split("//")[1].split(":")[0]);
				System.out.println("\n\t Node ID :: "+ node);
				
				// ----------- TO EXTRACT NODE IP END -----------
			}
			
			if(appURL != null && appURL != ""){
				webDriver.get(appURL);
			}
			
			webDriver.manage().window().maximize();
			//Thread.sleep(2000);
			
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
			liElements = webdriver.findElements(By.xpath(pathToCalculateSize));
			
			for (int i = 1; i < liElements.size()+1; i++) {
				WebElement linkElement = webdriver.findElement(By.xpath(first_xpath[0] + i+first_xpath[1]));  
				data+=linkElement.getText();
			}
			
		}catch(Exception e){
			//e.printStackTrace();
		}
		
		return data;
	}
	
	public String getUpdatedLocator(String customXpath, String keyword){
		
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
	
	public boolean switchTo_Window(){
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
	
	public boolean close_NewOpenWindow(){
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
	
	public boolean switchTo_DefaultWindow(){
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
	
	// SELET URL ACCRODING TO LOCALE AND EXECUTION ENVIRONMTN
	public String getURL_For_LocaleChoice(String localeChoice){
		String property_appURL = "";
		try {
			if(localeChoice != null){
				
				if(execution_Environment_Flag == 1){		// PROD
					property_appURL = prefix_prod + seperator + string_appURL + seperator;
					if(localeChoice.equalsIgnoreCase(suffix_en)){
						property_appURL += suffix_en;
					} else if(localeChoice.equalsIgnoreCase(suffix_zh)){
						property_appURL += suffix_zh;
					} else if(localeChoice.equalsIgnoreCase(suffix_de)){
						property_appURL += suffix_de;
					} else if(localeChoice.equalsIgnoreCase(suffix_ja)){
						property_appURL += suffix_ja;
					}
				} else if(execution_Environment_Flag == 2){	// STAGE
					property_appURL = prefix_stage + seperator + string_appURL + seperator;
					if(localeChoice.equalsIgnoreCase(suffix_en)){
						property_appURL += suffix_en;
					} else if(localeChoice.equalsIgnoreCase(suffix_zh)){
						property_appURL += suffix_zh;
					} else if(localeChoice.equalsIgnoreCase(suffix_de)){
						property_appURL += suffix_de;
					} else if(localeChoice.equalsIgnoreCase(suffix_ja)){
						property_appURL += suffix_ja;
					}
				} else if(execution_Environment_Flag == 3){	// QA
					property_appURL = prefix_qa + seperator + string_appURL + seperator;
					if(localeChoice.equalsIgnoreCase(suffix_en)){
						property_appURL += suffix_en;
					} else if(localeChoice.equalsIgnoreCase(suffix_zh)){
						property_appURL += suffix_zh;
					} else if(localeChoice.equalsIgnoreCase(suffix_de)){
						property_appURL += suffix_de;
					} else if(localeChoice.equalsIgnoreCase(suffix_ja)){
						property_appURL += suffix_ja;
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
			folderPath = propertyHandlerObj.readProperties("safRootPath");
			testDataPath = propertyHandlerObj.readProperties("testDataPath");
			
			if(execution_Environment_Flag == 1){ // PROD
				testDataPath_ENV = propertyHandlerObj.readProperties("testDataPath_PROD");
				
			} else if(execution_Environment_Flag == 2 || execution_Environment_Flag == 3){	// STAGE QA
				testDataPath_ENV = propertyHandlerObj.readProperties("testDataPath_STAGE");
				
			} else if(execution_Environment_Flag == 3){	// QA
				testDataPath_ENV = propertyHandlerObj.readProperties("testDataPath_QA");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		folderPath += testDataPath + testDataPath_ENV;
		return folderPath;
	}
	
	
	public void scroll_Vertical(int scrollValue){
		try {
			jse.executeScript("scroll(0," + scrollValue + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void scroll_Horizontal(int scrollValue){
		try {
			jse.executeScript("scroll(" + scrollValue +",0)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void scroll_TillWebElement(By byObj){
		WebElement webElement = null;
		try {
			webElement = webDriver.findElement(byObj);
			((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
			pause(500); 
		} catch (Exception e) {
			e.printStackTrace();
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

	public void operation_KeyPress_SPACE_ENTER(){
		try {
			action.sendKeys(Keys.SPACE).build().perform();
			
			action.sendKeys(Keys.RETURN).build().perform();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	public void operation_KeyPress_SPACE(){
		try {
			action.sendKeys(Keys.SPACE);
			action.build().perform();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	public void operation_KeyPress_ENTER(){
		try {
			action.sendKeys(Keys.ENTER);
			action.build().perform();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	// EXECUTE A FILE
	public boolean executeFile(String filePath){
		boolean operationFlag = false;
		try {
			if(filePath != null && filePath != ""){
				
				System.out.println("executeFile :: "  +filePath);
				Process p = Runtime.getRuntime().exec(filePath);
				Thread.sleep(5000);
				
				if(p != null){
					//p.destroyForcibly();
					System.out.println("->> IF ALIVE :: " + p.isAlive());
				}
				
				operationFlag = true;
			} else {
				operationFlag = false;
			}
		} catch (Exception e) {
			operationFlag = false;
			e.printStackTrace();
		}
		return operationFlag;
	}
	
	public boolean moveTo_Element(By elementByObj){
		boolean verifyResult = false;
		try {
			action.moveToElement(webDriver.findElement(elementByObj)).build().perform();
			verifyResult = true;
		} catch (Exception e) {
			verifyResult = false;
			e.printStackTrace();
		}
		return verifyResult;
	}
	
	
	private  void setClipboardData(String string) {
		StringSelection stringSelection = null;
		try {
			//StringSelection is a class that can be used for copy and paste operations.
			stringSelection = new StringSelection(string);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public  void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            
            //native key strokes for CTRL, V and ENTER keys
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
    }
	
	
} // CLASS END
*/