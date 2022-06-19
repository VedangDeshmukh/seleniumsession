package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandeling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("testuu12");
		driver.findElement(By.name("password")).sendKeys("testuu12");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();

		
		driver.switchTo().frame("mainpanel");
		
		By content = By.linkText("CONTACTS");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(content)).perform();
		
		driver.findElement(By.linkText("New Contact")).click();
		
		driver.findElement(By.name("title")).click();
		

	}

}
