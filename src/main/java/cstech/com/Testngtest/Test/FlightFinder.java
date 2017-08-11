package cstech.com.Testngtest.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;

import cstech.com.Testngtest.Utils.DriverManager;
//import cstech.com.Testngtest.Utils.UrlTextUtils;
//import org.testng.Assert;
//import cstech.com.Testngtest.Utils.UrlTextUtils;
import cstech.com.Testngtest.Utils.XpathUtils;

public class FlightFinder {
	private WebDriver driver = null;

	
	@Test(priority=1)
	public void login(){
		driver= DriverManager.driver;
		Logintest f = new Logintest();
		f.loginTest();
	}
	
	@Test(priority=2)
	public void waitforpageload(){

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=3)
	public void flightfinderTest2(){
		//driver= DriverManager.driver;
		driver.findElement(By.xpath(XpathUtils.Flightfind.Radio_Button2)).click();
		System.out.println(" ONE WAY selected successfully !!!" );

		Select dropdown1 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button1)));
		dropdown1.selectByIndex(1);
		
		System.out.println(" PASSENGERS:3 selected successfully !!!" );
	
		Select dropdown2 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button2)));
		dropdown2.selectByIndex(1);
		
		System.out.println("Departing From:london selected successfully !!!" );
		
		Select dropdown3 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button3)));
		dropdown3.selectByIndex(1);
		
		Select dropdown4 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button4)));
		dropdown4.selectByIndex(1);

		System.out.println("On:March 9 selected successfully !!!" );
		
		Select dropdown5 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button5)));
		dropdown5.selectByIndex(1);
		
		System.out.println("Arriving In:frankfurt selected successfully !!!" );
		
		Select dropdown6 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button6)));
		dropdown6.selectByIndex(1);
		
		Select dropdown7 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button7)));
		dropdown7.selectByIndex(1);
		
		System.out.println("Returning:February 2 selected successfully !!!" );
		
		driver.findElement(By.xpath(XpathUtils.Flightfind.Radio_Button3)).click();

		System.out.println("BUSINESS CLASS selected successfully !!!" );

		Select dropdown8 = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.Dropdown_Button8)));
		dropdown8.selectByIndex(1);
		
		System.out.println("Airline:Blue skies airlines selected successfully !!!" );
		
		driver.findElement(By.xpath(XpathUtils.Flightfind.BTN_Signin2)).click();
		
		System.out.println("Flightfinder page completed successfully !!!" );
	}
	
	
	
	//@Test(priority=3)
	//public void flightfinderTitleCheck()throws InterruptedException{
	//if(driver.getTitle().contains("Welcome: Mercury Tours"))
	    //Pass
	    //System.out.println("Page title contains \"Welcome: Mercury Tours\" ");
	//else
	    //Fail
	   // System.out.println("Page title doesn't contains \"Find a Flight: Mercury Tours:t\" ");
	
	//driver= DriverManager.driver;
	//Assert.assertEquals(driver.getTitle(), UrlTextUtils.Flightfinder_PAGE_TITLE2);
	//System.out.println("Home Page Title Verified !!!");
	//}

}