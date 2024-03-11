package nocPages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NcLoginPage {
	WebDriver driver;

	public NcLoginPage(WebDriver d) {
		this.driver = d;
	}

	By email = By.id("Email");
	By pws = By.name("Password");
	By loginbtn = By.tagName("button");

	public void enteremail() {

		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("admin@yourstore.com");
	}

	public void enterpassword() {
		driver.findElement(pws).clear();
		driver.findElement(pws).sendKeys("admin");

	}

	public void clickOnLoginBtn() {
		driver.findElement(loginbtn).click();
	}

}
