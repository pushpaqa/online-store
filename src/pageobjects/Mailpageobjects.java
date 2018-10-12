package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mailpageobjects {
	
	private static WebElement element = null;
	
	public static WebElement Txtbx_Email(WebDriver driver) {

		element = driver.findElement(By.id("identifierId"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Btn_Nxt(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@id='identifierNext']/content/span"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
		
	public static WebElement Txtbx_Pwd(WebDriver driver) {

		element = driver.findElement(By.name("password"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
		
	public static WebElement Btn_Nxt1(WebDriver driver) {

		element = driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Btn_Refresh(WebDriver driver) {

		element = driver.findElement(By.cssSelector(".asf.T-I-J3.J-J5-Ji"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement open_mail(WebDriver driver) {

		element = driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Text_mailsubject(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[2]/div/h2"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}

}
