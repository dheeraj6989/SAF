package Modules.MIS.Desktop.TestScript.Japanese.Industry_and_Solutions;

import java.util.HashMap;
import java.util.Map;

//---------- Selenium----------//
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
//---------- TestNG----------//
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//---------- Required FunctionLibrary----------//
import FunctionLibrary.DataFileHandler;
import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;
import Modules.MIS.Desktop.Pages.HomePage;
import Modules.MIS.Desktop.Pages.PLP;
import Modules.MIS.Desktop.Pages.PNP;

//---------- Required ApplicationSpecificFunctions----------//
//import Modules.TE.Desktop.ApplicationSpecificFunctions.*;

//-----------------------------------------------------------------------------------------//

@SuppressWarnings("unused")
public class TC_TE_IndustryandSolutions_automotive_ja {

	private GlobalFunction globalFunction = null;
	private DataFileHandler dataManager;
	private WebDriver webDriver = null;
	private HomePage homePage = null;
	private PLP plpPage =null;
	private PNP pnpPage =null;
	private PropertyHandler propertyHandlerObj = null;
	private String appURL = null;
	private int thinkTime;
	private final String localeChoice = "ja";

	private Map rowData = null;
	private int rowNumber = 1;
	private String dataFilePath;
	private String dataFileName = "Industries and solutions(automotive)_ja.xls";
	private String mstrTC_Name = "TC_TE_IndustryandSolutions_automotive_ja";

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
			pnpPage= new PNP(localeChoice,webDriver, globalFunction);
			
			testContext.setAttribute("WebDriver", this.webDriver);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void clickOnIndustryAndSolution(){

		homePage.closePopUp();
		boolean operationFlag=false;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			operationFlag = globalFunction.clickOnThisElement(homePage.globleMenu_IndustryAndSolution);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(operationFlag)
			Reporter.log("Industry And Solution Tab is clicked");
		else
			Reporter.log("Industry And Solution not Clicked");
		//Assert.assertEquals(operationFlag, true);
	}
	
	@Test(dependsOnMethods="clickOnIndustryAndSolution")
	public void clickOnAutomotiveTab(){
		boolean operationFlag=false;

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			operationFlag = globalFunction.clickOnThisElement(homePage.gmIndustryAndSolution_Automotive);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(operationFlag)
		{
			Reporter.log("Automotive Tab is clicked");

		}else

		{Reporter.log("Automotive Tab not Clicked");

		}
		//Assert.assertEquals(operationFlag, true);
	}

	@Test(dependsOnMethods="clickOnAutomotiveTab")
	public void clickOnAutomotiveProductTab(){

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		boolean operationFlag=false;
		try {
			operationFlag = globalFunction.clickOnThisElement(pnpPage.tabNavigaion_Products);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(operationFlag)
		{
			Reporter.log("Click On Automotive Product Tab");
		}else
		{
			Reporter.log(" Automotive Product Tab not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}

	@Test(dependsOnMethods="clickOnAutomotiveProductTab")
	public void clickOnProdCategory_AutomotiveTruckBusOffRoad(){

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean operationFlag=false;
		try {
			operationFlag = globalFunction.clickOnThisElement(pnpPage.prodCategory_AutomotiveTruckBusOffRoad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(operationFlag)

		{
			Reporter.log("Product category option Automotive, Truck, Bus & Off-Road Connectors link is clicked");
		}
		else
		{
			Reporter.log("Product category option Automotive, Truck, Bus & Off-Road Connectors link is not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}


	@Test(dependsOnMethods="clickOnProdCategory_AutomotiveTruckBusOffRoad")
	public void clickOnAutomotiveProductTabOptions(){

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean operationFlag=false;
		try {
			operationFlag = globalFunction.clickOnThisElement(pnpPage.viewAll_SimpleLink);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(operationFlag)

		{
			Reporter.log("View All Automotive, Truck, Bus & Off-Road Connectors  link is clicked");
		}
		else
		{
			Reporter.log("View All Automotive, Truck, Bus & Off-Road Connectors link not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}


	@Test(dependsOnMethods="clickOnAutomotiveProductTabOptions")		
	public void clickOnResults(){

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actualResult = null;
		String expectedResult = null;

		actualResult = globalFunction.cleanString_Simple(plpPage.getResult_ProductTab());
		expectedResult = globalFunction.cleanString_Simple(rowData.get("Results").toString());

		Reporter.log("Actual Result : " + actualResult);
		Reporter.log("Expected Result : " + rowData.get("Results").toString());

		if(actualResult.equalsIgnoreCase(expectedResult)){

			Reporter.log("Result Same");
		} else {
			Reporter.log("Result NOT Same");
		}

	}

	@Test(dependsOnMethods="clickOnResults")

	public void clickOnIndustriesFacet(){

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean operationFlag=false;
		operationFlag = plpPage.clickOnFacet_Industry();
		if(operationFlag)

		{
			Reporter.log("Industry Facet Tab is clicked");
		}
		else

		{
			Reporter.log("Industry Facet Tab not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}

	@Test(dependsOnMethods="clickOnIndustriesFacet")
	public void clickOnApplicationsFacet(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean operationFlag=false;
		operationFlag = plpPage.clickOnFacet_Application();
		if(operationFlag)
		{
			Reporter.log("Application Facet Tab is clicked");
		}
		else

		{
			Reporter.log("Application Facet Tab not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}

	@Test(dependsOnMethods="clickOnApplicationsFacet")
	public void clickOnProductAndFamiliesFacet(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean operationFlag=false;
		operationFlag = plpPage.clickOnFacet_ProductFamily();
		if(operationFlag)

		{
			Reporter.log("Product And Family Tab is clicked");
		}
		else

		{
			Reporter.log("Product And Family  Tab not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}



	@Test(dependsOnMethods="clickOnProductAndFamiliesFacet")
	public void clickOnStandardsFacets(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean operationFlag=false;
		operationFlag = plpPage.clickOnFacet_Standard();
		if(operationFlag)

		{
			Reporter.log("Standard Tab is clicked");
		}
		else

		{
			Reporter.log("Standard Tab not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}

/*
	@Test(dependsOnMethods="clickOnStandardsFacets")
	public void clickOnSeriesFacets(){
		boolean operationFlag=false;
		plpPage.clickOnFacet_Series();if(operationFlag)

		{
			Reporter.log("Series Tab");
		}
		else

		{
			Reporter.log("Series Tab not Clicked");
		}
		//Assert.assertEquals(operationFlag, true);
	}*/
	
	@AfterClass
	public void closeSetup(){
		try {
			if(webDriver != null){
				webDriver.quit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}



