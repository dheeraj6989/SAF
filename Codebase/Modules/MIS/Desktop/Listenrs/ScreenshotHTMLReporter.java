package Modules.MIS.Desktop.Listenrs;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.VelocityContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.uncommons.reportng.HTMLReporter;

public class ScreenshotHTMLReporter extends HTMLReporter implements ITestListener {

	protected static final ScreenshotReportNGUtils SS_UTILS = new ScreenshotReportNGUtils();
	private WebDriver webDriver;

	protected VelocityContext createContext() {
		VelocityContext context = super.createContext();
		context.put("utils", SS_UTILS);
		return context;
	}

	public void onTestFailure(ITestResult tr) {
		
		ITestContext context = tr.getTestContext();

		try {
			Object webDriver = tr.getTestContext().getAttribute("WebDriver");
					
			System.out.println("-----------------> TEST FAILURE <-----------------");

			File f = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

			String outputDir = tr.getTestContext().getOutputDirectory();
			
			outputDir = "H:\\Automation_POC\\SAF\\test-output\\web_testNG";

			System.out.println(" ** outputDir :: " + outputDir);

			File saved = new File(outputDir , "ss_1"+tr.getMethod().getMethodName()+".png");
			FileUtils.copyFile(f, saved);

			System.out.println(" ** outputDir :: " + outputDir + " :: " + "ss_1"+tr.getMethod().getMethodName()+".png");
			System.out.println("Absolute path"+saved.getAbsolutePath());
			tr.setAttribute("screenshot", saved.getName());
			tr.setAttribute("screenshotURL", ((WebDriver) webDriver).getCurrentUrl());
			tr.setAttribute("outputDir", saved.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error generating screenshot: "+e);
		}
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

/*	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}



	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}*/
}