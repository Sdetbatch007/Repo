package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptExecution2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	

		WebElement textbox = driver.findElement(By.id("Email"));

	//	js.executeScript("arguments[0].value = 'selenium';", textbox);
		
		js.executeScript("arguments[0].setAttribute('value','selenium')",textbox);
		
		js.executeScript("arguments[0].setAttribute('style','border:4px red solid')",textbox);
		
		js.executeScript("arguments[0].setAttribute('style','border:4px red solid;background:yellow;color:blue')",textbox);
		
	
	
	}

}
