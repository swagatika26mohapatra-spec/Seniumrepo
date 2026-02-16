import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().window().maximize();
		List<WebElement> button = driver.findElements(By.xpath("//input[@type='radio']"));

		for (int i = 0; i < button.size(); i++) {
			WebElement value = button.get(i);

			System.out.println(" the value is " + value.getAttribute("value"));

			if (value.equals("PYTHON")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
				value.click();
			}
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.quit();
		// TODO Auto-generated method stub

	}

}
