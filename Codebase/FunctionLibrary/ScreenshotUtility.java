package FunctionLibrary;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;

public class ScreenshotUtility {
	
	PropertyHandler propertyHandlerObj = null;
	JavascriptExecutor jse = null;
	WebDriver webdriver = null;
	String TC_Name = "DEFAULT";
	
	private String final_path = "";
	final String propertyFileName = "global";
	final String file_ext_PNG = ".PNG";
	final String seperator_UNDERSCORE = "_";
	
	public ScreenshotUtility(WebDriver webDriver){
		this.webdriver = webDriver;
		//this.TC_Name = TC_Name;
		setup();

	}
	
	public ScreenshotUtility(){
		setup();

	}
	
	public void set_WebDriver(WebDriver webDriver){
		this.webdriver = webDriver;
		if(webdriver != null){
			if(jse != null){
				jse = (JavascriptExecutor) webdriver;
			}
		}
	}
	
	private void set_Custom_FinalPath(String custom_File_Path){
		final_path = custom_File_Path;
	}
	
	private void setup(){
		propertyHandlerObj = new PropertyHandler();
		propertyHandlerObj.setFileName(propertyFileName);
		final_path = propertyHandlerObj.readProperties("safRootPath") + propertyHandlerObj.readProperties("screenshotPath");
		if(webdriver != null){
			jse = (JavascriptExecutor) webdriver;
		}
	}
	
	public String captureScreenshot(By byObj, String unique_name) {

		String screenShotName = "";
		WebElement webElement = null;
		WebDriver augmentedDriver = null;
		String final_path_screenshot = "";
		File scrFile = null;
		
		try {
			
			webElement = webdriver.findElement(byObj);
			
			if (webElement != null) {
				try {
					jse.executeScript(
							"arguments[0].setAttribute('style', arguments[1]);",
							webElement,
							"color: black; border: 4px solid black; border-style: dashed;");
				} catch (Exception e) {
				}
				Thread.sleep(2000);
				augmentedDriver = new Augmenter().augment(webdriver);
				scrFile = ((TakesScreenshot) augmentedDriver)
						.getScreenshotAs(OutputType.FILE);
				try {
					jse.executeScript(
							"arguments[0].setAttribute('style', arguments[1]);",
							webElement, "");
				} catch (Exception e) {
				}
			} else {
				augmentedDriver = new Augmenter().augment(webdriver);
				scrFile = ((TakesScreenshot) augmentedDriver)
						.getScreenshotAs(OutputType.FILE);
			}

			screenShotName = unique_name
					.concat(seperator_UNDERSCORE)
					.concat( createTimeStampStr() )
					.concat(file_ext_PNG);
			
			/*TC_Name
			.concat(seperator_UNDERSCORE)
			.concat(unique_name)*/
			
			final_path_screenshot = final_path + "\\\\\\\\" + screenShotName;
			FileUtils.copyFile(scrFile, new File(final_path_screenshot));
			scrFile.delete();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return screenShotName;
	}
	
	public String captureScreenshot(WebDriver webdriver,WebElement webElement, String screenShotPath){

		String screenShotName="notAvailable";

		try {
			File scrFile;
			
			jse = (JavascriptExecutor) webdriver;
			if(webElement!=null){
				try{
					jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "color: black; border: 4px solid black; border-style: dashed;");
				}catch (Exception e) {
				}
				Thread.sleep(2000);
				WebDriver augmentedDriver = new Augmenter().augment(webdriver);
				scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
				try{
					jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "");
				}catch (Exception e) {
				}
			}
			else{
				WebDriver augmentedDriver =  new Augmenter().augment(webdriver);
				scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
			}

			screenShotName = createTimeStampStr() + ".PNG";
			screenShotPath+= "\\\\\\\\"+ screenShotName;
			FileUtils.copyFile(scrFile, new File(screenShotPath));
			scrFile.delete();

		} catch (Exception e) {
			System.out.println("Unable to take Screenshot");
			e.printStackTrace();
		}

		return screenShotName;
	}

	public String captureScreenshot(String screenShotPath, By byObj) {

		WebDriver augmentedDriver = null;
		WebElement webElement = null;
		File scrFile = null;
		
		try {
			
			if(byObj != null){
				try {
					webElement = webdriver.findElement(byObj);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			jse = (JavascriptExecutor) webdriver;
			if(webElement != null){
				try{
					jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "color: black; border: 4px solid black; border-style: dashed;");
				}catch (Exception e) {
				}
				Thread.sleep(1500);
				augmentedDriver = new Augmenter().augment(webdriver);
				scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
				try{
					jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "");
				}catch (Exception e) {
				}
			}
			else{
				augmentedDriver =  new Augmenter().augment(webdriver);
				scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
			}
			
			FileUtils.copyFile(scrFile, new File(screenShotPath));
			scrFile.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return screenShotPath;
	}

	public String captureScreenshot(String screenShotPath) {

		WebDriver augmentedDriver = null;
		File scrFile = null;
		
		try {
			augmentedDriver =  new Augmenter().augment(webdriver);
			scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(screenShotPath));
			scrFile.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return screenShotPath;
	}
	
	public String createTimeStampStr() throws Exception {
		Calendar mycalendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_hhmmssS");
		String timeStamp = formatter.format(mycalendar.getTime());

		return timeStamp;
	}

}
