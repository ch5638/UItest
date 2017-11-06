package com.newdream.class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class damo8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.get("http://www.baidu.com");
		driver.findElement(By.cssSelector("#kw")).sendKeys("新梦想软件测试");
		driver.findElement(By.cssSelector("#su")).click();
		
		WebElement el = driver.findElement(By.linkText("零基础学软件测试"));
		
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", el);
		
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].style.border='5px solid yellow'", el);
		

	}

}
