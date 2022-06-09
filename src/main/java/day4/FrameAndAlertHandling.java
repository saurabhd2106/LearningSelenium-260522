package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlertHandling {

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

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		System.out.println(driver.getTitle());

	}

	public void clickTryitButton() {

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alert = driver.switchTo().alert();

		String alertMessage = alert.getText();

		System.out.println(alertMessage);

		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			// TODO: handle exception
		}

		alert.accept();

		// To switch back from a frame
		driver.switchTo().defaultContent();

		System.out.println(driver.getTitle());

	}

	public void closeBrowser() {
		driver.quit();
	}
}
