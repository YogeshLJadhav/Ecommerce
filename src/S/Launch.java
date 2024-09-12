package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Automation\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
         ChromeOptions co=new ChromeOptions();
         co.addArguments("--remote-allow-origins=*");
         WebDriver driver=new ChromeDriver(co);
         driver.get("https://www.facebook.com/");
         System.out.println("page Title:"+driver.getTitle());
         
       driver.findElement(By.name("email")).sendKeys("Admin");
       driver.findElement(By.name("pass")).sendKeys("yogesh");
         
	}

}
