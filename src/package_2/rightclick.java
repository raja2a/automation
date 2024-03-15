package package_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			WebElement Mobiles = driver.findElement(By.xpath("//span[text()='Mobiles']"));
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.contextClick(Mobiles).perform();
			
}
}