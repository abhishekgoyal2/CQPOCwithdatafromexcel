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
	public static String username;
	public static String password;
	public static int rownum;
	public static int colnum;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;
	public static FileOutputStream fileout;
	public static String path;
	public static int irow;
	public static int icol;

	//function to call row num,colnum and other function and read file input stream
//	@Test
	public String 	getfile() throws IOException{
		fis =new FileInputStream("D:\\CQRoll\\CQPOCwithdatafromexcel\\src\\main\\java\\testDataDriving\\CPoc data.xlsx");

		
		wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheetAt(0);
		rownum =getrownum(rownum);
		colnum =getcolnum(colnum);
		
		for(irow=1;irow<=rownum;irow++)
		{
		username=getusername(username,irow,icol);
		
		System.out.println(username);
		
		password =getpassword(password,irow,icol);
		System.out.println(password);
		}
		
		fis.close();	
	
	System.out.println("file read with success and closed");
	return "success";
	}
	
	
	
//	public	static void main (String [] args) throws IOException{
//		fis =new FileInputStream("D:\\CQRoll\\CQPOCwithdatafromexcel\\src\\main\\java\\testDataDriving\\CPoc data.xlsx");
//
//		
//		wb=new XSSFWorkbook(fis);
//		 sheet=wb.getSheetAt(0);
//		rownum =getrownum(rownum);
//		colnum =getcolnum(colnum);
//		
//		for(irow=1;irow<=rownum;irow++)
//		{
//		username=getusername(username,irow,icol);
//		
//		System.out.println(username);
//		
//		password =getpassword(password,irow,icol);
//		System.out.println(password);
//		}
//		
//		fis.close();	
//
//		}
	
	//function to write to a files
	public static  void fileOutStream1() throws IOException
	 {
		 fileout = new FileOutputStream("D:\\automationXpath\\Cal.xlsx");

          wb.write(fileout);
fileout.close();
	 }
	
	//function to write to get user name for multiple rows and numbers
	public   String getusername(String username,int irow,int jcol)
	{

			 username=sheet.getRow(irow).getCell(jcol).getStringCellValue();
				System.out.println("username is --  " + " = " + username);

			
		return username;
		}
	
	//function to write to get password name for multiple rows and numbers
	
	public  String getpassword(String password,int irow,int jcol)
	
	{

			password=sheet.getRow(irow).getCell(jcol+1).getStringCellValue();
			System.out.println("Password is --  " + " = " + password);

		return password;
		}
	
	//function to write to get row numbers from excel
	
	public  int getrownum(int rownum) throws IOException
	{
		fis =new FileInputStream("D:\\CQRoll\\CQPOCwithdatafromexcel\\src\\main\\java\\testDataDriving\\CPoc data.xlsx");
		wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheetAt(0);
		 rownum=sheet.getLastRowNum();
		 System.out.println("number of Rows--  " + " = " + rownum);
		return rownum;
		}
	
	//function to write to get column numbers from excel
	public  int getcolnum(int colnum) throws IOException
	{
		fis =new FileInputStream("D:\\CQRoll\\CQPOCwithdatafromexcel\\src\\main\\java\\testDataDriving\\CPoc data.xlsx");
		wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheetAt(0);
		colnum=sheet.getRow(0).getLastCellNum();
		 System.out.println("number of Columns--  " + " = " + colnum);
		return colnum;
		}
}
