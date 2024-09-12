package S;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Facebook- sign in or sign up";
		System.out.println("Expected Title ="+ExpectedTitle);

		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		Thread.sleep(2000);
		driver.close();

		}


	}


