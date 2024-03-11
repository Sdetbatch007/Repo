package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample9 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).clear();

		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(2000);
		boolean val = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println("Check box is selected:" + val);

		boolean ena = driver.findElement(By.tagName("button")).isEnabled();
		Thread.sleep(2000);
		System.out.println("Login button Enable?:" + val);
		driver.findElement(By.tagName("button")).click();
		boolean dis = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		System.out.println("Is logpage success?:" + dis);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();
		boolean prop = driver.findElement(By.xpath("//h1[contains(text(),'Products')]")).isDisplayed();
		System.out.println("product pageloaded?: " + prop);

		driver.findElement(By.id("SearchProductName")).sendKeys("Windows 8 Pro" + Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Boolean val3 = driver.findElement(By.id("Email")).isDisplayed();
		Thread.sleep(3000);
		System.out.println("Logout page successfull :" + val3);

		driver.quit();

	}

}
