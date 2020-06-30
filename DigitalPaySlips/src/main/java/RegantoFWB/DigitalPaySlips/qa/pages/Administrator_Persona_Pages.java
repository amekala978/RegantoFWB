package RegantoFWB.DigitalPaySlips.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;

public class Administrator_Persona_Pages extends DigitalPaySlipsBase  {
	
	@FindBy(css =".sidebar-wrapper.ps")
    WebElement hover;
		
	@FindAll({@FindBy(css ="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1)"),@FindBy(css="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1) > b")})
	WebElement caret;
	
	@FindBy(xpath = "//span[contains(text(),'Configuration')]")
	WebElement AdminConfiguration;
	
	@FindAll({@FindBy(xpath ="//b[contains(text(),'CONFIGURATION')]"),@FindBy(css="#headingOne > h3 > a > span > span > b")})
	WebElement AdminConfigSection;
	
	@FindAll({@FindBy(xpath="//a[@href='/administrator/help/home']"),@FindBy(css="#collapseExample > ul > li:nth-child(2) > a > mat-icon")})
	WebElement AdminHelpDesk;
	
	@FindAll({@FindBy(css="a.custominactive.btn.btn-rose.btn-round"),@FindBy(xpath="//div[@class='box2 vertical_middle']")})
	WebElement AdminHelpDeskSection;
	
	@FindBy(xpath="//span[text()='Messaging']")
	WebElement AdminMessaging;
	
	@FindBy(xpath="//div[text()='Manage Messages']")
	WebElement AdminMessageSection;
	
	@FindBy(xpath="//span[text()='Current Processing']")
	WebElement AdminCurrentProcessing;
	
	@FindBy(css="kendo-grid-list.k-grid-container.ng-star-inserted")
	WebElement AdminCurrentProcessingSection;

    @FindBy(xpath="//span[text()='Calendar']")
    WebElement AdminCalendar;
    
    @FindBy(css="div.my-ng-fullcalendar.ng-star-inserted")
    WebElement AdminCalendarSection;
    
    @FindBy(xpath="//span[text()='Logs']")
    WebElement AdminLogs;
    
    @FindBy(css="div.AuditHeader")
    WebElement AdminLogsSection;
       
    @FindBy(xpath="//span[text()='Document Library']")
    WebElement AdminDocumentLibrary;
  
    @FindBy(xpath="//div[text()=' Manage Document Library']")
    WebElement AdminDocLibSection;
    
    @FindBy(xpath="//a[@href='/administrator/admincleardown']")
    WebElement Cleardown;
    
    @FindBy(css="app-admincleardown.ng-star-inserted")
    WebElement CleardownSection;
    
    @FindBy(xpath="//span[text()='Other Services']")
    WebElement AdminOtherServices;
    
    @FindBy(css="div#accordion")
    WebElement AdminOtherServicesSection;
    
    @FindBy(xpath="//span[text()='Video Library']")
    WebElement AdminVideoLibrary;
    
    @FindBy(xpath="//div[text()=' Manage Video Library']")
    WebElement AdminVideoLibSection;
    
    @FindAll({@FindBy(css="#collapseExample > ul > li:nth-child(2) > a > span.sidebar-mini"),@FindBy(xpath="//a/span[text()='P']")})
    WebElement  PayManagerPersona;
    

	
	public Administrator_Persona_Pages()
	{
		PageFactory.initElements(driver, this);
	}

	
	public boolean AdminConfigurationPage() throws Throwable
	{
		Actions action = new Actions(driver);
	    action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(AdminConfiguration).build().perform();
		Thread.sleep(3000);
		return AdminConfigSection.isDisplayed();
	}
	
	
	public boolean AdminHelpDeskPage() throws Throwable 
	{
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(AdminHelpDesk).build().perform();
		Thread.sleep(4000);
		return AdminHelpDeskSection.isDisplayed();
		
	}
	
	public boolean AdminMessagingPage() throws Throwable
	{
		Thread.sleep(2000);
	    Actions action = new Actions(driver);
	    action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(AdminMessaging).build().perform();
		Thread.sleep(2000);
		return AdminMessageSection.isDisplayed();
		
	}
	
	public boolean AdminCurrentProcessingPage() throws Throwable
	{
		Thread.sleep(2000);
	    Actions action = new Actions(driver);
	   action.moveToElement(hover).build().perform();
	   action.moveToElement(hover).click(AdminCurrentProcessing).build().perform();
	   Thread.sleep(2000);
	   return AdminCurrentProcessingSection.isDisplayed();		
		
	}
	
	public boolean AdminCalendarPage() throws Throwable
	{
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(AdminCalendar).build().perform();
		Thread.sleep(2000);
		return AdminCalendarSection.isDisplayed();
	}
	
	
	public boolean AdminLogsPage() throws Throwable
	{
	   Thread.sleep(2000);	
	   Actions action = new Actions(driver);
	   action.moveToElement(hover).build().perform();
	   action.moveToElement(hover).click(AdminLogs).build().perform();
	   Thread.sleep(3000);
	   return AdminLogsSection.isDisplayed();
	
	}
	
	
	public boolean AdminDocumentLibraryPage() throws Throwable
	{
		   Thread.sleep(2000);
		   Actions action = new Actions(driver);
		   action.moveToElement(hover).build().perform();
		   action.moveToElement(hover).click(AdminDocumentLibrary).build().perform();;
		   Thread.sleep(2000);
		   return AdminDocLibSection.isDisplayed();
	}
	
	public boolean AdminClearDownPage() throws Throwable 
	{
		   Thread.sleep(2000);
		   Actions action = new Actions(driver);
		   action.moveToElement(hover).build().perform();
		   action.moveToElement(hover).click(Cleardown).build().perform();;
		   Thread.sleep(6000);
		   return CleardownSection.isDisplayed();
		
	}
	
	public boolean AdminOtherServicesPage() throws Throwable
	{
		   Thread.sleep(2000);
		   Actions action = new Actions(driver);
		   action.moveToElement(hover).build().perform();
		   action.moveToElement(hover).click(AdminOtherServices).build().perform();
		   Thread.sleep(2000);
		   return AdminOtherServicesSection.isDisplayed();	
				
	}
	
	
	public boolean AdminVideoLibraryPage() throws Throwable
	{
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(AdminVideoLibrary).build().perform();
		Thread.sleep(4000);
		return AdminVideoLibSection.isDisplayed();
		
	}
	
	
	public PayManager_Persona_Pages NavigateToPayMangerPersonaPage() throws Throwable
	{
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(caret).build().perform();
		action.moveToElement(hover).click(PayManagerPersona).build().perform();
		PayManagerPersona.click();	
		Actions action1 = new Actions(driver);
		action1.moveToElement(hover).build().perform();
		action1.moveToElement(hover).click(caret).build().perform();
		Thread.sleep(4000);
		return new PayManager_Persona_Pages();
	}	
	

}
