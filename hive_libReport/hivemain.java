package hive_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class hivemain extends Dataprovider

{
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		hiveclass loginobj = PageFactory.initElements(driver,hiveclass.class);
		driver=hiveclass.setup(driver,url);

		
		
		hiveclass loginobj1 = PageFactory.initElements(driver,hiveclass.class);

		driver=hiveclass.login(driver,email, password);

		driver=loginobj1.advisor(driver);

		driver=loginobj1.new_activity(driver);
		sdforms loginobj2 = PageFactory.initElements(driver,sdforms.class);
		driver=loginobj2.new_accountcreation(driver,portfolio_id);
		
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/pagefactorydataprovider.html");
		ExtentReports extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    ExtentTest logger=extent.createTest("Hive Application test");
	    logger.log(Status.PASS, "Logged in successfully");
	    
	    extent.flush();


		
		
		
	}








	
}
