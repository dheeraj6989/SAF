package Modules.MIS.ApplicationSpecificFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {

	private WebDriver driver;

	public CommonFunctions(WebDriver driver) {

		this.driver = driver;
	}

	public String getDataList(String xPath) {
		String data = "";
		try {
			String xpath = xPath;
			String[] first_xpath = xpath.split("--replace--");
			String pathToCalculateSize = first_xpath[0].substring(0,
					(first_xpath[0].length() - 1));
			System.out.println(pathToCalculateSize);

			List<WebElement> liElements = driver.findElements(By
					.xpath(pathToCalculateSize));

			for (int i = 1; i < liElements.size() + 1; i++) {
				WebElement linkElement = driver.findElement(By
						.xpath(first_xpath[0] + i + first_xpath[1]));

				data += linkElement.getText();
			}
		} catch (Exception e) {
		}
		return data;
	}

	public int getDataSize(String xPath) {

		String xpath = xPath;
		String[] first_xpath = xpath.split("--replace--");
		String pathToCalculateSize = first_xpath[0].substring(0,
				(first_xpath[0].length() - 1));
		System.out.println(pathToCalculateSize);

		List<WebElement> liElements = driver.findElements(By
				.xpath(pathToCalculateSize));

		int size = liElements.size();// getting size of the element

		return size;
	}

	public boolean checkFacetExistence(String xPath) {
		String xpath = xPath;
		String[] first_xpath = xpath.split("--replace--");
		String xpathToCheck = first_xpath[0] + "2" + first_xpath[1];
		System.out.println(xpathToCheck);
		try {

			driver.findElement(By.xpath(xpathToCheck));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String[] splitXpath(String xpath) {
		String[] newxpath = xpath.split("--replace--");
		return newxpath;
	}
}
