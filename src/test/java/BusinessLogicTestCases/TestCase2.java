package BusinessLogicTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.FlightsPage;
import PageObjects.LoginPage;

public class TestCase2 {
  @Test
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver","F:\\subject\\selenium\\seleniumJars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage objlogin = new LoginPage();
		objlogin.setusername(driver, "mercury");
		objlogin.setpassword(driver, "mercury");
		objlogin.login(driver);	 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FlightsPage Objflight = new FlightsPage();
		Objflight.setOneway(driver);
		Objflight.setBusiness(driver);
		Objflight.Airelinedrpdown(driver);	
		
		
		System.out.println(driver.getTitle());  
		driver.close();
		
	  
  }
}
