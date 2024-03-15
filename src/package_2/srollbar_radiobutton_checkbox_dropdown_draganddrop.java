package package_2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class srollbar_radiobutton_checkbox_dropdown_draganddrop {
	static {
	//execute driver executable
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
	//open the browser	
			ChromeDriver driver = new ChromeDriver();
	//Enter the URL
			driver.get("https://artoftesting.com/samplesiteforselenium");
	//maximize the screen
			driver.manage().window().maximize();
			
	//sending keys and clicking submit button
			driver.findElement(By.id("fname")).sendKeys("RAJA");
			driver.findElement(By.id("idOfButton")).click();
			Thread.sleep(1000);
			
	//clicking on radio button
			driver.findElement(By.id("male")).click();
			Thread.sleep(1000);
			
	//scrolling down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)");
			
	//drop down clicking
			List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
			int count = checkbox.size();
			for(int z=0;z<count;z++)
			{
				checkbox.get(z);
			}
			for(WebElement we :checkbox)
			{
				we.click();
			}
			WebElement dropdown = driver.findElement(By.id("testingDropdown"));
			Select sel = new Select(dropdown);
			sel.selectByIndex(2);
			Thread.sleep(1000);
			
			js.executeScript("window.scrollBy(0,400)");
			
	//dragging and dropping 
			WebElement dragged = driver.findElement(By.id("myImage"));
			WebElement dropped = driver.findElement(By.id("targetDiv"));
			
			Actions act = new Actions(driver);	
			act.dragAndDrop(dragged, dropped).perform();
			Thread.sleep(5000);
			
	//closing the application
			driver.close();				
		}
}