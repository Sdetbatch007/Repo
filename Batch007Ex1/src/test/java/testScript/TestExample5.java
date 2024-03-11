package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		List<WebElement> allInputs = driver.findElements(By.xpath("//div[@class='form-fields']/descendant::input"));

		int count = allInputs.size();

		System.out.println("All Inputssize is :" + count);

		Thread.sleep(3000);

		driver.quit();

	}

}
