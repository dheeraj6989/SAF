package Modules.MIS.Desktop.TestScript.English.Us.Login;

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

import Modules.MIS.Desktop.Pages.LgPage;

public class TC_TE_Login_en extends BaseTest {

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
	private String dataFileName = "8_g_search.xls";
	private String mstrTC_Name = "TC_TE_Login_en";

	private LgPage lgpage = null;
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
			System.out.println("Keyword :: " + rowData.get("Actul_text").toString());

			webDriver = globalFunction.openApplicationURL(browserDetails);
			globalFunction.pause(2000);
			lgpage = new LgPage(localeChoice, webDriver, globalFunction);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(dataProvider = "TestData")
	public void verify_Field_Velidationin_LoginPage(String actual, String tab, String info) {

		test = report.startTest("login page error message validation");

		boolean operationFlag = false;
		String actualResult = null;
		String expectedResult = null;

		if (globalFunction.isDisplayed(lgpage.title)) {
			try {
				test.log(LogStatus.INFO, "Login page title displayed");
				operationFlag = globalFunction.clickOnThisElement(lgpage.login_button);
				verifyResult(operationFlag, "login button clicked", "login button not clicked");
				globalFunction.pause(500);
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}

			try {
				String error = globalFunction.getElementText(lgpage.error_message);
				verify_Text(error, actual);
				test.log(LogStatus.PASS, "error message"+"::"+error);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

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

	public void verifyResult(boolean ststus, String pass, String fail) {

		if (ststus) {

			test.log(LogStatus.PASS, pass);
		} else {

			test.log(LogStatus.FAIL, fail);
			String TE_Report_Screenshot = globalFunction.takeScreenShot();
			test.log(LogStatus.INFO, "ScreenShot--" + test.addScreenCapture(TE_Report_Screenshot));
		}

	}

	/*
	 * public void verify_text(String actualResult, String expectedResult, String
	 * Pass, String Fail) { if (actualResult.equalsIgnoreCase(expectedResult) &&
	 * actualResult != "" & expectedResult != "") {
	 * 
	 * test.log(LogStatus.PASS, Pass); } else {
	 * 
	 * test.log(LogStatus.FAIL, Fail); String TE_Report_Screenshot =
	 * globalFunction.takeScreenShot(); test.log(LogStatus.INFO, "ScreenShot--" +
	 * test.addScreenCapture(TE_Report_Screenshot)); }
	 * 
	 * }
	 */
}
