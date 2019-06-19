package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ticket extends Sd_tickets {

	public void Hive_suppport()
	{
		wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[8]/div/div[4]/div[2]/div/div[3]/button")));
		driver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div[4]/div[2]/div/div[3]/button")).click();
		wait= new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"summary\"]")));
		WebElement summary=driver.findElement(By.xpath("//*[@id=\"summary\"]"));
		summary.sendKeys("Test please ignore");
		WebElement issue_dropdown=driver.findElement(By.xpath("//*[@id=\"customfield_15920\"]"));
		Select issue=new Select(issue_dropdown);
	    issue.selectByVisibleText("User login issues");

	    WebElement no_of_users=driver.findElement(By.xpath("//*[@id=\"customfield_15939\"]"));
	    no_of_users.sendKeys("1");
	    WebElement description=driver.findElement(By.xpath("//*[@id=\"description\"]"));
	    description.sendKeys("Test please ignore");
	    WebElement submit=driver.findElement(By.xpath("/html/body/div[2]/div[8]/div[1]/div[4]/form/div[2]/div[2]/button[2]"));
	    submit.click();
		
		
		
	}
	public static  void main(String args[]) throws InterruptedException
	{
		ticket obj=new ticket();
		obj.login();
		obj.switch_advisor();
		obj.switch_newactivity();
		obj.Hive_suppport();
	}
}
