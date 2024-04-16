package tc_page;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TcBooking {
	
	public WebDriver driver;
	By hotelLink = By.xpath("//*[@id=\"hotels\"]/a");
	By cityInput = By.xpath("//*[@id=\"find-hotel\"]");
	By citySelect = By.xpath("//*[@id=\"hotelAuto\"]/div/ul/li[1]/a");
	By checkIn = By.xpath("//*[@id=\"check-in\"]");
	By monthSlider = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a");
	By roomInput = By.xpath("//*[@id=\"travellerDetail\"]");
	By adultCount = By.xpath("//*[@id=\"flight-search\"]/div/div[4]/div/div/div/div[1]/div/div/div[1]/div[2]/button[2]/span");
	By doneButton = By.xpath("//*[@id=\"flight-search\"]/div/div[4]/div/div/div/div[2]/button[2]");
	By searchButton = By.xpath("//*[@id=\"search-button\"]");
	
	
	public TcBooking(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void hotelLink()
	{
		driver.findElement(hotelLink).click();
	}
	
	public void selectCity()
	{
		driver.findElement(cityInput).sendKeys("New");
		driver.findElement(citySelect).click();
	}
	
	public void datePicker()
	{
		driver.findElement(checkIn).click();
		while(true)
		{
			String expectedMonth = "May";
			WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]"));
			String actualMonth = month.getText();
			if(actualMonth.equalsIgnoreCase(expectedMonth))
			{
				System.out.println(actualMonth);
				break;
			}
			else
			{
				driver.findElement(monthSlider).click();
			}
		}
		
		String expectedDate = "16";
		List<WebElement> allDates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td/a"));
				
		for(WebElement dateElement:allDates)
		{
			String actualDate = dateElement.getText();
			if(actualDate.equals(expectedDate))
			{
				System.out.println("Date is selected");
				dateElement.click();
				break;
			}
		}
	}
	
	public void guestCount()
	{
		driver.findElement(roomInput).click();
		driver.findElement(adultCount).click();
		driver.findElement(doneButton).click();
	}
	
	public void hotelSearch()
	{
		driver.findElement(searchButton).click();
	}

}
