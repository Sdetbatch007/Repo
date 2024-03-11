package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
	}

}
