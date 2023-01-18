package Modules.MIS.ApplicationSpecificFunctions;

//---------- JAVA----------//
import java.util.List;

//---------- Selenium----------//
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.*;


public class CustomFunctions {


	public String getDataList(WebDriver webdriver , String xPath)
	{
		WebDriver driver=webdriver;

		String xpath=xPath;
		String[] first_xpath=xpath.split("-replace-");
		String pathToCalculateSize=first_xpath[0].substring(0,(first_xpath[0].length()-1));
		//		System.out.println(pathToCalculateSize);


		List<WebElement> liElements = driver.findElements(By.xpath(pathToCalculateSize));

		String data="";
		try{
			for (int i = 1; i < liElements.size()+1; i++) {
				try{
					WebElement linkElement = driver.findElement(By.xpath(first_xpath[0] + i+first_xpath[1]));  
					data+=linkElement.getText();
				}catch(Exception e){
				}
			}
		}catch(Exception e){
		}
		return data;
	}
	public String getDataSize(WebDriver webdriver , String xPath)
	{
		WebDriver driver=webdriver;

		String xpath=xPath;
		String[] first_xpath=xpath.split("-replace-");
		String pathToCalculateSize=first_xpath[0].substring(0,(first_xpath[0].length()-1));
		List<WebElement> liElements = driver.findElements(By.xpath(pathToCalculateSize));
		Integer size=liElements.size();
		return size.toString();
	}

	public int getDataList_size(WebDriver webdriver , String xPath)
	{

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~xPath : "+xPath);

		WebDriver driver=webdriver;

		String xpath=xPath;
		String[] first_xpath=xpath.split("--replace--");
		String pathToCalculateSize=first_xpath[0].substring(0,(first_xpath[0].length()-1));

		System.out.println(pathToCalculateSize);


		List<WebElement> liElements = driver.findElements(By.xpath(pathToCalculateSize));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FROM FUNCTION " + liElements.size());


		return liElements.size();
	}

}
