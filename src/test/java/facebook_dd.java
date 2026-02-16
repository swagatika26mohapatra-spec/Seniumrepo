import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebook_dd {

	@Test

	public void facebook() {

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--headless=new ");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		driver.manage().window();

		WebElement select_day_dd = driver.findElement(By.xpath("//div//select[@aria-label='Day']"));

		Select month_dd = new Select(select_day_dd);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		month_dd.selectByVisibleText("3");

		WebElement select_month = driver.findElement(By.xpath("//div//select[@aria-label='Month']"));

		Select month_drop = new Select(select_month);

		WebElement first = month_drop.getFirstSelectedOption();

		System.out.println(" The first selected value is " + first.getText());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		month_drop.selectByVisibleText("Jan");

		WebElement year_dd = driver.findElement(By.xpath("//div//select[@aria-label='Year']"));

		Select year_dropdown = new Select(year_dd);
		year_dropdown.selectByValue("2022");

		List<WebElement> all_year = year_dropdown.getOptions();

		System.out.println(" The size of the list is " + all_year.size());

		for (int i = 0; i < all_year.size(); i++) {

			WebElement ele = all_year.get(i);

			System.out.println(" the vaue is " + ele.getText()); 

		}

	}

}
