package paractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://developer.chrome.com/docs/chromedriver/get-started/chromeos");
		driver.close();
		System.out.println("Success");

	}

}
