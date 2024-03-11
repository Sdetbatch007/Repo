package testScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TestCaptures {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		File SourceFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/img.jpg");

		FileUtils.copyFile(SourceFile, destFile);

		System.out.println("Screenshot saved sucesfully");

		driver.quit();

	}

}
