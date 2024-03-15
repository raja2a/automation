package package_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
			driver.manage().window().maximize();

			WebElement elementtobedragged_1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
			WebElement elementtobedropped = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
			
			Actions act = new Actions(driver);	
			Thread.sleep(1000);
			act.doubleClick(elementtobedragged_1).perform();
			Thread.sleep(1000);
			act.dragAndDrop(elementtobedragged_1, elementtobedropped).perform();
			Thread.sleep(3000);
}
}