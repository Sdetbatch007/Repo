package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		// driver.findElement(By.id("Email"));
		// driver.findElement(By.name("password"));

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();
		Thread.sleep(2000);

		WebElement category = driver.findElement(By.name("SearchCategoryId"));

		Select selection = new Select(category);
		List<WebElement> alloptions = selection.getOptions();
		System.out.println("all count is :" + alloptions.size());

		Thread.sleep(2000);

		Select s = new Select(category);

		s.selectByVisibleText("Apparel");
		Thread.sleep(2000);
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByValue("15");

		Thread.sleep(2000);
		driver.quit();
	}

}
