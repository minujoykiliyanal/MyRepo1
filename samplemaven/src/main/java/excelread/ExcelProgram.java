package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProgram {
static FileInputStream fis; //Fileinputstream is an inbuilt class used to open the excel folder
static XSSFWorkbook wb; //inorder to change anything in the workbook
static XSSFSheet sh; // used to modify anything in the sheet , its an imbuilt
public static String getstringdata(int a, int b) throws IOException { //method used to read the string data , int a is row and int b is cell or coulmn
	fis= new FileInputStream("D:\\Book1.xlsx"); //copy as path the excel sheet
	wb= new XSSFWorkbook(fis);
	sh= wb.getSheet("Sheet1");
	XSSFRow xr=sh.getRow(a);
	XSSFCell xc=xr.getCell(b);
	return xc.getStringCellValue();
	
	
}
public static String getintegerdata(int a, int b) throws IOException { //method used to read the string data , int a is row and int b is cell or coulmn
	fis= new FileInputStream("D:\\Book1.xlsx"); //copy as path the excel sheet
	wb= new XSSFWorkbook(fis);
	sh= wb.getSheet("Sheet1");
	XSSFRow xr=sh.getRow(a);
	XSSFCell xc=xr.getCell(b);
	int x= (int) xc.getNumericCellValue();
	return String.valueOf(x);
}
}
