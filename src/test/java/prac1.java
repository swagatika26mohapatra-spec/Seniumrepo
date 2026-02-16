import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac1 {
	
	@Test
	
	public void test ()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // applaying wait 
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='KegjBN']")); // it will return a webelement 
		//System.out.println("The size of the element is " + listallele.size()); // it will return a list  of webelement in llist format 
		driver.close();
		
		
		
	}

}
