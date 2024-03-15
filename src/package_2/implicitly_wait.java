package package_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitly_wait {
	static {
		//execute driver executable
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws InterruptedException, IOException {
		//open the browser	
				ChromeDriver driver = new ChromeDriver();
		//Enter the URL
				driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		//maximize the screen
				driver.manage().window().maximize();
		//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.id("populate-text")).click();
				driver.findElement(By.id("display-other-button")).click();
				driver.findElement(By.id("enable-button")).click();
				driver.findElement(By.id("checkbox")).click();			

}
}