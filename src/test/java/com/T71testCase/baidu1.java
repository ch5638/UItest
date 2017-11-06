package com.T71testCase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class baidu1 {
	WebDriver driver = null;
  @BeforeMethod	
  @Parameters("url")
  public void setup(String url){
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(url);
  }
  @Test
  @Parameters("f1")
  public void f1(String f1) {
	  driver.findElement(By.cssSelector("#kw")).sendKeys(f1);
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  String title = driver.getTitle();
	  Assert.assertEquals(title, f1+"_百度搜索");
  }
  
  @Test
  @Parameters("f2")
  public void f2(String f2) {
	  driver.findElement(By.cssSelector("#kw")).sendKeys(f2);
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  String title = driver.getTitle();
	  Assert.assertEquals(title, f2+"_百度搜索");
  }
  
  @Test
  @Parameters("f3")
  public void f3(String f3) {
	  driver.findElement(By.cssSelector("#kw")).sendKeys(f3);
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  String title = driver.getTitle();
	  Assert.assertEquals(title, f3+"_百度搜索");
  }
  
  
  @AfterMethod
  public void end(){
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  driver.quit();
  }
}
