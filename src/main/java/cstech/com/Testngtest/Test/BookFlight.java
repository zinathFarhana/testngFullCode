package cstech.com.Testngtest.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import cstech.com.Testngtest.Utils.DriverManager;
import cstech.com.Testngtest.Utils.XpathUtils;

public class BookFlight {
	private WebDriver driver = null;
	@Test(priority=1)
	public void SelectFlightTest(){ 
		driver= DriverManager.driver;
		SelectFlight b = new SelectFlight();
		b.flightfinderTest();
		b.waitforpageload2();
		b.SelectFlight2();
	}
	
	@Test(priority=2)
	public void waitforpageload3(){

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public void BookFlight2(){
		driver.findElement(By.xpath(XpathUtils.BookFlight.First_Name)).sendKeys("zinath");
		driver.findElement(By.xpath(XpathUtils.BookFlight.Last_Name)).sendKeys("farhana");
		Select dropdown9 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button9)));
		dropdown9.selectByIndex(1);
		driver.findElement(By.xpath(XpathUtils.BookFlight.First_Name2)).sendKeys("choiti");
		driver.findElement(By.xpath(XpathUtils.BookFlight.Last_Name2)).sendKeys("farhana");
		Select dropdown10 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button10)));
		dropdown10.selectByIndex(1);
		
		//driver.findElement(By.xpath(XpathUtils.BookFlight.First_Name3)).sendKeys("choitii");
		//driver.findElement(By.xpath(XpathUtils.BookFlight.Last_Name3)).sendKeys("farhanaa");
		Select dropdown11 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button11)));
		dropdown11.selectByIndex(1);
		driver.findElement(By.xpath(XpathUtils.BookFlight.Number)).sendKeys("0134566");
		Select dropdown12 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button12)));
		dropdown12.selectByIndex(1);
	
		Select dropdown13 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button13)));
		dropdown13.selectByIndex(1);
		//Select dropdown14 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button15)));
		//dropdown14.selectByIndex(1);
		driver.findElement(By.xpath(XpathUtils.BookFlight.First_Name4)).sendKeys("zinath");
		driver.findElement(By.xpath(XpathUtils.BookFlight.Last_Name4)).sendKeys("farhana");
		driver.findElement(By.xpath(XpathUtils.BookFlight.Name5)).sendKeys("choiti");

		
		driver.findElement(By.xpath(XpathUtils.BookFlight.Radio_Button5)).click();
	}
}
	
