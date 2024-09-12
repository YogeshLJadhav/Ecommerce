package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		
		WebElement BmwRadio=driver.findElement(By.xpath("//input[@id='bmwradio']"));
		BmwRadio.click();
		System.out.println("Bmw radio button is selected?"+BmwRadio.isSelected());
		Thread.sleep(2000);
		
		WebElement HondaRadio=driver.findElement(By.xpath("//input[@id='hondaradio']"));
		BmwRadio.click();
		System.out.println("Honda radio button is selected?"+HondaRadio.isSelected());
		Thread.sleep(2000);
		
		WebElement BenzCheckbox=driver.findElement(By.xpath("//input[@id='benzcheckbox']"));
		BmwRadio.click();
		System.out.println("BenzCheckbox radio button is selected?"+BenzCheckbox.isSelected());
		Thread.sleep(2000);
		
		WebElement HondaCheckbox=driver.findElement(By.xpath("//input[@id='hondacheckbox']"));
		BmwRadio.click();
		System.out.println("HondaCheckbox radio button is selected?"+HondaCheckbox.isSelected());
		Thread.sleep(2000);
		
		WebElement BmwCheckbox=driver.findElement(By.xpath("input[@id='bmwcheck']"));
		BmwCheckbox.click();
		
		
	}

}
