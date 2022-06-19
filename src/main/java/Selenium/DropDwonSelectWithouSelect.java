package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDwonSelectWithouSelect {

	static WebDriver driver;
	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By countrydrop = By.xpath("//select[@name='Country']/option");
		
//		List<WebElement> dropdownelement =	driver.findElements(countrydrop);
//		
//		for(WebElement e : dropdownelement) {
//			String text= e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		
		SelectDropDownValue(countrydrop, "India");
	}
	
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void SelectDropDownValue(By locator , String value) {
		
	List<WebElement> dropdownelements =	driver.findElements(locator);
		
		for(WebElement e : dropdownelements) {
			String text= e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		
	}
	}
	
}