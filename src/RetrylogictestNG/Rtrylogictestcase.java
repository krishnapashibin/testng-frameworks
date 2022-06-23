package RetrylogictestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.IRetryAnalyzer;

public class Rtrylogictestcase {
	@Test(retryAnalyzer= Analyzer.class)
	public void test1() {
		Assert.assertEquals("true", "true");
	}
	@Test
	public void test2() {
		Assert.assertEquals("selse", "sary");
	}
}
