/**
 * 
 */
package paractice.selenium;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 
 */
public class GoogleSearch {

	@Test

	public void Google() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("selenium");

		List<WebElement> element = driver.findElements(By.xpath("//div[@jscontroller='Dvn7fe']//li"));

		System.out.println("the size is " + element);

		for (WebElement ele : element) {
			String text = ele.getText();

			System.out.println(" the text is " + text);

			if (text.contains("selenium")) {
				ele.click();

				break;
			}

		}

	}

}
