package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown_2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
			 driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Virat");
			 Thread.sleep(3000);		
			 List<WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			
			System.out.println(auto.size());
			
			for(WebElement options :auto) {
				System.out.println(options.getText());
			}
		int s = auto.size();
			System.out.println(s);
		auto.get(4).click();
	 
		}
			
}
