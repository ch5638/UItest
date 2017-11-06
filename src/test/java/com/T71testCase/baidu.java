package com.T71testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baidu {
  WebDriver driver = null;
  
  @BeforeMethod
	public void setup(){
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.baidu.com");
  }
	
  @Test
  public void test1() {
	  driver.findElement(By.cssSelector("#kw")).sendKeys("新梦想教育");
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "新梦想教育_百度搜索");
	  
  }

@Test
public void test2() {
	  driver.findElement(By.cssSelector("#kw")).sendKeys("孙猴子");
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "孙猴子_百度搜索");
	  
}


@Test
public void test3() {
	  driver.findElement(By.cssSelector("#kw")).sendKeys("葫芦娃");
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "葫芦娃_百度搜索");
	  
}
@AfterMethod
public void end() {	  
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.quit();
}
}
