package project;

import org.testng.annotations.Factory;

import org.testng.annotations.Factory;

public class SimpleTestFactory {

	@Factory
	public Object[] factoryMethod() {
		return new Object[] {
								new test("one"),
								new test("two")
							};
	}
}
