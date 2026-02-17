package base;

import java.lang.reflect.Method;

import org.testng.annotations.*;
import com.aventstack.extentreports.*;

import utils.ExtentManager;

public class BaseTest {

	protected static ExtentReports extent;
	protected static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	@BeforeSuite
	public void setupReport() {
		extent = ExtentManager.getInstance();
	}

	@BeforeMethod
	public void startTest(Method method) {
		test.set(extent.createTest(method.getName()));
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}