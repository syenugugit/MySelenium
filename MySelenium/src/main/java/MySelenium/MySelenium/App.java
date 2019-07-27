package MySelenium.MySelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://login.yahoo.com//");
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	
    	      
        //1. Locator : By.id
        WebElement element = driver.findElement(By.id("login-username"));
        element.sendKeys("syenugu");
        //WebElement btn = driver.findElement(By.id("login-signin"));
        driver.findElement(By.id("createacc")).sendKeys(Keys.ENTER);
        
       /* if(btn.isEnabled())
        {
        System.out.println("Element is Present");
        //btn.click();
        btn.sendKeys(Keys.ENTER);
        Synstem.out.println(btn.getText());
        }else{
        System.out.println("Element is Absent");
        }*/ 
        
        //driver.naviga("https://login.yahoo.com//account//create?specId=yidReg");       
        WebElement uname = driver.findElement(By.id("usernamereg-firstName"));
        if (uname.isDisplayed())
        {
        	    System.out.println("Element is Present");
                uname.sendKeys("PrinceTanvi");
        }   
        else{
            System.out.println("Element is Absent");
            }
        
        WebElement lname = driver.findElement(By.id("usernamereg-lastName"));
        if (uname.isDisplayed())
        {
        	    System.out.println("Element is Present");
                lname.sendKeys("Kalepu");
        }   
        else{
            System.out.println("Element is Absent");
            } 
        
        WebElement email1 = driver.findElement(By.id("usernamereg-yid"));
        if (uname.isDisplayed())
        {
        	    System.out.println("Element is Present");
                email1.sendKeys("princetanvikalepu");
        }   
        else{
            System.out.println("Element is Absent");
            } 
        WebElement pwd = driver.findElement(By.id("usernamereg-password"));
        if (pwd.isDisplayed())
        {
        	    System.out.println("Element is Present");
                pwd.sendKeys("Canada123");
        }   
        else{
            System.out.println("Element is Absent");
            } 
        WebElement ph = driver.findElement(By.id("usernamereg-phone"));
        if (ph.isDisplayed())
        {
        	    System.out.println("Element is Present");
                ph.sendKeys("6478892969");
        }   
        else{
            System.out.println("Element is Absent");
            }
        Select drpBMnth = new Select(driver.findElement(By.id("usernamereg-month")));
        drpBMnth.selectByVisibleText("January");
        WebElement bDay = driver.findElement(By.id("usernamereg-day"));
        if (bDay.isDisplayed())
        {
        	    System.out.println("Element is Present");
                bDay.sendKeys("01");
        }   
        else{
            System.out.println("Element is Absent");
            }
        WebElement bYear = driver.findElement(By.id("usernamereg-year"));
        if (bYear.isDisplayed())
        {
        	    System.out.println("BYear Element is Present");
                bYear.sendKeys("2013");
        }   
        else{
            System.out.println("Element is Absent");
            }
        
        WebElement contButton = driver.findElement(By.id("reg-submit-button"));
        if (contButton.isDisplayed())
        {
        	    System.out.println("cBtn Element is Present");
        	    contButton.click();
        }   	
        else{
            System.out.println("Element is Absent");
            }
        
        WebElement sCode = driver.findElement(By.name("sendCode"));
        if (contButton.isDisplayed())
        {
        	    System.out.println("sCode Element is Present");
        	    sCode.sendKeys(Keys.ENTER);
        }   	
        else{
            System.out.println("Element is Absent");
            }
        
        
    System.out.println( "Hello World!" );
    System.out.println( driver.getTitle() );
    
    
}
}
                
                
        	   
