package hive_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class hivemain extends Dataprovider

{
	public static WebDriver driver;


	public static void main(String args[]) throws InterruptedException
	{
		hiveclass loginobj = PageFactory.initElements(driver,hiveclass.class);
		driver=loginobj.setup(driver,url);

		
		
		hiveclass loginobj1 = PageFactory.initElements(driver,hiveclass.class);

		driver=loginobj1.login(driver,email, password);

		driver=loginobj1.advisor(driver);

		driver=loginobj1.new_activity(driver);
		sdforms loginobj2 = PageFactory.initElements(driver,sdforms.class);
		driver=loginobj2.new_accountcreation(driver,portfolio_id);



		
		
		
	}








	
}
