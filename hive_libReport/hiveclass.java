package hive_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hiveclass extends page_factory {
	public static WebDriver driver;
	public static WebDriver setup(WebDriver driver,String url)
	{
		
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(url);
		driver.manage().window().maximize();
	    logger.log(Status.PASS, "Logged in successfully");

		return driver;
	}

	public static WebDriver login(WebDriver driver,String email,String password) throws InterruptedException
	{
		
		Emailid_field.sendKeys(email);
		Password_field.sendKeys(password);
		Login_button.click();
		return driver;
	}
	public WebDriver advisor(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(profile_icon));
		profile_icon.click();
		advisor.click();
		return driver;
	}
	public WebDriver new_activity(WebDriver driver)
	{
		newactivity.click();
		return driver;
	}
	
}

