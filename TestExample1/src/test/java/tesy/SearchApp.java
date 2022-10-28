package tesy;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchApp {
	String driverPath="C:\\\\Users\\\\TARUN\\\\OneDrive\\\\Desktop\\\\JAR FILES\\\\chromedriver_win32\\\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.usplworld.com/wrogn/");
		WebElement d= driver.findElement(By.cssSelector("body > nav.navbar.navbar-fixed-top.navbar-light.navbar-expand.navi-1.d-flex > div > li:nth-child(1) > div > input"));
		d.sendKeys("Full Sleeves");
		String actualUrl = "https://www.usplworld.com/wrogn/";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
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
		 System.out.println("Search is Running");
}
}
