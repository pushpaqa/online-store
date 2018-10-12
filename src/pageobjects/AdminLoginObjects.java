package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginObjects {
	
	private static WebElement element = null;
	
	public static WebElement Txtbx_Email(WebDriver driver) {

		element = driver.findElement(By.id("username"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_Pwd(WebDriver driver) {

		element = driver.findElement(By.id("login"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_Signin(WebDriver driver) {

		element = driver.findElement(By.cssSelector("button.action-login.action-primary"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement lnk_Close(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("button.action-close"));
		
		return element;
	}

}
