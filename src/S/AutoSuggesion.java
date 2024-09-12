package S;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggesion {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> SearchList=driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		System.out.println(SearchList.size());
		for(WebElement SearchName:SearchList)
		{
			String SearchValue=SearchName.getText();
			System.out.println("SearchValue");
		}

	}

}
