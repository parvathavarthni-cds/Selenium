package com.pom_without_pagefactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom_ticket {
	static WebDriver driver;
    static WebDriverWait  wait;

    public pom_ticket(WebDriver driver)
	{
		this.driver=driver;
	}
	static By profile_icon=By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li/a");
	static By advisor_menu=By.xpath("/html/body/div[2]/header/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]/a");
	static By portfolio=By.xpath("//*[@id=\"horizontal-menu\"]/ul/li[1]/a");
	static By search=By.xpath("//*[@id=\"m_tabs_1_1\"]/div/input");
	public void switch_advisor() throws InterruptedException
	{
	wait= new WebDriverWait(driver, 60); 
	wait.until(ExpectedConditions.elementToBeClickable(profile_icon));

	driver.findElement(profile_icon).click();
    driver.findElement(advisor_menu).click();
    driver.findElement(portfolio).click();
    
    try
	{
		File src=new File("/home/parvathavarthini/Desktop/hive.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sh2= wb.getSheet("pv");
	    driver.findElement(search).sendKeys(sh2.getRow(2).getCell(0).getStringCellValue());
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr/td[1]/span")).click();
	}
    catch (Exception e) {

		   System.out.println(e.getMessage());
		  }
   
		  
      }
	
}
