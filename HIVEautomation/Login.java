package login;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;
    @Test
        public void testDriverManagerChrome() {
//             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//            ChromeDriverManager.getInstance().setup();
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.get("https://qa-hive.powerwrap.com.au");
    }
}
