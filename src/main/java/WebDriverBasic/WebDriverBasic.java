package WebDriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasic {

	public static void main(String[] args) {

		
		// it start the selenium server
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		//launch the browser 
		// new chromeDriver() is class and WebDriver is Interface
		WebDriver driver = new ChromeDriver(); //top casting
		
		driver.get("https://www.google.com");
//		
		String title =driver.getTitle();
//		 
//		 
		 // validation
		 if(title.equals("Google")) {
			 System.out.println("Test Case pass");
		 }else{
			 System.out.println("Test Case fail");

		 }
		 
		 
		 System.out.println(driver.getCurrentUrl()); // method to get the url of the page 
		 System.out.println(driver.getPageSource());
		 driver.close();

	}

}
