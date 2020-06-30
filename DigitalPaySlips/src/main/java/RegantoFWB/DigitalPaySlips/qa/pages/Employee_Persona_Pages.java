package RegantoFWB.DigitalPaySlips.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;


public class Employee_Persona_Pages extends DigitalPaySlipsBase{

	@FindBy(css =".sidebar-wrapper.ps")
    WebElement hover;
		
	@FindAll({@FindBy(css ="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1)"),@FindBy(css="div.user-info:nth-child(2) > a:nth-child(1) > span:nth-child(1) > b")})
	WebElement caret;
	
	@FindBy(xpath ="//span[contains(text(),'Dashboard')]")
	WebElement EmployeeDashboard;
	
	@FindBy(css="svg#Help")
	WebElement EmployeeDashboardSection;
	
	//@FindBy(xpath ="//span[text()='My Profile']")
	@FindBy(xpath="//a[@href='/myprofile']")
	WebElement EmployeeProfile;
	
	@FindAll({@FindBy(css="img#employeePicturePreview"),@FindBy(xpath="//*[@id='employeePicturePreview']")})
	WebElement EmployeeProfileSection;
	
	@FindBy(xpath ="//a[@href='/calendar']/mat-icon")
	WebElement  EmployeeCalendar;
	
	@FindBy(css="ng-fullcalendar.my-ng-fullcalendar.fc.fc-unthemed.fc-ltr")
	WebElement EmployeeCalendarSection;
	
	@FindBy(xpath ="//a[@href='/message-board']")
	WebElement EmployeeMessageBoard;
	
	@FindBy(xpath="//div[contains(text(),'Messages & Information')]")
	WebElement EmployeeMessageBoardSection;
	
	@FindBy(xpath ="//span[contains(text(),'Document Library')]")
	WebElement EmployeeDocumentLibrary;
	
	@FindBy(css ="div.card-body.ng-star-inserted")
	WebElement EmployeeDocumentLibrarySection;
	
	
	@FindBy(xpath="//span[contains(text(),'My Tickets')]")
	WebElement EmployeeMyTickets;
	
	
	@FindBy(css="kendo-grid#GridID.CustomGrid.KendoCustomScroll,GridScroll.scrollV.k-widget.k-grid.k-grid-virtual")
	WebElement EmployeeMyTicketsSection;
	
	
	@FindBy(xpath="//span[contains(text(),'Video Library')]")
    WebElement EmployeeVideoLibrary;
	
	
	@FindBy(css="div.video_library")
    WebElement EmployeeVideoLibrarySection;
	
	
	@FindBy(xpath="//span[contains(text(),'Tax Calculator')]")
	WebElement  EmployeeTaxCalculator;
	
	
	@FindBy(css="perfect-scrollbar.scroll_height.perfectScroll_custom")
	WebElement  EmployeeTaxCalculatorSection;
	
	@FindAll({@FindBy(xpath ="//a[@href='/my-tickets']"),@FindBy(css="a[href*='/my-tickets']")})
	WebElement MyTicketsView;
	
	@FindAll({@FindBy(css ="a[title='Raise Ticket']"),@FindBy(xpath="//a[@title='Raise Ticket']")})
	WebElement AddTicket;
	
	@FindAll({@FindBy(css="div.col-md-4.selectFld"),@FindBy(xpath="//div[@class='col-md-4 selectFld']")})
	WebElement AddTicketType;
	
	@FindBy(xpath = "//div[@class='noMaxHeight mat-dialog-content']")
	WebElement AddTicketDialog;
	
	@FindBy(css = "#mat-select-3 > div > div.mat-select-value > span")
	WebElement dropdown;
	
	@FindBy(xpath="//span[text()=' Account Locked ']")
	WebElement AccountLocked;
	
	@FindAll({@FindBy(css = "app-create-ticket-dialog > div:nth-child(2) > div > div > form > div.row.fileUploadContainer > div.col-md-12 > p > span > i"),@FindBy(xpath ="//span[text()=' Upload Documents ']")})
	WebElement UploadDocument;
	
	@FindBy(xpath = "//input[starts-with(@id,'mat-input')]")
	WebElement AddTicketSubject;
	
	@FindBy(xpath = "//textarea[starts-with(@id,'mat-input')]")
	WebElement AddTicketDescription;
	
	@FindBy(xpath="//i[contains(text(),'close')]")
	WebElement Discard; 

	@FindAll({@FindBy(xpath = "//button/i[text()='check']"),@FindBy(css="#mat-dialog-0 > app-create-ticket-dialog > div:nth-child(2) > div > div > form > div.container.editclosewrap > div > div > button.btn.btn-success.btn-round.btn-fab.btn-sm > i")})
	WebElement Check;
	
	@FindAll({@FindBy(xpath ="//*[@id='mat-dialog-11']/app-sucess-dialog/div/h2[contains(text(),'Your ticket created successfully')]"),@FindBy(css="#mat-dialog-11 > app-sucess-dialog > div > div.swal2-icon.pulse-success.text-center.line-height50.ng-star-inserted > div > img"),@FindBy(xpath="//div/img[@src='assets/img/success.png']")})
	WebElement SuccessfullTicket;
	
	@FindBy(css = "app-confirm-dialog > div > div:nth-child(5) > button.mr30.swal2-cancel.btn.btn-danger.mat-button")
	WebElement CancelButton;
	
	@FindBy(xpath = "//span[text()='OK']")
	WebElement ConfirmButton; 
	
	@FindBy(xpath ="//img[@class='close_dialog']")
	WebElement Closebutton;
	
	
	@FindAll({@FindBy(xpath="//span[text()=' Administrator ']"),@FindBy(xpath="//a/span[text()='A']"),@FindBy(css="#collapseExample > ul > li:nth-child(1) > a > span.sidebar-mini")})
	WebElement NavigateToAdminPage;
	
	
	public Employee_Persona_Pages()
	{
		PageFactory.initElements(driver,this);
			
	}
	
	
	public boolean EmployeeProfilePage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(EmployeeProfile).build().perform();
		Thread.sleep(4000);
		return EmployeeProfileSection.isDisplayed();
	}
	
	
	public boolean EmployeeMyCalendarPage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(hover).click(hover).build().perform();
    	action.moveToElement(hover).click(EmployeeCalendar).build().perform();
    	Thread.sleep(5000);
		return EmployeeCalendarSection.isDisplayed();
	}
	
	
	public boolean EmployeeMessageBoardPage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(EmployeeMessageBoard).build().perform();
		Thread.sleep(2000);
		return EmployeeMessageBoardSection.isDisplayed();
	}
	
	
	public boolean EmployeeDocumentLibraryPage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(EmployeeDocumentLibrary).build().perform();
		Thread.sleep(2000);
		return EmployeeDocumentLibrarySection.isDisplayed();
		
	}
	
	
	public boolean EmployeeMyTicketsPage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(EmployeeMyTickets).build().perform();
		Thread.sleep(2000);
		return EmployeeMyTicketsSection.isDisplayed();	
	}
	
	
	public boolean EmployeeVideoLibraryPage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(EmployeeVideoLibrary).build().perform();
	 	Thread.sleep(8000);
		return EmployeeVideoLibrarySection.isDisplayed();
	}
	
	
	public boolean EmployeeTaxCalculatorPage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(EmployeeTaxCalculator).build().perform();
		Thread.sleep(2000);
		return EmployeeTaxCalculatorSection.isDisplayed();
	}
	
	public boolean EmployeeDashboardPage() throws Throwable
	{
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).click(hover).build().perform();
		action.moveToElement(hover).click(EmployeeDashboard).build().perform();
		Thread.sleep(2000);
		return EmployeeDashboardSection.isDisplayed();
	}
	
	
	public Administrator_Persona_Pages NavigateToAdminPersonaPage() throws Throwable
	{
	
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		action.moveToElement(hover).click(caret).build().perform();
        NavigateToAdminPage.click();
		Actions action1 = new Actions(driver);
		//action1.moveToElement(hover).build().perform();
		action1.moveToElement(hover).click(caret).build().perform();
		Thread.sleep(8000);
		return new Administrator_Persona_Pages();
		
	}
	
	
  public boolean AddTicket() throws IOException, InterruptedException 
	{
		 AddTicket.click();
		 Thread.sleep(2000);
		 AddTicketType.click();
		 //Closebutton.click();			
		 AccountLocked.click();
		 Thread.sleep(3000);
	     UploadDocument.click();
	     Thread.sleep(2000);
	     Runtime.getRuntime().exec("C:\\Users\\AnilMekala\\Desktop\\AutoIT\\FileUpload.exe");
	     WebDriverWait wait = new WebDriverWait(driver, 3);
		 wait.until(ExpectedConditions.elementToBeClickable(AddTicketSubject));
	     AddTicketSubject.click();
		 AddTicketSubject.sendKeys("test");
		 Thread.sleep(2000);
		 WebDriverWait wait1 = new WebDriverWait(driver, 3);
		 wait1.until(ExpectedConditions.elementToBeClickable(AddTicketDescription));
		 AddTicketDescription.sendKeys("test");
		 Thread.sleep(2000);
	  // Discard.click(); 
	  // CancelButton.click();
		 WebDriverWait wait2 = new WebDriverWait(driver, 3);
		 wait2.until(ExpectedConditions.elementToBeClickable(Check));
	 	 Check.click();  
	 	 Thread.sleep(2000);
	 	 WebDriverWait wait3 = new WebDriverWait(driver, 6);
		 wait3.until(ExpectedConditions.visibilityOf(SuccessfullTicket));
		 ConfirmButton.click();
		 return SuccessfullTicket.isDisplayed();  

	} 
	
		
}
