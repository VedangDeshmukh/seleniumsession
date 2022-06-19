package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import WebDriverBasic.BrowserUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementExist {

	
	static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		BrowserUtil br = new BrowserUtil();
		driver= br.init_Browser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		By forgetlinlk = By.linkText("Forgotten Password");
		
		
		ElementUtil ele = new ElementUtil(driver);
		
	 List<WebElement> elelist =	ele.getElements(forgetlinlk);
	 
	 	if(elelist.size()>0) {
	 		System.out.println("forgtn link displayed ");
	 	}else {
	 		System.out.println("forgtn link not displayed ");

	 	}
		
		
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static boolean elementIsExist(By locator) {
		
		 List<WebElement> eleList = getElements(locator);
		 
		 if(eleList.size()>0) {
			 System.out.println("element is present");
			 return true;
		 }else {
			 System.out.println("element is not present");

			 return false;
		 }
	}
	
		

}
