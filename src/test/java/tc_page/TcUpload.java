package tc_page;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tc_utilities.TcUtil;

public class TcUpload {
	
	public WebDriver driver;
	By userIcon = By.xpath("//*[@id=\"loginRegisterDropdown\"]");
	By profile = By.xpath("//*[@id=\"headerProfile\"]/a");
	By editButton = By.xpath("//*[@id=\"profile-body\"]/div/div[2]/div[2]/div[2]/div[1]/span[3]");
	By uploadButton = By.xpath("//*[@id=\"editProfile\"]/div/div/div[2]/div/div/div[1]/div");
	By saveButton = By.xpath("//*[@id=\"myprofile_save\"]");
	By closeButton = By.xpath("//*[@id=\"editProfile\"]/div/div/div[1]/button");

	
	public TcUpload(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void uploadSetUp()
	{
		driver.findElement(userIcon).click();
		driver.findElement(profile).click();
	}
	
	public void upload() throws AWTException, InterruptedException
	{
		driver.findElement(editButton).click();
		driver.findElement(uploadButton).click();
		TcUtil.fileUpload("D:\\Luminar\\image5.png");
		driver.findElement(saveButton).click();
		driver.findElement(closeButton).click();
	}


}
