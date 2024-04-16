package tc_page;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class TcScreenshotElmt {
	
public WebDriver driver;
	
	public TcScreenshotElmt(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void screenshotElement() throws IOException
	{
		WebElement telephoneElement = driver.findElement(By.xpath("//*[@id=\"headercontainer\"]/div/div[2]/div/div[2]/a[1]"));
		File src = telephoneElement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshots//TelephoneElement.png"));
	}
	

}
