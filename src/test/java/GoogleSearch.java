import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div//textarea[@name='q']")).sendKeys("Selenium");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//li[@role='presentation']//div[@role='presentation']//span//b")));

		System.out.println(" The size is " + options.size());

		for (WebElement all_options : options) {
			String title = all_options.getText();
			System.out.println(" The title is " + title);

			if (title.contains("selenium")) {
				all_options.click();
				break;
			}

		}

		// TODO Auto-generated method stub

		driver.quit();

	}

}
