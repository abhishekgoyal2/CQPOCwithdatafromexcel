package CQPlus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




import pageObject.LoginPage;

@SuppressWarnings("unused")
public class HomePage extends BaseUd {
	public String url;
	public static Logger log=LogManager.getLogger(BaseUd.class.getName());

	@BeforeTest
	public void beforetest() throws IOException
	{
		  driver= intializeDriver();
		  log.info("Driver is intialized");
		
	}
//@Test(dataProvider="getData")
////	@Test
//	public void LogIn(String username,String Password) throws IOException, InterruptedException
//	{
//
//	url= geturl("url");
//	 driver.get(url);
//
//	LoginPage login=new LoginPage(driver);
//	login.getemail().sendKeys(username);
//	login.getpassword().sendKeys(Password);
//	login.loginbutton().click();
////	log.info(text);
//	
//	Thread.sleep(300);
//	
//	
//	}
	
	public	static void main (String [] args) throws IOException{


ExcelReader ex=new ExcelReader();
		int colnum = 0;
//String respone =ex.getfile();
colnum=ex.getcolnum(colnum);
System.out.println(colnum);
int rownum = 0;
rownum=ex.getrownum(rownum);
System.out.println(rownum);
		}
	
@AfterTest
public void aftertest()
{
	driver.close();
	driver=null;
}
	@DataProvider
	public Object[][] getData()
	{
		//row stands for different data types test should run
		//column stands for how many values per each test
		Object[][] data	=new Object[2][2];
		data[0][0]="abhishek.goyal2@globallogic.com";
		data[0][1]="Welcome@12";
//		data[0][2]="non restricted user";
		
		data[1][0]="restricteduser@qw.com";
				data[1][1]="2345";
//				data[1][2]="nonrestricteduser";
				
				return data;
	}
}
