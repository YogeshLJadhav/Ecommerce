package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CSSSelectorDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"," C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);
        
        Select dropdown =new Select(driver.findElement(By.cssSelector("select#carselect")));
        
        dropdown.selectByIndex(1);
        Thread.sleep(2000);
        
        dropdown.selectByValue("honda");
        Thread.sleep(2000);
        
        dropdown.selectByVisibleText("BMW");
        
        
	}

}

