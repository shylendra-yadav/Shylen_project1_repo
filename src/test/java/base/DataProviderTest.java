package base;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	@DataProvider(name= "searchData")
	public Object[] dataset1()
	{
		return new Object[] {"Dell","HP","Mac"};
			
		}
	
	}


