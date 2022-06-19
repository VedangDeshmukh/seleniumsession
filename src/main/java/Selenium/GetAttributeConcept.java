package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {

	
	static WebDriver driver;
	
	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.get("https://www.amazon.in/");
		
		By images = By.tagName("img");

		
		 //By email = By.id("Form_submitForm_Email");
		
//	String attributevalue=	driver.findElement(email).getAttribute("name");
//	System.out.println(attributevalue);
//		
		 
//		 ElementUtil ele = new ElementUtil(driver);
//		String attributevalue= ele.doGetAttributeValue(email, "name");
//		System.out.println(attributevalue);
		
	List<WebElement> elelist= 	driver.findElements(images);
	
	for(WebElement e : elelist) {
		String src=	e.getAttribute("src");
		System.out.println("image1:"+src);
	}
		
	}
	
	

}
