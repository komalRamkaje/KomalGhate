package FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.Login;

public class Logintestclass {
	
	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		

	     Login lo = new Login(driver);
	     lo.sendUsername("komalghate21@gmail.com");
	     lo.sendPassword("komal@2107");
	     lo.clickloginButton();
		  
	     
}
}