package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample6 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		// String source = driver.getPageSource();
		Thread.sleep(3000);

		// System.out.println(source);
		String Id = driver.getWindowHandle();
		System.out.println(Id);
		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Training')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Documentation')]")).click();
		Thread.sleep(3000);

		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);
	}

}
