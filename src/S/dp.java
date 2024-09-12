package S;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("yogeshjadhav44u@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.tagName("password ")).sendKeys("Jadhav@2251");
		Thread.sleep(2000);
		
	}

}
