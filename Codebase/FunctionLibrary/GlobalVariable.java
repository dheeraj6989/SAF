package FunctionLibrary;

import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalVariable {

	//	Global variables for dashboard
	public static int runId=1;
	
	public static String SYSTEM_BASE_PATH = "";
	public static String TEST_DATA_PATH = "";
	public static String OBJECT_REPOSITORY_PATH = "";
	
	public static final String globalSetupPropertyFile = "global";
		
	public static final String regPagePropertyFile_en = "RegPage_en";
	public static final String regPagePropertyFile_sp = "RegPage_sp";
	public static final String regPagePropertyFile_po = "RegPage_po";
	
	public static final String lgPagePropertyFile_en = "LgPage_en";
	public static final String lgPagePropertyFile_sp = "LgPage_sp";
	public static final String lgPagePropertyFile_po = "LgPage_po";
	
	
	public static final String mfaPagePropertyFile_en = "MFAPage_en";
	public static final String mfaPagePropertyFile_sp = "MFAPage_sp";
	public static final String mfaPagePropertyFile_po = "MFAPage_po";
	
	
	public static final String minfPagePropertyFile_en = "MINFPage_en";
	public static final String minfPagePropertyFile_sp = "MINFPage_sp";
	public static final String minfPagePropertyFile_po = "MINFPage_po";
	
	
	public static final String pswPagePropertyFile_en = "PSWPage_en";
	public static final String pswPagePropertyFile_sp = "PSWPage_sp";
	public static final String pswPagePropertyFile_po = "PSWPage_po";
	
	public static final boolean bTRUE = true;
	public static final boolean bFALSE = false;
	
	public static final String regEmailId = "te_autotest_dct@mailinator.com";
	public static final String mailinator_URL = "https://www.mailinator.com/";
	

	public static String getGlobalsetuppropertyfile() {
		return globalSetupPropertyFile;
	}

// Registration Page
	public static String getRegpagepropertyfileEn() {
		return regPagePropertyFile_en;
	}
	public static String getRegpagepropertyfileSp() {
		return regPagePropertyFile_sp;
	}
	public static String getRegpagepropertyfilePo() {
		return regPagePropertyFile_po;
	}
	  
	//Login Page
	public static String getLgpagepropertyfileEn() {
		return lgPagePropertyFile_en;
	}
	public static String getLgpagepropertyfileSp() {
		return lgPagePropertyFile_sp;
	}
	public static String getLgpagepropertyfilePo() {
		return lgPagePropertyFile_po;
	}
	
	//MFA Page
	public static String getmfapagepropertyfileEn() {
		return mfaPagePropertyFile_en;
	}
	public static String getmfapagepropertyfileSp() {
		return mfaPagePropertyFile_sp;
	}
	public static String getmfapagepropertyfilePo() {
		return mfaPagePropertyFile_po;
	}
	
	// Missing info Page
	public static String getminfpagepropertyfileEn() {
		return minfPagePropertyFile_en;
	}
	public static String getminfpagepropertyfileSp() {
		return minfPagePropertyFile_sp;
	}
	public static String getminfpagepropertyfilePo() {
		return minfPagePropertyFile_po;
	}
	
	
	// Password  Page that contain forget user name and password, temp password, reset password, change password 
		public static String getpswpagepropertyfileEn() {
			return pswPagePropertyFile_en;
		}
		public static String getpswpagepropertyfileSp() {
			return pswPagePropertyFile_sp;
		}
		public static String getpswpagepropertyfilePo() {
			return pswPagePropertyFile_po;
		}
	}
