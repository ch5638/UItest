package com.newdream.class1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class damo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk1.8.0_121\\bin\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.baidu.com");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("tj_trhao123")).click();
		Thread.sleep(3000);
		
		//后退
		driver.navigate().back();
		Thread.sleep(3000);
		//前进
		driver.navigate().forward();
		Thread.sleep(3000);
		
//		driver.navigate().back();
//		driver.findElement(By.name("tj_login")).click();
		//刷新
		driver.navigate().refresh();
		//截图
		File screenShotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
		//获取URL
		String URL = driver.getCurrentUrl();
		System.out.println("当前URL为："+URL);
		//获取标题
		String biaoti = driver.getTitle();
		System.out.println("当前标题："+biaoti);
		//退出
		driver.quit();
		
	}

}
