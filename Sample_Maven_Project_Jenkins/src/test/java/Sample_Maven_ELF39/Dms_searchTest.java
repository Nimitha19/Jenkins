package Sample_Maven_ELF39;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dms_searchTest {
	@Test
	
	public void TC01() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("short");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
