package FunctionLibrary;

import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalVariable {

	//	Global variables for dashboard
	public static int runId=1;
	
	public static String SYSTEM_BASE_PATH = "";
	public static String TEST_DATA_PATH = "";
	public static String OBJECT_REPOSITORY_PATH = "";
	
	public static final String globalSetupPropertyFile = "global";
		
	public static final String homePagePropertyFile_en = "HomePage_en";
	public static final String homePagePropertyFile_de = "HomePage_de";
	public static final String homePagePropertyFile_zh = "HomePage_zh";
	public static final String homePagePropertyFile_ja = "HomePage_ja";
	
	public static final String plpPropertyFile_en = "PLP_en";
	public static final String plpPropertyFile_de = "PLP_de";
	public static final String plpPropertyFile_zh = "PLP_zh";
	public static final String plpPropertyFile_ja = "PLP_ja";
	
	public static final String pdpPagePropertyFile_en = "PDP_en";
	public static final String pdpPagePropertyFile_de = "PDP_de";
	public static final String pdpPagePropertyFile_zh = "PDP_zh";
	public static final String pdpPagePropertyFile_ja = "PDP_ja";
	
	public static final String pgpPagePropertyFile_en = "PGP_en";
	public static final String pgpPagePropertyFile_de = "PGP_de";
	public static final String pgpPagePropertyFile_zh = "PGP_zh";
	public static final String pgpPagePropertyFile_ja = "PGP_ja";
	
	public static final String pnpPagePropertyFile_en = "PNP_en";
	public static final String pnpPagePropertyFile_de = "PNP_de";
	public static final String pnpPagePropertyFile_zh = "PNP_zh";
	public static final String pnpPagePropertyFile_ja = "PNP_ja";

	public static final String eloquaPagePropertyFile_en = "ELOQUA_en";
	public static final String eloquaPagePropertyFile_de = "ELOQUA_de";
	public static final String eloquaPagePropertyFile_zh = "ELOQUA_zh";
	public static final String eloquaPagePropertyFile_ja = "ELOQUA_ja";
	
	public static final String eloquaFormPropertyFile_en = "ELOQUA_Form_en";
	public static final String eloquaFormPropertyFile_de = "ELOQUA_Form_de";
	public static final String eloquaFormPropertyFile_zh = "ELOQUA_Form_zh";
	public static final String eloquaFormPropertyFile_ja = "ELOQUA_Form_ja";

	public static final String selfServicePropertyFile_en = "SELF_SERVICE_en";
	public static final String selfServicePropertyFile_de = "SELF_SERVICE_de";
	public static final String selfServicePropertyFile_zh = "SELF_SERVICE_zh";
	public static final String selfServicePropertyFile_ja = "SELF_SERVICE_ja";

	public static final boolean bTRUE = true;
	public static final boolean bFALSE = false;
	
	public static final String regEmailId = "te_autotest_dct@mailinator.com";
	public static final String mailinator_URL = "https://www.mailinator.com/";
	
	//public static WebDriverWait wait;
	//public static int thinkTime = 0;

	//public static String hubIpAddress = null;
	//public static String hubPortNo = null;

/*	public static WebDriverWait getWait() {
		return wait;
	}
	
	public static void setWait(WebDriverWait wait) {
		GlobalVariable.wait = wait;
	}*/
	
	/*public static int getThinkTime() {
		return thinkTime;
	}
	public static void setThinkTime(int thinkTime) {
		GlobalVariable.thinkTime = thinkTime;
	}*/


	public static String getGlobalsetuppropertyfile() {
		return globalSetupPropertyFile;
	}
	
	public static String getSelfservicepropertyfileEn() {
		return selfServicePropertyFile_en;
	}

	public static String getSelfservicepropertyfileDe() {
		return selfServicePropertyFile_de;
	}

	public static String getSelfservicepropertyfileZh() {
		return selfServicePropertyFile_zh;
	}

	public static String getSelfservicepropertyfileJa() {
		return selfServicePropertyFile_ja;
	}

	public static String getHomepagepropertyfileEn() {
		return homePagePropertyFile_en;
	}
	public static String getHomepagepropertyfileDe() {
		return homePagePropertyFile_de;
	}
	public static String getHomepagepropertyfileZh() {
		return homePagePropertyFile_zh;
	}
	public static String getHomepagepropertyfileJa() {
		return homePagePropertyFile_ja;
	}
	
	public static String getPgppagepropertyfileEn() {
		return pgpPagePropertyFile_en;
	}
	public static String getPgppagepropertyfileDe() {
		return pgpPagePropertyFile_de;
	}
	public static String getPgppagepropertyfileZh() {
		return pgpPagePropertyFile_zh;
	}
	public static String getPgppagepropertyfileJa() {
		return pgpPagePropertyFile_ja;
	}
	
	
	public static String getPlppropertyfileEn() {
		return plpPropertyFile_en;
	}
	public static String getPlppropertyfileDe() {
		return plpPropertyFile_de;
	}
	public static String getPlppropertyfileZh() {
		return plpPropertyFile_zh;
	}
	public static String getPlppropertyfileJa() {
		return plpPropertyFile_ja;
	}
	
	public static String getPdppagepropertyfileEn() {
		return pdpPagePropertyFile_en;
	}
	public static String getPdppagepropertyfileDe() {
		return pdpPagePropertyFile_de;
	}
	public static String getPdppagepropertyfileZh() {
		return pdpPagePropertyFile_zh;
	}
	public static String getPdppagepropertyfileJa() {
		return pdpPagePropertyFile_ja;
	}
	
	
	public static String getPnppagepropertyfileEn() {
		return pnpPagePropertyFile_en;
	}
	public static String getPnppagepropertyfileDe() {
		return pnpPagePropertyFile_de;
	}
	public static String getPnppagepropertyfileZh() {
		return pnpPagePropertyFile_zh;
	}
	public static String getPnppagepropertyfileJa() {
		return pnpPagePropertyFile_ja;
	}
	
	
	public static String getEloquapagepropertyfileEn() {
		return eloquaPagePropertyFile_en;
	}

	public static String getEloquapagepropertyfileDe() {
		return eloquaPagePropertyFile_de;
	}

	public static String getEloquapagepropertyfileZh() {
		return eloquaPagePropertyFile_zh;
	}

	public static String getEloquapagepropertyfileJa() {
		return eloquaPagePropertyFile_ja;
	}

	public static String getEloquaformpropertyfileEn() {
		return eloquaFormPropertyFile_en;
	}

	public static String getEloquaformpropertyfileDe() {
		return eloquaFormPropertyFile_de;
	}

	public static String getEloquaformpropertyfileZh() {
		return eloquaFormPropertyFile_zh;
	}

	public static String getEloquaformpropertyfileJa() {
		return eloquaFormPropertyFile_ja;
	}



	/*public static String getContactuspagepropertyfileEn() {
		return contactUsPagePropertyFile_en;
	}

	public static String getContactuspagepropertyfileDe() {
		return contactUsPagePropertyFile_de;
	}

	public static String getContactuspagepropertyfileZh() {
		return contactUsPagePropertyFile_zh;
	}

	public static String getContactuspagepropertyfileJa() {
		return contactUsPagePropertyFile_ja;
	}
*/
}
