package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingScrollbar_amazon {
	//private static final ChromeDriver JavascriptExecutor = null;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://tinyurl.com/2cd7ab2z");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		WebElement search = driver.findElement(By.xpath("//img[@alt='OP 12R']"));
		Thread.sleep(2000);
		Point loc = search.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 Thread.sleep(3000);
		 
		 js.executeScript("scrollBy("+x+", "+y+")");
		 
		

}
}