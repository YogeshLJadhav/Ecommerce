package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domain {

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
	}

}
