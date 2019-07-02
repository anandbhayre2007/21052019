package excelFileManupulation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file= new FileInputStream("D:\\TestData5.xls");
		
		HSSFWorkbook wb= new HSSFWorkbook(file);
		
		HSSFSheet sheet=wb.getSheet("Sheet1");
		
		HSSFRow row=sheet.getRow(1);
		
		HSSFCell cell=row.getCell(1);
		
		String data=cell.getStringCellValue();
		
		System.out.println(data);
		
	}
	
	public static ReadExcel test()
	{
		return new ReadExcel();
	}

}
