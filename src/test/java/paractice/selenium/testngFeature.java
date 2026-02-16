package paractice.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testngFeature {

	@Test

	public void fature1() {
		System.out.println("login page1 ");
		
		int i = 9/0; 
	}

	@Test

	public void fature2() {
		System.out.println("login page2 ");
	}

	@Test(dependsOnMethods = "fature1")

	public void fature3() {
		System.out.println("login page3 ");
	}

}
