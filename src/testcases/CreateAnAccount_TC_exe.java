package testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.CreateAnAccount_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestingLog4j;
//import utility.Log;

public class CreateAnAccount_TC_exe {

	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {

		Constant.setDriver("firefox");
		Constant.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Constant.URL" + Constant.front_URL);
		Constant.driver.get(Constant.front_URL);

	}

	@Test

	public void main() throws Exception {

		try {
			DOMConfigurator.configure("log4j.xml");

			// This is to open the Excel file. Excel path, file name and the
			// sheet name are parameters to this method

			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Values");

			// This is to get the values from Excel sheet, passing parameters
			// (Row num &amp; Col num)to getCellData method

			String FirstName = ExcelUtils.getCellData(1, 1);

			String LastName = ExcelUtils.getCellData(1, 2);

			String Email = ExcelUtils.getCellData(1, 3);

			String Mobile = ExcelUtils.getCellData(1, 4);

			String Password = ExcelUtils.getCellData(1, 5);

			String Confirmpassword = ExcelUtils.getCellData(1, 6);

			String gmail_url = ExcelUtils.getCellData(4, 1);

			String gmail_Email = ExcelUtils.getCellData(4, 2);

			String gmail_pwd = ExcelUtils.getCellData(4, 3);

			System.out.println("Mobile:" + Mobile);

			CreateAnAccount_Page.lnk_Login(Constant.driver).click();

			CreateAnAccount_Page.lnk_creatact(Constant.driver).click();

			CreateAnAccount_Page.Txtbx_Firstname(Constant.driver).sendKeys(FirstName);

			CreateAnAccount_Page.Txtbx_Lastname(Constant.driver).sendKeys(LastName);
			TestingLog4j.logger.info("Entered Txtbx_Lastname");

			CreateAnAccount_Page.Txtbx_Email(Constant.driver).sendKeys(Email);

			Thread.sleep(3000);
			System.out.println("Mobile:" + Mobile);
			CreateAnAccount_Page.Txtbx_Mobile(Constant.driver).sendKeys("9874569874");

			Thread.sleep(3000);
			CreateAnAccount_Page.Txtbx_password(Constant.driver).sendKeys(Password);

			CreateAnAccount_Page.Txtbx_cnfrmpassword(Constant.driver).sendKeys(Confirmpassword);

			CreateAnAccount_Page.Chckbx_subscribe(Constant.driver).click();

			CreateAnAccount_Page.Btn_Register(Constant.driver).click();

			Assert.assertEquals("Thank you for registering with Central Books Online.",
					CreateAnAccount_Page.welcome_txt(Constant.driver).getText());

			// This is to send the PASS value to the Excel sheet in the result
			// column.
			// Here r,c but in excel its c,r for understanding am writing this

			Constant.Mail(gmail_url, gmail_Email, gmail_pwd);

			ExcelUtils.setCellData("Pass", 1, 7);

		} catch (Throwable e) {
			System.out.println("test");
			// This is to open the Excel file. Excel path, file name and the
			// sheet name are parameters to this method

			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Values");
			ExcelUtils.setCellData("Fail", 1, 7);

			throw (e);
		}
	}

	@AfterMethod

	public void afterMethod() {

		// Constant.driver.close();

	}

}
