package S;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[@id-'draggable']")));
		act.pause(Duration.ofSeconds(2));
		//act.moveToElement(By.xpath("//div[@id-'droppable']")));
		act.release();
		act.pause(Duration.ofSeconds(2));
		act.build().perform();
		
		

	}

}
