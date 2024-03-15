package package_1;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_screenshots {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Katrina_Kaif");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sneha sri\\Pictures\\Saved Pictures\\screenshot.png");
		FileUtils.copyFile(src, dest);

}
}