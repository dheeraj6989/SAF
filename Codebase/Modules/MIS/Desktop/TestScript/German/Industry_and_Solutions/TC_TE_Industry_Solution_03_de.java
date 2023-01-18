package Modules.MIS.Desktop.TestScript.German.Industry_and_Solutions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import FunctionLibrary.DataFileHandler;
import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;
import Modules.MIS.Desktop.Base.BaseTest;
import Modules.MIS.Desktop.Pages.HomePage;
import Modules.MIS.Desktop.Pages.PLP;
import Modules.MIS.Desktop.Pages.PNP;

public class TC_TE_Industry_Solution_03_de extends BaseTest {

	//-------------------Local variable decleration---------------------//
			private GlobalFunction globalFunction = null;
			private DataFileHandler dataManager;
			private WebDriver webDriver = null;
			private HomePage homePage = null;
			private PLP plpPage =null;
			private PNP pnpPage =null;
			private PropertyHandler propertyHandlerObj = null;
			private String appURL = null;
			private int thinkTime;
			private final String localeChoice = "de";
			
			private Map rowData = null;
			private int rowNumber = 1;
			private String dataFilePath;
			private String dataFileName = "TC_TE_Industries_And_Solution_03_de.xls";
			private String mstrTC_Name = "TC_TE_Industry_Solution_03_de";
			
			
			//******************************************* Test Case Starts ***************************************************
			@Parameters({"device_new", "browserName","browser_version","os","os_version","resolution", "ip", "port_no", "proxyHost", "proxyPort"})
			//@Parameters({"browserName","ip","port_no"})
			@BeforeClass
			public void script(String device_new, String browser, String browser_version, String os, String os_version, String resolution, String ip, String port, String proxyHost, String proxyPort,ITestContext testContext) {
			//public void Setup(String browser,String ip,String port){

				Map<String, String> browserDetails = null;
				String testDataPath = null;
				
				try {

					globalFunction = new GlobalFunction();
					dataManager = new DataFileHandler();

					propertyHandlerObj = globalFunction.getPropertyFile(localeChoice, "global");
					testDataPath = globalFunction.get_TestDataPath();
					appURL = globalFunction.getURL_For_LocaleChoice(localeChoice);
					
					browserDetails = new HashMap<String, String>();
					
					browserDetails.put("mstrTC_Name", mstrTC_Name);
					browserDetails.put("appURL", appURL);
					browserDetails.put("ip", ip);
					browserDetails.put("port", port);
					browserDetails.put("browser", browser);
					browserDetails.put("device_new", device_new);
					browserDetails.put("browser_version", browser_version);
					browserDetails.put("os", os);
					browserDetails.put("os_version", os_version);
					browserDetails.put("resolution", resolution);
					
					browserDetails.put("proxyHost", proxyHost);
					browserDetails.put("proxyPort", proxyPort);
					
					
					dataFilePath = testDataPath + dataFileName; 
					rowData = dataManager.readDataByRow( dataFilePath , 0, rowNumber );
					
					System.out.println("Using Data File :: " + dataFilePath);
					System.out.println("Opening base URL :: " + appURL);
					System.out.println("Keyword :: "  + rowData.get("Keyword").toString() );
					
					webDriver = globalFunction.openApplicationURL(browserDetails);
					//webDriver = globalFunction.openApplicationURL(appURL, ip, port, browser);
					thinkTime = 10;
					
					homePage = new HomePage(localeChoice, webDriver, globalFunction);
					plpPage  = new PLP(localeChoice,webDriver, globalFunction);
					pnpPage  = new PNP(localeChoice,webDriver, globalFunction);
					
					testContext.setAttribute("WebDriver", this.webDriver);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}

//	      ************ Close the pop up ***********
			@Test
			public void openURLCheckPopUp(){
				
				//webDriver.get(rowData.get("PLP_URL").toString());
				globalFunction.pause(5000);

				boolean popUpStatus = false;
				popUpStatus = homePage.closePopUp();
				if(popUpStatus){
					//Reporter.log("Pop up closed");
					test.log(LogStatus.INFO, "Pop up closed");
				}
			}
			
		
			
//	      ************ Click on Industry and Solution ***********			
			@Test(dependsOnMethods="openURLCheckPopUp")
				public void clickOnIndustryAndSolutionList(){
					
				
					globalFunction.pause(5000);
					 boolean operationFlag = true;
					 try {
						operationFlag = globalFunction.clickOnThisElement(homePage.globleMenu_IndustryAndSolution);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 if(operationFlag){
							//Reporter.log("Industry and Solution Tab Clicked");
							test.log(LogStatus.INFO, "Industry and Solution Tab Clicked");
					 } else {
							//Reporter.log("Industry and Solution Tab NOT Clicked");
							test.log(LogStatus.INFO, "Industry and Solution Tab NOT Clicked");
					 }
					  Assert.assertEquals(operationFlag, true);	
			}
				
//	      ************ Click on sensors solution tab ***********		
			@Test(dependsOnMethods="clickOnIndustryAndSolutionList")	
			public void clickOnSensorSolutionsTab(){
					
				globalFunction.pause(5000);
				 boolean operationFlag = false;
				 try {
					operationFlag=globalFunction.clickOnThisElement(homePage.gmProduct_SensorSolutions);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 if(operationFlag){
						//Reporter.log("Sensor Solutions Tab Clicked");
						test.log(LogStatus.INFO, "Sensor Solutions Tab Clicked");
				 } else {
						//Reporter.log("Sensor Solutions Tab NOT Clicked");
						test.log(LogStatus.INFO, "Sensor Solutions Tab Clicked");
				 }
				  Assert.assertEquals(operationFlag, true);	
			}
				

//	      ************ Click on Product navigation tab ***********
			@Test(dependsOnMethods="clickOnSensorSolutionsTab")
			public void clickOnProductNavigationTab(){
						
				globalFunction.pause(5000);
				 boolean operationFlag = false;
			     try {
					operationFlag=globalFunction.clickOnThisElement(pnpPage.tabNavigaion_Products);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 if(operationFlag){
						 //Reporter.log("Product Navigation Tab Clicked");
						 test.log(LogStatus.INFO, "Product Navigation Tab Clicked");
				 } else {
						 //Reporter.log("Product Navigation Tab NOT Clicked");
						 test.log(LogStatus.INFO, "Product Navigation Tab NOT Clicked");
				 }
				Assert.assertEquals(operationFlag, true);	
			}
			
//	      ************ Click on View All ***********		
			@Test(dependsOnMethods="clickOnProductNavigationTab")
			public void clickOnViewAll(){
				globalFunction.pause(5000);
				// IF ELSE
				boolean operationFlag = false;
				
				operationFlag = true;
				
				globalFunction.pause(5000);
				
				if(operationFlag == true){
					try {
						operationFlag = globalFunction.clickOnThisElement(pnpPage.viewAll_PictureLink);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					try {
						operationFlag = globalFunction.clickOnThisElement(pnpPage.viewAll_SimpleLink);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(operationFlag){
					//Reporter.log("View All Link clicked");
					test.log(LogStatus.INFO, "View All Link clicked");
				} else {
					//Reporter.log("View All Link NOT clicked");
					test.log(LogStatus.INFO, "View All Link NOT clicked");
					
				}
				
				 Assert.assertEquals(operationFlag, true);
				
			}
				
				
				
				/*public void verifyAllResults(){
				
				String actualResult = null;
				String expectedResult = null;
				
				homePage.clickOnThisElement(homePage.getGmIndustryList_Product());
				Reporter.log("Click on Product Tab");
			}
			*/
			
			
//	      ************ Click on Industry Facet ***********
			 @Test(dependsOnMethods="clickOnViewAll") 
			 public void clickOnIndustryFacet(){
			 
					globalFunction.pause(5000);
					
				  boolean operationFlag=false;
				  try {
					operationFlag=globalFunction.clickOnThisElement(plpPage.facet_Industry);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  if(operationFlag){
						//Reporter.log("Industry Facet is Clicked");
						test.log(LogStatus.INFO, "Industry Facet is Clicked");
				  } else {
						//Reporter.log("Industry Facet NOT Clicked");
						test.log(LogStatus.INFO, "Industry Facet is NOT Clicked");
				  }
				  Assert.assertEquals(operationFlag, true);	
			 }

//		      ************ Click on Applications Facet ***********
			 @Test(dependsOnMethods="clickOnIndustryFacet") 
			 public void clickOnApplicationsFacet(){
					globalFunction.pause(5000);
				
					
				  boolean operationFlag=false;
				  try {
					operationFlag=globalFunction.clickOnThisElement(plpPage.facet_Applications);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  if(operationFlag){
						//Reporter.log("Application Facet is Clicked");
						test.log(LogStatus.INFO, "Application Facet is Clicked");
				  } else {
						//Reporter.log("Application Facet NOT Clicked");
						test.log(LogStatus.INFO, "Application Facet is NOT Clicked");
						
				  }
				  Assert.assertEquals(operationFlag, true);	
			 }
			 
//		      ************ Click on Product Families Facet ***********					
			 @Test(dependsOnMethods="clickOnApplicationsFacet") 
			 public void clickOnProductFamiliesFacet(){
						
					globalFunction.pause(5000);
				   boolean operationFlag=false;	
				   try {
					operationFlag=globalFunction.clickOnThisElement(plpPage.facet_ProductFamily);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   if(operationFlag){
						//Reporter.log("ProductFamily globalFunctionet is Clicked");
						test.log(LogStatus.INFO, "ProductFamily globalFunctionet is Clicked");
				  } else {
						//Reporter.log("ProductFamily Facet NOT Clicked");
						test.log(LogStatus.INFO, "ProductFamily globalFunctionet NOT Clicked");
				  }
				  Assert.assertEquals(operationFlag, true);
			 }

//******************************************* Test Case ends ***************************************************		
			 
//		      ************ Quit the browser ***********		  
			  @AfterClass
			  public void closeSetup(){
					 try {
						 if(webDriver != null){
							webDriver.quit();}
					      }
					 catch (Exception e) {
					  e.printStackTrace();}
			  }

}		
