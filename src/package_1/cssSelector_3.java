package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector_3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps/@17.4784512,78.3056896,13z?entry=ttu");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[id='searchboxinput']")).sendKeys("paris");
		//driver.findElement(By.cssSelector("input[id^='search']")).sendKeys("dubai");
		//driver.findElement(By.cssSelector("input[id$='input']")).sendKeys("warangal");
		driver.findElement(By.cssSelector("input[id*='box']")).sendKeys("hyderabad");
	}

}
