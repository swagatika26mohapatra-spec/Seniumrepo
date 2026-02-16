import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import paractice.selenium.seleniumManager;

public class flipkart {

	@SuppressWarnings("deprecation")
	@Test

	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		List<WebElement> link = driver.findElements(By.tagName("a"));

		System.out.println("the size link is " + link.size());

		for (WebElement links : link) {
			String url = links.getAttribute("href");

			System.out.println("url value is " + url);

			if (url != null && !url.isEmpty()) {
				System.out.println("the url is " + url);
			}

		}

		driver.quit();

	}

}
