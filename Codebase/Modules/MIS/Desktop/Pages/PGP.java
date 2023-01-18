package Modules.MIS.Desktop.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibrary.GlobalFunction;
import FunctionLibrary.PropertyHandler;

//PRODUCT GROUP PAGE - PGP
public class PGP {

	// VARS
	
	// SAF OBJECTS
	public PropertyHandler propertyHandlerObj = null;
	
	// SELENIUM OBJECTS
	public GlobalFunction globalFunctionObj = null;
	
	// TE HOME PAGE OBJBECTS
	public By viewall_Link = null;
	public By viewall_Pic_Link = null;
	public By products_Tab = null;
	public By category_Link = null;

	public By medicalAndHealthcare_ApplicationsTab=null;
	public By medicalAndHealthcare_Applications_Comfort=null;
	public By medicalAndHealthcare_ConnectWithUs=null;
	public By medicalAndHealthcare_Contact_ConfirmationMessage = null;
	public By OverView_Tab=null;
	public By related_Material_Tab=null;
	
	
	public By component_Copy_Body=null;
	
	
	public By component_Factorial_row=null;
	public By 		component_Copy_table=null;
	public By		component_Feature_docs=null;
	public By		component_copy_Link_List=null;
	public By		component_View_All_Button=null;
	public By		component_CTA_Email=null;
	public By		component_Promo_Reference_Crafter=null;
	public By		component_Promo_Reference=null;
	public By		component_Promo_Grid=null;
	public By		component_Promo_Grid_Compact=null;
	public By		component_Related_Product_Grid=null;
	public By		component_Copy_intro=null;
	public By 		component_CTA_Link=null;
	public By component_Copy_Lead_Out=null;
	public By component_Copy_Intro=null;
	
	
	public By		component_Product_Hero=null;
	public By		component_Large_Infographic=null;
	public By 		component_Image_Row=null;
	public By component_view_All=null;
	public By component_Feature_Document=null;
	
	public  By component_CTA_Download=null;
	public By component_Video=null;
	public By component_disclamir=null;
	public By component_Bio_Grid=null;
	

	
	//----------------------------------------------------- GETTER SETTER -----------------------------------------------------

	public By getOverView_Tab() {
		return OverView_Tab;
	}

	public By getMedicalAndHealthcare_ApplicationsTab() {
		return medicalAndHealthcare_ApplicationsTab;
	}

	public By getMedicalAndHealthcare_Applications_Comfort() {
		return medicalAndHealthcare_Applications_Comfort;
	}

	public By getMedicalAndHealthcare_ConnectWithUs() {
		return medicalAndHealthcare_ConnectWithUs;
	}
	public By getMedicalAndHealthcare_Contact_ConfirmationMessage() {
		return medicalAndHealthcare_Contact_ConfirmationMessage;
	}
	
	public By getViewall_Link() {
		return viewall_Link;
	}

	public By getViewall_Pic_Link() {
		return viewall_Pic_Link;
	}

	public By getProducts_Tab() {
		return products_Tab;
	}

	public By getCategory_Link() {
		return category_Link;
	}
	//--------------------------------------------------- GETTER SETTER END ---------------------------------------------------


	// CTOR
	public PGP(String localeChoice, WebDriver webDriver,  GlobalFunction globalFunctionObj){
		this.globalFunctionObj=globalFunctionObj;
		setup(localeChoice);
	}
	
	// SETUP
	public void setup(String localeChoice){
		try {
			if(localeChoice != null && localeChoice != ""){
				propertyHandlerObj = globalFunctionObj.getPropertyFile(localeChoice, "pgp");
				initializepageObjects();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initializepageObjects(){
		try {
       
			viewall_Link = By.xpath(propertyHandlerObj.readProperties("viewall_Link"));
			viewall_Pic_Link = By.xpath(propertyHandlerObj.readProperties("viewall_Pic_Link"));
			products_Tab = By.xpath(propertyHandlerObj.readProperties("products_Tab"));
			
			medicalAndHealthcare_ApplicationsTab = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_ApplicationsTab"));
			medicalAndHealthcare_Applications_Comfort = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_Applications_Comfort"));
			medicalAndHealthcare_ConnectWithUs = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_ConnectWithUs"));
			medicalAndHealthcare_Contact_ConfirmationMessage = By.xpath(propertyHandlerObj
					.readProperties("medicalAndHealthcare_Contact_ConfirmationMessage"));
			
			OverView_Tab= By.xpath(propertyHandlerObj
					.readProperties("OverView_Tab"));
			
			
			component_Copy_Body=By.xpath(propertyHandlerObj
					.readProperties("component_Copy_Body"));

	//a ddted by adhir fir comz		
			
					component_Factorial_row=By.xpath(propertyHandlerObj
							.readProperties("component_Factorial_row"));
					component_Copy_table=By.xpath(propertyHandlerObj
							.readProperties("component_Copy_table"));
					
					component_Feature_docs=By.xpath(propertyHandlerObj
							.readProperties("component_Feature_docs"));
					
					
					component_copy_Link_List=By.xpath(propertyHandlerObj
							.readProperties("component_copy_Link_List"));
					
					
					component_View_All_Button=By.xpath(propertyHandlerObj
							.readProperties("component_View_All_Button"));
					component_CTA_Link=By.xpath(propertyHandlerObj
							.readProperties("component_CTA_Link"));
					
					component_CTA_Email=By.xpath(propertyHandlerObj
							.readProperties("component_CTA_Email"));
					
					
					component_Promo_Reference_Crafter=By.xpath(propertyHandlerObj
							.readProperties("component_Promo_Reference_Crafter"));
					
					
					component_Promo_Reference=By.xpath(propertyHandlerObj
							.readProperties("component_Promo_Reference"));
					
					
					component_Promo_Grid=By.xpath(propertyHandlerObj
							.readProperties("component_Promo_Grid"));
					
					
					component_Promo_Grid_Compact=By.xpath(propertyHandlerObj
							.readProperties("component_Promo_Grid_Compact"));
					
					
					component_Related_Product_Grid=By.xpath(propertyHandlerObj
							.readProperties("component_Related_Product_Grid"));
					
					
					component_Copy_intro=By.xpath(propertyHandlerObj
							.readProperties("component_Copy_intro"));
					
					
					component_Copy_Lead_Out=By.xpath(propertyHandlerObj
							.readProperties("component_Copy_Lead_Out"));
					
					component_Copy_Intro=By.xpath(propertyHandlerObj
							.readProperties("component_Copy_Intro"));
					
					
					component_Product_Hero=By.xpath(propertyHandlerObj
							.readProperties("component_Product_Hero"));
					
					component_Large_Infographic=By.xpath(propertyHandlerObj
							.readProperties("component_Large_Infographic"));
					
					component_Image_Row=By.xpath(propertyHandlerObj
							.readProperties("component_Image_Row"));
					
					component_view_All=By.xpath(propertyHandlerObj
							.readProperties("component_view_All"));
					
					
					component_Feature_Document=By.xpath(propertyHandlerObj
							.readProperties("component_Feature_Document"));
					
					component_CTA_Download=By.xpath(propertyHandlerObj
							.readProperties("component_CTA_Download"));
					component_Video=By.xpath(propertyHandlerObj
							.readProperties("component_Video"));
					
					component_disclamir=By.xpath(propertyHandlerObj
							.readProperties("component_discalimer"));
					
					component_Bio_Grid=By.xpath(propertyHandlerObj
							.readProperties("component_Bio_Grid"));
					related_Material_Tab=By.xpath(propertyHandlerObj
							.readProperties("related_Material_Tab"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} // CLASS END
