package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Selectors.AmazonSelectors;

public class amazontest extends AmazonSelectors {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          
		  System.setProperty(drivertorun, driverPath);
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	      
	        
	        driver.get(Amazon);
	        
	        driver.findElement(By.xpath(SignXapth)).click();
	        WebElement get_emailorphone=driver.findElement(By.id("ap_email"));
	        get_emailorphone.sendKeys(number);
	        
	        driver.findElement(By.id("continue")).submit();
	        
	        
	        WebElement get_password=driver.findElement(By.id("ap_password"));
	        get_password.sendKeys(password);
	        
	        driver.findElement(By.id("signInSubmit")).submit();
	        
	      WebElement select_element=  driver.findElement(By.xpath(DropDown));
	      Select sel=new Select(select_element);
	      sel.selectByVisibleText(DropDown_value);
	      
	      
	      WebElement search_box=driver.findElement(By.xpath(Search_bar));
	      search_box.sendKeys(Search_bar_value);
	      search_box.sendKeys(Keys.ENTER);
	      
	      driver.findElement(By.linkText(LinkText)).click();
	      Thread.sleep(100);
	      
	      driver.findElement(By.xpath(addToCart)).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath(cart_details)).click();
	}

}
