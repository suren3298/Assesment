package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.cuslogin;

public class clickurl {
	@Test
	public void customername()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUREN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		cuslogin cuslogin = new cuslogin(driver);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		cuslogin.name();
		cuslogin.login();
	}
	
}