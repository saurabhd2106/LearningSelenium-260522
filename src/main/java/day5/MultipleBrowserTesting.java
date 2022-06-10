package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleBrowserTesting {

	WebDriver driver;

	public void openBrowser(String browserType) throws Exception {
		
		if(browserType.equalsIgnoreCase("chrome")) {
			
			//Set this variable as an environment variable
			System.setProperty("webdriver.chrome.driver",
					"/Users/saurabhdhingra/eclipse-workspace/LearningSelenium-26052022/driver/chromedriver");

			driver = new ChromeDriver();

			
		} else if(browserType.equalsIgnoreCase("edge")) {
			
			//Set this variable as an environment variable
			System.setProperty("webdriver.edge.driver",
					"/Users/saurabhdhingra/eclipse-workspace/LearningSelenium-26052022/driver/edgedriver");

			driver = new EdgeDriver();
			
		} else if(browserType.equalsIgnoreCase("ff")) {
			
			//Set this variable as an environment variable
			System.setProperty("webdriver.gecko.driver",
					"/Users/saurabhdhingra/eclipse-workspace/LearningSelenium-26052022/driver/geckodriver");

			driver = new FirefoxDriver();
			
		} else {
			
			throw new Exception("Invalid Browser Type " + browserType);
		}

		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();;
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.get("https://test.qatechhub.com/form-elements/");

	}
	
	public void formFill() {
		
		driver.findElement(By.id("wpforms-49-field_1")).sendKeys("Saurabh");
		
		driver.findElement(By.name("wpforms[fields][1][last]")).sendKeys("Dhingra");
		
		driver.findElement(By.id("wpforms-49-field_2")).sendKeys("saurabh@uptut.com");
		
		driver.findElement(By.id("wpforms-49-field_3_2")).click();
		
		driver.findElement(By.id("wpforms-49-field_4")).sendKeys("478563278");
		
		WebElement dropdown =	driver.findElement(By.id("wpforms-49-field_5"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Cypress");
		
		driver.findElement(By.id("wpforms-submit-49")).click();
		
	}

	public void closeBrowser() {

		driver.quit();
	}

}
