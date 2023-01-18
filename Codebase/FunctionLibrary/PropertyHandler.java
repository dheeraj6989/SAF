package FunctionLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyHandler {

	private static final String USER_DIR_STR = "user.dir";
	private static final String SYSTEM_BASE_PATH = System.getProperty(USER_DIR_STR);
	
	private InputStreamReader fis;
	private Properties p;

    /*System.out.println("Working Directory = " +
            System.getProperty("user.dir"));*/

	// private static String basePath = "D:\\Automation_POC\\SAF\\Codebase\\ObjectRepository\\";
	private static String basePath = SYSTEM_BASE_PATH + "\\Codebase\\ObjectRepository\\";
	private static String fileExtn = ".properties";	
	
	public PropertyHandler(){
		GlobalVariable.SYSTEM_BASE_PATH = SYSTEM_BASE_PATH;
	}
	
	public boolean setFileName(String fileName) {
		String error;

		try {
			fis= new InputStreamReader(
			new FileInputStream(basePath + fileName + fileExtn), "UTF8");
			
			p = new Properties();
			p.load(fis);
		} catch (FileNotFoundException fe) {
			error = "Unable to open file " + fileName + ".properties";
			System.out.println(error);
			return false;
		} catch (IOException io) {
			error = "Unable to load File " + fileName + ".properties";
			System.out.println(error);
			return false;
		}
		return true;
	}

	public String readProperties(String key) {
		String data = null;
		try {
			data = p.getProperty(key);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return data;
	}
	
	public String getURL_For_LocaleChoice_OLD(String localeChoice){
		String appURL = null;
		try {
			if(localeChoice != null){
				if(localeChoice.equalsIgnoreCase("en")){
					appURL = readProperties("appURL_en");
				} else if(localeChoice.equalsIgnoreCase("zh")){
					appURL = readProperties("appURL_zh");
				} else if(localeChoice.equalsIgnoreCase("ja")){
					appURL = readProperties("appURL_ja");
				} else if(localeChoice.equalsIgnoreCase("de")){
					appURL = readProperties("appURL_de");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return appURL;
	}
	
}
