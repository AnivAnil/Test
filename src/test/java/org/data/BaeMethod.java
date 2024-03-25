package org.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaeMethod {
	public static WebDriver driver;
	public  static WebDriver browserlauch(String a) {
		if(a.equalsIgnoreCase(a)) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(a.equalsIgnoreCase(a)) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
			}
		
		public static void url(String b) {
		driver.get(b);
		driver.manage().window().maximize();
		
		}
		public static void sendkeys(WebElement e ,String a) {
		e.sendKeys(a);
		}
         public static void click(WebElement e) {
		e.click();

		}
         public static void select (WebElement e ,String a) {
        	 Select S=new Select(e);
        	 S.selectByVisibleText(a);
         }
         public static String gettext(WebElement e ) {
        	String text = e.getText();
			return text;
        	
			
		}
         
         public static String getAttribute(WebElement e) {
        	 String attribute = e.getAttribute("value");
			return attribute;
		}
	     public static void syso(String e) {
	    	 System.out.println(e);
	     }
	
	
	
	
	

}
