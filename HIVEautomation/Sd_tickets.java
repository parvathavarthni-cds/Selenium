package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sd_tickets {
	WebDriver driver;
    WebDriverWait wait;
	public void login()
	{
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
	    driver.get("https://qa-hive.powerwrap.com.au/users/sign_in");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("parvatha.varthni@crystaldelta.com");
	    driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("T$sthive1226");
	    driver.findElement(By.xpath("//*[@id=\"m_login_signin_submit\"]")).click();
	  }
	public void switch_advisor() throws InterruptedException
	{  
		wait= new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li/a")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li/a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]/a")));
       driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]/a")).click();
 
      }
	public void switch_newactivity()
	{
		wait= new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ul/div/span/span[1]")));
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ul/div/span/span[1]")).click();
	}
	

}
