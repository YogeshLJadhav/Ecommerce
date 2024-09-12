package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
 WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
 search.sendKeys("iphone13");
 
 WebElement A=driver.findElement(By.xpath("//button[@type='submit']"));
 A.click();
 
 driver.get("https://www.flipkart.com/apple-iphone-13-midnight-128-gb/p/itmca361aab1c5b0?pid=MOBG6VF5Q82T3XRS&lid=LSTMOBG6VF5Q82T3XRSOXJLM9&marketplace=FLIPKART&q=iphone13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=8ba6bfb3-7977-4bad-87f4-f0e3e89a0ccf.MOBG6VF5Q82T3XRS.SEARCH&ppt=hp&ppn=homepage&ssid=ey2h609o000000001726034565557&qH=7d4afaedfc628b80");

	WebElement a=driver.findElement(By.xpath("//ul[@class='row']/child::li[1]/child::button[1]"));
	a.click();
	
	}

}
