package tc_page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TcScreenshot {
	
	public WebDriver driver;
	
	public TcScreenshot(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void screenshot() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\Luminar\\Projects\\Files\\ThomasCook.png"));
	}
	

}
