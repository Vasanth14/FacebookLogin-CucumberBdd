package cucuPageFac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPf {
	public static WebDriver driver;
	
	@FindBy(name="email")
	WebElement txt_userName;
	
	@FindBy(id="pass")
	WebElement txt_passWord;
	
	@FindBy(name="login")
	WebElement bTn;

	
	
	public LoginPf(WebDriver driver) {
		LoginPf.driver=driver;
		PageFactory.initElements(driver,this );
	}
	public  void userName(String user) {
		driver.findElement(By.id("email")).sendKeys(user);
	}
	public void passWord(String pass) {
		txt_passWord.sendKeys(pass);
	}
	public void cllick() {
		bTn.click();
	}

}
