package com.utils;

import java.util.ArrayList;

public class TestUtils {

	static xls_Reader reader;

	public static getDataFromExcel()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try ()
		{
			reader = new xls_reader("give the xls file path");
			
		}
		catch(Exception r)
		{
			r.printStackTrace();
		}
		
		for (int rownum =2 ; rownum< = reader.getrowCount("sheetname "));rownum++)
{
	
} 
return mydata; 
	}

}
