package TestNgBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTest {

	
	
	
	@Test
	public void verifyTitleTest() {
			String title= driver.getTitle();
			System.out.println("title of page is:"+title);
			
			Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void verifyPageUrlTest() {
		String url =driver.getCurrentUrl();
		System.out.println("url of page is :"+url);
		Assert.assertTrue(url.contains("https://www.amazon.in/"));
		
	}
	
	@Test()
	public void searchBoxExistTest() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	}
	
	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class})
	public void testmetod() {
		int n=10;
		int c = n/0;
	}
	
	
	
}
