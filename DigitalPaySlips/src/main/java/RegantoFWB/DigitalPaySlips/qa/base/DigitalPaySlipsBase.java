package RegantoFWB.DigitalPaySlips.qa.base;
//New changes for Eclipse to Azure Repos.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import RegantoFWB.DigitalPaySlips.qa.util.TestUtil;

public class DigitalPaySlipsBase {
	
	public static WebDriver driver;
	public static Properties prop;
    
	public DigitalPaySlipsBase()
	{
		try {
			prop = new Properties();
			FileInputStream fip = new FileInputStream(TestUtil.Path);
			prop.load(fip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		 
	}
	
	public static void initialization() throws Throwable {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\EdgeDriver\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver(); 
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\FirefoxGeeckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
	}
}
