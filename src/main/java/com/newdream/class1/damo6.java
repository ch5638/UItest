package com.newdream.class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class damo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
		driver.get("F:/note/12.selenium/selenium/alert.html");
		
		driver.findElement(By.cssSelector("#alert")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(1000);
		String text = alert.getText();
		System.out.println(text);
		//接受
		alert.accept();
		
		//confirm
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		//取消
		alert.dismiss();
		
		//prompt
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		alert.sendKeys("12345567");
		System.out.println(alert.getText());
		
		

	}

}
