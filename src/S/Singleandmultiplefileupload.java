package S;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Singleandmultiplefileupload {

	public static void main(String[] args) {

System.setProperty("webdriver.chroma.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.manage().window().maximize(); 

	}

}
