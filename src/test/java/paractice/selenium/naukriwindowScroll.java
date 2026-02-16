package paractice.selenium;

import org.testng.annotations.Test;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naukriwindowScroll {

	@Test

	public void practice() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// create the instance of js

		JavascriptExecutor je = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'View all companies')]"));
		
		((JavascriptExecutor)driver).executeScript("scroll(0,40000)");

		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		ele.click();

		System.out.println(ele.getText());

	}

}
