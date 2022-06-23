package testNGpackage;

import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount=10)
	public void invocationcount()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println("Sum is"+c);
	}

}
