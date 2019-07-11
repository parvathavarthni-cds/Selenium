package hive_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sdforms extends hiveclass{
	public static WebDriverWait wait;
	public WebDriver new_accountcreation(WebDriver driver,String portfolio_id)
	{
		wait = new WebDriverWait(driver, 120);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(newaccount_creation));
		newaccount_creation.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(open_a_new_account));
		open_a_new_account.click();
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(portfolio_idbox));
		portfolio_idbox.sendKeys(portfolio_id);
		WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(withassets));
		withassets.click();
		submit_button.click();
		return driver;
	}

}
