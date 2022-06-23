package testNGpackage;

import java.util.ArrayList;

import net.sf.jxls.reader.XLSReader;

public class fetchingdatafromexcel {
	static XLSReader reader;
	public static ArrayList<Object[]> getdata(){
		
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		reader=new XLSReader(System.getProperty("C:\\Users\\91859\\project\\src\\testNGpackage\\testdata.xls"));
	}

}
