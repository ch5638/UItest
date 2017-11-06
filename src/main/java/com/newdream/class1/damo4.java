package com.newdream.class1;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class damo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.baidu.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		driver.findElement(By.cssSelector("input#kw")).sendKeys("晏涛");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input#kw")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input#kw")).sendKeys("晏涛");
//		driver.findElement(By.cssSelector("form#form")).submit();
		
//		WebElement a = driver.findElement(By.cssSelector("input#kw"));
//		
//		a.sendKeys("大王叫我来巡山");
//		int height = a.getSize().height;
//		int width  = a.getSize().width;
//		Thread.sleep(1000);
		
//		WebElement b = driver.findElement(By.cssSelector("#u1 > a:nth-child(4)"));
//		String text = b.getText();
//		System.out.println("内容为"+text);
		
//		String name = b.getAttribute("name");
//		String classname = b.getAttribute("class");
//		String url = b.getAttribute("url");
//		System.out.println("name:"+name+"class:"+classname+"url:"+url);
		
//		Set<Cookie> cookies = driver.manage().getCookies();
//		System.out.println(cookies);		
//		System.out.println("cookie总数为"+cookies.size());        
//        for(Cookie cookie:cookies)
//            System.out.println("作用域："+cookie.getDomain()+", 名称："+cookie.getName()+
//                ", 值："+cookie.getValue()+", 范围："+cookie.getPath()+
//                 ", 过期时间"+cookie.getExpiry());
//
//		
//		//增加coolis
//		Cookie cookie2 = new Cookie("loginName", "liuguang");  
//		driver.manage().addCookie(cookie2);
//		
//		Cookie cookie=driver.manage().getCookieNamed("loginName");
//		System.out.println(cookie);
		
		//鼠标事件
//		WebElement c = driver.findElement(By.id("su"));
//		Actions actions = new Actions(driver);
		//右击
//		actions.contextClick(c).perform();
//		Thread.sleep(1000);
//		actions.release(c).perform();
//		Thread.sleep(1000);
//		actions.doubleClick(c).perform();
		
//		WebElement d = driver.findElement(By.cssSelector("#u1 > a.pf"));
//		
//		actions.moveToElement(d).perform();
//		driver.findElement(By.linkText("高级搜索")).click();
		
		
		//键盘
//		Actions actions = new Actions(driver);
//		driver.findElement(By.cssSelector("#kw")).click();
//		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//		Thread.sleep(3000);
		//关不了
	//	actions.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.ALT).perform();
	//	actions.sendKeys(Keys.NULL).perform();
		
		//验证并打印
//		driver.findElement(By.cssSelector("#kw")).sendKeys("新梦想软件测试");
//		Thread.sleep(2000);
//		String title = driver.getTitle();
//		if(title.compareTo("新梦想软件测试_百度搜索")==0){
//			System.out.println("成功");
//		}else {
//			System.out.println("失败");
//			return;
		//定位一组元素
		
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(driver.findElement(By.cssSelector("#u1 > a.pf"))).perform();
//		driver.findElement(By.linkText("高级搜索")).click();
//		Thread.sleep(1000);
//		
//		List<WebElement> els = driver.findElements(By.className("c-input"));
//		//方法1
//		els.get(2).sendKeys("新梦想");
//		//方法2
//		
////		for(WebElement el:els){
////			el.sendKeys("新梦想测试");
////			Thread.sleep(1000);
////		}
//		
//		List<WebElement> els1 = driver.findElements(By.name("q5"));
//		for(WebElement el:els1){
//			el.click();
//			Thread.sleep(1000);
//		}
		
//		//层级定位
//		driver.findElement(By.cssSelector("#u1 > a.lb")).click();
//		
//		driver.findElement(By.id("TANGRAM__PSP_10__userNameWrapper")).findElement(By.name("userName")).sendKeys("18435116425");
//		driver.findElement(By.id("TANGRAM__PSP_10__passwordWrapper")).findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("ch563868");
//		driver.findElement(By.cssSelector("#TANGRAM__PSP_10__submit")).click();
		
		
	}
	}


