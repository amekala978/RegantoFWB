package RegantoFWB.DigitalPaySlips.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.pages.*;

public class Administrator_Persona_Pages_Test extends DigitalPaySlipsBase
{
	Employee_Persona_Pages employeepersonapages;
	Administrator_Persona_Pages adminpersonapages;
	
	
	public Administrator_Persona_Pages_Test() 
	{
		super();
	}
	
	@BeforeClass
	public void setup() throws Throwable {
		employeepersonapages = new Employee_Persona_Pages();
		adminpersonapages = employeepersonapages.NavigateToAdminPersonaPage();
		
	}
	
	@Test(priority=1)
	public void VerifyAdminConfigPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminConfigurationPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void VerifyAdminHelpDeskPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminHelpDeskPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void VerifyAdminMessagingPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminMessagingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void VerifyAdminCurrentProcessingPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminCurrentProcessingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void VerifyAdminCalendarPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminCalendarPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void VerifyAdminLogsPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminLogsPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void VerifyAdminDocumentLibraryPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminDocumentLibraryPage();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=8)
	public void VerifyAdminOtherServicesPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminOtherServicesPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void VerifyAdminVideoLibraryPageDisplayTest() throws Throwable {
	    Thread.sleep(2000);
		boolean flag = adminpersonapages.AdminVideoLibraryPage();
		Assert.assertTrue(flag);
	}
	
	
	
}
