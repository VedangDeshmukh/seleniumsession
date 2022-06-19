package TestNgBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgB {
	
	//TestNg we use to maintain the test cases to write the test cases
	//provide different features
	//- reporting : able to geneate the html report
	//- able to priorities the test cases
	//- able to applay the asserstion : validation 
	//- able to prove the data to the test case
	
	
	
/*	BS------DBconnection
	BT------Create user
	BC------ launch url
	
	BM------ Login to application
	Test------ verify application
	AM------ logout 
	
	BM------ Login to application
	Test------ verify logout feature
	AM------ logout 
	
	AC------ logout 
	AT------ delete user 
	
	
	AS------ close db connection */

	
	
	@BeforeSuite
	public void DBconnection() {
		System.out.println("BS------DBconnection");
	}
	
	@BeforeTest
	public void CreateUser() {
		System.out.println("BT------Create user");

	}
	
	@BeforeClass
	public void launchurl() {
		System.out.println("BC------ launch url");

	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM------ Login to application");

	}
	
	@Test
	public void verifyApplication() {
		System.out.println("Test------ verify application");

	}
	
	@Test
	public void  verifylogoutfeature() {
		System.out.println("Test------ verify logout feature");

	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM------ logout ");
	}
	
	@AfterClass
	public void closeUrl() {
		System.out.println("AC------ logout ");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT------ delete user ");

	}
	
	@AfterSuite
	public void closeDBconnection() {
		System.out.println("AS------ close db connection ");

	}

}
