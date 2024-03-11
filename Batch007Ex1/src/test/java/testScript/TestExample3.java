package testScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample3 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		Thread.sleep(3000);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.quit();

	}

}
