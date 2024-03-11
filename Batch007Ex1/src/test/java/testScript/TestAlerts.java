package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlerts{
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// driver.findElement(By.xpath("//button[text()= 'Click for JS
		// Alert']")).click();

		// driver.findElement(By.xpath("(//button[contains(text() , 'Click
		// for')])[2]")).click();

		driver.findElement(By.xpath("(//button[contains(text() , 'Click for')])[3]")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert(); // driver.switchTo().alert().accept();
		Thread.sleep(3000);

		// alert.accept(); // click on ok button

		// alert.dismiss(); // click on cancel button

//		String alerttext = alert.getText();
//		System.out.println("alerttext");

		alert.sendKeys("selenium");
		Thread.sleep(3000);

		alert.accept();


	}

}
