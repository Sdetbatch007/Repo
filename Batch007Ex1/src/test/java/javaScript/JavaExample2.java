package javaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaExample2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		boolean login = driver.findElement(By.id("Email")).isDisplayed();
		if (login = true) {
			System.out.println("login page successfully loaded");
			driver.findElement(By.tagName("button")).click();
		} else {
			System.out.println("login page not loaded");
		}
		String a = "Product reviews";
		switch (a) {
		case "products":
			driver.findElement(By.xpath("//p[contains(text() , 'Catalog')]")).click();
			driver.findElement(By.xpath("(//p[contains(text(), ' Products')])[1]")).click();
			driver.findElement(By.xpath("//div[@class = 'float-right']/a")).click();

			driver.findElement(By.name("Name")).sendKeys("watches");
			driver.findElement(By.xpath("//button[@name = 'save']")).click();

			driver.findElement(By.name("SearchProductName")).sendKeys("watches" + Keys.ENTER);
			String val = driver.findElement(By.name("SearchProductName")).getAttribute("name");
			System.out.println(val + " ");
			break;
		case "category":
			driver.findElement(By.xpath("//p[contains(text() , 'Catalog')]")).click();
			driver.findElement(By.xpath("//p[contains(text() , 'Categories')]")).click();
			driver.findElement(By.xpath("//div[@class = 'float-right']/a")).click();

			driver.findElement(By.name("Name")).sendKeys("computer parts");
			driver.findElement(By.xpath("//button[@name = 'save']")).click();
			driver.findElement(By.name("SearchCategoryName")).sendKeys("computer parts" + Keys.ENTER);
			System.out.println("see the computer parts");
			break;
		case "Product reviews":
			int day = 27;
			driver.findElement(By.xpath("//p[contains(text() , 'Catalog')]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Product reviews')]")).click();
			driver.findElement(By.xpath("(//span[@role = 'button'])[1]")).click();

//			driver.findElement(By.xpath("(//table[@role ='grid']//a[text() = " + day + "])[1]")).click();

			driver.findElement(By
					.xpath("//table[@role ='grid']//td[not(contains(@class,'k-other-month'))]/a[text()= " + day + "]"))
					.click();

			System.out.println("see the date of month");
			break;
		}
		Thread.sleep(5000);
		// driver.quit();
	}

}
