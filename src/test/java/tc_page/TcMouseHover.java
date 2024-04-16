package tc_page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TcMouseHover {
	
	public WebDriver driver;
	
	public TcMouseHover(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void mouseHover()
	{
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(hover).perform();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div[3]/ul/li[10]/a")));
		wb.click();
		
	}

}
