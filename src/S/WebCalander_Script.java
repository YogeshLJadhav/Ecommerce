package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebCalander_Script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.get("https://jqueryui.com/datepicker/");
		 driver.switchTo().frame(0);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='datepicker')")).click();
		 
		 //Expected date
		 String expectedDay="30";
		 String expectedMonth="octomber";
		 String expectedYear="2025";
		 
		 while(true)
		 {
			 String calanderMonth =driver.findElement(By.xpath("//span[@class='ui-datepickert-month']")).getText();
			 String calanderYear =driver.findElement(By.xpath("//span[@class='ui-datepickert-month']")).getText();
			 System.out.println("Month "+calanderMonth+ " year "+calanderYear);
			 
			 if(calanderMonth.equals(expectedMonth) && calanderYear.equals(expectedYear))
				 //if(calanderMonth.equal("octomber" && calanderYear.equal("2015"));
			 {
				 driver.findElement(By.xpath("//a[@date-date='30']")).click();
				 break;
			 }
			 else
			 {
				 driver.findElement(By.xpath("//span[@class='ui-icon-circle-triangle-e']")).click();
			 }
			 
		 
		 }

	}

}
