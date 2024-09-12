package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] arg) throws InterruptedException  {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	search.sendKeys("iphone13");
WebElement b=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
b.click();

driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?crid=2AUP36030TKQG&dib=eyJ2IjoiMSJ9.OCoJgZ8ghdguKvc7Ozmt3KlC0a5KB5Cw1Z8vR-gHUKYJrQ17HskNFXrgDJz7f6HLMw8SAwwH9DPYGy0xSckBZmZAzGdxd7xx4K0B5N323bgepF_7cKD4d_wX5gjt8MvKUhfnSv4n6IQ8LmeT0YPm0LqnVjRvJj-c32p5DRR-jpiDUfYgMcLGprRoQcsR-aM6B0PEkg4S_jWoJrwN13XOWtWEQuTF-W9e6qiEfbgTXjU.uOOfAJ3Ns9b3edcUAf4WNrfXbO1JcEKKMv-RNtiVBC8&dib_tag=se&keywords=iphone+13&qid=1726037636&sprefix=iphone13%2Caps%2C263&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

	
	WebElement addToCard=driver.findElement(By.xpath("//span[@id='exportsUndeliverable-cart-announce']"));
	addToCard.click();
	}

}
