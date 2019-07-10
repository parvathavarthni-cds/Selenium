package hive_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class page_factory {

	@FindBy (xpath="//*[@id=\"user_email\"]")
	static WebElement Emailid_field;
	
	@FindBy(xpath="//*[@id=\"user_password\"]")
	
	static WebElement Password_field;
	
	@FindBy(xpath="//*[@id=\"m_login_signin_submit\"]")
	
	static WebElement Login_button;
	
	@FindBy (xpath="/html/body/div[2]/header/div/div/div[4]/div/ul/li")
	static WebElement profile_icon;
	
	@FindBy(xpath="//*[@id=\"m_header\"]/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]/a/span")
	static WebElement advisor;
	
	@FindBy(xpath="//*[@id=\"raise_a_request\"]")
	static WebElement newactivity;
	//sd forms
	
	@FindBy(xpath="//*[@id=\"m_accordion_sd_item_0_head\"]/span[1]")
	static WebElement newaccount_creation;
	
	@FindBy(xpath="//*[@id=\"m_accordion_sd_item_0_body\"]/div")
	static WebElement open_a_new_account;
	
	@FindBy(xpath="//*[@id=\"customfield_10106\"]")
	static WebElement portfolio_idbox;
	
	@FindBy(xpath="//*[@id=\"customfield_10600_hash_10500\"]")
	static	WebElement withassets;
	//*[@id="customfield_10600_hash_10500"]
	
	@FindBy (xpath="//*[@id=\"sd-form\"]/div[2]/div[2]/button[2]")
	static WebElement submit_button;
	
}
