package package_1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingScrollbar {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.neogensofttech.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//Scroll down
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);
		
		//Scroll up
		js.executeScript("window.scrollBy(0,-1000)");

}
}