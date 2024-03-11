package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("Email"))).perform();
		Thread.sleep(2000);
		action.doubleClick().perform();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		action.moveToElement(driver.findElement(By.id("nopSideBarPusher"))).perform();
		Thread.sleep(2000);
		action.click().perform();
		action.contextClick().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
