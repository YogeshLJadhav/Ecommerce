package S;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeywords {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB);
		act.pause(Duration.ofSeconds(2));
		act.sendKeys(Keys.TAB);
		act.pause(Duration.ofSeconds(2));
		act.sendKeys(Keys.TAB);
		act.pause(Duration.ofSeconds(2));
		act.sendKeys(Keys.TAB);
		act.pause(Duration.ofSeconds(2));
		act.sendKeys(Keys.ENTER);
		act.build().perform();		
	}

}
