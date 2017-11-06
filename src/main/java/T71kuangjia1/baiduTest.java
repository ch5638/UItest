package T71kuangjia1;

import static org.testng.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class baiduTest {
	WebDriver dr = null;
//	String url = "http://www.baidu.com";
	@BeforeMethod()
	@Parameters("url")
	public void init(String url){
		System.setProperty("org.uncommons.reportng.escape-output", "false");
	dr = Baiducase.openWeb(dr, url);
	
	Reporter.log("info消息：已成功打开网址");
	}
//    @Test
//  public void test1() throws InterruptedException {
//    	Baiducase.baidu(dr, "新梦想");
//		Baiducase.wait(3);
//		String actual = dr.getTitle();
//		Assert.assertEquals(actual, "新梦想_百度搜索");
//		
//   }
//    @Test
//    public void test2() throws InterruptedException{
//    	Baiducase.baidu(dr,"12306");
//    	Baiducase.wait(3);
//    	String actual = dr.getTitle();
//    	Assert.assertEquals(actual, "12306_百度搜索");
//    }
    @Test
    public void test3(){
    	String[] title = new String[]{"新梦想","新的一天","selenium"};
    	for(String str:title){
    		Baiducase.baidu(dr, str);
    		Baiducase.wait(3);
    		String ac = dr.getTitle();
    		Assert.assertEquals(ac, str+"_百度搜索");
    		Reporter.log("info消息：执行百度搜索业务");
    		Baiducase.wait(3);
        	dr.navigate().back();
    	}
    }
	@AfterMethod
	public void end(){
		Baiducase.wait(3);
		Baiducase.quit(dr);
	}
}
