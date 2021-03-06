package project;

import org.testng.annotations.Test;

//import basicProgram.DropDownMethod;
//import pom_Page_Object_Module.AtomationProject;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ProjectAutomation 
{
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Documents\\Automated Testing Prm\\Browser Extention\\chromedriver.exe");
		  driver=new ChromeDriver();
			Thread.sleep(2000); 
			driver.manage().window().maximize();
   }
	
  @Test
  public void f() throws Exception 
  {
	  Select s;
	  //ProjectAutomation a=new ProjectAutomation();
	  driver.get("https://blazedemo.com/");
	   driver.manage().window().maximize();

	  
	 // a.url(driver);
	  // a.maximize(driver);
	 //dropDown
	 		//step 1: Create object of select class
	 		 s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
	 		//step 2:Select option
	 		 s.selectByIndex(5);
	 		Thread.sleep(2000);
	 		
	 	//DropDown--->(Destination City):Tagname must be <select>
		//step 2: Create object of select class
				s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
				//step 2:Select option
				s.selectByVisibleText("Berlin");
				Thread.sleep(2000);
			
		//Find flight Button
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();		
		Thread.sleep(2000);
		
		//	Flight from Mexico city to Berlin
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		
		//Your flight from TLV to SFO has been reserved.
		//First Name
		driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Ritesh"
				+ "");
		Thread.sleep(2000);
		//Address
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(" solapur");
		Thread.sleep(2000);
		//City
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("solapur");
		Thread.sleep(2000);
		//State
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Maharastra");
		Thread.sleep(2000);
		//Zip code
		driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("123456");
		Thread.sleep(2000);
		
		//DropDown
		
		s=new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
		//step 2:Select option
		s.selectByVisibleText("Visa");
		Thread.sleep(2000);
		//Credit Card No
		driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("4356 6754 8765");
		Thread.sleep(2000);
	    //Month
		driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("11");
		Thread.sleep(2000);
		//Year
		driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2022");
		Thread.sleep(2000);
		//Name of Card
		driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("ritesh");
		Thread.sleep(2000);
		//Remember me
		driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
		//Purchase Flight
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
	  
  }
  

  @AfterTest
  public void afterTest()
  {
	// close Browser
	driver.close();	
  }

}