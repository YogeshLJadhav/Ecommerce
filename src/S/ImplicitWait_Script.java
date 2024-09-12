package S;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait_Script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 
		 driver.get("https://www.rediff.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 System.out.println("Time Start :"+new Date());
		 driver.findElement(By.xpath("//a[text()='Rediffmail']")).click();
		// driver.findElement(By.linkText("Rediffmail")).click();
		 System.out.println("End Time :"+new Date());
		 
		 
		 


	}

}
