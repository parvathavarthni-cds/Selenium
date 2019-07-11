package csv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class main {
	static WebDriver driver;
	static String csvfile="/home/parvathavarthini/Desktop/hive.csv";
	static String url="https://qa-hive.powerwrap.com.au/users/sign_in";



	public static void main(String args[]) throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	    driver.get(url);
	    driver.manage().window().maximize();

		CSVReader reader=new CSVReader(new FileReader(csvfile));
		String cell[];
		while((cell=reader.readNext())!=null)
		{
			for(int i=0;i<1;i++)
			{
				String email=cell[i];
				String password=cell[i+1];
				 driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys(email);
				    driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys(password);
				    driver.findElement(By.xpath("//*[@id=\"m_login_signin_submit\"]")).click();

			}
		}
	}



	
}
