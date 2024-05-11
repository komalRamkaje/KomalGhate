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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FB2.CreateNewAccount;
import Facebook.Login;

public class creatacc {

	public class Assertion {
		WebDriver driver;
		
			
			@BeforeClass
			 
			public void launchurl() {
				System.out.println("Before class");
				
			    driver = new ChromeDriver();
				driver.manage().window().maximize();
					
			}
			
			@BeforeMethod
			
			public void homepage() {
				System.out.println("Before Method");
				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				
			}
			
			@Test
			
			public void Createnewaccount() throws InterruptedException {
				
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


}



