package seleniumscripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selectors.BajajSelector;

public class bajajTest extends BajajSelector{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		

        System.setProperty(drivertorun, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       
        //visit google
        driver.get(visit_google);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       
         WebElement path= driver.findElement(By.xpath(google_Xapth));
         path.sendKeys("Bajaj finserve health");
         path.sendKeys(Keys.ENTER);
         
  driver.findElement(By.xpath(bajaj_link)).click();
  
  
  WebElement search=driver.findElement(By.xpath(search_bar));
  search.sendKeys(value);
  search.sendKeys(Keys.ENTER);
  
  
 Thread.sleep(3000);
  driver.findElement(By.cssSelector(First_result)).click();
   
  //click slot and move check page
  Thread.sleep(3000);
  driver.findElement(By.cssSelector(select_slot)).click();

  
  
  
           
       
	}

}
