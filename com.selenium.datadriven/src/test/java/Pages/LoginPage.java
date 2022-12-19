package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage
{

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	
	//@FindBy(id="user_login") 
	@FindBy(how=How.ID,using="user_login") 
	@CacheLookup
	WebElement username;
	

	// @FindBy(name="pwd")
	@FindBy(how=How.NAME,using="pwd")
	@CacheLookup
	WebElement password;
	
	// @FindBy(how=How.XPATH,using="//input[@id='wp-submit']")
	@FindBy(xpath="//input[@id='wp-submit']")
	@CacheLookup
	WebElement login_button;
	
	
	public void typeUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void typePassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginButton(){
		login_button.click();
		
	}
	
	public void verifyPageTitle()
	{
		//Assert.assertTrue(driver.getTitle().contains("WordPress"));
	}
	
	
	public void login_Wordpress(String uname,String pass)
	{
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("WordPress"));
		username.sendKeys(uname);	
		password.sendKeys(pass);
		login_button.click();
	}
	

	
}
