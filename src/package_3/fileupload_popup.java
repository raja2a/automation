package package_3;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://imagecompressor.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@aria-label='Upload files']")).sendKeys("\"C:\\Users\\sneha sri\\Pictures\\Screenshots\\content not aligned properly.png\"");		
		}
}