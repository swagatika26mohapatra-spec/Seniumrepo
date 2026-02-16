package paractice.selenium;

import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.http.message.BasicListHeaderIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_window {

	@Test

	public void handle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String Parent = driver.getWindowHandle();

		System.out.println(" The parent window handle ID is " + Parent);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		// list of windows

		Set<String> all_winds = driver.getWindowHandles();
		System.out.println("the list of windows are :" + all_winds.size());
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		for (String child : all_winds) {
			if (!Parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
//				driver.findElement(
//						By.xpath("//input[@class='gNO89b' and @data-ved='0ahUKEwjEpv65ip-SAxVjR2wGHUIhMGgQ4dUDCCA']"))
//						.click();
				Thread.sleep(3000);
				driver.close();

			}
		}
		driver.switchTo().window(Parent);

		System.out.println(" The parent indow title is " + driver.getTitle());
	}

}
