package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrames{
	

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/iframe");

	//	driver.switchTo().frame(0);
		
		driver.switchTo().frame("mce_0_ifr");
		

		WebElement ele = driver.findElement(By.tagName("p"));
		Thread.sleep(5000);
		ele.clear();
		Thread.sleep(5000);
		ele.sendKeys("Selenium concepts");
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		WebElement label = driver.findElement(By.tagName("h3"));

		System.out.println(label.getText());

		Thread.sleep(5000);
		driver.quit();

	}

}
