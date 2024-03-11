package javaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForeachLoop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		List<WebElement> allinputs = driver.findElements(By.xpath("//Input"));
		for (WebElement Input : allinputs) {
			String val = Input.getAttribute("Name");
			System.out.println(val);

		}
		driver.quit();
	}

}
