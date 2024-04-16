package tc_page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TcWindow {
	
	public WebDriver driver;
	By cruiseLink = By.xpath("//*[@id=\"cruisePath\"]");
	By cordeliaLink = By.xpath("//*[@id=\"content\"]/app-exclusivedeals/section/div/div[2]/div[1]/div/div");

	public TcWindow(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void windowHandle()
	{
		String currentWindow = driver.getWindowHandle();
		driver.findElement(cruiseLink).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String window:allWindows)
		{
			if(!window.equalsIgnoreCase(currentWindow))
			{
				driver.switchTo().window(window);
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,500)", "");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.findElement(cordeliaLink).click();
				driver.close();
			}
			driver.switchTo().window(currentWindow);
		}	
	}

}
