package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Generic_Utility.File_Utility;

public class FtechingDataFromJsonFile2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//step1: getting the connection of the file
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
		
		System.out.println(URL);
		

	}

}
