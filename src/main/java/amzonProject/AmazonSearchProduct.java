package amzonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearchProduct {

	ChromeDriver driver;

	public void openBrowser() {

		// Set this variable as an environment variable
		System.setProperty("webdriver.chrome.driver",
				"/Users/saurabhdhingra/eclipse-workspace/LearningSelenium-26052022/driver/chromedriver");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in");

	}

	public void searchProduct(String product, String category) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);

		// Selecting a value from dropdown

		WebElement categoryDropdown = driver.findElement(By.id("searchDropdownBox"));

		Select categorySelect = new Select(categoryDropdown);

		categorySelect.selectByVisibleText(category);

		driver.findElement(By.id("nav-search-submit-button")).click();

	}

	public void getNthProduct(int itemNumber) {
		itemNumber += 2;

		// String productXpath =
		// "(//span[@data-component-type='s-search-results']//div[contains(@class,'s-result-item')])["+
		// itemNumber + "]";

		String productXpath = String.format(
				"(//span[@data-component-type='s-search-results']//div[contains(@class,'s-result-item')])[%d]",
				itemNumber);
		
		WebElement product = driver.findElement(By.xpath(productXpath));
		
		WaitUtils.waitTillElementVisible(driver, 10, product);

		String productInfo = product.getText();

		System.out.println(productInfo);
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
