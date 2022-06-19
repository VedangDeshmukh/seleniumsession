package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ISDisplayedandISEnabled {

	
	static WebDriver driver;
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By name = By.id("Form_submitForm_Name");
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
		if(elementUtil.doCheckIsDisplayed(name)) {
			if(elementUtil.doCheckIsEnabled(name)) {
				elementUtil.doSendKeys(name, "hello");
			}
		}
		
	}

}
