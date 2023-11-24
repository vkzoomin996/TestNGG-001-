import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import objectrepo.Loginpage;

public class LoginTest extends Baseclass{
	
	
	
	@Test
	public void logintest() throws Throwable {
		String USERNAME = flib.readdatafromprofile("username");
	String PASSWORD = flib.readdatafromprofile("password");
  
  		Loginpage lp=new Loginpage(driver);
		lp.loginpage(USERNAME,PASSWORD);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	
	
	
	}
}
