package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_findElements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(5000);
		int count = checkbox.size();
		for(int z=0;z<count;z++)
		{
			checkbox.get(z);
		}
		for(WebElement we :checkbox)
		{
			we.click();
		}
}
}

