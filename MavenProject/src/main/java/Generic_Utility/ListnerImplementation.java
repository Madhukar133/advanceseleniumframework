package Generic_Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener {
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
		Object takeScreenshot;
		File src=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./FiledTestScript.png");
		
		try {
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
