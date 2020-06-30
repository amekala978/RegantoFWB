package RegantoFWB.DigitalPaySlips.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.pages.EmployeeDashboardPage;
import RegantoFWB.DigitalPaySlips.qa.pages.HelpDeskManagerDashboardPage;
import RegantoFWB.DigitalPaySlips.qa.pages.LoginPage;

public class HelpDeskManagerPageTest extends DigitalPaySlipsBase {
    
	LoginPage loginpage;
	EmployeeDashboardPage  employeedashboardpage;
	HelpDeskManagerDashboardPage helpdeskmanagerdashboardpage;
	
	public HelpDeskManagerPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		
		loginpage = new LoginPage();
		//employeedashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		helpdeskmanagerdashboardpage = employeedashboardpage.NavigateToHelpDeskManager();
	}
	
	@Test(priority=1)
	public void VerifyAdminDashboardDisplayTest() {
	boolean flag = helpdeskmanagerdashboardpage.ValidateHelpDeskPage();
		Assert.assertTrue(flag);
    boolean flag1 = helpdeskmanagerdashboardpage.TicketDetailsPage();
		Assert.assertTrue(flag1);
	boolean flag2 = helpdeskmanagerdashboardpage.TicketMessage();
		Assert.assertTrue(flag2);
		
		
		
	}
	

}
