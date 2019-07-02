package basicAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass4 
{
	
	@Test(dataProvider="getdata")
	public void test(String username, String password)
	{
		System.out.println("Enter username- "+username);
		System.out.println("Enter password - "+password);
		System.out.println("Click on login button");
	}
	
	@DataProvider
	public String[][] getdata() throws IOException
	{
		Xls_Reader xl= new Xls_Reader("D:\\21052019\\TestNGProject\\src\\testData\\TestData.xls");
		
		int rows=xl.getrowcount("Sheet1");
		int cols=xl.getColumncount("Sheet1");
		
		String[][] data= new String[rows-1][cols];
		
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{				
				
				data[r-2][c-1]=xl.getCellData("Sheet1", r, c);
			}
		}
		
		
		return data;
		
	}
}
