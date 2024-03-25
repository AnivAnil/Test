 package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data extends BaeMethod {
	public static void main(String[] args) throws InterruptedException, IOException {
		browserlauch("Chrome");
		url("https://adactinhotelapp.com/");
		Logipage l = new Logipage();
		sendkeys(l.user(), "Anil6536");
		
		sendkeys(l.pass(), "Anil6536");
		click(l.login());
		sendkeys(l.location(), "New York");
		sendkeys(l.hotels(), "Hotel Sunshine");
		sendkeys(l.room(), "Two");
		sendkeys(l.room1(), "1");
		sendkeys(l.room2(), "0");
		sendkeys(l.date(), "25/10/2022");
		sendkeys(l.date2(), "27/10/2022");
		click(l.Submit());
		click(l.radiobutton());
		click(l.continu());
		sendkeys(l.firstname(), "Anil");
		sendkeys(l.lastname(), "Aniv");
		sendkeys(l.address(), "no8 bcnager");
		sendkeys(l.ccnum(), "4569871236547896");
		sendkeys(l.cctype(), "American Express");
		sendkeys(l.ccexpmonth(), "November");
		sendkeys(l.ccexpyear(), "2020");
		sendkeys(l.cccvv(), "653");
		click(l.booknow());
		Thread.sleep(5000);
		String attribute = getAttribute(l.order());
       syso(attribute);
	}

	
	
	
	
	
}
