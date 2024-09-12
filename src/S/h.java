package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class h {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://devmo.evervent.in/");

Thread.sleep(2000);

driver.manage().window().maximize();
driver.findElement(By.xpath("//div[@class='ip_box healthinsurance MuiBox-root css-0']")).click();

driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3']")).click();	
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='Two Adults']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='Son ']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='Daughter ']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root Mui-selected MuiPickersDay-dayWithMargin css-a78wou']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-alignCenter MuiDatePickerToolbar-title css-k3zp98']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-alignCenter MuiDatePickerToolbar-title css-k3zp98']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(2000);
	
	}
	
	

}

