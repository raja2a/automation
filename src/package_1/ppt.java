package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ppt {
	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException
		{
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://in.bookmyshow.com/");
			//driver.navigate.to("https://in.bookmyshow.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[@class='bwc__sc-ttnkwg-16 dizuyr']")).click();
			driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9876543210");
			
			//			driver.close();
			//			driver.quit();			
}
		
}
