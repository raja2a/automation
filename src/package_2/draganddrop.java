package package_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/droppable/");
			driver.manage().window().maximize();
			
			WebElement scroll=driver.findElement(By.xpath("//div[@id='simpleDropContainer']"));
	
			Point loc = scroll.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(3000);
			js.executeScript("scrollBy("+x+", "+y+")");
			
			
			WebElement elementtobedragged = driver.findElement(By.id("draggable"));
			WebElement elementtobedropped = driver.findElement(By.id("droppable"));
			
			Actions act = new Actions(driver);	
			act.dragAndDrop(elementtobedragged, elementtobedropped).perform();
			Thread.sleep(3000);
			//driver.close();
			
}	
}