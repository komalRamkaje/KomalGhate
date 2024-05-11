package Facebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	// variable - privet- Webelement
	
	@FindBy(xpath=("//input[@type='text']"))
	private WebElement username;
	
	@FindBy(xpath=("//input[@type='password']"))
	private WebElement passWord;
	
	@FindBy(xpath=("//button[text()='Log in']"))
	private WebElement Login;
	
	// Constructor - public WebElement intialise
	
	  public Login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	  
	  
	  public void sendUsername (String userid) {
		  username.sendKeys(userid);
		  
	  }
	  
	  public void sendPassword (String pass) {
		  passWord.sendKeys(pass);
		  
	  }
	  
	  public void clickloginButton() {
		  Login.click();
		  
	  }
	  
	  
	  
	  
	  
	  public void facebook(){
		  
		  username.sendKeys("ghatekomal9@gmail.com");
		  passWord.sendKeys("komal@2107");
		  Login.click();
		  
		  
	  }
	
}
