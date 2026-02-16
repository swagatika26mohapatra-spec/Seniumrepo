package crossbrowsertesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {
	WebDriver driver;

	@Test
	@Parameters("browser")

	public void test(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		driver.get("https://www.google.com/");

		System.out.println("The title of the page is " + driver.getTitle());

		driver.quit();

	}

}
