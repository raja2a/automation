package package_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_window {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			
			WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"));
			searchbox.sendKeys("software Testing");
			searchbox.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Senior Software Test Engineer']")).click();
			Thread.sleep(2000);
			Set<String> win =driver.getWindowHandles();
			Iterator<String> it =win.iterator();
			String win1 =it.next();
			String win2 =it.next();
			driver.switchTo().window(win2);
			Thread.sleep(2000);
			driver.findElement(By.id("login-apply-button")).click();
		
}
}