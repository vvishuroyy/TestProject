package moduletest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import resources.BaseClass;

public class BusinessloginTest extends BaseClass {
	

	@BeforeTest
	public void Initialize() throws IOException
	{
		driver=Intializebrowser();// mhnun baseclass mde return driver tevl

		}	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[5][2];
		
		data[0][0]="sumit";
		data[0][1]="shere";
		
		data[1][0]="suhas";
		data[1][1]="kakade";
		
		data[2][0]="ranjya";
		data[2][1]="shinde";
		
		return data;
		
		
		
		
				
				
		
	}
	

}
