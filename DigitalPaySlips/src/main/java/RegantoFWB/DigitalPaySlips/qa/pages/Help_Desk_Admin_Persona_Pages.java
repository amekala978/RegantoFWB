package RegantoFWB.DigitalPaySlips.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;

public class Help_Desk_Admin_Persona_Pages  extends DigitalPaySlipsBase {

	@FindBy(css =".sidebar-wrapper.ps")
    WebElement hover;
		
	@FindAll({@FindBy(css ="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1)"),@FindBy(css="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1) > b")})
	WebElement caret;
	
	@FindBy(css="#collapseExample > ul > li.nav-item.ng-star-inserted.active > a > mat-icon")
	WebElement HelpDeskAdminHelpDesk;
	
	@FindBy(css="a.custominactive.btn.btn-rose.btn-round")
	WebElement HelpDeskAdminHelpDeskSection;
	
	@FindAll({@FindBy(xpath="//a[@href='/helpDeskAdmin/current/processing']"),@FindBy(css="#collapseExample > ul > li:nth-child(2) > a > mat-icon")})
	WebElement HelpDeskAdminCurrentProcessing;
	
	@FindBy(css="kendo-grid-list.k-grid-container.ng-star-inserted")
	WebElement HelpDeskAdminCurrentProcessingSection;
	
    @FindBy(xpath="//a[@href='/helpDeskAdmin/activity/log']")
    WebElement HelpDeskAdminLogs;
    
    @FindBy(css="div.AuditHeader")
    WebElement HelpDeskAdminLogsSection;
    
    @FindBy(xpath="//a[@href='/helpDeskAdmin/accesscleardown']")
    WebElement HelpDeskAdminClearDown;
    
    @FindBy(css="#headingTwo")
    WebElement HelpDeskAdminClearDownSection;
     
    @FindBy(xpath="//a[@href='/helpDeskAdmin/otherServices']")
    WebElement HelpDeskAdminOtherServices;
    
    @FindBy(css="div#accordion")
    WebElement HelpDeskAdminOtherServicesSection;
    
    public Help_Desk_Admin_Persona_Pages()
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    public boolean HelpDeskAdminHelpDeskPage() throws Throwable
	{
    	Thread.sleep(3000);
   	    Actions action = new Actions(driver);
    	action.moveToElement(hover).build().perform();
    	action.moveToElement(hover).click(hover).build().perform();
    	action.moveToElement(hover).click(HelpDeskAdminHelpDesk).build().perform();
		Thread.sleep(4000);
		return HelpDeskAdminHelpDeskSection.isDisplayed();
	}
    
    
    public boolean HelpDeskAdminCurrentProcessingPage() throws Throwable
    {
        Thread.sleep(2000);
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).build().perform();
    	action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(HelpDeskAdminCurrentProcessing).build().perform();
		Thread.sleep(2000);
		return HelpDeskAdminCurrentProcessingSection.isDisplayed();
    }
    
    
    public boolean HelpDeskAdminLogsPage() throws Throwable
    {
    	Thread.sleep(2000);
    	Actions action = new Actions(driver);
		action.moveToElement(hover).click(HelpDeskAdminLogs).build().perform();
		HelpDeskAdminLogs.click();
		Thread.sleep(2000);
		return HelpDeskAdminLogsSection.isDisplayed();
    }
    
    public boolean HelpDeskAdminOtherServicesPage() throws Throwable
    {
    	Thread.sleep(2000);
    	Actions action = new Actions(driver);
    	action.moveToElement(hover).build().perform();
      	action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(HelpDeskAdminOtherServices).build().perform();
		Thread.sleep(2000);
		return HelpDeskAdminOtherServicesSection.isDisplayed();
    }
    
    
    
}
