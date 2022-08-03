package ass3W9D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeWebDriverAss3W9D3 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */

	@BeforeTest
	public void setUp() throws InterruptedException {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}

	/**
	 * Test TextField using cssSelector by tag, id, and attribute
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// Find username TextField by tag, id, and attribute
		WebElement username = driver.findElement(By.cssSelector("input#email[name='email']"));
		username.sendKeys("Mawaddah");
//		Thread.sleep(2000);
		
		// Find password TextField by tag, id, and attribute
		WebElement password = driver.findElement(By.cssSelector("input#pass[name='pass']"));
		password.sendKeys("Hanbali");
//		Thread.sleep(2000);
		
		// Find login Button by tag and attribute
		WebElement button = driver.findElement(By.cssSelector("button[name='login']"));
		button.click();
//		Thread.sleep(2000);
		
		
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
