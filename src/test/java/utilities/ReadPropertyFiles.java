package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFiles {
	
	public void main() throws IOException 

	{
		FileReader frCong = new FileReader("E:\\SeleniumTrainingWorkspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		
		p.load(frCong);
		
		
	}

}
