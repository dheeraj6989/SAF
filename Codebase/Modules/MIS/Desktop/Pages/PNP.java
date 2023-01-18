package Modules.MIS.Desktop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

// PRODUCT NAVIGATION PAGE - PNP
public class PNP {

	// SAF OBJECTS
	public PropertyHandler propertyHandlerObj = null;
	
	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;
	
	//TE PNP OBJECTS
	public By viewAll_PictureLink = null;
	public By viewAll_SimpleLink = null;
	
	public By tabNavigaion_Products = null;
	public By prodCategory_AutomotiveTruckBusOffRoad = null;
	public By tabNavigaion_Overview = null;
	
	public By subNavigation = null;
	public By component_Copy_Intro = null;
	public By component_Copy_Leadin = null;
	public By component_Linked_list = null;
	
	public By component_Picture_Navigation_Link = null;
	public By component_Promo_Grid = null;
	public By component_PullQuota = null;
	
	public By component_Primary_Video = null;
	public By component_related_material = null;
	
	public By component_Hero_HomePage = null;
	public By component_Hero_Story = null;
	public By component_CTA_Link = null;

	public By component_Image_Row=null;
	
public By component_BioGrid=null;
public By component_Chapter_Heading=null;

public By component_Eloqua_Form=null;
	

public By comp_copy_module_body=null;
	// CTOR
	public PNP(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}
	
	// SETUP
	public void setup(String localeChoice){
		try {
			
			if(localeChoice != null && localeChoice != ""){
				
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "pnp");
				initializepageObjects();
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initializepageObjects(){
		try {

			viewAll_PictureLink = By.xpath(propertyHandlerObj.readProperties("viewAll_PictureLink"));
			viewAll_SimpleLink = By.xpath(propertyHandlerObj.readProperties("viewAll_SimpleLink"));
			//prodCategory_AutomotiveTruckBusOffRoad = By.xpath(propertyHandlerObj.readProperties("prodCategory_AutomotiveTruckBusOffRoad"));
			tabNavigaion_Products = By.xpath(propertyHandlerObj.readProperties("tabNavigaion_Products"));
			tabNavigaion_Overview = By.xpath(propertyHandlerObj.readProperties("tabNavigaion_Overview"));
			
			subNavigation= By.xpath(propertyHandlerObj.readProperties("subNavigation"));
			component_Copy_Intro= By.xpath(propertyHandlerObj.readProperties("component_Copy_Intro"));
			component_Copy_Leadin= By.xpath(propertyHandlerObj.readProperties("component_Copy_Leadin"));
			component_Linked_list= By.xpath(propertyHandlerObj.readProperties("component_Linked_list"));
			component_Picture_Navigation_Link= By.xpath(propertyHandlerObj.readProperties("component_Picture_Navigation_Link"));
			component_Promo_Grid= By.xpath(propertyHandlerObj.readProperties("component_Promo_Grid"));
			component_PullQuota= By.xpath(propertyHandlerObj.readProperties("component_PullQuota"));
			component_Primary_Video= By.xpath(propertyHandlerObj.readProperties("component_Primary_Video"));
			component_related_material= By.xpath(propertyHandlerObj.readProperties("component_related_material"));
			component_Hero_HomePage= By.xpath(propertyHandlerObj.readProperties("component_Hero_HomePage"));
			component_Hero_Story= By.xpath(propertyHandlerObj.readProperties("component_Hero_Story"));
			component_CTA_Link= By.xpath(propertyHandlerObj.readProperties("component_CTA_Link"));
			
			component_Image_Row= By.xpath(propertyHandlerObj.readProperties("component_Image_Row"));
			component_BioGrid= By.xpath(propertyHandlerObj.readProperties("component_BioGrid"));
			component_Chapter_Heading= By.xpath(propertyHandlerObj.readProperties("component_Chapter_Heading"));
			comp_copy_module_body= By.xpath(propertyHandlerObj.readProperties("comp_copy_module_body"));
			
			component_Eloqua_Form=By.xpath(propertyHandlerObj.readProperties("component_Eloqua_Form"));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
