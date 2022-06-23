package testNGpackage;

import org.testng.annotations.Test;

public class enabledfalsealwaysruntrue {
	
	@Test
	public void paymenttest() {
		System.out.println("payment");
		int c= 6/0;
	}
	@Test(enabled=true,alwaysRun=true,dependsOnMethods="paymenttest")
	public void enabledtest() {
		System.out.println("test");
	}

}
