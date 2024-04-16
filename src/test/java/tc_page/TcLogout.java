package tc_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TcLogout {
	public WebDriver driver;
	By userIcon = By.xpath("//*[@id=\"LoginLogoutToggel\"]");
	By logoutButton = By.xpath("//*[@id=\"headercontainer\"]/div/div[2]/div/div[2]/div/div[3]/ul/li[2]/a");
	
	
	public TcLogout(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void logout()
	{
		driver.findElement(userIcon).click();
		driver.findElement(logoutButton).click();
	}


}
