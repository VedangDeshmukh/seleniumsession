package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBaseDropDown {

	static WebDriver driver;
	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By countrydrop = By.id("Form_submitForm_Country");
		
		Select s = new Select(driver.findElement(countrydrop));
		//s.selectByIndex(3);
		//s.selectByVisibleText("India");
		//s.selectByValue("Afghanistan");
		
		
		Select slect = new Select(getElement(countrydrop));
		List<WebElement> options=	slect.getOptions();
		
		System.out.println("Size of the dropdown options:"+options.size());
		
		for(WebElement e : options) {
			String text =e.getText();
			System.out.println(text);
		}
		
		
//		List<String> countrydropdown = getDropDownOptions(countrydrop);
//		
//		if(countrydropdown.size() == 21) {
//			System.out.println("Test case is pass");
//		}else {
//			System.out.println("Test case is fail");
//		}
		
		
		//selectDropDownValue(countrydrop, "India");
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownValueByIndex(By locator, int index) {
		
		Select s = new Select(getElement(locator));
		s.selectByIndex(index);
	}
	
	public static void doSelectDropDownValueByText(By locator , String text) {
		Select s = new Select(getElement(locator));
		s.selectByVisibleText(text);
	}
	
	
	public static void doSelectDropDownValueByValue(By locator , String value) {
		Select s = new Select(getElement(locator));
		s.selectByValue(value);
	}
	
	
	
	

	public static List<String> getDropDownOptions(By locator) {
		
		List<String> dropdownoptions = new ArrayList<>();
		
		Select s = new Select(getElement(locator));
			List<WebElement> dropdownelements = s.getOptions();
			
			for(WebElement e : dropdownelements) {
				String text = e.getText();
				dropdownoptions.add(text);
			}
			
			return dropdownoptions;
	}	
	
	
  public static void selectDropDownValue(By locator, String value) {
				
		Select s = new Select(getElement(locator));
			List<WebElement> dropdownelements = s.getOptions();
			
			for(WebElement e : dropdownelements) {
				String text = e.getText();
				if(text.equals(value)) {
					e.click();
					break;
				}
			}
			
	}	
}
