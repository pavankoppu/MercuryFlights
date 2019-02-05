package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
By username = By.xpath("//input[@name='userName']");
By password = By.name("password");
By submit = By.name("login");	

public void setusername(WebDriver driver, String userid)
{
	driver.findElement(username).sendKeys(userid);
}

public void setpassword(WebDriver driver, String pwd)
{
	driver.findElement(password).sendKeys(pwd);
}

public void login(WebDriver driver)
{
	driver.findElement(submit).click();
}




}
