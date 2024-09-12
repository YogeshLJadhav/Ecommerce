package S;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots_Script {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","\"D:\\Users\\Automation\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://www.mycarhelpline.com/");
		TakesScreenshot ss=(TakesScreenshot)driver;
		 
		 WebElement m=driver.findElement(By.xpath("//div[@id='header=top=container=right']"));
		 File s=ss.getScreenshotAs(OutputType.FILE);
		 File location=new File("D://Header.jpeg");//fullpage
		 FileHandler.copy(s, location);
		
	}

}
