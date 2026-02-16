/**
 * 
 */
package com.wordpress.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 */
public class LoginPageNew {

	WebDriver driver;

	public LoginPageNew(WebDriver driverl)

	{

		this.driver = driverl;

	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement username;

	@FindBy(xpath = "//button[@type='submit']")

	WebElement button;

	public void login_wordpress(String user)

	{
		username.sendKeys(user);
		button.click();

	}

}
