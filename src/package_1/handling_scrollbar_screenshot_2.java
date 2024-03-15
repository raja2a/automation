package package_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_scrollbar_screenshot_2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/844/140/image/53af045d60230342.jpg?q=50']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/50/50/image/3addda3be87c0757.jpg?q=50']")).click();
		
		//Screenshot of Section or Portion of the Page
		WebElement mobile = driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/416/416/xif0q/mobile/9/z/9/a3-mzb0h0min-redmi-original-imagy2wssjzud2sn.jpeg?q=70&crop=false']"));
		File src = mobile.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sneha sri\\Pictures\\Saved Pictures.png");
		FileUtils.copyFile(src,dest);
		driver.close();
		
		
		
}
}