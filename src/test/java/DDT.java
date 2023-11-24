//import java.io.FileInputStream;
//
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import objectrepo.Loginpage;
//
//public class DDT  extends Baseclass{
//
//	@Test(dataProvider ="exce" )
//	public void  xyz(String username, String pass) throws Throwable {
//		Loginpage lp=new Loginpage(driver);
//		
//		Thread.sleep(3000);
// lp.setUsername(username);	
// lp.setPassword(pass);
// lp.getSubbtn().click();
// String title = driver.getTitle();
// if(title.equalsIgnoreCase("Student Management System"))
//  Reporter.log("login successfully",true);}
//	else {
//		driver.swi
//	}
//	
//	
// 	@DataProvider(name = "exce")
//	public Object[][] getDataFromExcel() throws Throwable    {
//		FileInputStream fi = new FileInputStream("./src/test/resources/Excel.xlsx");
//		Workbook wb = WorkbookFactory.create(fi);
//		 Sheet sh = wb.getSheet("Sheet1");
//		int lastrow = sh.getLastRowNum();
//		int lastcell = sh.getRow(0).getLastCellNum();
//		Object[][] obj = new Object[lastrow+1][lastcell];
//		for(int i=0; i<=lastrow; i++) //row
//		{
//			for(int j=0; j<lastcell; j++)//col
//			{
//				obj[i][j]	=sh.getRow(i).getCell(j).getStringCellValue();
//			}
//		}
//		
//		return obj;
//		
//	}}
//
