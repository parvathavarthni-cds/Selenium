package Assertions;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hive_lib.hiveclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hivefunctions extends pagefactory {
	static Logger logger = Logger.getLogger(hiveclass.class.getName()); 

 	
	public static WebDriver setup(WebDriver driver,String url)
	{
		
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(url);
		driver.manage().window().maximize();
		logger.info("Browser is launched"); 
		String actualtitle=driver.getTitle();
		String expectedtitle="Hive";
		assertEquals(expectedtitle,actualtitle);
		return driver;
	}

	public static WebDriver login(WebDriver driver,String email,String password) throws InterruptedException
	{
		
		Emailid_field.sendKeys(email);
		Password_field.sendKeys(password);
		Login_button.click();
		logger.info("Logged in successfully"); 
		return driver;
	}
	public WebDriver advisor(WebDriver driver) throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(profile_icon));
		profile_icon.click();
		advisor.click();
		logger.info("Switched to advisor");

		return driver;
	}
	public WebDriver new_activity(WebDriver driver)
	{
		newactivity.click();

		logger.info("Clicked new activity");
		return driver;
	}
	

}
