package RegantoFWB.DigitalPaySlips.qa.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;
import RegantoFWB.DigitalPaySlips.qa.util.TestUtil;
import java.io.IOException;



public class EmployeeDashboardPage extends DigitalPaySlipsBase{
	
	
	@FindBy(css =".sidebar-wrapper.ps")
    WebElement hover;
	
	@FindBy(css="div.user-info:nth-child(2) > a:nth-child(1) > span")
	WebElement usernameLabel;
	
	@FindBy(css ="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1) > b")
	WebElement caret;
	
	@FindBy(xpath="//*[@id=\"collapseExample\"]/ul/li[1]/a/span[2]")
	WebElement Administrator;
	
	@FindBy(css = "div > h6")
	WebElement AdminDashboard;
	
	@FindBy(css ="#collapseExample > ul > li:nth-child(2) > a > span.sidebar-normal.pl30")
	WebElement PayManager;
	
	@FindBy(css ="#main > ul > li.nav-item.ctrl_totals > a")
	WebElement PayManagerDashboard;
	
	@FindBy(css ="#collapseExample > ul > li:nth-child(3) > a > span.sidebar-normal.pl30")
	WebElement HelpDeskAdministrator;
	
	@FindBy(xpath="//*[@id='navigation']")
	WebElement HelpDeskAdminDashboard;
	
	
//	@FindBy(css ="#collapseExample > ul > li:nth-child(4) > a > span.sidebar-normal.pl30")
	@FindBy(xpath="//span[text()=' Help Desk Manager ']")
	WebElement HelpDeskManager;
	
	@FindBy(css ="div > h6")
	WebElement HelpDeskManagerDashboard;
	
	@FindBy(xpath ="//a[@href='/my-tickets']")
	//@FindBy(css="#collapseExample > ul > li.nav-item.ng-star-inserted.active > a")
	WebElement MyTicketsView;
	
//	@FindBy(xpath = "//i[@class='material-icons topHelp cursor-pointer']")
	@FindBy(css ="#navigation > ul > li:nth-child(1) > a > i")
	WebElement AddTicket;
	
	//@FindBy(xpath = "//*[@id='cdk-overlay-0']")
	@FindBy(xpath="div.col-md-4.selectFld")
	WebElement AddTicketClick;
	
	@FindBy(xpath = "//div[@class='noMaxHeight mat-dialog-content']")
	WebElement AddTicketDialog;
	
	//@FindBy(css ="#mat-select-0")
	//WebElement AddTicketType;
	
	@FindBy(css = "#mat-select-3 > div > div.mat-select-value > span")
	//@FindBy(id = "mat-select-3")
	WebElement dropdown;
	
	@FindBy(xpath = "//span[contains(text(),'Lockouts')]")
	WebElement Lockouts;
	 
	//@FindBy(tagName = "mat-select-content ng-trigger ng-trigger-fadeInContent")
	//@FindBy(className = "mat-select-content ng-trigger ng-trigger-fadeInContent")
   //@FindBy(className=".cdk-overlay-pane")
  //  WebElement  TicketTypeDropdown;
    
	@FindBy(css = "app-create-ticket-dialog > div:nth-child(2) > div > div > form > div.row.fileUploadContainer > div.col-md-12 > p > span > i")
	WebElement UploadDocument;
	
	@FindBy(xpath = "//input[starts-with(@id,'mat-input')]")
	WebElement AddTicketSubject;
	
	@FindBy(xpath = "//textarea[starts-with(@id,'mat-input')]")
	WebElement AddTicketDescription;
	
	//@FindBy(xpath="//button[@class='btn btn-danger btn-round btn-fab btn-sm']")
	@FindBy(xpath="//i[contains(text(),'close')]")
	WebElement Discard; 

	@FindBy(xpath = "//i[contains(text(),'check')]")
	WebElement Check;
	
	@FindBy(css = "//*[@id=\"mat-dialog-11\"]/app-display-message-dialog/div/h2/text()")
	WebElement SuccessfullTIcket;
	
	@FindBy(css = "app-confirm-dialog > div > div:nth-child(5) > button.mr30.swal2-cancel.btn.btn-danger.mat-button")
	WebElement CancelButton;
	
	@FindBy(css = "app-confirm-dialog > div > div:nth-child(5) > button.swal2-confirm.btn.btn-success.mat-button > span")
	WebElement ConfirmButton; 
	
//	@FindBy(xpath ="//img[@src='assets/img/close_dialog.png']")
	@FindBy(xpath ="//img[@class='close_dialog']")
	//@FindBy(css ="#mat-dialog-1 > app-create-ticket-dialog > div.position-relative > img")
	WebElement Closebutton;
	
	

	public EmployeeDashboardPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public HelpDeskManagerDashboardPage NavigateToHelpDeskManager ()
	{
		Actions action = new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		action.moveToElement(hover).moveToElement(caret).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		HelpDeskManager.click();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		return new HelpDeskManagerDashboardPage();
	}
	
	public boolean ValidateAdminDashboardPage()
	{
		Actions action = new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		action.moveToElement(hover).moveToElement(caret).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		Administrator.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		return AdminDashboard.isDisplayed();
	}
	
	public boolean ValidatePayManagerDashboardPage()
	{
		Actions action = new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		action.moveToElement(hover).moveToElement(caret).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		PayManager.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		return PayManagerDashboard.isDisplayed();
	}
	
	public boolean ValidateHelpDeskAdminDashboardPage()
	{
		Actions action = new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		action.moveToElement(hover).moveToElement(caret).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		HelpDeskAdministrator.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		return HelpDeskAdminDashboard.isDisplayed();
	}
	
	public boolean ValidateHelpDeskManagerDashboardPage()
	{
		Actions action = new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		action.moveToElement(hover).moveToElement(caret).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		HelpDeskManager.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		return HelpDeskManagerDashboard.isDisplayed();
	}
	
	public boolean AddTicket() throws IOException, InterruptedException 
	{
		Actions action = new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
	    action.moveToElement(hover).moveToElement(caret).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
	    MyTicketsView.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		AddTicket.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			
		Thread.sleep(5000);
		//Closebutton.click();		
	
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
	//  WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-select-0")));
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'mat-select')]")));
    //	driver.findElement(By.cssSelector("//*[contains(@id,'mat-select')]")).click();
		
		
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 5);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Lockouts')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Lockouts')]")).click();
	
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
	  //  NgWebDriver ngwebdriver = new NgWebDriver((JavascriptExecutor) driver);
	  //   List<WebElement> weColors = driver.findElements(ByAngular.options("mat-option"));
      //    assertThat(weColors.get(0).getText(), containsString("apple"));
      //    assertThat(weColors.get(3).getText(), containsString("banana"));	
	  //	  a.moveToElement(AddTicketType).clickAndHold(AddTicketType).perform();
	  //	  AddTicketType.click();
	  //    Lockouts.click();
		
		
		  driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
			
	     UploadDocument.click();
	     Thread.sleep(5000);
	     Runtime.getRuntime().exec("C:\\Users\\AnilMekala\\Desktop\\AutoIT\\FileUpload.exe");
		  
		  
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
       AddTicketSubject.sendKeys("test");
        
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		AddTicketDescription.sendKeys("test");
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
		Discard.click(); 
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	//	CancelButton.click();
	//	ConfirmButton.click();
		
		Check.click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			
		return SuccessfullTIcket.isDisplayed();
		
     
	
	
	}
	
}
