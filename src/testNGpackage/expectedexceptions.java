package testNGpackage;

import org.testng.annotations.Test;

public class expectedexceptions {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void excepti() {
		int i=1;
				while(i==1)
				{
					System.out.println("value of i"+i);
				}
	}

}
