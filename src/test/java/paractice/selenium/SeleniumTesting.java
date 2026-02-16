package paractice.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTesting {
	
	
	// pre condition starting with @Before
	@BeforeSuite //1
	public void SetUp()
	{
		System.out.println("System pro. for chrome");
	}
	@BeforeClass // 3
	
	public void login()
	{
		System.out.println("login page");
	}
	
	@BeforeMethod // 4
	
	public void enterUrl()
	{
		System.out.println("Enter URL");
	}
	
	@BeforeTest // 2
	
	public void launchBrowser()
	{
		System.out.println("launchBrowser");
	}
	
	// Annotation starting with @Test contains test cases 
	
	@Test (priority = 0,groups="title")
	
	public void test() {
		System.out.println("This is the first test case ");
	}
	
	@Test(priority = 1,groups="selenium")
	public void test2()
	{
		System.out.println("This is the second test case ");
	}
	@Test(priority = 2)
	public void test3()
	{
		System.out.println("This is the second test case ");
	}
	@Test(priority = 3,groups="selenium")
	public void test11()
	{
		System.out.println("This is the second test case ");
	}
	@Test(priority = 4,groups="title")
	public void test4()
	{
		System.out.println("This is the second test case ");
	}
	// Post Condition starting @After annotation 
	@AfterMethod //6
	
	public void logOut()
	{
		System.out.println("logout page");
	}
	
	@AfterTest // 7
	public void deleteCoocki()
	{
		System.out.println("delete cookie");
	}
	
	@AfterClass// 8
	
	public void closeBrowser()
	{
		System.out.println("close broser");
	}
	
	@AfterSuite //9
	
	public void generateTestReport()
	{
		System.out.println("Generate test report");
	}

}
