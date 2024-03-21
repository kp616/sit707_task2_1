package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement elemFirstName = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + elemFirstName);
		// Send first name
		elemFirstName.sendKeys("Kevin");
		
		WebElement elemLastName = driver.findElement((By.id("lastname")));
		System.out.println("Found element: " + elemLastName);
		// Send last name
		elemLastName.sendKeys("Phan");
		
		WebElement elemPhone = driver.findElement((By.id("phoneNumber")));
		System.out.println("Found element: " + elemPhone);
		// Send phone number
		elemPhone.sendKeys("0400000000");
		
		WebElement elemEmail = driver.findElement((By.id("email")));
		System.out.println("Found element: " + elemEmail);
		// Send email
		elemEmail.sendKeys("testing@gmail.com");
		
		WebElement elemPassword = driver.findElement((By.id("password")));
		System.out.println("Found element: " + elemPassword);
		// Send password
		elemPassword.sendKeys("test");
		
		WebElement elemConfirmPassword = driver.findElement((By.id("confirmPassword")));
		System.out.println("Found element: " + elemConfirmPassword);
		// Send confirm password
		elemConfirmPassword.sendKeys("test");
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		WebElement buttonCreateAccount = driver.findElement((By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button")));
		buttonCreateAccount.click();
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		
		// Sleep a while
		sleep(10);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void etsy_registration_page(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("kevin@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("1");
		
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("First");
		
		driver.findElement(By.name(("submit_attempt"))).click();
		
		
		sleep(10);
		
		driver.close();
		
	}
}
