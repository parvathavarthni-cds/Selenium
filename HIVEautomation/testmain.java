package login;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class testmain {
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
	public void select_portfolio() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/ul/li[1]/a")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/ul/li[1]/a")).click();
		List all_rows=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/table/thead/tr"));
		int rows=all_rows.size();
		System.out.println(rows);
		String before_xpath="/html/body/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/table/tbody/tr[";
		String after_xpath="]/td[1]/span";
		for(int i=1; i<=14; i++) 
		{   
			Thread.sleep(4000);
		String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			if(name.contains("PWL Hive MF Test"))
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/table/tbody/tr["+i+"]/td[1]/span")).click();
		}
	}
		public void place_order() throws InterruptedException
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"place_an_order\"]")));
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"place_an_order\"]")).click();			
	}
		public void buy_order() throws InterruptedException
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[9]/div[2]/div[1]/div[2]/div[2]/a[1]")));
			driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[2]/div[1]/div[2]/div[2]/a[1]")).click();
			Thread.sleep(5000);
			WebElement buy_drp =driver.findElement(By.xpath("//*[@id=\"select2-sell_dropdown-container\"]"));
            buy_drp.click();
            Thread.sleep(2000);
           driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[1]/div/h5")).click(); //ausbil Microcap
           Thread.sleep(1000);
           WebElement Investment_amt= driver.findElement(By.xpath("//*[@id=\"orderAmountValue\"]"));
           Investment_amt.sendKeys("23");
           WebElement advise_no=driver.findElement(By.xpath("//*[@id=\"advise_no_option\"]"));
           advise_no.click();
           WebElement pds=driver.findElement(By.xpath("/html/body/div[2]/div[10]/div/div/div/div[2]/div[1]/div/div/label/span"));
           pds.click();
           WebElement submit=driver.findElement(By.xpath("//*[@id=\"add-btn\"]"));
           submit.click();
           
		}
		public void preview() throws InterruptedException
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[9]/div[2]/div[3]/div/div/button[2]")));
			Thread.sleep(2000);
			WebElement preview = driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[2]/div[3]/div/div/button[2]"));
			preview.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[9]/div[2]/div[3]/div[1]/div/div/label/span")));
			WebElement preview_checkbox=driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[2]/div[3]/div[1]/div/div/label/span"));
			preview_checkbox.click();
			WebElement confirm_order=driver.findElement(By.xpath("//*[@id=\"confirm-order\"]"));
			confirm_order.click();
		}

public static void main(String args[]) throws InterruptedException
	{
		testmain login_obj=new testmain();
		
		login_obj.login();
		login_obj.switch_advisor();
		//login_obj.select_portfolio();
		login_obj.place_order();
		login_obj.buy_order();
		login_obj.preview();
		
		
		}
}
