package tesy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCart {
	WebDriver driver;
	@Test
	public void search() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TARUN\\\\OneDrive\\\\Desktop\\\\JAR FILES\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.usplworld.com/wrogn/products/shirts/");
		driver.findElement(By.cssSelector("#product-image-wrapper > a")).click();
		driver.findElement(By.cssSelector("#quickSizeSelect > ul > div:nth-child(5) > li")).click();
		driver.findElement(By.cssSelector("#quickAddToCart")).click();
		String actualUrl = "https://www.usplworld.com/wrogn/product/details/wzsh0009-dark-checked-shirt/";
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
		 System.out.println("Added To Cart");
}
}