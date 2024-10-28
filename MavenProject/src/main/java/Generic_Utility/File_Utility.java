package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	
	public String getKeyAndValuePair(String key) throws Throwable {
		//step1: get the file path connection
		FileInputStream fis=new FileInputStream("C:\\Users\\Madhu\\Downloads\\propertiesfile.txt");
		
		//step2: load all the keys
		Properties pro=new Properties();
		pro.load(fis);
		
		//step3: read the key value
		String value = pro.getProperty(key);
		return value;
		
	}

}
