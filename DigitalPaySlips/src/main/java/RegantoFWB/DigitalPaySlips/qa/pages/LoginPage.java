package RegantoFWB.DigitalPaySlips.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import RegantoFWB.DigitalPaySlips.qa.base.DigitalPaySlipsBase;

public class LoginPage extends DigitalPaySlipsBase{

	@FindBy(xpath = "//div/input[@name='userName' and @type='text']") 
	WebElement username; 
	
	@FindBy(xpath = "//div/input[@name='password' and @type='password']")
	WebElement  password;
	
	@FindBy(css = "a.btn.btn-rose")
	WebElement  LoginBtn;
	
	@FindBy(css = ".card-title > strong:nth-child(1)")
	WebElement  WealdenLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPageTitle(){
		 System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public Employee_Persona_Pages login(String un, String pwd) throws Throwable
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		Thread.sleep(8000);
		return new Employee_Persona_Pages();
	}
	
	
	

}
