package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Iframe 
{
	public static void main(String[]args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver =new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	Thread.sleep(2000);
	
	//switch to paraent frame 
	driver.switchTo().frame("frame1");
	
	//switch to child frame
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@id='a']")).click();
	Thread.sleep(2000);
	
	//switch to parent frame again from frame3
	driver.switchTo().parentFrame();
	driver.findElement(By.tagName("input")).sendKeys("Hello");
	Thread.sleep(2000);
	
	//switch to main window
	driver.switchTo().defaultContent();
	
	//switch to frame 2
	driver.switchTo().frame("frame2");
	
	WebElement dd=driver.findElement(By.id("animals"));
	Select dropdown=new Select(dd);
	dropdown.selectByVisibleText("Avatar");
	
	
	}
}
