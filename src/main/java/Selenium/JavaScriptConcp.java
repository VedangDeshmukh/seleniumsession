package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcp {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		System.out.println(js.executeScript("return document.title").toString());
		
		//System.out.println(js.getPTitleByJS());
		
//		js.refreshBrowserByJS();
//		
//		System.out.println(js.getPageInnerText());
		
		//js.generateAlertByJS("This is genearted aleart");
		
		//js.clickOn(driver.findElement(By.linkText("CONTACT SALES")));

	}

}
