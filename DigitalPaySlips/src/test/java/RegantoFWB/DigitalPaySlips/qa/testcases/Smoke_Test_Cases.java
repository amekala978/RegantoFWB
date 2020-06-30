package RegantoFWB.DigitalPaySlips.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.pages.Administrator_Persona_Pages;
import RegantoFWB.DigitalPaySlips.qa.pages.Employee_Persona_Pages;
import RegantoFWB.DigitalPaySlips.qa.pages.Help_Desk_Admin_Persona_Pages;
import RegantoFWB.DigitalPaySlips.qa.pages.Help_Desk_Manager_Persona_Pages;
import RegantoFWB.DigitalPaySlips.qa.pages.LoginPage;
import RegantoFWB.DigitalPaySlips.qa.pages.PayManager_Persona_Pages;


public class Smoke_Test_Cases extends DigitalPaySlipsBase {
    
	LoginPage loginpage;
	Employee_Persona_Pages employeepersonapages;
	Administrator_Persona_Pages  adminpersonapages;
	PayManager_Persona_Pages  paymanagerpersonapages;
	Help_Desk_Manager_Persona_Pages  helpdeskmanagerpersonapages;
	Help_Desk_Admin_Persona_Pages   helpdeskadminpersonapages;
	
	
	public Smoke_Test_Cases() {
     		super(); 
	}
	
	@BeforeClass 
	public void setup() throws Throwable {
		initialization();
		loginpage = new LoginPage();
		employeepersonapages = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
  //Employee Persona Pages

	@Test(priority=1)
	public void VerifyEmployeeProfilePageDisplayTest() throws Throwable {
	   Thread.sleep(3000);
	   boolean flag = employeepersonapages.EmployeeProfilePage();
	   	Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void VerifyEmployeeMyCalendarPageDisplayTest() throws Throwable {
	 	boolean flag = employeepersonapages.EmployeeMyCalendarPage();
	 	Assert.assertTrue(flag);
    }
	
	@Test(priority=3)
	public void VerifyEmployeeMessageboardPageDisplayTest() throws Throwable {
			boolean flag = employeepersonapages.EmployeeMessageBoardPage();
	   		Assert.assertTrue(flag);
		}
		
		
	@Test(priority=4)
		public void VerifyEmployeeDocumentLibraryPageDisplayTest() throws Throwable {
		    boolean flag = employeepersonapages.EmployeeDocumentLibraryPage();
		 	Assert.assertTrue(flag);
		}
		
		
	 @Test(priority=5)
		public void VerifyEmployeeMyTicketsPageDisplayTest() throws Throwable {
		 	boolean flag = employeepersonapages.EmployeeMyTicketsPage();
		 	Assert.assertTrue(flag);
		}
		
		
	 @Test(priority=6,enabled=false)
		public void VerifyEmployeeVideoLibraryPageDisplayTest() throws Throwable {
			boolean flag = employeepersonapages.EmployeeVideoLibraryPage();
			Assert.assertTrue(flag);
		}
	 
	 
	 @Test(priority=7,enabled=false)
	  	public void VerifyEmployeeTaxCalculatorPageDisplayTest() throws Throwable {
			boolean flag = employeepersonapages.EmployeeTaxCalculatorPage();
			Assert.assertTrue(flag);
		}
	 
	 @Test(priority=8)
		public void VerifyEmployeeDashboardPageDisplayTest() throws Throwable {
		   	boolean flag = employeepersonapages.EmployeeDashboardPage();
			Assert.assertTrue(flag);
		}
	 
	 @Test(priority=9)
		public void VerifyEmployeeAddTicket() throws Throwable {
			Thread.sleep(4000);
			boolean flag= employeepersonapages.AddTicket();
			Assert.assertTrue(flag);
			
		}
	
	 
	 // Administrator Persona PagesTesting
	  @Test(priority=10)
	 public void VerifyNavigationToAdminPersonaPageTest() throws Throwable {
	     employeepersonapages = new Employee_Persona_Pages();
		 Thread.sleep(2000);
		 adminpersonapages = employeepersonapages.NavigateToAdminPersonaPage();
	 }
		
		@Test(priority=11)
		public void VerifyAdminHelpDeskPageDisplayTest() throws Throwable {
		     Thread.sleep(2000);
			 boolean flag = adminpersonapages.AdminHelpDeskPage();
			 Assert.assertTrue(flag);
		}
		
		@Test(priority=12)
		public void VerifyAdminMessagingPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminMessagingPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=13)
		public void VerifyAdminCurrentProcessingPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminCurrentProcessingPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=14)
		public void VerifyAdminCalendarPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminCalendarPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=15)
		public void VerifyAdminLogsPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminLogsPage(); 
			Assert.assertTrue(flag);
		}
		
		@Test(priority=16)
		public void VerifyAdminDocumentLibraryPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminDocumentLibraryPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=17)
		public void VerifyAdminClearDownPageTest() throws Throwable 
		{
			Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminClearDownPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=18)
		public void VerifyAdminOtherServicesPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminOtherServicesPage();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=19,enabled=false)
		public void VerifyAdminVideoLibraryPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = adminpersonapages.AdminVideoLibraryPage();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=20)
		public void VerifyAdminConfigPageDisplayTest() throws Throwable {
		    Thread.sleep(2000);
		  	boolean flag = adminpersonapages.AdminConfigurationPage();
		  	Assert.assertTrue(flag);
		}
		
		
	//PayManager Persona Pages
		@Test(priority=21)
		public void VerifyNavigateToPayMangerPersonaPageTest() throws Throwable {
			driver.navigate().refresh();
			Thread.sleep(4000);
			adminpersonapages = new Administrator_Persona_Pages();
			paymanagerpersonapages = adminpersonapages.NavigateToPayMangerPersonaPage();
			
		  }
		
		@Test(priority=22)
		public void VerifyPayManagerCurrentProcessingPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerCurrentProcessingPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=23)
		public void VerifyPayManagerControlReportsPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerControlReportsPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=24)
		public void VerifyPayManagerViewPayslipsPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerViewPayslipsPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=25)
		public void VerifyPayManagerViewOtherDocumentsPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerViewOtherDocumentsPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=26)
		public void VerifyPayMangerHelpDeskPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerHelpDeskPage();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=27)
		public void VerifyPayMangerCalendarPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerCalendarPage();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=28)
		public void VerifyPayManagerMessagingPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerMessagingPage();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=29)
		public void VerifyPayManagerDocumentLibraryPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerDocumnetLibraryPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=30)
		public void VerifyPayManagerLogsPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerLogsPage();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=31)
		public void VerifyPayManagerclearDownPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerclearDownPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=32,enabled=false)
		public void VerifyPayMangerOtherServicesPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerOtherServicesPage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=33)
		public void VerifyPayManagerDashboardPageTest() throws Throwable {
		    Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerDashboardPage();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=34,enabled=false)
		public void VerifyPayManagerVideoLibraryPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = paymanagerpersonapages.PayManagerVideoLibraryPage();
			Assert.assertTrue(flag);
		}
		
		
		//HelpDeskManager Persona Page Tests
		
	    @Test(priority=35)
		public void VerifyNavigateToHelpDeskManagerPersonaPageTest() throws Throwable {
			driver.navigate().refresh();
	    	Thread.sleep(4000);
			paymanagerpersonapages = new PayManager_Persona_Pages();
			helpdeskmanagerpersonapages = paymanagerpersonapages.NavigateToHelpDeskManagerPersonaPage();
		  }
		
		@Test(priority=36)
		public void VerifyHelpDeskManagerHelpDeskPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = helpdeskmanagerpersonapages.HelpDeskManagerHelpDeskPage();
			Assert.assertTrue(flag);
			
		  }
		
		@Test(priority=37)
		public void VerifyHelpDeskManagerMessagingPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = helpdeskmanagerpersonapages.HelpDeskManagerMessagingPage();
			Assert.assertTrue(flag);
			
		  }
		
		  
		@Test(priority=38)
		public void VerifyHelpDeskManagerCurrentProcessingPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = helpdeskmanagerpersonapages.HelpDeskManagerCurrentProcessingPage();
			Assert.assertTrue(flag);
			
		  }
		
		
		@Test(priority=39)
		public void VerifyHelpDeskManagerCalendarPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = helpdeskmanagerpersonapages.HelpDeskManagerCalendarPage();
			Assert.assertTrue(flag);
			
		  }
		
		
		@Test(priority=40)
		public void VerifyHelpDeskManagerLogsPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = helpdeskmanagerpersonapages.HelpDeskManagerLogsPage();
			Assert.assertTrue(flag);
			
		  }
		
		
		@Test(priority=41)
		public void VerifyHelpDeskManagerOtherServicesPageTest() throws Throwable {
			Thread.sleep(2000);
			boolean flag = helpdeskmanagerpersonapages.HelpDeskManagerOtherServicesPage();
			Assert.assertTrue(flag);
			
		  }
		
		//HelpDesk Admin Persona Pages Test
		
				@Test(priority=42)
				public void VerifyNavigateToHelpDeskAdminPersonaPageTest() throws Throwable {
					driver.navigate().refresh();
		            Thread.sleep(3000);
					helpdeskmanagerpersonapages = new Help_Desk_Manager_Persona_Pages();
					helpdeskadminpersonapages = helpdeskmanagerpersonapages.NavigateToHelpDeskAdminPersonaPage();
				  }
				
				@Test(priority=43)
				public void VerifyHelpDeskAdminCurrentProcessingPageTest() throws Throwable 
				{
					Thread.sleep(3000);
					boolean flag = helpdeskadminpersonapages.HelpDeskAdminCurrentProcessingPage();
					Assert.assertTrue(flag);
					
				  }
				
				@Test(priority=44)
				public void VerifyHelpDeskAdminHelpDeskPageTest() throws Throwable 
				{
					Thread.sleep(3000);
					boolean flag = helpdeskadminpersonapages.HelpDeskAdminHelpDeskPage();
					Assert.assertTrue(flag);
					
				  }
				
				
				@Test(priority=45)
				public void VerifyHelpDeskAdminLogsPageTest() throws Throwable
				{
					Thread.sleep(3000);
					boolean flag = helpdeskadminpersonapages.HelpDeskAdminLogsPage();
					Assert.assertTrue(flag);
					
				  }
				
				
				@Test(priority=46)
				public void VerifyHelpDeskAdminOtherServicesPageTest() throws Throwable 
				{
					Thread.sleep(3000);
					boolean flag = helpdeskadminpersonapages.HelpDeskAdminOtherServicesPage();
					Assert.assertTrue(flag);
					
				  }
			
			
	@AfterClass
	public void tearDown() throws Throwable {
		Thread.sleep(3000);
		driver.quit(); 
	}
	
}
