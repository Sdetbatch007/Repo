package javaScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTables {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("//p[normalize-space(text())= 'Catalog']")).click();
		driver.findElement(By.xpath("//p[text()= ' Categories']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'categories-grid']/tbody/tr"));

		int rowcount = rows.size();
		System.out.println("all rows is :" + rowcount);
		List<WebElement> colum = driver.findElements(By.xpath("//table[@id = 'categories-grid']/tbody/tr[1]/td"));

		int columcount = colum.size();
		System.out.println("all colum is :" + columcount);
		for (int r = 1; r <= rowcount; r++) {
			for (int c = 1; c <= columcount; c++) {
				String val = driver
						.findElement(By.xpath("//table[@id = 'categories-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(val + " ");
			}
				System.out.println();
			
		}
	}
}