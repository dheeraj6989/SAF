package Modules.MIS.Desktop.TestScript.Japanese.Industry_and_Solutions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.DataFileHandler;
import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;
import Modules.MIS.Desktop.Pages.HomePage;
import Modules.MIS.Desktop.Pages.PLP;
import Modules.MIS.Desktop.Pages.PNP;

public class TC_TE_Industry_Solution_02_ja {
	//-------------------Local variable decleration---------------------//
		private GlobalFunction globalFunction = null;
		private DataFileHandler dataManager;
		private WebDriver webDriver = null;
		private HomePage homePage = null;
		private PLP plpPage =null;
		private PNP pnpPage = null;
		private PropertyHandler propertyHandlerObj = null;
		private String appURL = null;
		private int thinkTime;
		private final String localeChoice = "ja";
		
		private Map rowData = null;
		private int rowNumber = 1;
		private String dataFilePath;
		private String dataFileName = "TC_TE_Industries_And_Solution_02_ja.xls";
		private String mstrTC_Name = "TC_TE_Industry_Solution_02_ja";
		
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
				System.out.println("Keyword :: "  + rowData.get("Keyword").toString());
				
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
		
			@Test
			public void executeIndustryAndSolution(){		
				homePage.closePopUp();
				//homePage.enterKeywordInSearchBox_PressEnter("80 volts circuit");
			/*
				boolean popUpStatus = false;
				popUpStatus = homePage.closePopUp();
				if(popUpStatus){
				Reporter.log("Pop up closed");
		
				//homePage.clickOnThisElement(homePage.getGlobleMenu_IndustryAndSolution());
			*/
			}
		
		
			@Test(dependsOnMethods="executeIndustryAndSolution")
			public void clickOnIndustryAndSolutionList(){
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 boolean operationFlag = true;
				 try {
					operationFlag = globalFunction.clickOnThisElement(homePage.globleMenu_IndustryAndSolution);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 if(operationFlag){
						Reporter.log("Industry and Solution Tab Clicked");
				 } else {
						Reporter.log("Industry and Solution Tab NOT Clicked");
				 }
				  Assert.assertEquals(operationFlag, true);	
			}
			
			
			@Test(dependsOnMethods="clickOnIndustryAndSolutionList")	
			public void clickOnAerospaceTab(){
					
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 boolean operationFlag = false;
				 try {
					operationFlag=globalFunction.clickOnThisElement(homePage.gmProduct_Aerospace);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 if(operationFlag){
						Reporter.log("Aerospace Tab Clicked");
				 } else {
						Reporter.log("Aerospace Tab NOT Clicked");
				 }
				  Assert.assertEquals(operationFlag, true);	
			}

			
			@Test(dependsOnMethods="clickOnAerospaceTab")
			public void clickOnProductNavigationTab(){
						
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				  boolean operationFlag = false;
				  try {
					operationFlag=globalFunction.clickOnThisElement(pnpPage.tabNavigaion_Products);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  if(operationFlag){
						Reporter.log("Product Navigation Tab Clicked");
				  } else {
						Reporter.log("Product Navigation Tab NOT Clicked");
				  }
				  Assert.assertEquals(operationFlag, true);	
			}	
				  
			@Test(dependsOnMethods="clickOnProductNavigationTab")
			public void clickOnResultProductTab(){
						
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				  boolean operationFlag = false;
				  try {
					operationFlag=globalFunction.clickOnThisElement(plpPage.resultProductTab);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  if(operationFlag){
						Reporter.log("Result Product Tab Clicked");
				  } else {
						Reporter.log("Result Product Tab NOT Clicked");
				  }
				  Assert.assertEquals(operationFlag, true);	
			}		
			
				
			/*public void verifyTotalResults(){
								
				   String actualResult = null;
				   String expectedResult = null;
								
				   homePage.clickOnThisElement(homePage.getGmIndustryList_Product());
			       Reporter.log("Click on Product Tab");
								
				   actualResult = GlobalFunction.cleanString_Simple(homePage.getResult_AerospaceTab());
			       expectedResult = GlobalFunction.cleanString_Simple(rowData.get("Result_Category").toString());
								
				   Reporter.log("Actual Result : " + actualResult);
				   Reporter.log("Expected Result : " + rowData.get("Result_Category").toString());
								
				   if(actualResult.equalsIgnoreCase(expectedResult)){
				    Reporter.log("Result Same");
					 } else { 
					  Reporter.log("Result NOT Same");
					}
				}*/
			
		
			 @Test(dependsOnMethods="clickOnResultProductTab") 
			 public void clickOnApplicationsFacet(){
			 	
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					boolean   operationFlag=false;
				  try {
					operationFlag=globalFunction.clickOnThisElement(plpPage.facet_Applications);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  if(operationFlag){
						Reporter.log("Application Facet is Clicked");
				  } else {
						Reporter.log("Application Facet NOT Clicked");
				  }
				 // Assert.assertEquals(operationFlag, true);
				  Assert.assertEquals(operationFlag, true);
			 }
			 
					
			 @Test(dependsOnMethods="clickOnApplicationsFacet") 
			 public void clickOnProductFamiliesFacet(){					

					
				 boolean operationFlag=false;	
				   try {
					operationFlag=globalFunction.clickOnThisElement(plpPage.facet_ProductFamily);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   if(operationFlag){
						Reporter.log("ProductFamilies Facet is Clicked");
				  } else {
						Reporter.log("ProductFamilies Facet NOT Clicked");
				  }
				  Assert.assertEquals(operationFlag, true);
			 }
					
			 
			 @Test(dependsOnMethods="clickOnProductFamiliesFacet") 
			 public void clickOnStandardsFacet(){
				 
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					boolean operationFlag=false;
				   try {
					operationFlag=globalFunction.clickOnThisElement(plpPage.facet_Standards);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   if(operationFlag){
						Reporter.log("Standards Facet is Clicked");
				  } else {
						Reporter.log("Standards Facet NOT Clicked");
				  }
				  Assert.assertEquals(operationFlag, true);
			  }
					
				
			  @Test(dependsOnMethods="clickOnStandardsFacet") 
			  public void clickOnSeriesFacet(){
						
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					boolean operationFlag=false;
				    try {
						operationFlag=globalFunction.clickOnThisElement(plpPage.facet_Series);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    if(operationFlag){
						Reporter.log("Series Facet is Clicked");
				  } else {
						Reporter.log("Series Facet NOT Clicked");
				  }
				  Assert.assertEquals(operationFlag, true);
			  }
				
			  
			  
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