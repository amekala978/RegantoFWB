package RegantoFWB.DigitalPaySlips.qa.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.util.TestUtil;

public class HelpDeskManagerDashboardPage extends DigitalPaySlipsBase{

	
	@FindBy(css =".sidebar-wrapper.ps")
    WebElement hover;
	
	@FindBy(css ="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1) > b")
	WebElement caret;
	
	@FindBy(xpath="//span[text()=' Help Desk Manager ']")
	WebElement HelpDeskManager;
	
	@FindBy(css ="div > h6")
	WebElement HelpDeskManagerDashboard;

	@FindBy(xpath="//span[text()='Help Desk']")
    WebElement HelpDesk;
	
	@FindBy(xpath="//span[text()=' menu ']")
	WebElement Hidebuttton;
	
	
	@FindBy(xpath="//div[@class='HelpTicketMain']")
	WebElement TickedDetailsPage;
	
	//@FindBy(xpath="//img[@class='helpticketChatIcon cursor-pointer']")
	@FindBy(css="#mySidenav > app-help-ticket > div.container-fluid.helpticket.mainWrapper > perfect-scrollbar > div > div.ps-content > div > div.row.ng-star-inserted > div > div.row.mt10 > div.col-md-4.text-right > img")
	WebElement Messageicon;
	
	@FindBy(xpath="//*[@class='myTicketSlide']")
	WebElement HelpDeskTicketMessage;
	
	
		
	public HelpDeskManagerDashboardPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public boolean ValidateHelpDeskPage() {
	
		Actions action = new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		action.moveToElement(hover).moveToElement(caret).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
			
		Actions action1 = new Actions(driver);
		action1.moveToElement(hover).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(HelpDesk));
		HelpDesk.click();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		return HelpDesk.isDisplayed();
		
	}
	
		
	public boolean TicketDetailsPage() {
		
		WebDriverWait wait1 = new WebDriverWait(driver, 5);
		wait1.until(ExpectedConditions.elementToBeClickable(Hidebuttton));
		Hidebuttton.click();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		return TickedDetailsPage.isDisplayed();
		
	}
	
	public boolean TicketMessage()
	{
		WebDriverWait wait2 = new WebDriverWait(driver, 8);
		wait2.until(ExpectedConditions.elementToBeClickable(Messageicon));
		Messageicon.click(); 
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
	
		return HelpDeskTicketMessage.isDisplayed();
	}
	

}
