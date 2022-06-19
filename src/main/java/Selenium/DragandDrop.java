package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By countrydrop = By.xpath("//select[@name='Country']/option");
		
		Actions act = new Actions(driver);
		act.clickAndHold().moveToElement(null).release().build().perform();
		
		System.out.println("Drag and Drop Example ");
		
	}

}
