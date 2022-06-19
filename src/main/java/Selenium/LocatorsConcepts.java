package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		//Locators are use to loate the WebElement on the WebPage 
		//formula create WebElement + prform the actios (click , sendKeys, getText, isDisplayed)
		
		
		//Different approches to create the WebElement 
		
		
		//1. 
//		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("Vedang");
//		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("emailtest");
		
		
		//2.
		
//			WebElement name = driver.findElement(By.id("Form_submitForm_Name"));
//			WebElement email = driver.findElement(By.id("Form_submitForm_Email"));
//			name.sendKeys("vednag");
//			email.sendKeys("hjjjjjj@gmail.com");
//			
			
			// 3. By locator startegy
			
//			By email = By.id("Form_submitForm_Email");
//			By name = By.id("Form_submitForm_Name");
//			
//		 driver.findElement(name);
//		 driver.findElement(email);
//		 
		 
		 //4. generic Method
		 
//		 By email = By.id("Form_submitForm_Email");
//			By name = By.id("Form_submitForm_Name");
//			getElement(name).sendKeys("vedang");
//			getElement(email).sendKeys("jkjkjk");
//			
			
			//5. genericMethod with page Actions
			
		By email = By.id("Form_submitForm_Email");
		By name = By.id("Form_submitForm_Name");
		
		doSendkeys(name, "vedamhg");
		doSendkeys(email, "abc@gmaiul.com");
		
		
		// 6. seperate class Elemenet util 
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(name, "vednag");
		ele.doSendKeys(email, "abc@gmail.com");
			
		
	}
	
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
