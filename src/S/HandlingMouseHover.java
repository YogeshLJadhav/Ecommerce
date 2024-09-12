package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		System.out.println("Page Title :"+driver.getTitle());
		
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Abc@123");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Forgetten password"))).perform();
		



	}

}
