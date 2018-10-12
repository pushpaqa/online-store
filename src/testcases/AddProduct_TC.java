package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.AddProductObjects;
import pageobjects.AdminLoginObjects;
import utility.Constant;
import utility.ExcelUtils;

public class AddProduct_TC {
	
	@BeforeMethod
	public void beforemethod() throws Exception
	{
		Constant.setDriver("firefox");
		Constant.driver.get(Constant.back_URL);
		
	}
	
	@Test
	public void main() throws Exception
	{
		/*//command for Zoom in / Zoom out
		
		WebElement html = Constant.driver.findElement(By.tagName("html"));
		
		//Zoom in
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		
		//Zoom out
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));*/
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Values");
		
		//String heading = ExcelUtils.getCellData(RowNum, ColNum)
				
		Constant.admin_login();
		Assert.assertEquals("Dashboard", AddProductObjects.Txt_pageheading(Constant.driver).getText());
		System.out.println("Dashboard title: " + AddProductObjects.Txt_pageheading(Constant.driver).getText());
		
		AdminLoginObjects.lnk_Close(Constant.driver).click();
		
		Thread.sleep(2000);
		AddProductObjects.lnk_catalog(Constant.driver).click();
		
		Thread.sleep(2000);
		AddProductObjects.lnk_product(Constant.driver).click();
		
		Thread.sleep(2000);
		Assert.assertEquals("Products", AddProductObjects.Txt_pageheading(Constant.driver).getText());
		System.out.println("Products title: " + AddProductObjects.Txt_pageheading(Constant.driver).getText());
		
		ExcelUtils.setCellData("Opens product list page", 7, 4);
		
		AddProductObjects.Btn_addproduct(Constant.driver).click();
		Assert.assertEquals("New Product", AddProductObjects.Txt_pageheading(Constant.driver).getText());
		System.out.println("Add product title: " + AddProductObjects.Txt_pageheading(Constant.driver).getText());
		
		ExcelUtils.setCellData("Opens add product page", 7, 5);
		
		Thread.sleep(2000);
		AddProductObjects.lnk_adavncepricing(Constant.driver).click();
		
		AddProductObjects.btn_Add(Constant.driver).click();
		Assert.assertEquals("Advanced Pricing", AddProductObjects.heading_advancepricing(Constant.driver).getText());
		
		ExcelUtils.setCellData("Opens Advanced Pricing page", 7, 6);
	}

	@AfterMethod
	public void teardown() throws Exception
	{
		//Constant.driver.close();
	}
}
