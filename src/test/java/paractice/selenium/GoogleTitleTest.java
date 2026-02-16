package paractice.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver ;
	
	@BeforeMethod
	@BeforeMethod()
	
	public void setUp()
	{
		driver = new ChromeDriver() ;
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void test ()
	{
		String title = driver.getTitle();
		System.out.println( " The tite is " + title );
		AssertJUnit.assertEquals(title, "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com");
	}
	
	@AfterMethod
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}

}
