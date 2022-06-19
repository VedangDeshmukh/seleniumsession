package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fotterlinks {

	static WebDriver driver;
	
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 By links = By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//a");
		 
		  List<String> fotterlinks = getLinkTextList(links);
		  
		  if(fotterlinks.contains("Amazon Cares")) {
			  System.out.println("Pass ");
		  }else {
			  System.out.println("Faild");
		  }
		 
		 
		 
		 
		
	}
	
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	
	public static List<String> getLinkTextList(By locator) {
		
		List<String> linktext = new ArrayList<>();
		
		 List<WebElement> eleList = getElements(locator);
		 System.out.println("size of elements:"+eleList.size());
		 for(WebElement e : eleList) {
			 
			 if(!e.getText().isEmpty())
				 
				 System.out.println(e.getText());
			 	linktext.add(e.getText());
		 }
		 
		 return linktext;
	}

}
