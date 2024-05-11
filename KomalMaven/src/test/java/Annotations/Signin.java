package Annotations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import FB2.CreateNewAccount;
import Facebook.Login;

public class Signin {
	

	WebDriver driver;

		
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
			
		}
		
		@Test
		
		public void Signin() throws InterruptedException {
		

		     Login lo = new Login(driver);
		     lo.sendUsername("komalghate21@gmail.com");
		     lo.sendPassword("komal@2107");
		     lo.clickloginButton();
			  
			
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




