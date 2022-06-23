package testNGpackage;

import org.testng.annotations.DataProvider;

public class dataproviderformat {
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] a1= {{1},{2}};
		return a1;
	}

}
