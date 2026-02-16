package paractice.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testSeleniu {

WebDriver driver ; 

@BeforeMethod
@BeforeMethod()

public void setUp()
{
	WebDriverManager.chromiumdriver().setup();
	driver = new ChromeDriver() ;
	driver.get("https://learn-automation.com/implicit-wait-in-selenium-webdriver/");
	String str =driver.findElement(By.xpath("//a[normalize-space()='Automation']")).getText();
	System.out.println("The valueis "+ str);
	
	driver.manage().window().maximize();
	
	//h3[@class='t-title-s m-ellipsis-2lines][text()='Find The Perfect Hotel For Every Trip']
	//*[@id="main-content"]/div/div[5]/div/div/div/div[1]/div/h3
	
	
}

@Test()

public void googleTitle()
{
	driver.get("https://developer.chrome.com/docs/chromedriver/get-started/chromeos");
}

@AfterMethod
@AfterMethod

public void tearDown()
{
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.quit();
}

}
