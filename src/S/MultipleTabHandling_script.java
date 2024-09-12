package S;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleTabHandling_script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.myntra.com/floorlamp");
		 String MainPageTitle=driver.getTitle();
		 System.out.println("Main Page Title ="+MainPageTitle);
		 
		 driver.findElement(By.xpath("//img[@title='SANDED EDGE & Off White & Black Wooden Floor Lamp With Shade']")).click();
          
		 String SecondPageTitle=driver.getTitle();
		 System.out.println("Second Page Title ="+SecondPageTitle);
		 
		 Set<String> handle=driver.getWindowHandles();
		 Iterator<String> itr=handle.iterator();
		 
		 String parentwindow=itr.next();
		 String childwindow=itr.next();
		 
		 driver.switchTo().window(childwindow);
		 String SecondTitle=driver.getTitle();
		 System.out.println("Child Window ="+SecondTitle);
		 
		 driver.switchTo().window(parentwindow);
		 String FirstTitle=driver.getTitle();
		 System.out.println("Parent Window ="+FirstTitle);
		 
		 
		 
	}

}
