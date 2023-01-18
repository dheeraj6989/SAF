package Modules.MIS.Desktop.Pages;

import org.openqa.selenium.WebDriver;

import FunctionLibrary.GlobalFunction;

public class Page {
	
	private WebDriver webDriver = null;
	private GlobalFunction globalFunction = null;
	
	public HomePage homePage = null;
	public PDP pdp = null;
	public PGP pgp = null;
	public PLP plp = null;
	public PNP pnp = null;
	
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
		
		homePage = new HomePage(localeChoice, webDriver, globalFunctionObj);
		pdp = new PDP(localeChoice, webDriver, globalFunctionObj);
		pgp = new PGP(localeChoice, webDriver, globalFunctionObj);
		plp = new PLP(localeChoice, webDriver, globalFunctionObj);
		pnp = new PNP(localeChoice, webDriver, globalFunctionObj);
		
	}

	
}
