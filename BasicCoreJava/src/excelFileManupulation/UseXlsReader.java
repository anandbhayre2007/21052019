package excelFileManupulation;

import java.io.IOException;

public class UseXlsReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Xls_Reader xl= new Xls_Reader("D:\\TestData5.xls");
		
		int rows=xl.getrowcount("Sheet1");
		int cols=xl.getColumncount("Sheet1");
		
		//System.out.println("Rows="+rows);
		//System.out.println("Cols="+cols);
		
		//System.out.println(xl.getCellData("Sheet1", 1, 1));
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				System.out.println(xl.getCellData("Sheet1", r, c));
			}
		}

		xl.setCellData("Sheet1","UserName",3,"Anand");
		
	}

}
