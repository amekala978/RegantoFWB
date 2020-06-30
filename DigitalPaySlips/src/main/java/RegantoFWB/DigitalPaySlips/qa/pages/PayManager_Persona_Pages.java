package RegantoFWB.DigitalPaySlips.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;


public class PayManager_Persona_Pages extends DigitalPaySlipsBase {

	@FindBy(css =".sidebar-wrapper.ps")
    WebElement hover;
		
	@FindAll({@FindBy(css ="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1)"),@FindBy(css="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1) > b")})
	WebElement caret;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement PayManagerdashboard;
	
	@FindBy(xpath="//a[text()=' Current Processing ']")
	WebElement PayManagerdashboardsection;
	
	@FindBy(xpath="//span[text()='Current Processing']")
	WebElement PayManagerCurrentProcessing;
	
	@FindBy(css="kendo-grid-list.k-grid-container.ng-star-inserted")
	WebElement PayManagerCurrentProcessingSection;
	
	@FindBy(xpath="//span[text()='Control Reports']")
	WebElement PayManagerControlReports;
	
	@FindBy(xpath="//div[text()=' TAX YEAR ']")
	WebElement PayManagerControlReportsSection;
	
	@FindBy(xpath="//span[text()='View Payslips']")
	WebElement PayManagerViewPaySlip;
	
	@FindBy(xpath="//p[text()='SEARCH PAYSLIPS']")
	WebElement PayManagerViewPaySlipSection;
	
	@FindBy(xpath="//span[text()='View Other Documents']")
	WebElement PayManagerViewOtherDocs;
	
	@FindBy(xpath="//p[text()='SEARCH DOCUMENTS']")
	WebElement PayManagerViewOtherdocsSection;
	
	@FindBy(xpath="//span[text()='Help Desk']")
	WebElement PayManagerHelpDesk;
	
	@FindBy(css="a.custominactive.btn.btn-rose.btn-round")
	WebElement PayManagerHelpDeskSection;
	
    @FindBy(xpath="//span[text()='Calendar']")
    WebElement PayManagerCalendar;
    
    @FindBy(css="div.my-ng-fullcalendar.ng-star-inserted")
    WebElement PayManagerCalendarSection;
	
    @FindBy(xpath="//span[text()='Messaging']")
	WebElement PayMangerMessaging;
	
	@FindBy(xpath="//div[text()='Manage Messages']")
	WebElement PayManagerMessageSection;
	
    @FindBy(xpath="//span[text()='Document Library']")
    WebElement PayManagerDocumentLibrary;
   
    @FindBy(xpath="//div[text()=' Manage Document Library']")
    WebElement PayManagerDocLibSection;
	
    @FindBy(xpath="//span[text()='Logs']")
    WebElement PayManagerLogs;
    
    @FindBy(css="div.AuditHeader")
    WebElement PayManagerLogsSection;
    
    @FindBy(xpath="//span[text()='Clear Down (GDPR)']")
    WebElement PayManagerClearDown;
    
    @FindBy(xpath="//b[text()='MANUAL CLEAR DOWN']")  
    WebElement PayManagerClearDownSection;
    
    @FindBy(xpath="//span[text()='Other Services']")
    WebElement PayManagerOtherServices;
    
    @FindBy(css="div#accordion")
    WebElement PayManagerOtherServicesSection;
    
    @FindBy(xpath="//span[text()='Video Library']")
    WebElement PayManagerVideoLibrary;
    
    @FindBy(xpath="//div[text()=' Manage Video Library']")
    WebElement PayManagerVideoLibSection;
    
    
    @FindAll({@FindBy(css="#collapseExample > ul > li:nth-child(3) > a > span.sidebar-mini > sup"),@FindBy(xpath="//a/span[text()='H']/sup"),@FindBy(xpath="//span[text()=' Help Desk Manager ']")})
    WebElement HelpDeskManagerPersona;

    public PayManager_Persona_Pages () 
    {
       PageFactory.initElements(driver, this);	
    }
 
    
    public boolean PayManagerDashboardPage() throws Throwable
	{
   	
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(PayManagerdashboard).build().perform();
		//PayManagerdashboard.click();
		Thread.sleep(4000);
		return PayManagerdashboardsection.isDisplayed();
		
	}
	
    public boolean PayManagerCurrentProcessingPage() throws Throwable
	{
		Actions action = new Actions(driver);
	    action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(PayManagerCurrentProcessing).build().perform();	
		//PayManagerCurrentProcessing.click();
		Thread.sleep(4000);
        return PayManagerCurrentProcessingSection.isDisplayed();
	    
	}
    
    public boolean PayManagerControlReportsPage() throws Throwable
	{
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(PayManagerControlReports).build().perform();
		//PayManagerControlReports.click();
		Thread.sleep(4000);
		return PayManagerControlReportsSection.isDisplayed();

	}
    
    public boolean PayManagerViewPayslipsPage() throws Throwable
   	{
   		Actions action = new Actions(driver);
   		action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerViewPaySlip).build().perform();
   		Thread.sleep(4000);
   		return PayManagerViewPaySlipSection.isDisplayed();
   	}
    
    public boolean PayManagerViewOtherDocumentsPage() throws Throwable
   	{
   		Actions action = new Actions(driver);
   		action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerViewOtherDocs).build().perform();
   		Thread.sleep(4000);
   		return PayManagerViewOtherdocsSection.isDisplayed();
   	}
    
    
    public boolean PayManagerHelpDeskPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerHelpDesk).build().perform();  	
   		Thread.sleep(4000);
   		return PayManagerHelpDeskSection.isDisplayed();
    }
    
    public boolean PayManagerCalendarPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerCalendar).build().perform();
   		Thread.sleep(4000);
   		return PayManagerCalendarSection.isDisplayed();
    }
    
    public boolean PayManagerMessagingPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayMangerMessaging).build().perform();
   		Thread.sleep(4000);
   		return PayManagerMessageSection.isDisplayed();
    }
    
    public boolean PayManagerDocumnetLibraryPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerDocumentLibrary).build().perform();
   		Thread.sleep(4000);
   		return PayManagerDocLibSection.isDisplayed();
    	
    }
    
    public boolean PayManagerLogsPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerLogs).build().perform();
   		Thread.sleep(4000);
   		return PayManagerLogsSection.isDisplayed();
    }
    
    public boolean PayManagerclearDownPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerClearDown).build().perform();
   		Thread.sleep(4000);
   		return PayManagerClearDownSection.isDisplayed();
    	
    }
    
    
    public boolean PayManagerOtherServicesPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerOtherServices).build().perform();
   		Thread.sleep(4000);
   		return PayManagerOtherServicesSection.isDisplayed();
    }
    
    
    public boolean PayManagerVideoLibraryPage() throws Throwable
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).click();
   		action.moveToElement(hover).click(PayManagerVideoLibrary).build().perform();
   		Thread.sleep(4000);
   		return PayManagerVideoLibSection.isDisplayed();
    	
    }
    
    public Help_Desk_Manager_Persona_Pages NavigateToHelpDeskManagerPersonaPage() throws Throwable
    {
    	Thread.sleep(2000);
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(caret).build().perform();
		action.moveToElement(hover).click(HelpDeskManagerPersona).build().perform();
		HelpDeskManagerPersona.click();
		Actions action1 = new Actions(driver);
		action1.moveToElement(hover).build().perform();
	    action1.moveToElement(hover).click(caret).build().perform();
	    return new Help_Desk_Manager_Persona_Pages();
    }
   
    
}
