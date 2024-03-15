package package_2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdowns_3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.calculator.net/date-calculator.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement today_Month_ID = driver.findElement(By.id("today_Month_ID"));
			WebElement today_Day_ID = driver.findElement(By.id("today_Day_ID"));
			WebElement ageat_Month_ID = driver.findElement(By.id("ageat_Month_ID"));
			WebElement ageat_Day_ID = driver.findElement(By.id("ageat_Day_ID"));
			
//Approach_2
			Select sel = new Select(today_Month_ID);
			List<WebElement> alloptions = sel.getOptions();
			for(WebElement option :alloptions)
			{
				if(option.getText().equals("Jan"))
				{
					option.click();
					break;
				}
			}
			
			Select sel_1 = new Select(today_Day_ID);
			List<WebElement> alloptions_1 = sel_1.getOptions();
			for(WebElement option :alloptions_1)
			{
				if(option.getText().equals("1"))
				{
					option.click();
					break;
				}
			}
			
			Select sel_2 = new Select(ageat_Month_ID);
			List<WebElement> alloptions_2 = sel_2.getOptions();
			for(WebElement option :alloptions_2)
			{
				if(option.getText().equals("Dec"))
				{
					option.click();
					break;
				}
			}
			
			Select sel_3 = new Select(ageat_Day_ID);
			List<WebElement> alloptions_3 = sel_3.getOptions();
			for(WebElement option :alloptions_3)
			{
				if(option.getText().equals("31"))
				{
					option.click();
					break;
				}
			}
						
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[@class='cbmark']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@value='Calculate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("c2year")).clear();
			driver.findElement(By.id("c2year")).sendKeys("2005");
		}

}
