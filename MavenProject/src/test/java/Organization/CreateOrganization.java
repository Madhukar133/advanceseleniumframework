package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateOrganization {

	public static void main(String[] args) throws Throwable {
        FileInputStream fis=new FileInputStream("./src/test/resources/JsonData2.txt");
		
		//object creation
		ObjectMapper object = new ObjectMapper();
		JsonNode data = object.readTree(fis);
		
		String BROWSER = data.get("browser").asText();
		String URL= data.get("url").asText();
		String USERNAME = data.get("username").asText();
		String PASSWORD = data.get("password").asText();
		
		WebDriver driver=new EdgeDriver();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.partialLinkText("Create an Organization")).click();
		
		//To avoid dupilcates
		
		Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		
		//
		driver.findElement(By.name("accountname")).sendKeys("MSD");
		driver.findElement(By.id("phone")).sendKeys("7702921802");
		driver.findElement(By.id("email1")).sendKeys("madhukargaddam7@gmail.com");
		driver.findElement(By.name("button")).click();
		
		
		driver.findElement(By.className("small")).click();
		driver.findElement(By.className("Sign Out")).click();
		

	}

}
