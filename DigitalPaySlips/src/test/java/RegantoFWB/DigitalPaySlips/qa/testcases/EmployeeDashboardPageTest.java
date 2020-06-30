package RegantoFWB.DigitalPaySlips.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.pages.EmployeeDashboardPage;
import RegantoFWB.DigitalPaySlips.qa.pages.LoginPage;
import RegantoFWB.DigitalPaySlips.qa.util.TestUtil;

public class EmployeeDashboardPageTest extends DigitalPaySlipsBase {
    
	LoginPage loginpage;
	EmployeeDashboardPage  employeedashboardpage;
	
	public EmployeeDashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LoginPage();
		//employeedashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	//@Test(priority=2)
	public void VerifyAdminDashboardDisplayTest() {
		boolean flag = employeedashboardpage.ValidateAdminDashboardPage();
		Assert.assertTrue(flag);
	}
	
	//@Test(priority=3)
	public void VerifyPayManagerDashboardDisplayTest() {
		boolean flag = employeedashboardpage.ValidatePayManagerDashboardPage();
		Assert.assertTrue(flag);
	}
	
	//@Test(priority=4)
	public void VerifyHelpDeskAdminDashboarDisplayTest() {
		boolean flag = employeedashboardpage.ValidateHelpDeskAdminDashboardPage();
		Assert.assertTrue(flag);
	}
	
	//@Test(priority=5)
	public void VerifyHelpDeskManagerDashboardDisplayTest() {
		boolean flag = employeedashboardpage.ValidateHelpDeskManagerDashboardPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 1)
	public void AddTicketTest() throws IOException, InterruptedException
	{
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);	
	    boolean ticketadded = employeedashboardpage.AddTicket();
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);	
	    Assert.assertTrue(ticketadded);
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);	
	}
	
	
	@AfterMethod
	public void tearDown() {
				driver.quit(); 
	}
	
}
