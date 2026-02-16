import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropDownDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		WebElement element = driver
				.findElement(By.xpath("//div[@class='post-body entry-content']//button[@class='dropbtn']"));

		Actions action = new Actions(driver);

		action.moveToElement(element).perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.quit();

		// TODO Auto-generated method stub

	}

}
