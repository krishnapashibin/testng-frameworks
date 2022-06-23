package project;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test
{
	private String param ;

	public test(String param) {
		this.param = param;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before SimpleTest class executed.");
	}

	@Test
	public void testMethod() {
		System.out.println("testMethod parameter value is: " + param);
	}
	@Test
	public void testMethod1() {
		System.out.println("testMethod2 parameter value is: " + param);
	}
}