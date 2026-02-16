import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class parallal {

	@Test

	public void test1() {
		System.out.println("testing ");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void test2() {
		System.out.println("testing ");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
