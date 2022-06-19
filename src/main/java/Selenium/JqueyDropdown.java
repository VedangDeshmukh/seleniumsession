package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverBasic.BrowserUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueyDropdown {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		BrowserUtil br = new BrowserUtil();
		driver= br.init_Browser("chrome");
		br.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By drop1 = By.id("justAnInputBox");
		By dropdownoption = By.xpath("//span[@class='comboTreeItemTitle']");
		
		
		
		driver.findElement(drop1).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		selectChoice(dropdownoption, "all");
		//selectChoice(dropdownoption, "all");

		
	}
	

	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void selectChoice(By locator, String... value) {
		
		
		 List<WebElement> optionseleList = getElements(locator);
		   System.out.println("Size of the elements"+optionseleList.size());
			  

		if(!value[0].equalsIgnoreCase("all")) {
			  
				  for(WebElement e : optionseleList) {
					  System.out.println(e.getText());
					  
					  if(!e.getText().isEmpty()) {
						  
						  for(int j=0;j<value.length;j++) {
							  
							  if(e.getText().equals(value[j])) {
								  e.click();
								  break;
							  }
						  }
					  }
				  }
		}else {
			
			try {
				for(WebElement e: optionseleList) {
					e.click();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
		}
		
		   
		
	}
	
//	public static void selectChoice(By locator, String... value) {
//
//		List<WebElement> eleList = getElement(locator);
//		System.out.println("size of elements is:" + eleList.size());
//
//		if (!value[0].equalsIgnoreCase("all")) {
//			for (WebElement e : eleList) {
//				String text = e.getText();
//
//				for (int j = 0; j < value.length; j++) {
//					if (text.equals(value[j])) {
//						e.click();
//						break;
//					}
//				}
//
//			}
//		} else {
//			// all selection logic
//			try {
//				for (WebElement e : eleList) {
//					e.click();
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//
//		}
//
//	
//	}

	
	
}
