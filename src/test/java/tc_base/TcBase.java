package tc_base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TcBase {
	
	public WebDriver driver;
	String baseUrl = "https://www.thomascook.in/";
	
	@BeforeTest
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

}
