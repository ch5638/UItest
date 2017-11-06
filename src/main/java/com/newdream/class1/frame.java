package com.newdream.class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("F:/note/12.selenium/selenium/frame/frame.html");
		
		driver.switchTo().frame("top");
		driver.findElement(By.name("message")).sendKeys("新梦想");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("left");
		driver.findElement(By.name("message")).sendKeys("新梦想");
		
		driver.findElement(By.cssSelector("body > p:nth-child(2) > a")).click();
		driver.findElement(By.name("message")).sendKeys("新梦想");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		driver.findElement(By.name("message")).sendKeys("新梦想");

	}

}
