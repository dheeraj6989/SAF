package Modules.MIS.Desktop.Pages;

import org.openqa.selenium.WebDriver;

import FunctionLibrary.GlobalFunction;

public class Page {
	
	private WebDriver webDriver = null;
	private GlobalFunction globalFunction = null;
	
	public RegPage regpage = null;
	public MfaPage mfapage = null;
	public MinfPage minfpage = null;
	public PswPage pswpage = null;
	public LgPage lgpage = null;
	
	private String localeChoice = "";
	
	// GETTERS
	public WebDriver getWebDriver() {
		return webDriver;
	}
	public GlobalFunction getGlobalFunction() {
		return globalFunction;
	}

	// CTOR
	public Page(String localeChoice, WebDriver webDriver, GlobalFunction globalFunctionObj){
		this.localeChoice = localeChoice;
		this.webDriver = webDriver;
		this.globalFunction = globalFunctionObj;
		
		regpage = new RegPage(localeChoice, webDriver, globalFunctionObj);
		lgpage = new LgPage(localeChoice, webDriver, globalFunctionObj);
		minfpage = new MinfPage(localeChoice, webDriver, globalFunctionObj);
		mfapage = new MfaPage(localeChoice, webDriver, globalFunctionObj);
		pswpage = new PswPage(localeChoice, webDriver, globalFunctionObj);
		
	}

	
}
