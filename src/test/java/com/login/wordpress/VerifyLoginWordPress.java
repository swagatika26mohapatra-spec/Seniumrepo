/**
 * 
 */
package com.login.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.com.wordpress;

/**
 * 
 */
public class VerifyLoginWordPress

{

	@Test

	public void testclass() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://wordpress.com/log-in/");

		wordpress word = new wordpress(driver);

		word.username();
		word.button();
	}

}
