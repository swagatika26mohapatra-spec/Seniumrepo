package paractice.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	//@Test(invocationCount = 2, expectedExceptions = NumberFormatException.class )
//	
//	public void timeOut()
//	{
//		int i=1 ; 
//		while (i==1)
//			
//			System.out.println("i");
//			
//	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	
	public void test ()
	{
		String x = "100A";
		
		Integer.parseInt(x);
		
	}

}
