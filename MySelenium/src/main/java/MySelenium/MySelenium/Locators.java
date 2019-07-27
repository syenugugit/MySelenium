package MySelenium.MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://login.yahoo.com//");
    	// 1. By.id("")
    	//driver.findElement(By.id("login-username")).sendKeys("syenugu");
    	//driver.findElement(By.id("createacc")).sendKeys(Keys.ENTER);

    	//2. By.name("")
    	//driver.findElement(By.name("username")).sendKeys("syenugu");
    	//driver.findElement(By.id("createacc")).sendKeys(Keys.ENTER);
    	
    	//3. By.xpath("")-inspect-go to element-right click-copy xpath
    	//driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("syenugu");
    	//driver.findElement(By.xpath("//*[@id=\"createacc\"]")).sendKeys(Keys.ENTER);
    	
    	//3. By.xpath("")-inspect-go to element-right click-copy xpath, give html tag in
    	//place of star and Single quote for value in place of double quotes
    	 // driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("syenugu");
    	 // driver.findElement(By.xpath("//a[@id='createacc']")).sendKeys(Keys.ENTER);
    	  
//    	  4. By.cssSelector("")--inspect-go to element-right click-copy Selector
//    	  driver.findElement(By.cssSelector("#login-username")).sendKeys("syenugu");
//    	  driver.findElement(By.cssSelector("#createacc")).sendKeys(Keys.ENTER);
  	  
    	  //5. By.linkText("") - this is only method for links-should use for all elements start with "a" tag
    	
    	  //driver.findElement(By.linkText("Trouble signing in?")).sendKeys(Keys.ENTER);
    	
    	// 6. By.partialLinkText("")
    	  // driver.findElement(By.partialLinkText("Trouble")).sendKeys(Keys.ENTER);
    	
    	  //7. By.className("") - class name is not unique
    	 //river.findElement(By.className("orko-button-primary orko-button")).sendKeys(Keys.ENTER);
    	  
    	  
    	  
	}

}
