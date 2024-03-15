package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("earphones");
			Thread.sleep(1000);		
			List<WebElement> auto = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']/li"));
			System.out.println(auto.size());
				 for(WebElement options :auto) {
						System.out.println(options.getText());
					}
			int s = auto.size();
				System.out.println(s);
				auto.get(4).click();
				
				}
}

