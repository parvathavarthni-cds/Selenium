package hivenew;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import newhivepageobject.Homepage;

public class hivetest {
	 private WebDriver driver;
	 @Before
	public void setup() throws InterruptedException
	{

		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
		
		
	}
	
	@Test()
	public void login_credentials()
	{
		//create object for Home page class
		System.out.println("Entering");
		Homepage home = new Homepage(driver);
	    home.login();
	}
	@After
    public void close(){
          driver.close();
       }
	
}

