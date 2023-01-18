package Modules.MIS.Desktop.Listenrs;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import FunctionLibrary.GlobalFunction;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;


public class ScreenshotListener extends TestListenerAdapter {

	private WebDriver webDriver;

	private boolean createFile(File screenshot) {
		boolean fileCreated = false;

		if (screenshot.exists()) {
			fileCreated = true;
		} else {
			File parentDirectory = new File(screenshot.getParent());
			if (parentDirectory.exists() || parentDirectory.mkdirs()) {
				try {
					fileCreated = screenshot.createNewFile();
				} catch (IOException errorCreatingScreenshot) {
					errorCreatingScreenshot.printStackTrace();
				}
			}
		}

		return fileCreated;
	}

	private void writeScreenshotToFile(WebDriver driver, File screenshot) {
		try {

			FileOutputStream screenshotStream = new FileOutputStream(screenshot);
			screenshotStream.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			screenshotStream.close();
		} catch (IOException unableToWriteScreenshot) {
			System.err.println("Unable to write " + screenshot.getAbsolutePath());
			unableToWriteScreenshot.printStackTrace();
		}
	}


	public ScreenshotListener(String localeChoice, WebDriver webDriver,
			GlobalFunction globalFunction) {
		this.webDriver = webDriver;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onTestFailure(ITestResult failingTest) {
		try {
			System.out.println("inside on testfailure");

			String screenshotDirectory ="D:\\New_Eclipse\\PageObjectModelDemo";
			String screenshotAbsolutePath = screenshotDirectory + File.separator + System.currentTimeMillis() + "_" + failingTest.getName() + ".png";
			File screenshot = new File(screenshotAbsolutePath);
			if (createFile(screenshot)) {
				try {
					writeScreenshotToFile(webDriver, screenshot);
				} catch (ClassCastException weNeedToAugmentOurDriverObject) {
					writeScreenshotToFile(new Augmenter().augment(webDriver), screenshot);
				}
				System.out.println("Written screenshot to " + screenshotAbsolutePath);
			} else {
				System.err.println("Unable to create " + screenshotAbsolutePath);
			}
			String test ="<a href=\"" + screenshotAbsolutePath + "\"><p align=\"left\">Add New PR screenshot at " + new Date()+ "</p>";
			Reporter.setEscapeHtml(false);
			Reporter.log(test);

		} catch (Exception ex) {
			System.err.println("Unable to capture screenshot...");
			ex.printStackTrace();
		}
	}
}