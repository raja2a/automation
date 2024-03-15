package package_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdowns_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.calculator.net/date-calculator.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement today_Month_ID = driver.findElement(By.id("today_Month_ID"));
			WebElement today_Day_ID = driver.findElement(By.id("today_Day_ID"));
			WebElement ageat_Month_ID = driver.findElement(By.id("ageat_Month_ID"));
			WebElement ageat_Day_ID = driver.findElement(By.id("ageat_Day_ID"));
			
			WebElement today2_Month_ID = driver.findElement(By.id("today2_Month_ID"));
			WebElement today2_Day_ID = driver.findElement(By.id("today2_Day_ID"));
			WebElement bigtext = driver.findElement(By.id("c2op"));
//Approach_1
			Select sel = new Select(today_Month_ID);
			sel.selectByIndex(10);
			
			Select sel_1 = new Select(today_Day_ID);
			sel_1.selectByIndex(0);
			
			Select sel_3 = new Select(ageat_Month_ID);
			sel_3.selectByIndex(2);
			
			Select sel_4 = new Select(ageat_Day_ID);
			sel_4.selectByIndex(22);
			
			Select sel_5 = new Select(today2_Month_ID);
			sel_5.selectByIndex(3);
			
			Select sel_6 = new Select(today2_Day_ID);
			sel_6.selectByIndex(5);
			
			Select sel_2 = new Select(bigtext);
			sel_2.selectByIndex(1);
			
			driver.findElement(By.id("today2_Year_ID")).click();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_6);
			r.keyRelease(KeyEvent.VK_6);
			
			r.keyPress(KeyEvent.VK_7);
			r.keyRelease(KeyEvent.VK_7);
			
			r.keyPress(KeyEvent.VK_8);
			r.keyRelease(KeyEvent.VK_8);
			
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
			
			//driver.findElement(By.xpath("//span[@class='cbmark']")).click();
			//driver.findElement(By.xpath("//input[@value='Calculate']")).click();	
		}
}