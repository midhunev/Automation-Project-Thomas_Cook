package tc_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TcRegister {
	
	public WebDriver driver;
	By regIcon = By.xpath("//*[@id=\"loginRegisterDropdown\"]");
	By regButton1 = By.xpath("//*[@id=\"newUserId\"]/p/a");
//	By title = By.xpath("//*[@id=\"regTitle\"]");
	By firstName = By.xpath("//*[@id=\"registerFName\"]");
	By lastName = By.xpath("//*[@id=\"registerLName\"]");
	By emailId = By.xpath("//*[@id=\"registerEmailId\"]");
	By password = By.xpath("//*[@id=\"registerPwd\"]");
	By confirmPassword = By.xpath("//*[@id=\"registerConfirmPwd\"]");
	By mobileNo = By.xpath("//*[@id=\"registerMobileNo\"]");
	By regButton2 = By.xpath("//*[@id=\"registerButton\"]");
	
	public TcRegister(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void regSetUp()
	{
		driver.findElement(regIcon).click();
		driver.findElement(regButton1).click();
	}
	public void setValues(String fName, String lName, String eId, String pswd, String confirmPswd, String mobNo)
	{
		WebElement regTitle = driver.findElement(By.xpath("//*[@id=\"regTitle\"]"));
		Select objTitle = new Select(regTitle);
		objTitle.selectByIndex(3);
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(fName);
		driver.findElement(lastName).clear();
		driver.findElement(lastName).sendKeys(lName);
		driver.findElement(emailId).clear();
		driver.findElement(emailId).sendKeys(eId);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(confirmPassword).clear();
		driver.findElement(confirmPassword).sendKeys(confirmPswd);
		driver.findElement(mobileNo).clear();
		driver.findElement(mobileNo).sendKeys(mobNo);
	}
	
	public void register()
	{
		driver.findElement(regButton2).click();
	}

}
