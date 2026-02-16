package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Paratemetermain {

	@Test
	@Parameters({"env","browser"})

	public void test(String url , String browser ) {
		WebDriver driver = new ChromeDriver();

		driver.get(
				url);

		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}

}
