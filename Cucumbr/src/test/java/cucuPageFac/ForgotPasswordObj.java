package cucuPageFac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordObj {
	WebDriver driver;
	
	//@FindBy(xpath= "//a[text()='Forgotten password?']")
	@FindBy(how = How.XPATH, using  ="//a[text()='Forgotten password?']")
	WebElement linkClick;
	
	@FindBy(css="div.x1r8uery")
	WebElement loginBtn;
	
	public ForgotPasswordObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, ForgotPasswordObj.class);
	}
	public void linkkClic() {
		linkClick.click();
	}
	public void loginBtnn() {
		loginBtn.click();
	}
	
	

}
