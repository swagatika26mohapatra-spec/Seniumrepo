import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {

	@Test

	public void check() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		List<WebElement> Check_box = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < Check_box.size(); i++) {

			WebElement ele = Check_box.get(i);

			if (ele.equals("Singing")) {
				ele.click();
			}

		}

		driver.close();

	}

}
