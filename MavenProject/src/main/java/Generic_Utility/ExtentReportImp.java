package Generic_Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportImp implements ITestListener {
	
	ExtentTest test;
	ExtentReports report;
	
	public void onStart(ItestContext context) {
		String time=new Date().toString().replace(" ","_").replace(":","_");
		Java_Utility jlib= new Java_Utility();
		Object ranNum = jlib.getRandomNum();
		
		ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReports/Reports.html"+time);
		spark.config().setDocumentTitle("VtigerReport");
		spark.config().setReportName("Madhu");
		spark.config().setTheme(Theme.STANDARD);
		
		//System configuration
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Platform","Windows10");
		report.setSystemInfo("ExecutedBy","Nani");
		
	}
	public void onTestFailure(ITestResult result) {//@Test
		test=report.createTest(result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		System.out.println("---->>Test FAIL<<----");
		String screenShot=null;
		try {
			WebDriver_utility.takeScreenShot1(BaseClass.sdriver,result.getMethod().getMethodName());
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenShot);
	}
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
		System.out.println("--->>Test SKIP<<---");
	}
	public void onFinish(ITestContext context) {
		report.flush();
	}

}

