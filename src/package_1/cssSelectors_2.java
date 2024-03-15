package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors_2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("12345678");
		//driver.findElement(By.cssSelector("input[class^='_2IX']")).sendKeys("12345678");
		//driver.findElement(By.cssSelector("input[class$='DxU']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[class*='2-']")).sendKeys("12345678");
	
	}
	
}

