package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUplaod {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\Admin\\Downloads\\Bulk_Product_Upload.xls");

	}

}
