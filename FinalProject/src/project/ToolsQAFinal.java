package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ToolsQAFinal
{

	WebDriver driver;
 @BeforeTest
  public void beforeTest() throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Documents\\Automated Testing Prm\\Browser Extention\\chromedriver.exe");
	 driver=new ChromeDriver();
     Thread.sleep(1200);
     driver.manage().window().maximize();
     driver.get("https://demoqa.com/tabs");
	 Thread.sleep(1200);
		  
	  }
  @Test
  public void ToolsQAFinal() throws InterruptedException
  {
	//*******TEXT_BOX***************88888
	  //Arrow Buttons
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/span/div")).click(); 
	 
	  //Text Box
	  driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
	  Thread.sleep(1000);
	  //Name
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Shravani");
	  Thread.sleep(1000);
	  //Email
	  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("shravanidhumal@gmail.com");
	  Thread.sleep(1000);
	  //Current address
	  driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Shikrapur Pune");
	  Thread.sleep(1000);
	  //Permenant address
	  driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("Shikrapur Pune");
	  Thread.sleep(1000);
	  //Submit Button
	  //driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	  //Thread.sleep(2000);
	  
	  
	  //******CHECK_BOX**********************
      //Check Box click
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]")).click();
	  Thread.sleep(1000);
	  //Check box
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/span/label/span[1]")).click();
	  Thread.sleep(1000); 
	  
	  //*****Radio Button****
	//Elements
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]")).click();
		 Thread.sleep(1200);
		 
		 //Radio Button
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
		 Thread.sleep(1200);
		 
		 //Do you Like This Site--->Impressive
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
		 Thread.sleep(1200);
		  
		 //Yes
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
		 //Thread.sleep(1200);
		 
		 //*******Forms****Practice forms
		
		  //open forms
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]")).click();
		  Thread.sleep(1200);
		  //practice forms dot click
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")).click();
		  Thread.sleep(1200);
		  //first name
		  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ritesh");
		  Thread.sleep(1200);
		  //last name
		  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("bangera");
		  Thread.sleep(1200);
		  //email id
		  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("riteshbangera1102@gmail.com");
		  Thread.sleep(1200);
		  //gender
		  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		  Thread.sleep(1200);
		  //mobile number
		  driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9673018535");
		  Thread.sleep(1200);
		  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		  Thread.sleep(1200);
		  //adress
		  driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("solapur");
		  Thread.sleep(1200);
  }
  

  @AfterTest
  public void afterTest()
  {
	 // driver.close();
  }

}
