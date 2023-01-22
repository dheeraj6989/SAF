package Modules.MIS.Desktop.Base;



import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

public class ExtentManager extends GlobalFunction {
	private static ExtentReports extent;
	public static String envoirment=null;
	
	
	public static ExtentReports getInstance() {
				if (extent == null) {
				
			Date d = new Date();
			
			String MIS_Report = "MISAutomation"+d.toString().replace(":", "_").replace(" ", "_") +".html";
			extent = new ExtentReports(System.getProperty("user.dir")+"//report//"+ MIS_Report, true, DisplayOrder.NEWEST_FIRST);
              
			extent.loadConfig(new File(System.getProperty("user.dir") + "//ReportsConfig.xml"));
			extent.addSystemInfo("Selenium Version", "2.53.0").addSystemInfo("Envoirment","QA").addSystemInfo("Plateform", "Desktop").addSystemInfo("Browser", "Google Chrome- Version 69.0");
		}

		return extent;
	}
}
