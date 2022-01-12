package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import basetest.basepage;

public class cuslogin  extends basepage {
	
	private WebDriver driver;
  By yourname = By.id("userSelect");
  By loginBtn = By.xpath("/html/body/div/div/div[2]/div/form/button");
    

 public cuslogin(WebDriver driver) {
	 super(driver);
  this.driver=driver;

 }
public void name() {
	Select name=new Select(driver.findElement(yourname));
	name.selectByValue("2");
}
public void login(){
	
	driver.findElement(loginBtn).click();
 //return new HomePage();
} 
}
	