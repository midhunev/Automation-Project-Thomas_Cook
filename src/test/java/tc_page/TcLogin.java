package tc_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TcLogin {
	
	public WebDriver driver;
	By loginIcon = By.xpath("//*[@id=\"loginRegisterDropdown\"]");
	By loginButton1 = By.xpath("//*[@id=\"mainLogIn\"]");
	By emailId = By.xpath("//*[@id=\"loginId\"]");
	By password = By.xpath("//*[@id=\"existloginPass\"]");
//	By title = By.xpath("//*[@id=\"regTitle\"]");
	By loginButton2 = By.xpath("//*[@id=\"loginButton\"]");

	
	public TcLogin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginSetUp()
	{
		driver.findElement(loginIcon).click();
		driver.findElement(loginButton1).click();
	}
	public void setValues(String eId, String pswd)
	{
		driver.findElement(emailId).clear();
		driver.findElement(emailId).sendKeys(eId);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void login()
	{
		driver.findElement(loginButton2).click();
	}

}
