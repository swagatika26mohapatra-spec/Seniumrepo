import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindow {

	@Test

	public void test() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

		String parent_window = driver.getWindowHandle();

		System.out.println(" The parent window is " + parent_window);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();

		Set<String> all_windows = driver.getWindowHandles();

		System.out.println(" the all windwo ID is " + all_windows);

//		for (String child : all_windows) {
//			if (!child.equalsIgnoreCase(parent_window))
//
//			{
//				driver.switchTo().window(child);
//
//				driver.findElement(By.xpath("//div//textarea[@jsname='yZiJbe']")).sendKeys("Selenium");
//
//				Thread.sleep(2000);
//				driver.close();
//
//			}
//		}

		// convert set to list

		List<String> all_window_list = new ArrayList<String>(all_windows);
		driver.switchTo().window(all_window_list.get(2));

		driver.switchTo().window(parent_window);

		driver.quit();

	}

}
