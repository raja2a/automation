package package_3;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class filedownload_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.pexels.com/search/free%20wallpaper/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebElement flower = driver.findElement(By.xpath("//img[@src='https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(flower).perform();
	
			driver.findElement(By.xpath("//span[@class='DownloadButton_downloadButtonText__qVWuI']")).click();
		}
}