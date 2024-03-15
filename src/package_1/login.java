package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.google.co.in/");
	driver.findElement(By.id(null)).sendKeys("123");
		
	}

}



