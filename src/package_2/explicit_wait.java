package package_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {
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
		//explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until( ExpectedConditions.elementToBeClickable(driver.findElement(By.id("populate-text")))).click();
				wait.until( ExpectedConditions.elementToBeClickable(driver.findElement(By.id("display-other-button")))).click();
				wait.until( ExpectedConditions.elementToBeClickable(driver.findElement(By.id("enable-button")))).click();
				wait.until( ExpectedConditions.elementToBeClickable(driver.findElement(By.id("checkbox")))).click();		
			}
}

