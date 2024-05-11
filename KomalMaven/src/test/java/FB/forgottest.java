package FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FB3.Forgotten;


public class forgottest {
	
public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		

		Forgotten  forgot = new Forgotten(driver);
		forgot.ClickForgot();
		 String text=forgot.getMessage();
		 System.out.println(text);
		 
		 if (text.equals("Please enter your email address or mobile number to search for your account.")) {
			 
			 System.out.println("pass");
		 }
		 else 
		 {
			 
			 System.out.println("Fail");
		 }
		
		
		forgot.Sendmail("ghatekomal9@gmail.com");
		forgot.ClickSearchbutton();
		
}


}


