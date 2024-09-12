package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthI {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.bimastreet.com/");
		Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways product-type css-z4r21k'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='Son ']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='1st Adult DOB']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@data-timestamp='315513000000']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id=':rf:-grid-label']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@fdprocessedid='s5edau']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@role='combobox']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@role='option']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='Child 1 Date of birth (DOB)']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@role='gridcell']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id=':ro:-grid-label']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@aria-checked='true']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id=':r12:']")).sendKeys("1234567890");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=':r13:']")).sendKeys("110018");
Thread.sleep(2000);

	}

}
