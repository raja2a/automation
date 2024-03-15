package package_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.youtube.com/watch?v=6GxXehkPyBs");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
			Thread.sleep(5000);
			WebElement doubleclick = driver.findElement(By.xpath("//video[@tabindex='-1']"));
		
			Actions act = new Actions(driver);
			act.doubleClick(doubleclick).perform();
			Thread.sleep(2000);
			//driver.close();

}
}