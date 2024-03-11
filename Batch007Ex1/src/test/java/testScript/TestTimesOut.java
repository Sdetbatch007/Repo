package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTimesOut {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button"))));

		driver.findElement(By.tagName("button")).click();
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("(//p[contains(text()  , 'Catalog')])[1]"))));

		driver.findElement(By.xpath("(//p[contains(text()  , 'Catalog')])[1]")).click();

		System.out.println("Execution done");

		driver.quit();
	}

}
