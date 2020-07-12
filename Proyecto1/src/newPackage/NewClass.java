package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roberth\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/V4/";		
		String expectedTitle = "Guru99 Bank Home Page";		
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();	
		
		Assert.assertEquals(actualTitle,expectedTitle, "salio mal");
		driver.quit();
	}

}
