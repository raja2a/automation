package package_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		//driver.close();
}
}