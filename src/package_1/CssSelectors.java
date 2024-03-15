package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12345678");
		//driver.findElement(By.cssSelector("input[placeholder^='Pass']")).sendKeys("12345678");
		//driver.findElement(By.cssSelector("input[placeholder$='word']")).sendKeys("12345678");
		//driver.findElement(By.cssSelector("input[placeholder*='sword']")).sendKeys("12345678");
	}
}