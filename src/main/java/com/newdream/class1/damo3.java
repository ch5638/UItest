package com.newdream.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class damo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.baidu.com");
	//	driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[3]/a[3]")).click();
		driver.findElement(By.cssSelector("input#kw")).click();
	}

}
