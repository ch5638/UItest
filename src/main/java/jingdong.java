import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jingdong {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jingdong.com");
		
		driver.findElement(By.cssSelector("div a[class='link-login']")).click();
		driver.findElement(By.cssSelector("div a[clstag='pageclick|keycount|201607144|2']")).click();
		driver.findElement(By.cssSelector("#loginname")).sendKeys("ach563868");
		driver.findElement(By.cssSelector("#nloginpwd")).sendKeys("ch563868");
		driver.findElement(By.cssSelector("#loginsubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#key")).sendKeys("茶叶");
		driver.findElement(By.cssSelector("#search > div > div.form > button > i")).click();
		driver.findElement(By.cssSelector("#J_promGoodsWrap_291 > div.mc > ul > li:nth-child(1) > div.p-img > a > img.err-product")).click();
		
		
		String oldWin = driver.getWindowHandle();
        Set<String> newWin = driver.getWindowHandles();
        	for(String str : newWin )
        		{
        			if(!str.equals(oldWin))
        			{
        				driver.switchTo().window(str);
        			}
        		}
        	
		driver.findElement(By.cssSelector("#InitCartUrl")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#GotoShoppingCart")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#cart-floatbar > div > div > div > div.options-box > div.toolbar-right > div.normal > div > div.btn-area > a > b")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#order-submit > b")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#bank-icbc")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#modal_newCardWangyin > div > div.ui-modal-content > div.nm-tab-content.nm-tab-content-quick > div > div.nw-form-wrap.nw-form-quick.hide > div.ui-form > div:nth-child(2) > div > input")).sendKeys("6212260502011334387");
		driver.findElement(By.cssSelector("#modal_newCardWangyin > div > div.ui-modal-content > div.nm-tab-content.nm-tab-content-quick > div > div.nw-form-wrap.nw-form-quick.hide > div.ui-form > div:nth-child(4) > div > input")).sendKeys("陈欢");
		driver.findElement(By.cssSelector("#modal_newCardWangyin > div > div.ui-modal-content > div.nm-tab-content.nm-tab-content-quick > div > div.nw-form-wrap.nw-form-quick.hide > div.ui-form > div:nth-child(5) > span > div > input")).sendKeys("142632199610241213");
		driver.findElement(By.cssSelector("#modal_newCardWangyin > div > div.ui-modal-content > div.nm-tab-content.nm-tab-content-quick > div > div.nw-form-wrap.nw-form-quick.hide > div.ui-form > div:nth-child(6) > div > input")).sendKeys("18435116425");
	}
	
}
