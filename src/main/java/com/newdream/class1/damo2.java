package com.newdream.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class damo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.baidu.com");
		
//		driver.findElement(By.id("kw")).sendKeys("陈欢");
//		driver.findElement(By.name("wd")).sendKeys("陈欢");
//		driver.findElement(By.className("quickdelete")).sendKeys("陈欢");
//		driver.findElement(By.linkText("新闻")).click();
//		driver.findElement(By.partialLinkText("新")).click();
		
		//绝对路径
//		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[1]/div/form/span[1]/input")).click();
		//相对路径
//		driver.findElement(By.xpath("//div/form/span[1]/input")).sendKeys("陈欢");
		//通过元素索引
		//通过属性识别
		driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("陈欢");
		//部分属性值
		//匹配前
		
	}

}
