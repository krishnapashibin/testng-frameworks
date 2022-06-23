package testNGpackage;

import org.testng.annotations.DataProvider;

public class daraproviderdatasetclass {
	
	@DataProvider
	public Object[][] dataset() {
		Object[][] data=new Object[2][2] ;
		data[0][0]="Krishna";
		data[0][1]="Krishna@123";
		data[1][0]="Krishnatest";
		data[1][1]="Krishna@123test";
		return data;
		
	}
	
	//method 2 using dataprovide
	@DataProvider
	public Object[][] dataset2() {
		return new Object[][] {
			{"Krishna","Krishna@123"},
			{"Krishnatest","Krishna@123test"}
		};
		

}
}
