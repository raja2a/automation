package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("raja@gmail.com");
		//	Thread.sleep(1000);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
			System.out.println(driver.getTitle());
			driver.switchTo().activeElement();
			driver.close();
			//driver.quit();
			
		}
}
