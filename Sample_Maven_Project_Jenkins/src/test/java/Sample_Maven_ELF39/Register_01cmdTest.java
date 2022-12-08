package Sample_Maven_ELF39;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.BasetestcmdTest;



public class Register_01cmdTest extends BasetestcmdTest
{
	
	
	@Test
	public void TC01() throws InterruptedException {
 
	WebElement nn= driver.findElement(By.cssSelector("a[href='/register']"));
	Utility_01cmd.Click_Element(nn);
	
	WebElement ns=driver.findElement(By.cssSelector("input[id='gender-female']"));
	Utility_01cmd.Click_Element(ns);
	
	WebElement nss=driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]"));
	Utility_01cmd.Enter_Value_InTestfield(nss, "nimitha");
	
	WebElement nsss=driver.findElement(By.id("LastName"));
	Utility_01cmd.Enter_Value_InTestfield(nsss, "h s");
	
	WebElement nssss=driver.findElement(By.cssSelector("input[id='Email']"));
	Utility_01cmd.Enter_Value_InTestfield(nssss, "niminimtha33@gmail.com");
	
	WebElement nim=	driver.findElement(By.id("Password"));
	Utility_01cmd.Enter_Value_InTestfield(nim, "nimitha@19");
	
	WebElement nis=driver.findElement(By.name("ConfirmPassword"));
	Utility_01cmd.Enter_Value_InTestfield(nis, "nimitha@19");
	
	WebElement niss=driver.findElement(By.id("register-button"));
	Utility_01cmd.Click_Element(niss);
	//	driver.close();
	
}
}
