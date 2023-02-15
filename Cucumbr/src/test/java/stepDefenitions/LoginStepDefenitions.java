package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucuPageFac.ForgotPasswordObj;
import cucuPageFac.LoginPf;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefenitions{
	

	public WebDriver driver;
	LoginPf login;
	
	    
    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() throws Throwable {
    	 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
        
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_and(String user, String pass) throws Throwable {
    	System.out.println("ready");
         login = new LoginPf(driver);
    	
         login.userName(user);
         login.passWord(pass);
         login.cllick();
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
       
    }
    @Given("^user is on the landing page$")
    public void user_is_on_the_landing_page() throws Throwable {
    	
    }

   

}
