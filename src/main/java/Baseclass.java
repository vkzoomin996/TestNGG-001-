import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

 
public class Baseclass {
 public WebDriver driver;
	public    static Fileutils flib=new Fileutils();
	public    static Excelutils elib=new Excelutils();
	
	
	@BeforeSuite
	public void bsconfig() {
		
		Reporter.log("connected to database",true);
	}
	@BeforeClass
	public void bcconfig() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		  driver =new ChromeDriver();
		Reporter.log("launch the browser",true);

	}
	@BeforeMethod
	public void Bmconfig() throws Throwable {
		String URL = flib.readdatafromprofile("url");
		driver.get(URL);
		System.out.println(driver.getTitle());
		Reporter.log("navigate to the application",true);
		
	}
	@AfterMethod
	public void amconfig() {
 		Reporter.log("logout from application",true);
		

	}
	@AfterClass
	public void acconfig() {
 		Reporter.log("close the browser",true);
		driver.close();

	}
	@AfterSuite
	public void asconfig() {
 		Reporter.log("close the database",true);
		

	}
	
	
}