package CQPlus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {
	public static int username;
	public static int password;
	public static int rownum;
	public static int colnum;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;
	public static FileOutputStream fileout;
	public static String path;
	
	@Test
	public	static String 	getfile() throws IOException{
		fis =new FileInputStream("D:\\CQRoll\\CQPOCwithdatafromexcel\\src\\main\\java\\testDataDriving\\CPoc data.xlsx");
//		getusername("username");
		getrownum(rownum);
		getcolnum(colnum);
		fis.close();	
		fileout.close();
		return "Success";
	}
	
	public static  void fileOutStream1() throws IOException
	 {
		 fileout = new FileOutputStream("D:\\automationXpath\\Cal.xlsx");
//		 System.out.print("calling filepath");
          wb.write(fileout);
fileout.close();
	 }
	
	public static String getusername(String username)
	{
		for(int row=0;row<rownum;row++)
			
		return username;
		
	}
	
	
	public static String getpassword(String username)
	{
		return username;
		
	}
	
	public static int getrownum(int rownum) throws IOException
	{
		wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheetAt(0);
		 rownum=sheet.getLastRowNum();
		 System.out.println("number of Rows--  " + " = " + rownum);
		return rownum;
		
	}
	
	public static int getcolnum(int colnum)
	{
		colnum=sheet.getRow(0).getLastCellNum();
		 System.out.println("number of Rows--  " + " = " + colnum);
		return colnum;
		
	}
}
