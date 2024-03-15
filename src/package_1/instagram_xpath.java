package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_xpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
	}
	

}
