package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverBasic.BrowserUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlelinks {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		BrowserUtil br = new BrowserUtil();
		driver= br.init_Browser("chrome");
		br.launchUrl("https://www.google.co.in/");
		
		
		By links = By.xpath("//div[@id='SIvCob']//a");
		
//		 List<WebElement> googlelinks = driver.findElements(links);
//		 
//		 System.out.println("size of links is "+googlelinks.size());
//		 
//		 for(WebElement e : googlelinks) {
//			  String text =e.getText();
//			  if(!text.isEmpty()) {
//				  System.out.println(text);
//				  if(text.equals("मराठी")) {
//					  e.click();
//					  break;
//				  }
//			  }
//		 }
		
		clickOnLink(links, "मराठी");
		
		
	}
	
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
//	public static void clickOnLink(By locator, String value) {
//
//		List<WebElement> links = getElements(locator);
//		System.out.println("size of links" + links.size());
//
//		for (WebElement e : links) {
//
//			String text = e.getText();
//			if (!text.isEmpty()) {
//				System.out.println(text);
//
//				if (text.equals(value)) {
//					e.click();
//					break;
//				}
//			}
//
//		}
//
//	}
	
	public static void clickOnLink(By loator, String value) {

		List<WebElement> elelist = getElements(loator);
		System.out.println("Size of the links is" + elelist.size());

		for (WebElement e : elelist) {
			String text = e.getText();

			if (!text.isEmpty()) {
				System.out.println(text);

				if (text.equals(value)) {
					e.click();
					break;
				}
			}
		}
	}

}
