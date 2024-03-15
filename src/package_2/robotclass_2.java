package package_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotclass_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_M);
			r.keyRelease(KeyEvent.VK_M);
			r.keyPress(KeyEvent.VK_O);
			r.keyRelease(KeyEvent.VK_O);
			r.keyPress(KeyEvent.VK_B);
			r.keyRelease(KeyEvent.VK_B);
			r.keyPress(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_I);
			r.keyPress(KeyEvent.VK_L);
			r.keyRelease(KeyEvent.VK_L);
			r.keyPress(KeyEvent.VK_E);
			r.keyRelease(KeyEvent.VK_E);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_5);
			r.keyRelease(KeyEvent.VK_5);
			r.keyPress(KeyEvent.VK_G);
			r.keyRelease(KeyEvent.VK_G);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);	

}
}