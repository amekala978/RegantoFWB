package RegantoFWB.DigitalPaySlips.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.pages.*;

public class Employee_Persona_Pages_Test extends DigitalPaySlipsBase {
    
	LoginPage loginpage;
	Employee_Persona_Pages employeepersonapages;
	
	public Employee_Persona_Pages_Test() {
     		super(); 
	}
	
	@BeforeClass
	public void setup() throws Throwable {
		initialization();
		loginpage = new LoginPage();
		employeepersonapages = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void VerifyEmployeeProfilePageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = employeepersonapages.EmployeeProfilePage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void VerifyEmployeeMyCalendarPageDisplayTest() throws Throwable {
		Thread.sleep(2000);
		boolean flag = employeepersonapages.EmployeeMyCalendarPage();
		Assert.assertTrue(flag);
    }
	
	@Test(priority=3)
		public void VerifyEmployeeMessageboardPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = employeepersonapages.EmployeeMessageBoardPage();
			Assert.assertTrue(flag);
		}
		
		
	@Test(priority=4)
		public void VerifyEmployeeDocumentLibraryPageDisplayTest() throws Throwable {
		    Thread.sleep(3000);
		    boolean flag = employeepersonapages.EmployeeDocumentLibraryPage();
			Assert.assertTrue(flag);
		}
		
		
	 @Test(priority=5)
		public void VerifyEmployeeMyTicketsPageDisplayTest() throws Throwable {
		    Thread.sleep(4000);
			boolean flag = employeepersonapages.EmployeeMyTicketsPage();
			Assert.assertTrue(flag);
		}
		
		
	 @Test(priority=6)
		public void VerifyEmployeeVideoLibraryPageDisplayTest() throws Throwable {
		    Thread.sleep(10000);
			boolean flag = employeepersonapages.EmployeeVideoLibraryPage();
			Assert.assertTrue(flag);
		}
	 
	 
	 @Test(priority=7)
		public void VerifyEmployeeTaxCalculatorPageDisplayTest() throws Throwable {
		    Thread.sleep(4000);
			boolean flag = employeepersonapages.EmployeeTaxCalculatorPage();
			Assert.assertTrue(flag);
		}
	 
	 @Test(priority=8)
		public void VerifyEmployeeDashboardPageDisplayTest() throws Throwable {
		    Thread.sleep(4000);
			boolean flag = employeepersonapages.EmployeeDashboardPage();
			Assert.assertTrue(flag);
		}
	 
	
	@AfterClass
	public void tearDown() throws Throwable {
		Thread.sleep(3000);
		driver.quit(); 
	}
	

}
