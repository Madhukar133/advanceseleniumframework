package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void bs() {
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Parallel execution");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("launching Browser");
	}
	
	@BeforeMethod
	public void  bm() {
		System.out.println("login to application");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("logout from application");
	}
	@AfterClass
	public void ac() {
		System.out.println("close the browser");
	}
	
	@AfterTest
	public void at() {
		System.out.println("parallel excution done");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("close the database Connection");
	}
	

}
