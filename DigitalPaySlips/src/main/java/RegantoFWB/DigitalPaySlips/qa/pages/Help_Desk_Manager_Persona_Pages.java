package RegantoFWB.DigitalPaySlips.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;

public class Help_Desk_Manager_Persona_Pages extends DigitalPaySlipsBase  {
	
	@FindBy(css =".sidebar-wrapper.ps")
    WebElement hover;
		
	@FindBy(css ="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1) > b")
	WebElement caret;
	
	@FindBy(xpath="//span[text()='Help Desk']")
	WebElement HelpDeskManagerHelpDesk;
	
	@FindBy(css="a.custominactive.btn.btn-rose.btn-round")
	WebElement HelpDeskManagerHelpDeskSection;
		
	@FindBy(xpath="//span[text()='Messaging']")
	WebElement HelpDeskMangerMessaging;
	
	@FindBy(xpath="//div[text()='Manage Messages']")
	WebElement HelpDeskManagerMessageSection;
	
	@FindBy(xpath="//span[text()='Current Processing']")
	WebElement HelpDeskManagerCurrentProcessing;
	
	@FindBy(css="kendo-grid-list.k-grid-container.ng-star-inserted")
	WebElement HelpDeskManagerCurrentProcessingSection;
	
    @FindBy(xpath="//span[text()='Calendar']")
    WebElement HelpDeskManagerCalendar;
    
    @FindBy(css="div.my-ng-fullcalendar.ng-star-inserted")
    WebElement HelpDeskManagerCalendarSection;
    
    @FindBy(xpath="//span[text()='Logs']")
    WebElement HelpDeskManagerLogs;
    
    @FindBy(css="div.AuditHeader")
    WebElement HelpDeskManagerLogsSection;
     
    @FindBy(xpath="//span[text()='Other Services']")
    WebElement HelpDeskManagerOtherServices;
    
    @FindBy(css="div#accordion")
    WebElement HelpDeskManagerOtherServicesSection;
    
   @FindBy(css="#collapseExample > ul > li:nth-child(4) > a > span.sidebar-mini")
    WebElement  HelpDeskAdminPersona;
    
    
    public Help_Desk_Manager_Persona_Pages()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public boolean HelpDeskManagerHelpDeskPage() throws Throwable
	{	
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(HelpDeskManagerHelpDesk).build().perform();
		Thread.sleep(2000);
		//HelpDeskManagerHelpDesk.click();
		return HelpDeskManagerHelpDeskSection.isDisplayed();
	}
	

    public boolean HelpDeskManagerMessagingPage() throws Throwable
    {
    	Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(HelpDeskMangerMessaging).build().perform();
		Thread.sleep(2000);
		return HelpDeskManagerMessageSection.isDisplayed();
    }
    
    
    public boolean HelpDeskManagerCurrentProcessingPage() throws Throwable
    {
    	Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(HelpDeskManagerCurrentProcessing).build().perform();
		Thread.sleep(2000);
		return HelpDeskManagerCurrentProcessingSection.isDisplayed();
    }
    
    
    public boolean HelpDeskManagerCalendarPage() throws Throwable
    {
    	Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(HelpDeskManagerCalendar).build().perform();
		Thread.sleep(2000);
		//HelpDeskManagerCalendar.click();
		return HelpDeskManagerCalendarSection.isDisplayed();
    }
    
    public boolean HelpDeskManagerLogsPage() throws Throwable
    {
    	Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(HelpDeskManagerLogs).build().perform();
		Thread.sleep(2000);
		//HelpDeskManagerLogs.click();
		return HelpDeskManagerLogsSection.isDisplayed();
    }
    
    public boolean HelpDeskManagerOtherServicesPage() throws Throwable
    {
    	Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(HelpDeskManagerOtherServices).build().perform();
		Thread.sleep(2000);
		//HelpDeskManagerOtherServices.click();
		return HelpDeskManagerOtherServicesSection.isDisplayed();
    }
    
    
    public Help_Desk_Admin_Persona_Pages NavigateToHelpDeskAdminPersonaPage() throws Throwable
    {
    	Thread.sleep(4000);
    	Actions action = new Actions(driver);	
    	action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(caret).build().perform();
		action.moveToElement(hover).click(HelpDeskAdminPersona).build().perform();
		HelpDeskAdminPersona.click();
		Actions action1 = new Actions(driver);
		action1.moveToElement(hover).build().perform();
		action1.moveToElement(hover).click(caret).build().perform();
		Thread.sleep(3000);
		return new Help_Desk_Admin_Persona_Pages();
    }
    
    
    
    
}
