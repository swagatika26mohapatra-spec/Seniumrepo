package paractice.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount =  10 )
	
	public void invocation()
	{
		int a = 10 ; 
		int b = 30 ; 
		
		int c = a + b ; 
		
		System.out.println(" the sum is ====" + c );
	}

}
