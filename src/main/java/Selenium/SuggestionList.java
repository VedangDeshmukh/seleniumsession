package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList {

	static WebDriver driver;
	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 String admin ="ac";
		driver.get("https://"+ admin+ ":"+ admin+"@"+"www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("git");
		
		By suggestionlist = By.xpath("//ul[@class='G43f7e']//li//div[@class='pcTkSc']");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		 List<WebElement> eleList = driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@class='pcTkSc']"));
//		 
//		 for(WebElement e: eleList) {
//			 if(e.getText().equals("gitlab")) {
//				 e.click();
//				 break;
//			 }
//		 }
		
		//selectValue(suggestionlist, "gitlab");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.selectDropDownValue(suggestionlist, "gitlab");
		
	

//		
//		ElementUtil ele = new ElementUtil(driver);
//		ele.selectDropDownValue(By.xpath("//ul[@class='G43f7e']//li//div[@class='pcTkSc']"), "gitlab");
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	
	public static void selectValue(By locator , String value) {
		
	  List<WebElement> elelist =	getElements(locator);
	  for(WebElement e : elelist) {
		  if(e.getText().equals(value)) {
			  e.click();
			  break;
		  }
	  }
	}
	

}
