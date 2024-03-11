package javaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTables2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
		int rowcount = rows.size();
		Thread.sleep(4000);
		System.out.println("all rows :" + rowcount);

		List<WebElement> colum = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[2]/td"));
		int columcount = colum.size();
		Thread.sleep(4000);
		System.out.println("all column:" + columcount);

		for (int r = 1; r <= rowcount; r++) {
		 for (int c = 1; c <= columcount; c++) {

				String val = driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr["+ r +"]/td["+ c +"]"))
						.getText();
				System.out.print(val + "  ");
				System.out.println();
			}
		}

//		Thread.sleep(4000);
//	    driver.quit();
	}

}
