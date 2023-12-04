package base;
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilities.TestUtils;

public class Listeners extends TestListenerAdapter implements ITestListener {
	
	private TestUtils testUtils = new TestUtils();
	private ExtentTest extentTest;
	ExtentReports extentreports;
	
	public void onTestStart ( ITestResult result) {
		
		extentTest = TestUtils.extentreports.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess (ITestResult result) {
		
		extentTest.log(Status.PASS, "Test passed");
	}
	
    public void onTestFailure( ITestResult result) {
    	extentTest.log(Status.FAIL, "Test failed");
    	extentTest.log(Status.FAIL, result.getThrowable());
    	System.out.println("test failed - screenshot captured");
    	try {
    		testUtils.Screenshots();
		} catch (IOException e) {
			
			e.printStackTrace();}
		}
    	public void onTestSkipped(ITestResult result) {
            extentTest.log(Status.SKIP, "Test skipped");
    	
    }
    	public void onFinish(ITestContext context) {
            TestUtils.extentreports.flush();
}
    	public void getnameMethod(ITestContext context) {

    		extentTest = extentreports.createTest(context.getName());
    	}
}
