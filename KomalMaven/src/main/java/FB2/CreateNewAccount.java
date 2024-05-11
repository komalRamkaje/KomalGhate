package FB2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	@FindBy(xpath=("//a[text()='Create new account']"))
	private WebElement CreatenewAccount;
	
	@FindBy(xpath=("//input[@name='firstname']"))
	private WebElement Firstname;
	
	@FindBy(xpath=("//input[@name='lastname']"))
	private WebElement lastname;
	
	@FindBy(xpath=("(//input[@type='text'])[4]"))
	private WebElement mobileNo;
	
	@FindBy(xpath=("(//input[@type='password'])[2]"))
	 private WebElement password;
	
	@FindBy(xpath=("//select[@name='birthday_day']"))
	private WebElement birthDay;
	
	@FindBy(xpath=("//select[@name='birthday_month']"))
	private WebElement birthMonth;
	
	@FindBy(xpath=("//select[@name='birthday_year']"))
	private WebElement birthYear;
	
	@FindBy(xpath=("(//input[@type='radio'])[1]"))
	private WebElement femaleRadio;
	
	@FindBy(xpath=("//button[@name='websubmit']"))
	private WebElement submit;
	

	// Constructor - public WebElement intialise
	
	  public CreateNewAccount(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	  
	  public void clickCreateNewAcoount () {
		  CreatenewAccount.click();
	  }
	 
		public void sendfirstname (String fname) {
			Firstname.sendKeys(fname);
		  
	  }
	  
	  public void sendLastname (String lname) {
		  lastname.sendKeys(lname);
		  
	  }
	  
	  public void sendMobileNo(String No) {
		  mobileNo.sendKeys(No);
		  
	  }
	  
	  public void sendPassword(String pass) {
		  password.sendKeys(pass);
		  
	  }
	  
	  public void SelectBirthDay ( int Birthday)
	  {
		  Select x = new Select(birthDay);
		  x.selectByIndex(Birthday);
	  }
	  
	  public void SelectBirthMonth ( int BirthdayMonth)
	  {
		  Select y = new Select(birthMonth);
		  y.selectByIndex(BirthdayMonth);
	  }
	  
	  public void SelectBirthYear ( String BirthdayYear)
	  {
		  Select z = new Select(birthYear);
		  z.selectByValue(BirthdayYear);
	  }
	  
	  public void ClickGenderFemale()
	  {
		  femaleRadio.click();
	  }
	  
	  public void clickSubmit () {
		  submit.click(); 
		  
	  }
	  
	  
	  
	  public void face(){
		  
		  CreatenewAccount.click();
		  Firstname.sendKeys("Komal");
		  lastname.sendKeys("kaje");
		  mobileNo.sendKeys("7972153455");
		  password.sendKeys("Komal@2107");
		  Select x = new Select(birthDay);
		  x.selectByIndex(21);
		  Select y = new Select(birthMonth);
		  y.selectByIndex(7);
		  Select z = new Select(birthYear);
		  z.selectByValue("1997");
		  femaleRadio.click();
		  submit.click(); 
		  
	  }
	
}


