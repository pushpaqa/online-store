package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductObjects {
	
	private static WebElement element = null;
	
	
	public static WebElement lnk_catalog(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[@id='menu-magento-catalog-catalog']/a"));
System.out.println("test");
		// Element is returned, so that an Action can be performed on it.
		return element;
		

	}
	
	public static WebElement lnk_product(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[@id='menu-magento-catalog-catalog']/div/ul/li/div/ul/li/a"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txt_pageheading(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1.page-title"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Btn_addproduct(WebDriver driver) {

		element = driver.findElement(By.id("add_new_product-button"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Btn_enable(WebDriver driver) {

		element = driver.findElement(By.cssSelector("label.admin__actions-switch-label"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement drop_attributeset(WebDriver driver) {

		element = driver.findElement(By.cssSelector(".admin__action-multiselect-text"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_productname(WebDriver driver) {

		element = driver.findElement(By.id("KKK0024"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_sku(WebDriver driver) {

		element = driver.findElement(By.id("ARQHSO7"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_price(WebDriver driver) {

		element = driver.findElement(By.id("F2FK943"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement lnk_adavncepricing(WebDriver driver) {

		element = driver.findElement(By.cssSelector("button.action-additional"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement heading_advancepricing(WebDriver driver) {

		element = driver.findElement(By.id("modal-title-13"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_specialprice(WebDriver driver) {

		element = driver.findElement(By.id("UDTQ4B6"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	public static WebElement Date_From(WebDriver driver) {

		element = driver.findElement(By.id("dp1534941152993"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	public static WebElement Date_To(WebDriver driver) {

		element = driver.findElement(By.id("dp1534941152994"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_Cost(WebDriver driver) {

		element = driver.findElement(By.id("EMRBDXH"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement btn_Add(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@id='modal-content-13']/div/div/div/fieldset/div[3]/div/div/table/tfoot/tr/td/button"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement drop_website(WebDriver driver) {

		element = driver.findElement(By.id("JCCWQ7N"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement drop_group(WebDriver driver) {

		element = driver.findElement(By.id("Q4GWAJL"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement drop_qty(WebDriver driver) {

		element = driver.findElement(By.id("E4L2DS8"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement drop_price(WebDriver driver) {

		element = driver.findElement(By.id("JT1WB59"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement Txtbx_groupprice(WebDriver driver) {

		element = driver.findElement(By.id("K1FDIB4"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	public static WebElement btn_delete(WebDriver driver) {

		element = driver.findElement(By.cssSelector(".action-delete"));

		// Element is returned, so that an Action can be performed on it.
		return element;

	}
	
	
	

}
