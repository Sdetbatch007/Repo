package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestActions2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.get("https://demoqa.com/droppable");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement Source = driver.findElement(By.id("draggable"));
		Thread.sleep(5000);

		WebElement Target = driver.findElement(By.id("droppable"));
		Thread.sleep(5000);

		action.dragAndDrop(Source, Target).perform();
		Thread.sleep(2000);

		action.moveToElement(driver.findElement(By.className("header-text"))).perform();
		Thread.sleep(2000);

		action.click().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text() = 'Text Box']")).click();
	

//		WebElement text = driver.findElement(By.id("userName"));
//	
//
//		action.keyDown(Keys.SHIFT).sendKeys(text, "maruthi").keyUp(Keys.SHIFT).perform();
//		Thread.sleep(5000);

		driver.quit();

	}

}
