package base;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TestUtils;

public class Listeners extends TestUtils implements ITestListener {
	
	public void onTestStart ( ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
	}
	
	public void onTestSuccess (ITestResult result) {
		Reporter.log("Status of execution is - "+result.getStatus());
	}
	
    public void onTestFailure( ITestResult result) {
    	
    	System.out.println("test failed - screenshot captured");
    	try {
    		Screenshots();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    }
}
