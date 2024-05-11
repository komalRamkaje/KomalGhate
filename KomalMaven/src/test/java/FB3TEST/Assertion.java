package FB3TEST;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import FB3.Forgotten;

public class Assertion {
WebDriver driver;
private SoftAssert soft;
	
	@BeforeClass
	 
	public void forgot() {
		System.out.println("Before class");
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
			
	}
	
	@BeforeMethod
	
	public void forgot2() {
		System.out.println("Before Method");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		soft = new SoftAssert();
		
	}
	
	@Test
	
	public void forgotPassword() {
		System.out.println("test");
		Forgotten  forgot = new Forgotten(driver);
		forgot.ClickForgot();
		 String text=forgot.getMessage();
		 System.out.println(text);
		 
		 String text1 =("Please enter your email address or mobile number to search for your account.");
		 soft.assertEquals(text, text1);
		// soft.assertNotEquals(text, text1);
		 
		 boolean text2 = text.equals(text1);
		 soft.assertTrue(text2);
		System.out.println(text2);
		 //soft.assertFalse(text2);
		 //System.out.println(text2);
		 soft.assertAll();
		 
//		 
//		 if (text.equals("Please enter your email address or mobile number to search for your account.")) {
//			 
//			 System.out.println("pass");
//		 }
//		 else 
//		 {
//			 
//			 System.out.println("Fail");
//		 }
//		
//		
		forgot.Sendmail("ghatekomal9@gmail.com");
		forgot.ClickSearchbutton();
		
}
	
	  @AfterMethod
	  
	  public void TakesScreenshot() throws IOException {
		  
		  System.out.println("After method");
		  
		 
				 
				 String cd = new SimpleDateFormat("dd.mm.yyyy.hh.mm.ss").format(Calendar.getInstance().getTime());
					
				 File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					
						
						File dest1 = new File("E:\\Komal_screenshot\\"+cd+".jpg");
						FileHandler.copy(src1, dest1);  
			 }
	  
	  @AfterClass
	   public void CloseFb() {
		  System.out.println("AfterClass");
		 
		 driver.close();
	  }
		
}



