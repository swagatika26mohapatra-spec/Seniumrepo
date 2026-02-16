package paractice.selenium;

import org.testng.annotations.Test;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.TestUtils;

public class HalfEbayTest {

	WebDriver driver;

	@SuppressWarnings({ "deprecation", "deprecation" })
	@BeforeMethod

	public void setup() {
		driver = new ChromeDriver();
		driver.get(
				"https://login.yahoo.com/?.src=ym&lang=en-GB&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAJi-iiautUPt-cq54V6NFmob40OZJYih37nKP5eHe3YWfoUau1PnQ_Fd8zWiqQtRhKJV_fQPPqdlELVWRs4nN02naZLDmtKKXJ3yiGSK4sqMEbipE42mTAvUjuoo3EG5yBqHu1aFBsHqQKzv4YyyVX0OMR_y3-cyyI-yZyvdOmId");

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@Test
	@DataProvider

	public void testData() {
		ArrayList<Object> testdata = TestUtils.getDataFromExcel();
		return testdata.iterator();
	}

	@Test(dataProvider = "testData")

	public void yahoo(String username) {
		driver.findElement(By.xpath("//input[@class='phone-no ']")).clear();
		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys(username);
	}

	@AfterMethod

	public void teardown() {
		driver.quit();
	}

}
