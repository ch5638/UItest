import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phpwind {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.138/phpwind/");
		
		driver.findElement(By.cssSelector("#J_username")).sendKeys("我是小王");
		driver.findElement(By.cssSelector("#J_password")).sendKeys("123456");
		driver.findElement(By.cssSelector("#J_sidebar_login")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#J_head_forum_post > span > span")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#J_forum_list > li")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#J_forum_ul > li")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#J_head_forum_sub")).click();
		driver.findElement(By.cssSelector("#J_atc_title")).sendKeys("大王叫我来巡山");
	//	driver.findElement(By.cssSelector("#mainForm > div > nav > nav > div > div.cc.mb10 > div.cm > div > div > div.wind_editor_toolbar > ul > li.plugin_icons > div:nth-child(1) > span")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.cssSelector("body > div.edit_menu > div > div.edit_menu_cont.cc > ul > li:nth-child(1) > a > img")).click();
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("body")).sendKeys("你是大王吗");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#J_post_sub")).click();

	}

}
