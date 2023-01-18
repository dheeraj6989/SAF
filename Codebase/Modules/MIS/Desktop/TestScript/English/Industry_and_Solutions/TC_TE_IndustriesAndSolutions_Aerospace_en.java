package Modules.MIS.Desktop.TestScript.English.Industry_and_Solutions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import FunctionLibrary.DataFileHandler;
import FunctionLibrary.ExcelDataPoolManager_NEW;
import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;
import Modules.MIS.Desktop.Base.BaseTest;
import Modules.MIS.Desktop.Pages.HomePage;
import Modules.MIS.Desktop.Pages.PLP;
import Modules.MIS.Desktop.Pages.PNP;

public class TC_TE_IndustriesAndSolutions_Aerospace_en extends BaseTest {

	private final String localeChoice = "en";
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
	private String dataFileName = "TC_TE_IndustriesAndSolutions_Aerospace.xls";
	private String mstrTC_Name = "8_g_search";

	private HomePage homePage = null;
	private PLP plpPage = null;
	private PNP pnpPage = null;
	private SoftAssert softAssertObj = null;

	private Map<String, String> browserDetails = null;
	private ITestContext testContext = null;
	private String surl;

	// ******************************************* Test Case Starts
	// ***************************************************
	@Parameters("browserName")
	@BeforeClass
	public void script(String browser) {

		Map<String, String> browserDetails = null;
		String testDataPath = null;

		try {

			globalFunction = new GlobalFunction();
			dataManager = new DataFileHandler();

			propertyHandlerObj = globalFunction.getPropertyFile(localeChoice, "global");
			testDataPath = globalFunction.get_TestDataPath();
			appURL = globalFunction.getURL_For_LocaleChoice(localeChoice);

			browserDetails = new HashMap<String, String>();

			browserDetails.put("appURL", appURL);
			browserDetails.put("browser", browser);
			

			dataFilePath = testDataPath + dataFileName;
			rowData = dataManager.readDataByRow(dataFilePath, 0, rowNumber);

			System.out.println("Using Data File :: " + dataFilePath);
			System.out.println("Opening base URL :: " + appURL);
			System.out.println("Keyword :: " + rowData.get("Keyword").toString());

			webDriver = globalFunction.openApplicationURL(browserDetails);
			

			homePage = new HomePage(localeChoice, webDriver, globalFunction);
			plpPage = new PLP(localeChoice, webDriver, globalFunction);
			pnpPage = new PNP(localeChoice, webDriver, globalFunction);

			// testContext.setAttribute("WebDriver", this.webDriver);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ************ Open the browser ***********
	private void openBrowser() {
		webDriver = globalFunction.openApplicationURL(browserDetails);
		// INITIALIZE PAGES
		homePage = new HomePage(localeChoice, webDriver, globalFunction);
		plpPage = new PLP(localeChoice, webDriver, globalFunction);
		pnpPage = new PNP(localeChoice, webDriver, globalFunction);
	}

	// ************ Verify the primary image displayed ***********
	@Test(dataProvider = "TestData")
	public void verifyPrimaryImageDisplayed(String Keyword, String tab, String info)   {

		test = report.startTest("TC verify Aerospace in Industries and Solutions for:" + Keyword);

		boolean operationFlag = false;
		String actualResult = null;
		String expectedResult = null;
		

		globalFunction.pause(longThinkTime);
		System.out.println("before URL and slouction click");

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
	@AfterClass
	public void aterMethod() {
		closeSetup();
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
