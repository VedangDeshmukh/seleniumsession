package Selenium;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getColor {

	
	
	
	static WebDriver driver;
	
	
	
	private static final Color GREEN = Color.fromString("green");
	private static final Color WHITE = Color.fromString("white");
	private final Color TRANSPARENT = Color.fromString("transparent");

	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By sales = By.linkText("CONTACT SALES");
		
		
		
		//************ Color Handeling*******************************
		
		//1 approch
		
		WebElement element= driver.findElement(By.linkText("CONTACT SALES"));
		
	/*	String color= element.getCssValue("color");
		System.out.println(color);
		
		System.out.println("elemt bg color:"+element.getCssValue(element.getCssValue("background-color")));
		*/
			
/*		//2 Color class
		
		
		String contactsalecolor = (Color.fromString(element.getCssValue("color")).asHex()).toString();
		String contactsalebgcolor = (Color.fromString(element.getCssValue("background-color")).asHex()).toString();
		
		System.out.println("color:"+contactsalecolor);
		System.out.println("bgcolor:"+contactsalebgcolor);
		
		assertEquals(contactsalecolor, "#ffffff");
		assertEquals(contactsalebgcolor, "#17a954");
		
		
	*/
		
		//3 Approch
		
		Color loginButtonColour = getElementColor(sales);
		Color loginButtonBackgroundColour = Color.fromString(element.getCssValue("background-color"));
		
		System.out.println(loginButtonColour);
		System.out.println(loginButtonBackgroundColour);
		assert loginButtonBackgroundColour.equals(GREEN);
		
		//getElement(sales).getCssValue("font");
		System.out.println(getElement(sales).getCssValue("fontsize"));
		
		//System.out.println(getElement(sales).getCssValue("height"));
		
		
		
		By label = By.xpath("//label[text()='Full Name']");
		
System.out.println("aAAA:"+getElement(label).getSize());	
System.out.println("nnnn:"+getElement(label).getCssValue("font-style"));
System.out.println("nnnn:"+getElement(label).getCssValue("font-size"));

		//************** Handing the diensions*****************************
		
		 Dimension dm = getElement(sales).getSize();
		 
		 System.out.println(dm.getHeight());
		 System.out.println(dm.getWidth());
		 
		 



		
		//background, font, border, border-top, margin,margin-top, padding, padding-top, list-style, outline, pause, cue
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	
	public static Color getElementColor(By locator) {
		
		return Color.fromString(getElement(locator).getCssValue("color"));
	}
	
	public static int getElementHeight(By locator) {
		 Dimension dimesions = getElement(locator).getSize();
		 return dimesions.getHeight();
	}
	
	public static int getElementWeidth(By locator) {
		 Dimension dimesions = getElement(locator).getSize();
		 return dimesions.getWidth();
	}
	
	public static String getTextFont(By locator) {
		 return getElement(locator).getCssValue("font-style");
	}
	
	public static String getTextSizet(By locator) {
		 return getElement(locator).getCssValue("font-size");
	}
	
	
	      
}
