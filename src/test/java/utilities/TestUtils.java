package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class TestUtils extends BaseTest{
	
	public void Screenshots() throws IOException {
		
		Date currentdate =new Date();
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilename + ".png"));
	}

}
