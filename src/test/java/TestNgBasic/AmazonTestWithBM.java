package TestNgBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestWithBM {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	
	@Test(invocationCount = 5)
	public void verifyTitleTest() {
			String title= driver.getTitle();
			System.out.println("title of page is:"+title);
			
			Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
//	@Test
//	public void verifyPageUrlTest() {
//		String url =driver.getCurrentUrl();
//		Assert.assertTrue(url.contains("https://www.amazon.in/"));
//		
//	}
//	
//	@Test
//	public void Va() {
//		System.out.println("VA");
//	}
//	
//	@Test
//	public void VB() {
//		System.out.println("VB");
//	}
//	
//	@Test
//	public void searchBoxExistTest() {
//		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
//	}
//	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
