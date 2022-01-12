package project_xyz.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class bank 
{
	@Test
	public void clickcuslogin( ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUREN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.findElement(By.linkText("Customer Login")).click();
		
	}
}
