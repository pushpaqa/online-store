package testcases;
 
     import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobjects.CreateAnAccount_Page;
import utility.*;
 
     // Import package pageObject.*
 
     
 
public class CreateAnAccount_TC {
 
    // private static WebDriver driver = null;
 
   public static void main(String[] args) throws Exception {
	   
	   
	 //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
	   
       ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Values");

     //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
       
		String FirstName = ExcelUtils.getCellData(1, 1);

		String LastName = ExcelUtils.getCellData(1, 2);
		
		String Email = ExcelUtils.getCellData(1, 3);
		
		String Password = ExcelUtils.getCellData(1, 4);
		
		String Confirmpassword = ExcelUtils.getCellData(1, 5);
			
	   Constant.setDriver("firefox");
	   Constant.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
    
    System.out.println("Constant.URL" + Constant.front_URL);
	   Constant.driver.get(Constant.front_URL);
     
   // Thread.sleep(3000);
 
   CreateAnAccount_Page.lnk_Login(Constant.driver).click();
    
    CreateAnAccount_Page.lnk_creatact(Constant.driver).click();
    
    CreateAnAccount_Page.Txtbx_Firstname(Constant.driver).sendKeys(FirstName);
    
    CreateAnAccount_Page.Txtbx_Lastname(Constant.driver).sendKeys(LastName);
     
    Constant.driver.close();
    
    
     
     
     //This is to send the PASS value to the Excel sheet in the result column.
     //Here r,c but in excel its c,r for understanding am writing this
     
     
     ExcelUtils.setCellData("Pass", 1, 6);
   }
}
