package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
	
	String driverPath="C:\\Users\\Roberth\\Desktop\\chrome\\chromedriver.exe";
	String url="http://testphp.vulnweb.com/login.php";
	WebDriver driver;
	
	LoginPage objLogin;
	HomePage objHome;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
	
	@Test
	public void Login() {
		
		objLogin = new LoginPage(driver);
		objHome = new HomePage(driver);
		
		driver.get(url);
		objLogin.LoginIntothepage("test", "test");
		Assert.assertEquals("user info", objHome.GetTitle());
		
	}
}
