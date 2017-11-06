package com.newdream.class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class damo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
		driver.get("F:/note/12.selenium/selenium/select.html");
	//	driver.get("http://www.baidu.com");
		
		WebElement select = driver.findElement(By.cssSelector("#status"));
		
		Select select1 =new Select(select);
		//1
		select1.selectByIndex(3);
		Thread.sleep(4000);
		
		//2
		select1.selectByVisibleText("审核不通过");
		Thread.sleep(4000);
		
		//3
		select1.selectByValue("1");
	}

}
