package S;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExlicitWait_Script {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rediff.com/");
		System.out.println("Start Time : "+new Date());
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Money']")));
		 element.click();
		 System.out.println("End Time :"+new Date());
		 }

}
