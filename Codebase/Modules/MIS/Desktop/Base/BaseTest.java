package Modules.MIS.Desktop.Base;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import FunctionLibrary.GlobalFunction;

public class BaseTest extends GlobalFunction{

	public ExtentTest test;
	public ExtentReports report=ExtentManager.getInstance();
	


}
