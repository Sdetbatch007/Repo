package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptExecution {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
				"document.getElementsByTagName('button')[0].setAttribute('style','border: 4px red solid;background: yellow');");
		js.executeScript("document.getElementsByTagName('button')[0].click();");
		js.executeScript("window.scrollTo(0,300);");
		js.executeScript("window.scrollBy(0,300);");
		js.executeScript("document.getElementsByClassName('card-title')[7].scrollIntoView();");
		
		Thread.sleep(5000);

		driver.quit();
	}

}
