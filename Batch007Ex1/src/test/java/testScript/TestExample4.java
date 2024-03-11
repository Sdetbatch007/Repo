package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.manage().window().maximize();

		String val = driver.getTitle();

		System.out.println(val);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);

		String url = driver.getCurrentUrl();

		System.out.println(url);

		driver.quit();

	}

}
