package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import junit.framework.Assert;
import pageobjects.CreateAnAccount_Page;
import utility.Constant;
import utility.ExcelUtils;

public class Blank_CreateAnAccount_TC {
	
	//public WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() throws Exception{
		Constant.setDriver("firefox");
		Constant.driver.get(Constant.front_URL);
		
		
		
		
	}
	@Test
	public void main() throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Values");
		String alerttext = ExcelUtils.getCellData(1, 8);
		
		CreateAnAccount_Page.lnk_Login(Constant.driver).click();
		CreateAnAccount_Page.lnk_creatact(Constant.driver).click();
		CreateAnAccount_Page.Btn_Register(Constant.driver).click();
		Assert.assertEquals(alerttext, CreateAnAccount_Page.Alerttxt_Firstname(Constant.driver).getText());
		System.out.println(CreateAnAccount_Page.Alerttxt_Firstname(Constant.driver).getText());
		
		Assert.assertEquals(alerttext, CreateAnAccount_Page.Alerttxt_Lastname(Constant.driver).getText());
		System.out.println(CreateAnAccount_Page.Alerttxt_Lastname(Constant.driver).getText());
		
		Assert.assertEquals(alerttext, CreateAnAccount_Page.Alerttxt_Email(Constant.driver).getText());
		System.out.println(CreateAnAccount_Page.Alerttxt_Email(Constant.driver).getText());
		System.out.println(CreateAnAccount_Page.Alerttxt_Email(Constant.driver).getText());
		
		Assert.assertEquals(alerttext, CreateAnAccount_Page.Alerttxt_Mobile(Constant.driver).getText());
		System.out.println(CreateAnAccount_Page.Alerttxt_Mobile(Constant.driver).getText());
		
		Assert.assertEquals(alerttext, CreateAnAccount_Page.Alerttxt_password(Constant.driver).getText());
		System.out.println(CreateAnAccount_Page.Alerttxt_password(Constant.driver).getText());
		
		Assert.assertEquals(alerttext, CreateAnAccount_Page.Alerttxt_cnfrmpassword(Constant.driver).getText());
		System.out.println(CreateAnAccount_Page.Alerttxt_cnfrmpassword(Constant.driver).getText());
		
		
	}
	
	@AfterMethod
	public void teardown() throws Exception
	{
		Constant.driver.close();
		
			
	}

}
