package FBTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import FB2.CreateNewAccount;

public class Createaccounttest {
	
public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		CreateNewAccount  cna = new CreateNewAccount(driver);
		
		cna.clickCreateNewAcoount();
		Thread.sleep(3000);
		cna.sendfirstname("Komal");
		cna.sendLastname("Kaje");
		cna.sendMobileNo("7972153455");
		cna.sendPassword("komal@2107");
		cna.SelectBirthDay(21);
		cna.SelectBirthMonth(7);
		cna.SelectBirthYear("1997");
		cna.ClickGenderFemale();
		cna.clickSubmit();
		
		
	

}
}