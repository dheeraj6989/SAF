package Modules.Loader;
import FunctionLibrary.GlobalFunction;
import Modules.MIS.Desktop.Pages.Page;

public class TEST_PAGE_WORING {
	
	public static void main(String[] args) {
		
		String localeChoice = "en";
		GlobalFunction globalFunction = null;
		Page page = null;
		
		try {
			System.out.println("CHECKING IF ALL PAGES ARE INITIALIZING PROPERLY");
			globalFunction = new GlobalFunction();
			page = new Page(localeChoice, null, globalFunction);
			System.out.println("WORKING FINE");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}