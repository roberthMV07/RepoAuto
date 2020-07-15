package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	String driverPath="C:\\Users\\Roberth\\Desktop\\chrome\\chromedriver.exe";
	String url="http://testphp.vulnweb.com/login.php";
	WebDriver driver;
	
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
	public void test() {
		driver.get(url);
		String expectedTitle = "user info";		
		String actualTitle = "";
		
		
		WebElement txtUser = driver.findElement(By.name("uname"));
		WebElement txtPassword = driver.findElement(By.name("pass"));
		WebElement BtnLogin = driver.findElement(By.xpath("//input[@value='login']"));
		
		txtUser.sendKeys("test");
		txtPassword.sendKeys("test");
		BtnLogin.click();
		
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle, "salio mal");
		
	}
  public void f() {
  }
}
