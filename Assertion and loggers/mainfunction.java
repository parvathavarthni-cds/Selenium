package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class mainfunction extends Dataprovider{
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		hivefunctions loginobj = PageFactory.initElements(driver,hivefunctions.class);
		driver=loginobj.setup(driver,url);

		
		
		hivefunctions loginobj1 = PageFactory.initElements(driver,hivefunctions.class);

		driver=hivefunctions.login(driver,email, password);

		driver=loginobj1.advisor(driver);

		driver=loginobj1.new_activity(driver);
		sdformfunctions loginobj2 = PageFactory.initElements(driver,sdformfunctions.class);
		driver=loginobj2.new_accountcreation(driver,portfolio_id,portfolio_name);
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/learn_automation1.html");
		ExtentReports extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.flush();
		
	}

}
