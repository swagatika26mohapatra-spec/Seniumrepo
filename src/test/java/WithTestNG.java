import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class WithTestNG {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	public void setupReport() {

		ExtentSparkReporter reporter = new ExtentSparkReporter(
				"/Users/swagatikamohapatra/Desktop/Report_Extend/extentReport.html");

		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Test Execution Report");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@Test
	public void test() {

		test = extent.createTest("BrowserStack Title Test");

		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/extent-reports-in-selenium");
		driver.manage().window().maximize();

		String title = driver.getTitle();

		test.info("Title is: " + title);
		test.pass("Test executed successfully");
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
		extent.flush(); // 🔥 THIS IS VERY IMPORTANT
	}
}