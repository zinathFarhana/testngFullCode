package cstech.com.Testngtest.Test;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cstech.com.Testngtest.Utils.DriverManager;
import cstech.com.Testngtest.Utils.UrlTextUtils;
//import cstech.com.Testngtest.Utils.UrlTextUtils;
import cstech.com.Testngtest.Utils.XpathUtils;
//import org.testng.Assert;

public class Logintest {
	private WebDriver driver = null;
	
//	public void checkHomePageTitle1() {
//		driver= DriverManager.driver;
//		driver.get(UrlTextUtils.Base_URL);
//		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Flightfinder_PAGE_TITLE);
//		System.out.println("Home Page Title Verified before !!!");
//	}
	//@Test(priority=3)
	//public void flightfinderTest(){
		//FlightFinder f = new FlightFinder();
		//f.flightfinderTest2();
	//}
	//@Test(priority=2)
	//public void waitforpageload(){

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//}
	
	@Test(priority=1)
	public void loginTest(){
		//driver.get(UrlTextUtils.BASE_URL);
		driver= DriverManager.driver;
		driver.get(UrlTextUtils.Base_URL);
		driver.findElement(By.xpath(XpathUtils.Login.Login_Username)).sendKeys("demo");
		driver.findElement(By.xpath(XpathUtils.Login.Input_Password )).sendKeys("demo");
		driver.findElement(By.xpath(XpathUtils.Login.BTN_Signin)).submit();
		System.out.println("Logged In Successfully !!");
	}

//	public void checkHomePageTitle() {
//		driver= DriverManager.driver;
//		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Flightfinder_PAGE_TITLE2);
//		System.out.println("Home Page Title Verified !!!");
//	}
}
