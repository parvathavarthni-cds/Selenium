package newhivepageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
	static WebDriver driver;

//Page url
	public String url="https://qa-hive.powerwrap.com.au/users/sign_in";  

//Locators
	
	@FindBy(xpath="//*[@id=\"user_email\"]")
    WebElement email;
	@FindBy(xpath="//*[@id=\"user_password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"m_login_signin_submit\"]")
    WebElement login;
	
	
	public Homepage(WebDriver driver){
	       this.driver=driver;
	       driver.get(url);
	       //Initialize Elements
	       PageFactory.initElements(driver, this);
	   }
	

	//Methods
	public void login()
	{
		email.sendKeys("parvatha.varthni@crystaldelta.com");
		password.sendKeys("T$sthive1226");
		login.click();	
	}
	

}