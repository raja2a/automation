package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_01 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("warangal");
		//driver.findElement(By.xpath("//input[@value='warangal']")).click();
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']")).click();
		
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		

	}
}
