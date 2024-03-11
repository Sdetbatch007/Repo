package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		/*
		 * driver.findElement(By.id("Email")).clear();
		 * 
		 * driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		 * 
		 * driver.findElement(By.name("Password")).clear();
		 * 
		 * driver.findElement(By.name("Password")).sendKeys("admin");
		 * 
		 * driver.findElement(By.tagName("button")).click();
		 * 
		 * Thread.sleep(5000);
		 */


	
		WebElement email = driver.findElement(By.id("Email"));

		email.clear();

		email.sendKeys("admin@yourstore.com");

		driver.quit();

	}

}
