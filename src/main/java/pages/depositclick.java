package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;


public class depositclick {
	 WebDriver driver;
	 
	 WebElement ar= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button"));
	 
	 public void clickcustomerlogin()
	 {
	 ar.click();
		
	
	}
}

