package headlessMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class headlessMode {

	@Test

	public void head() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://www.geeksforgeeks.org/java/arrays-sort-in-java/");

		String title = driver.getTitle();
		System.out.println(" The title is " + title);

	}

}
