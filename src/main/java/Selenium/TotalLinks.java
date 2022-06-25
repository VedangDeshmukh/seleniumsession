package Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverBasic.BrowserUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	
	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		BrowserUtil br = new BrowserUtil();
		driver= br.init_Browser("chrome");
		br.launchUrl("https://www.amazon.in/");
		
		
		//By links = By.tagName("a");
		
		By images = By.tagName("img");
		
		
//	List<WebElement> linkslist =driver.findElements(links);
//	
//	System.out.println("size of links are:"+linkslist.size());
//	
////	for(int i=0; i<linkslist.size();i++) {
////		String text =linkslist.get(i).getText();
////		
////		if(!text.isEmpty()) {
////			System.out.println(text);
////		}
////		
////	}
//	
//	int index=0;
//	
//	for(WebElement e : linkslist) {
//		
//		String text =e.getText();
//		if(!text.isEmpty()) {
//			System.out.println(index+":"+ text);
//		}
//		index++;
//	}
//		
		
		
//		{{ List<WebElement> linkseleList =	driver.findElements(links);
//	System.out.println("Total links are:"+linkseleList.size());
//	
//	for(int i =0 ; i<linkseleList.size();i++) {
//		
//		 String text =linkseleList.get(i).getText();
//		 
//		 if(!text.isEmpty()) {
//			 System.out.println(text);
//		 }
//	}
//	
//	
//	System.out.println("==================================================");
//	
//	
//	int index =0;
//	for(WebElement e : linkseleList) {
//		 String text= e.getText();
//		 
//		 if(!text.isEmpty()) {
//			 System.out.println(index+":"+text);
//		 }
//		 index++;
//	}
//	
//		}}
		
		
		 List<WebElement> imageEleList = getElements(images);
		  
		  for(int i =0 ;i<imageEleList.size();i++) {
			  
			  
			 String text= imageEleList.get(i).getAttribute("src");
			 
			 if(!text.isEmpty()) {
				 System.out.println("image src value ---->"+text);
			 }
		  }
	
	}
	
	
	public static List<String> getLinksTextList(By locator) {
		
		ArrayList<String> linkstext = new ArrayList<String>();
		
		List<WebElement> elelist = getElements(locator);
		System.out.println("Size of the list is "+elelist.size());
		
		for(WebElement e : elelist) {
			
			String text =e.getText();
			if(!text.isEmpty()) {
				linkstext.add(text);
			}
			
			
		}
		
		return linkstext;
	}
	
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	
	

}
