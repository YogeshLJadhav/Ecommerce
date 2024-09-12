package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heat {
	public static void main(String[] args) {
        // Set up WebDriver (assumes ChromeDriver is in your PATH)
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Domain to test (change this value to switch domains)
        String domain = "https://dev.bimastreet.com";
        
        // Test Scenario 1
        fillForm(driver, domain, "One", "Son", "1", "0", "01/01/1980", "Male", "01/01/2010", "Male", "1234567890", "110018");
        validateQuotation(driver);

        // Test Scenario 2
        fillForm(driver, domain, "Two", "Daughter", "0", "1", "02/02/1990", "Female", "03/03/1985", "Male", "01/01/2015", "Female", "0987654321", "110018");
        validateQuotation(driver);

        // Close the driver
        driver.quit();
    }

    private static void fillForm(WebDriver driver, String domain, String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8, String string9,
			String string10, String string11, String string12) {
		// TODO Auto-generated method stub
		
	}

	public static void fillForm(WebDriver driver, String domain, String adults, String children, String numSons, String numDaughters, 
                                String dobAdult1, String genderAdult1, String dobChild1, String genderChild1, String mobileNumber, String pinCode) {
        // Open the domain page
        driver.get(domain);

        // Select number of adults
        if (adults.equals("One")) {
           // driver.findElement(By.id("adultsOne")).click(); // Replace with actual element locators
        	driver.findElement(By.id("adultsOne"));
        } else {
            driver.findElement(By.id("adultsTwo")).click();
        }

        // Select include children option
        if (children.equals("Son")) {
            driver.findElement(By.id("includeSon")).click(); // Replace with actual element locators
        } else if (children.equals("Daughter")) {
            driver.findElement(By.id("includeDaughter")).click();
        } else if (children.equals("Both")) {
            driver.findElement(By.id("includeBoth")).click();
        } else {
            driver.findElement(By.id("includeNone")).click();
        }

        // Enter number of sons and daughters
        driver.findElement(By.id("numSons")).sendKeys(numSons); // Replace with actual element locators
        driver.findElement(By.id("numDaughters")).sendKeys(numDaughters);

        // Enter date of birth and gender for adult 1
        driver.findElement(By.id("dobAdult1")).sendKeys(dobAdult1); // Replace with actual element locators
        if (genderAdult1.equals("Male")) {
            driver.findElement(By.id("genderMaleAdult1")).click();
        } else {
            driver.findElement(By.id("genderFemaleAdult1")).click();
        }

        // Enter date of birth and gender for child
        driver.findElement(By.id("dobChild1")).sendKeys(dobChild1); // Replace with actual element locators
        if (genderChild1.equals("Male")) {
            driver.findElement(By.id("genderMaleChild1")).click();
        } else {
            driver.findElement(By.id("genderFemaleChild1")).click();
        }

        // Enter mobile number and pin code
        driver.findElement(By.id("mobileNumber")).sendKeys(mobileNumber); // Replace with actual element locators
        driver.findElement(By.id("pinCode")).sendKeys(pinCode);

        // Submit the form
        driver.findElement(By.id("submitButton")).click(); // Replace with actual element locators
    }

    public static void validateQuotation(WebDriver driver) {
        // Assuming the quotations are displayed in an element with ID 'quotationResult'
        WebElement quotationElement = driver.findElement(By.id("quotationResult")); // Replace with actual element locator
        if (quotationElement.isDisplayed()) {
            System.out.println("Quotation received successfully.");
        } else {
            System.out.println("Quotation not received.");
        }
    }
}


