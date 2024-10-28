package Organization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Generic_Utility.File_Utility;
import ObjectRepository.LoginPage;

public class CreateCampaign {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		

		//Reading data from File_Utility;
		File_Utility flib=new File_Utility();
		
		String BROWSER = flib.getKeyAndValuePair("browser");
		String URL= flib.getKeyAndValuePair("url");
		String USERNAME = flib.getKeyAndValuePair("username");
		String PASSWORD = flib.getKeyAndValuePair("password");
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		
		//implemented using getter methods
		LoginPage login = new LoginPage(driver);
		login.loginToVtiger(USERNAME, PASSWORD);
		
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
//		
		System.out.println(URL);

	}

}
