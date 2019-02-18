package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

public WebDriver driver;	

public Properties pis;

public WebDriver Intializebrowser() throws IOException
{
	pis = new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\sumit\\workspace\\Ridefirstcomplete\\src\\main\\java\\resources\\datas.properties");
	pis.load(fis);
	
	String browsername= pis.getProperty("browser");
	
	if (browsername.equals("chrome"))
	{
		System.setProperty("Webdriver.chrome.driver","C://Chromedriver.exe");
		 driver= new FirefoxDriver();
	}
	else if (browsername.equals("firefox"))
	{
		driver= new FirefoxDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	
	
}
