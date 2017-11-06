package T71kuangjia1;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import T71kuangjia2.logDemo;

public class Baiducase {
	private static Logger logger = LogManager.getLogger(Baiducase.class.getName());
	public  static WebDriver openWeb(WebDriver dr,String url){
		dr = new ChromeDriver();
		logger.info("info信息");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.get(url);
		logger.info(url+"网站已打开");
		return dr;
	}
	public static void baidu(WebDriver dr,String str){
		dr.findElement(By.cssSelector("#kw")).sendKeys(str);
		dr.findElement(By.cssSelector("#su")).click();
	}
	public static void wait(int second){
		try {
			logger.info("等待"+second+"s");
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void quit(WebDriver dr){
		logger.info("关闭网站");
		dr.close();
	}
}
