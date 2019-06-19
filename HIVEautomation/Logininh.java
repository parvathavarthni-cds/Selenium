package login;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Logininh {
	public static void main(String args[]) throws InterruptedException
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
    driver.get("https://qa-hive.powerwrap.com.au/users/sign_in");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("parvatha.varthni@crystaldelta.com");
    driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("T$sthive1226");
    driver.findElement(By.xpath("//*[@id=\"m_login_signin_submit\"]")).click();   
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    		   .withTimeout(120, TimeUnit.SECONDS)
    		   .pollingEvery(2, TimeUnit.SECONDS)
    		   .ignoring(NoSuchElementException.class);

    		 wait.until(new Function<WebDriver, WebElement>()
    		{
    		 public WebElement apply(WebDriver driver) {
    	    return driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li"));
    		}
    		});

    driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li")).click();
    driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]/a/span")).click();
   
   // wait.until(new Function<WebDriver, WebElement>()
	//{
	// public WebElement apply(WebDriver driver) {
   // return driver.findElement(By.cssSelector(".new_activity_btn"));
	//}
	//});
    //driver.findElement(By.cssSelector(".new_activity_btn")).click();
    WebElement portfolio_dropdown=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/ul/li[1]/a"));

    Select portfolio=new Select(portfolio_dropdown);

    portfolio.selectByVisibleText("PWL Hive MF Test");
    
    
    
    

    
   }
}

List all_rows=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/table/thead/tr"));
String before_xpath="/html/body/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/table/tbody/tr[";
String after_xpath="]/td[1]";
for(int i=0;i<all_rows.size();i++) 
{
	String name = driver.findElement(By.xpath(before_xpath +i+ after_xpath)).getText();
	if(name.contains("PWL Hive MF Test"))
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/table/tbody/tr["+i+"]/td[1]")).click();
		
	}
	
}
