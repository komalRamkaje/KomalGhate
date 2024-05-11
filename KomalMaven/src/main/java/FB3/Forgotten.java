package FB3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotten {
	
    // private variable 
	@FindBy(xpath=("//a[text()='Forgotten password?']"))
	private WebElement Forgot;
	
	@FindBy(xpath=("//tbody//td//div"))
	private WebElement text;
	
	@FindBy(xpath=("//input[@id='identify_email']"))
	private WebElement mail;
	
	@FindBy(xpath=("(//a[@role='button'])[1]"))
	private WebElement Search;
	
	//constructor  public 
	
	public Forgotten(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickForgot() {
		
		Forgot.click();
	}
	
	public String getMessage() {
		
		return text.getText();
	}
	
	public void Sendmail(String userId) {
		
	  mail.sendKeys(userId);
	}
	
   public void ClickSearchbutton() {
		
	   Search.click();
	}
	
    // methods public
   
   //call
   
   public void reminder() {
	   
	   
	   Forgot.click();
	   text.getText();
	   mail.sendKeys("ghatekomal9@gmail.com");
	   Forgot.click();
	}
	}
	   
	   
   
	
	
	

