package login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Hive {
	static String expectedTitle="Email";
	static String actualtitle="Email";

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://qa-hive.powerwrap.com.au/users/sign_in");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(expectedTitle,actualtitle);
		driver.close();
		

	}

}