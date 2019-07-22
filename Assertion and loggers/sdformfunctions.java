package Assertions;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class sdformfunctions extends pagefactory {
	static Logger logger = Logger.getLogger(sdformfunctions.class.getName()); 

	public static WebDriverWait wait;
	public WebDriver new_accountcreation(WebDriver driver,String portfolio_id,String portfolio_name)
	{
		wait = new WebDriverWait(driver, 120);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(newaccount_creation));
		newaccount_creation.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(open_a_new_account));
		open_a_new_account.click();
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(portfolio_idbox));
		String actualtitle=pagetitle.getText();
		String expectedtitle="Open a new account";
		assertEquals(expectedtitle,actualtitle);
		portfolio_idbox.sendKeys(portfolio_id);
		portfolio_namebox.sendKeys(portfolio_name);

		//WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(withassets));
		withassets.click();
		submit_button.click();
		logger.info("Ticket is created");
		return driver;
	}

}
