package com.newdream.class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//方法2
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("F:/note/12.selenium/selenium/Wait.html");
		
		driver.findElement(By.cssSelector("#b")).click();
		
		//方法1
		WebElement el = driver.findElement(By.className("red_box"));
		
		//方法3
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement wl = wait.until(new ExpectedCondition<WebElement>() {

			public WebElement apply(WebDriver d) {
				// TODO Auto-generated method stub
				return d.findElement(By.className("red_box"));
			}
		});
		
		//JS高亮
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].style.border='5px solid yellow'", wl);

	}

}
