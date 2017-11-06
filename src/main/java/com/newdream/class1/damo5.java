package com.newdream.class1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class damo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		driver.get("http://www.baidu.com");
		driver.findElement(By.cssSelector("#u1 > a.lb")).click();
		driver.findElement(By.linkText("立即注册")).click();
		
//		String defaultWindows = driver.getWindowHandle();
//		System.out.println(defaultWindows);
		
		Set<String> currorsWindows = driver.getWindowHandles();
//		System.out.println(currorsWindows.toString());
		
		driver.switchTo().window((String)currorsWindows.toArray()[1]);
//		for(String window : currorsWindows){
//			if(!window.equals(defaultWindows)){
//				driver.switchTo().window(window);
//			}
//		}
		driver.findElement(By.cssSelector("#TANGRAM__PSP_3__userName")).sendKeys("qwertyuiop");
		driver.findElement(By.cssSelector("#TANGRAM__PSP_3__phone")).sendKeys("17635426452");
		
//		Actions actions = new Actions(driver);
//		
//		actions.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).perform();
//		driver.switchTo().window(defaultWindows);
//		driver.findElement(By.cssSelector("#TANGRAM__PSP_10__userName")).sendKeys("12345678");
		
		
		//driver.quit();
	}

}
