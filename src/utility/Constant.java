package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import pageobjects.AdminLoginObjects;
import pageobjects.Mailpageobjects;

public class Constant {
	
	//Will instantiate driver only in main class
	
	public static WebDriver driver;
 
	  public static final String front_URL = "http://magento.quad1test.com/centralbooksnew";
	  
	  public static final String back_URL = "http://highendtest.atigro.com/admin";
	  
	  public static final String Gmail_URL = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
 
       public static final String Username = "testuser_1";
 
       public static final String Password = "Test@123";
       
       public static final String Path_TestData = "D:\\Pushpa System\\eclipse-java-mars-2-win32-x86_64\\POM Framework\\OnlineStore\\src\\testdata//";
    		   
       public static final String File_TestData = "TestData.xls";

          
       public static void setDriver(String browserName) {
   		
   		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   		
   		if (browserName.equals("firefox")) {
   			driver = new FirefoxDriver();
   		} else if (browserName.equals("chrome")) {
   			System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\chromedriver.exe");
   		  
   			driver = new ChromeDriver();
   			
   		} else if (browserName.equals("IE")) {
   			driver = new InternetExplorerDriver();
   		}

   		driver.manage().window().maximize();
   		
   	}
       
       public static void Mail(String URL, String Email, String Pwd) throws Exception {
    	   
    	   driver.get(Constant.Gmail_URL);
       	   Mailpageobjects.Txtbx_Email(Constant.driver).sendKeys(Email);
       	   Mailpageobjects.Btn_Nxt(Constant.driver).click();
       	   Mailpageobjects.Txtbx_Pwd(Constant.driver).sendKeys(Pwd);
       	   Mailpageobjects.Btn_Nxt1(Constant.driver).click();
       	   Mailpageobjects.Btn_Refresh(Constant.driver).click();
       	   Mailpageobjects.open_mail(Constant.driver).click();
       	   String mail_subject = Mailpageobjects.Text_mailsubject(Constant.driver).getText();
    	   
    	   ExcelUtils.setCellData(mail_subject, 1, 9);
       
   	}
       
      public static void admin_login() throws Exception {
    	   
    	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Values");
  		
  		String Admin_email = ExcelUtils.getCellData(7, 1);
  		
  		String Admin_Pwd = ExcelUtils.getCellData(7, 2);
  		
  		AdminLoginObjects.Txtbx_Email(Constant.driver).sendKeys(Admin_email);
  		
  		AdminLoginObjects.Txtbx_Pwd(Constant.driver).sendKeys(Admin_Pwd);
  		
  		AdminLoginObjects.Txtbx_Signin(Constant.driver).click();
  		
  		ExcelUtils.setCellData("Login succesfull", 7, 3);		
       
   	}
       
       

}
  

