package package_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovering {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();

			WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(electronics).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Laptop and Desktop']")).click();
			driver.close();
		}
}
