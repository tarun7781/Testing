package tesy;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Registeration {
	String driverPath="C:\\\\Users\\\\TARUN\\\\OneDrive\\\\Desktop\\\\JAR FILES\\\\chromedriver_win32\\\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException 
  {
	  
	    driver.manage().window().maximize();
		driver.get("https://www.usplworld.com/sign-up/?redirect_to=/");
		
		driver.findElement(By.cssSelector("#login-email > div:nth-child(1) > div.col-6.pr-1 > input")).sendKeys("Tarun");	
		driver.findElement(By.cssSelector("#login-email > div:nth-child(1) > div.col-6.pl-1 > input")).sendKeys("Penubarthi");
		driver.findElement(By.cssSelector("#email_id")).sendKeys("tarun@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Msd@7781");
		driver.findElement(By.cssSelector("#mobile_number")).sendKeys("8121234568");
		Thread.sleep(10);	
		driver.findElement(By.cssSelector("#login-email > input.btn.btn-usp-3.w-100.mt-3")).click();
}
@BeforeTest
public void beforeTest() 
{
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TARUN\\\\OneDrive\\\\Desktop\\\\JAR FILES\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver = new ChromeDriver();
}
@AfterTest
public void afterTest()
{
		 System.out.println("Registered Successfully");
}
}