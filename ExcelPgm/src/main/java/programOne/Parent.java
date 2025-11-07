package programOne;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parent {
	
	static FileInputStream f;  //to read details from file
	static XSSFWorkbook wb;    //apache class to read details from the workbook
	static XSSFSheet sh;       //apache inbuilt class to read details from sheet
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("E:\\Java\\Student.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");  //getSheet is a method used to get details from sheet
		XSSFRow r =sh.getRow(a);   //XSSFRow is a class to get details from row
		XSSFCell c = r.getCell(b); //XSSFCell is a class to get details from column
		return c.getStringCellValue(); // to get details from string in the cell
	}
	
	public static String getIntegerData(int a,int b) throws IOException 
	{
		f=new FileInputStream("E:\\Java\\Student.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");  
		XSSFRow r =sh.getRow(a);   
		XSSFCell c = r.getCell(b); 
		int j=(int)c.getNumericCellValue();  //type casting
		return String.valueOf(j);  //valueOf() -> used to convert any(int) value to string
	}
	
	public static String getFloatData(int a,int b) throws IOException 
	{
		f=new FileInputStream("E:\\Java\\Student.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");  
		XSSFRow r =sh.getRow(a);   
		XSSFCell c = r.getCell(b); 
		float j=(float)c.getNumericCellValue();  //type casting
		return String.valueOf(j);  //valueOf() -> used to convert any(int) value to string
	}

}
