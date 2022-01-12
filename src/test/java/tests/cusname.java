
package tests;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

	import pages.depositclick;

	public class cusname {
	 
		
		@Test
		
		public void clickcuslogin( ) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SUREN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			depositclick cuslogin = new depositclick();
			driver.manage().window().maximize();
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
			cuslogin.clickcustomerlogin();
			
			String actualURL= driver.getCurrentUrl();

			 String expectedURL= "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
			 AssertJUnit.assertEquals(actualURL, expectedURL);
			
			
		}

	}



