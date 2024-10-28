package M;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchDataFromJsonfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file = new File("./src\\test\\resources\\JsonData1.txt");
	       
		ObjectMapper jsonData = new ObjectMapper();
        JsonNode data = jsonData.readTree(file);
        
       String URL = data.get("url").asText();
		
       WebDriver driver=new ChromeDriver();
       driver.get(URL);
       
       System.out.println(URL);


	}

}
