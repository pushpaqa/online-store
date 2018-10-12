package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import utility.Constant;

public class CreateAnAccount_Page {

	private static WebElement element = null;

	// Method is declared as Public Static, so that it can be called in any
	// other method without instantiate the class

	// Driver is being passed as an Argument so that Selenium is able to locate
	// the element on the browser (driver).

	public static WebElement lnk_Login(WebDriver driver) {

		element = driver.findElement(By.linkText("Log In"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	public static WebElement lnk_creatact(WebDriver driver) {

		element = driver.findElement(By.xpath("//form[@id='login-form']/div/table/tbody/tr/td/div[2]/div/button"));

		return element;

	}
	
	public static WebElement Heading_creatact(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;

	}
	public static WebElement Heading_personalinfo(WebDriver driver) {

		element = driver.findElement(By.cssSelector("legend.legend > span"));

		return element;

	}
	
	public static WebElement Txtbx_Firstname(WebDriver driver) {

		element = driver.findElement(By.id("firstname"));

		return element;

	}
	
	public static WebElement Txtbx_Lastname(WebDriver driver) {

		element = driver.findElement(By.id("lastname"));

		return element;

	}
	
	public static WebElement Txtbx_Email(WebDriver driver) {

		element = driver.findElement(By.id("email_address"));

		return element;

	}
	
	public static WebElement Txtbx_Mobile(WebDriver driver) {

		element = driver.findElement(By.name("mobile_number"));

		return element;

	}
	
	public static WebElement Txtbx_password(WebDriver driver) {

		element = driver.findElement(By.id("password"));

		return element;

	}
	
	public static WebElement Txtbx_cnfrmpassword(WebDriver driver) {

		element = driver.findElement(By.id("confirmation"));

		return element;

	}
	
	public static WebElement Chckbx_subscribe(WebDriver driver) {

		element = driver.findElement(By.id("is_subscribed"));

		return element;

	}
	
	public static WebElement Btn_Register(WebDriver driver) {

		element = driver.findElement(By.xpath("//form[@id='form-validate']/div[2]/button"));

		return element;

	}
	
	public static WebElement Alerttxt_Firstname(WebDriver driver) {

		element = driver.findElement(By.id("advice-required-entry-firstname"));

		return element;

	}
	
	public static WebElement Alerttxt_Lastname(WebDriver driver) {

		element = driver.findElement(By.id("advice-required-entry-lastname"));

		return element;

	}
	
	public static WebElement Alerttxt_Email(WebDriver driver) {

		element = driver.findElement(By.id("advice-required-entry-email_address"));

		return element;

	}
	
	public static WebElement Alerttxt_Mobile(WebDriver driver) {

		element = driver.findElement(By.id("advice-required-entry-mobile_number"));

		return element;

	}
	
	public static WebElement Alerttxt_password(WebDriver driver) {

		element = driver.findElement(By.id("advice-required-entry-password"));

		return element;

	}
	
	public static WebElement Alerttxt_cnfrmpassword(WebDriver driver) {

		element = driver.findElement(By.id("advice-required-entry-confirmation"));

		return element;

	}
	
	public static WebElement welcome_txt(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.success-msg > ul > li > span"));

		return element;

	}

}
