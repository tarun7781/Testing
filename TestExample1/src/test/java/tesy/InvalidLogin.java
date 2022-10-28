package tesy;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidLogin {
	String driverPath="C:\\\\Users\\\\TARUN\\\\OneDrive\\\\Desktop\\\\JAR FILES\\\\chromedriver_win32\\\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException 
  {
    driver.manage().window().maximize();
	driver.get("https://www.usplworld.com/login/?redirect_to=/");
	
	driver.findElement(By.cssSelector("#email_id")).sendKeys("tarun01@gmail.com");
	driver.findElement(By.cssSelector("#password")).sendKeys("Msd@7781");
	driver.findElement(By.cssSelector("#content > section > section > div > div > div > div > div.col-md-7.p-0.h-100.login-blocks > div > div.login-wrapper > div:nth-child(6) > form > input.btn.btn-usp-3.w-100.mt-3.loginButton")).click();
}
@BeforeTest
public void beforeTest() 
{
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TARUN\\\\OneDrive\\\\Desktop\\\\JAR FILES\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver = new ChromeDriver();
}
@AfterTest
public void afterTest() 
{
		 System.out.println("Invalid Credentials");
}
}