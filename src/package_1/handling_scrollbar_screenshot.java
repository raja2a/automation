package package_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_scrollbar_screenshot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.craftsvilla.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(By.xpath("//img[@src='https://cdn1.plotch.io/assets/images/1702618249_MS5wbmc=.png']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js1.executeScript("window.scrollBy(0,3000)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@src='https://cdnaz.plotch.io/image/upload/w_301,h_301/C/V/PLOm90D9aG1689006578_e4ee3435247ba439afac1a34e8f89db98fa04abbdd8fd6519b94068fbea2cb28.jpg?product_id=1108837323&s=1']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./RAJA/greentea.png");
		FileUtils.copyFile(src, dest);

		
		
		
}
}