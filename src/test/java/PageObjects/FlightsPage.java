package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage 
{
	
	By Oneway = By.xpath("//input[@value='oneway']");
	By Businessclass = By.xpath("//input[@value='Business']");
	By Airline = By.name("airline");	

	public void setOneway(WebDriver driver)
	{
		driver.findElement(Oneway).click();
	}

	public void setBusiness(WebDriver driver)
	{
		driver.findElement(Businessclass).click();
	}

	public void Airelinedrpdown(WebDriver driver)
	{
		Select s  = new Select(driver.findElement(Airline));
		s.selectByVisibleText("Unified Airlines");
		
	} 

}
