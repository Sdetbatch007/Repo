package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTables {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[contains(@class, 'oxd-main')])[2]")).click();
		Thread.sleep(2000);

		List<WebElement> allRows = driver.findElements(By.xpath("//div[@class = 'oxd-table-body']/div"));

		int rowsCount = allRows.size();

		System.out.println("All Rows Count is : " + rowsCount);
		Thread.sleep(5000);

		List<WebElement> allColumns = driver.findElements(By.xpath("//div[@class = 'oxd-table-body']/div[1]/div/div"));

		int columnsCount = allColumns.size();
		Thread.sleep(5000);

		System.out.println("All Columns Count is : " + columnsCount);
		Thread.sleep(5000);

		for (int r = 1; r <= rowsCount; r++) {

			for (int c = 1; c <= columnsCount; c++) {

				String val = driver
						.findElement(By.xpath("//div[@class = 'oxd-table-body']/div[" + r + "]/div/div[" + c + "]"))
						.getText();
				System.out.print(val + "	");
			}

			System.out.println();

		}

		Thread.sleep(5000);

		driver.quit();

	}

}
