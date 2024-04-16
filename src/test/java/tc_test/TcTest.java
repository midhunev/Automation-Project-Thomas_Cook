package tc_test;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import tc_base.TcBase;
import tc_page.TcBooking;
import tc_page.TcLogin;
import tc_page.TcLogout;
import tc_page.TcMouseHover;
import tc_page.TcRegister;
import tc_page.TcScreenshot;
import tc_page.TcScreenshotElmt;
import tc_page.TcUpload;
import tc_page.TcWindow;
import tc_utilities.TcUtil;


public class TcTest extends TcBase{
	
	@Test(priority=1)
	public void register()
	{
		TcRegister r = new TcRegister(driver);
		r.regSetUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String xl = "D:\\Luminar\\Projects\\Files\\registerData.xlsx";
		String sheet = "Sheet1";
		int rowCount = TcUtil.getRowCount(xl, sheet);
		System.out.println("Row Count is " + rowCount);
		for(int i=1;i<=rowCount;i++)
		{
			String fName = TcUtil.getCellValue(xl, sheet, i, 0);
			System.out.println("First Name ----" + fName);
			String lName = TcUtil.getCellValue(xl, sheet, i, 1);
			System.out.println("Last Name ----" + lName);
			String email = TcUtil.getCellValue(xl, sheet, i, 2);
			System.out.println("Last Name ----" + email);
			String pswd = TcUtil.getCellValue(xl, sheet, i, 3);
			System.out.println("Email Id ----" + pswd);
			String cPswd = TcUtil.getCellValue(xl, sheet, i, 4);
			System.out.println("Confirm Password ----" + cPswd);
			String mobNo = TcUtil.getCellValue(xl, sheet, i, 5);
			System.out.println("Mobile No. ----" + mobNo);
			System.out.println("Here");
			r.setValues(fName, lName, email, pswd, cPswd, mobNo);
			r.register();
		}
	}
	
	@Test(priority=2)
	public void titleVerification()
	{
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "Thomas Cook Tours and Travels: Flights, Hotels, Forex & Holidays Packages";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Registration Passed");
		}
		else
		{
			System.out.println("Registration Failed");
		}
	}
	

	@Test(priority=3)
	public void hotelBooking()
	{
		TcBooking b = new TcBooking(driver);
		b.hotelLink();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		b.selectCity();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		b.datePicker();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		b.guestCount();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		b.hotelSearch();
	}
	
	
	@Test(priority=4)
	public void editProfile() throws AWTException, InterruptedException
	{
		TcUpload u = new TcUpload(driver);
		u.uploadSetUp();
		u.upload();
	}
	
	@Test(priority=5)
	public void logout()
	{
		TcLogout lgt = new TcLogout(driver);
		lgt.logout();
	}
	
	@Test(priority=6)
	public void login()
	{
		TcLogin l = new TcLogin(driver);
		l.loginSetUp();
		String xl = "D:\\Luminar\\Projects\\Files\\apache.xlsx";
		String sheet = "Sheet1";
		int rowCount = TcUtil.getRowCount(xl, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String email = TcUtil.getCellValue(xl, sheet, i, 0);
			System.out.println("Email id ----" + email);
			String passwd = TcUtil.getCellValue(xl, sheet, i, 1);
			System.out.println("Password ----" + passwd);
			l.setValues(email, passwd);
			l.login();
		}
	
	}
	
	@Test(priority=7)
	public void screenshotScreen() throws IOException
	{
		TcScreenshot s = new TcScreenshot(driver);
		s.screenshot();
	}
	
	@Test(priority=8)
	public void screenshotElement() throws IOException 
	{
		TcScreenshotElmt se = new TcScreenshotElmt(driver);
		se.screenshotElement();
	}
	
	@Test(priority=9)
	public void mouseHover()
	{
		TcMouseHover m = new TcMouseHover(driver);
		m.mouseHover();
	}
	
	@Test(priority=10)
	public void windowHandle()
	{
		TcWindow w = new TcWindow(driver);
		w.windowHandle();
	}
	

}
