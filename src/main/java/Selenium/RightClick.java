package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		// User Actions are handel by the Actions class in Selenium 
		//		Actions act = new Actions(driver);


		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		
		By rightclick = By.xpath("//span[text()='right click me']");
		By options = By.xpath("//li[contains(@class,'context-menu-item context-menu-icon ')]");
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(rightclick)).perform();
		
		 List<WebElement> elelist = driver.findElements(options);
		 for(WebElement e : elelist) {
			 
			 if(e.getText().equals("Copy")) {
				 e.click();
				 break;
			 }
		 }
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void rightClickAndSelect(By rightclickelementlocator, By optionslocator, String value) {

		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(rightclickelementlocator)).perform();

		List<WebElement> elelist = driver.findElements(optionslocator);
		for (WebElement e : elelist) {

			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

}
