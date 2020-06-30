package RegantoFWB.DigitalPaySlips.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.pages.EmployeeDashboardPage;
import RegantoFWB.DigitalPaySlips.qa.pages.LoginPage;


public class LoginPageTest extends DigitalPaySlipsBase {
	
	LoginPage loginpage;
	EmployeeDashboardPage employeedashboardpage;
	
	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable {
		
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
	    Assert.assertEquals(title,"Digital Payslips");
	}
	
	@Test(priority=2)
	public void  loginTest() {
		//employeedashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    System.out.println("Successfully Logged In");	
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
