package package_1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.io.File;
import java.io.File;
public class handling_window_scrollbar_screenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
	//scroll bar
			JavascriptExecutor js= (JavascriptExecutor)driver;
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,5000)");
			
			Thread.sleep(3000);
	//window handling
			driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/9/i/h/-original-imagt4tdvvhyag9j.jpeg?q=70']")).click();
			Thread.sleep(2000);
			Set<String> win =driver.getWindowHandles();
			Iterator<String> it =win.iterator();
			String win1 =it.next();
			String win2 =it.next();
			driver.switchTo().window(win2);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	//screen short
			driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
			Thread.sleep(2000);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\sneha sri\\Pictures\\Saved Pictures\\screenshot.png");
			FileUtils.copyFile(src, dest);
			Thread.sleep(1000);
			driver.close();
		}
}