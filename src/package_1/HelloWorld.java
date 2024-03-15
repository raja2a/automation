package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			// Enter the URL
			driver.get("https://www.facebook.com/");
			// driver.findElement(By.tagName("textarea")).click();
			driver.findElement(By.id("email")).sendKeys("raja_A1");
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys("12345678");
			
	}

}
