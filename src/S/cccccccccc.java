package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cccccccccc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.bimastreet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='product-section']/child::ul[1]/child::li[2]/child::a[1]")).click();

	}

}
