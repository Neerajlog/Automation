package seleniumscripts;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selectors.Makemytripselctor;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class makemytrip extends Makemytripselctor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  
		  System.setProperty(drivertorun, driverPath);
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get(MakeMyTrip);
	        
	       WebElement radio1= driver.findElement(By.xpath(RoundTrip));
	       radio1.click();

	      Thread.sleep(3000);
	       driver.findElement(By.xpath(Frominputselector)).click();
	       Thread.sleep(3000);
	     
	       driver.findElement(By.xpath(Fromvalueselctor)).sendKeys(city);
	       
	    List<WebElement>dynamicList=driver.findElements(By.cssSelector(citySelector));
	     for(int i=0;i<dynamicList.size();i++) {
	    	 String text=dynamicList.get(i).getText();
	    	
	    	 if(text.contains(city)) {
	    	 dynamicList.get(i).click();
	    		 break;
	    	 }
	     }
	      
	    		   
	   
	       driver.findElement(By.xpath(search1)).click();
	       
	       driver.findElement(By.xpath("//input[@id=\"departure\"]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath(departureDateselector)).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@id=\"return\"]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath(returndateselector)).click();
	       driver.findElement(By.xpath(search2)).click();
	       
	       
	      
	      
	       
	       
	}

}
