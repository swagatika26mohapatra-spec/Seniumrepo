package com.wordpress.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wordpress {

	WebDriver driver;

	By username = By.id("usernameOrEmail");
	By button = By.xpath("//button[@type='submit']");

	public wordpress(WebDriver driver) {
		this.driver = driver;
	}

	public void username() {
		driver.findElement(username).sendKeys("swagatika");
		
	}

	public void button() {
		driver.findElement(button).click();

	}

}
