package basicAnnotations;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException 
	{
		Xls_Reader xl= new Xls_Reader("D:\\21052019\\TestNGProject\\src\\testData\\TestData.xls");
		
		int rows=xl.getrowcount("Sheet1");
		int cols=xl.getColumncount("Sheet1");
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{				
				String val=xl.getCellData("Sheet1", r, c);
				System.out.println(val);
			}
		}
		
		
		
	}

}
