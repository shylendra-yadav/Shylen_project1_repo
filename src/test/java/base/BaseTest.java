package base;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		if(driver==null) {
			
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
			FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locator.properties");
			prop.load(fr1);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			driver.get(prop.getProperty("testurl"));
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firfox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			driver.get(prop.getProperty("testurl"));
			
		}
	}
	    @AfterMethod
		public void afterTest() {
			driver.quit();
			
		
	    
            

}}
