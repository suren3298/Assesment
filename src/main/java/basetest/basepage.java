package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basepage {
WebDriver driver;

@BeforeMethod
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
}
@AfterMethod
public void tearDown() {
driver.close();
}
}