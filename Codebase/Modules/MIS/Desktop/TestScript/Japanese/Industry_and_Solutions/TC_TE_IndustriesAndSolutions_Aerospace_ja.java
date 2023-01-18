package Modules.MIS.Desktop.TestScript.Japanese.Industry_and_Solutions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import FunctionLibrary.DataFileHandler;
import FunctionLibrary.ExcelDataPoolManager_NEW;
import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;
import Modules.MIS.Desktop.Base.BaseTest;
import Modules.MIS.Desktop.Pages.Components;
import Modules.MIS.Desktop.Pages.HomePage;
import Modules.MIS.Desktop.Pages.PLP;
import Modules.MIS.Desktop.Pages.PNP;
import Modules.MIS.Desktop.Pages.Page;

public class TC_TE_IndustriesAndSolutions_Aerospace_ja extends BaseTest {

	
	private final String localeChoice = "ja";
	private GlobalFunction globalFunction = null;
	private DataFileHandler dataManager;
	private WebDriver webDriver = null;
	
	private PropertyHandler propertyHandlerObj = null;
	private final String sheetName = "Sheet1";
	private String appURL = null;
	private int shortThinkTime;
	private int longThinkTime;
	
	private Map rowData = null;
	private int rowNumber = 1;
	private String dataFilePath;
	private String dataFileName = "TC_TE_IndustriesAndSolutions_Aerospace_ja.xls";
	private String mstrTC_Name = "TC_TE_IndustriesAndSolutions_Aerospace_ja";

	private HomePage homePage = null;
	private PLP plpPage = null;
	private PNP pnpPage = null;
	Page page = null;
	Components component = null;
	private Map<String, String> browserDetails = null;
	private ITestContext testContext = null;
	private String surl;
	
	@Parameters({"device_new", "browserName","browser_version","os","os_version","resolution", "ip", "port_no", "proxyHost", "proxyPort"})
	@BeforeClass
	public void script(String device_new, String browser, String browser_version, String os, String os_version, String resolution, String ip, String port, String proxyHost, String proxyPort,ITestContext testContext) {
		
		String testDataPath = null;
		
		try {
			globalFunction = new GlobalFunction();
			dataManager = new DataFileHandler();

			propertyHandlerObj = globalFunction.getPropertyFile(localeChoice, "global");
			testDataPath = globalFunction.get_TestDataPath();
			appURL = globalFunction.getURL_For_LocaleChoice(localeChoice);
		
			shortThinkTime = Integer.parseInt(propertyHandlerObj.readProperties("shortThinkTime"));
			longThinkTime = Integer.parseInt(propertyHandlerObj.readProperties("longThinkTime"));
			
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
			rowData = dataManager.readDataByRow(dataFilePath, 0, rowNumber);

			System.out.println("Using Data File :: " + dataFilePath);
			System.out.println("Opening base URL :: " + appURL);
			System.out.println("Keyword :: " + rowData.get("Keyword").toString());

			webDriver = globalFunction.openApplicationURL(browserDetails);

			// INITIALIZE PAGES
			homePage = new HomePage(localeChoice,webDriver, globalFunction);
			plpPage = new PLP(localeChoice,webDriver, globalFunction);
			pnpPage = new PNP(localeChoice, webDriver, globalFunction);
			//testContext.setAttribute("WebDriver", this.webDriver);

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // script FUNC END
	
	
	
	
	
	@Test(dataProvider="TestData")
	public void verifyPrimaryImageDisplayed(String Keyword, String Index , String Results,
			String Facets,	String Result_Category){
		
		test = report.startTest("TC verify Aerospace in Industries and Solutions for:" + Keyword);

		boolean operationFlag = false;
		String actualResult = null;
		String expectedResult = null;

		globalFunction.pause(longThinkTime);
		System.out.println("before URL and slouction click");

		globalFunction.pause(7000);

		boolean popUpStatus = false;
		popUpStatus = homePage.closePopUp();
		if (popUpStatus) {

			test.log(LogStatus.INFO, "Pop up closed");
		}

		if (operationFlag) {

			test.log(LogStatus.INFO, "Pop up closed");
		}

		globalFunction.pause(3000);
		
		/*surl=webDriver.getCurrentUrl();
		System.out.println(surl);
		test.log(LogStatus.INFO, "CurentURL--"+surl);
		operationFlag=globalFunction.Check_Https_url(surl );
		verifyResult(operationFlag, "Current url is https", "Current url is not https");
		*/

		try {
			operationFlag = globalFunction.clickOnThisElement(homePage.globleMenu_IndustryAndSolution);
		} catch (Exception e1) {

			e1.printStackTrace();
		}
		System.out.println("after industry and slouction click");
		
		/*surl=webDriver.getCurrentUrl();
		System.out.println(surl);
		test.log(LogStatus.INFO, "CurentURL--"+surl);
		operationFlag=globalFunction.Check_Https_url(surl );
		verifyResult(operationFlag, "Current url is https", "Current url is not https");
		*/
		verifyResult(operationFlag, "Industry and Solution Tab Clicked", "Industry and Solution Tab NOT Clicked");

		

		globalFunction.pause(5000);

		operationFlag = homePage.clickOn_CustomIndustrySoln_Element(Keyword);
		verifyResult(operationFlag, Keyword + " " + "Selected", Keyword + " " + "NOT Selected");

		globalFunction.pause(5000);
		try {
			operationFlag = globalFunction.clickOnThisElement(pnpPage.tabNavigaion_Products);
		} catch (Exception e) {

			e.printStackTrace();
		}
		verifyResult(operationFlag, "Product Navigation Tab Clicked", "Product Navigation Tab NOT Clicked");
		globalFunction.pause(5000);
		actualResult = globalFunction.cleanString_Simple(plpPage.getResult_ProductTab());

		

		expectedResult = Results;
		test.log(LogStatus.INFO, "Actual Result: " + actualResult);
		test.log(LogStatus.INFO, "Expected Result : " + actualResult);

		System.out.println("Actual Result:" + actualResult);
		System.out.println("Expected result:" + expectedResult);

		verify_text(actualResult, expectedResult, "Result Same", "Result Not Same");
		
		homePage.closePopUp();
		
		
		/*try {
			operationFlag = globalFunction.clickOnThisElement(plpPage.resultInformationTab);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		verifyResult(operationFlag, "Information Tab Clicked", "Information Tab NOT Clicked");
		globalFunction.pause(4000);
		
	operationFlag=	verifyInformationTabResult();
	verifyResult(operationFlag, "Information result same", "Information Result not same");
		
*/
		/*
		 * globalFunction.pause(5000); operationFlag =
		 * globalFunction.checkIfElementEnabled(Facets); verifyResult(operationFlag,
		 * "Facets verified", "Facets NOT verified");
		 */

	}

	// ******************************************* Test Case Ends
	// ***************************************************

		
	@DataProvider
	public Object[][] TestData() throws Exception {
		ExcelDataPoolManager_NEW excel = new ExcelDataPoolManager_NEW();
		excel.setWorkBook(dataFilePath, sheetName);
		Object[][] testObjArray = excel.getTableArray();
		return (testObjArray);
	}

	public void closeSetup() {
		try {
			if (webDriver != null && report != null) {
				webDriver.quit();

				report.endTest(test);
				report.flush();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void aterMethod() {
		closeSetup();
	}

	
	
	public boolean verifyInformationTabResult() {

		String actualResult = "";
		String expectedResult = "";
		boolean operationFlag = false;

		actualResult = globalFunction.cleanString_Simple(plpPage.getResult_InformationTab());
		expectedResult = globalFunction.cleanString_Simple(plpPage.getResult_InformationTab());
		test.log(LogStatus.INFO, "Actual Result: " + actualResult);
		test.log(LogStatus.INFO, "Expected Result : " + actualResult);
		
		if(actualResult.equalsIgnoreCase(actualResult)){
			operationFlag = true;
		} else {
			operationFlag = false;
		}
		return operationFlag;
	}
	
	
	
	
	public void verifyResult(boolean ststus, String pass, String fail) {

		if (ststus) {

			test.log(LogStatus.PASS, pass);
		} else {

			test.log(LogStatus.FAIL, fail);
			String TE_Report_Screenshot = globalFunction.takeScreenShot();
			test.log(LogStatus.INFO, "ScreenShot--" + test.addScreenCapture(TE_Report_Screenshot));
		}

	}

	public void verify_text(String actualResult, String expectedResult, String Pass, String Fail) {
		if (actualResult.equalsIgnoreCase(actualResult) && actualResult!="" &expectedResult!="") {
           
			test.log(LogStatus.PASS, Pass);
		} else {

			test.log(LogStatus.FAIL, Fail);
			String TE_Report_Screenshot = globalFunction.takeScreenShot();
			test.log(LogStatus.INFO, "ScreenShot--" + test.addScreenCapture(TE_Report_Screenshot));
		}

	}

}
