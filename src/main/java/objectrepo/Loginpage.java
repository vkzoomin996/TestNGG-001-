package objectrepo;

 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Loginpage {
 

@FindBy(id="email")
private WebElement username;
@FindBy(id="password")
private WebElement password;
@FindBy(id="btnSubmit")
private WebElement subbtn;
@FindBy(xpath = "//div[@class='modal-content']//div[@class='modal-body bgColorWhite']")
private WebElement warning;


public WebElement getWarning() {
	return warning;
}

public   Loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSubbtn() {
	return subbtn;
}
  public void loginpage(String Email, String Password) throws InterruptedException {
	username.sendKeys(Email);
 	password.sendKeys(Password);
subbtn.click();


}

 
}
