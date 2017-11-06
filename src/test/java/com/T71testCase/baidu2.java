package com.T71testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baidu2 {
	WebDriver driver = null;
	 @DataProvider(name = "test1")
		public static Object[][] primeNumbers(){
		return new Object[][] {{"新梦想软件测试","新梦想软件测试_百度搜索"},
			{"我想去新梦想","我想去新梦想_百度搜索"},
			{"新梦想最棒","新梦想最棒_百度搜索"}};
		}
	  	
	  @BeforeMethod		 
	  @Parameters("url")
	  public void setup(String url){
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(url);
	  }
	  @Test(dataProvider = "test1")	  
	  public void f1(String kw , String a) {
		  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
		  driver.findElement(By.cssSelector("#su")).click();
		  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  String title = driver.getTitle();
		  Assert.assertEquals(title, a);
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
