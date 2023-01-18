package Modules.Loader;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;
import FunctionLibrary.PropertyHandler;

public class MainLoader {

	public static void main(String[] args) {

		TestListenerAdapter tla = null;
		TestNG testng = null;
		List<String> suites = null;
		
		PropertyHandler propertyHandlerObj = null;
		final String propertyFileName = "global";
		String safRootPath = null;
		String testng_path = null;
		
		try {
			
			propertyHandlerObj = new PropertyHandler();
			propertyHandlerObj.setFileName(propertyFileName);
			
			safRootPath = propertyHandlerObj.readProperties("safRootPath");
			testng_path = propertyHandlerObj.readProperties("testng_path");
			
			safRootPath += testng_path;
			
			tla = new TestListenerAdapter();
			testng = new TestNG();
			suites = Lists.newArrayList();
			//suites.add("E:/Automation_POC/SAF/Testng.xml");
			suites.add(safRootPath);
			
			testng.setTestSuites(suites);
			testng.setSuiteThreadPoolSize(2);
			testng.run();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
