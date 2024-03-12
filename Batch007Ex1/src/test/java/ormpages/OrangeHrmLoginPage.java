package ormpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLoginPage {

	WebDriver driver;

	public OrangeHrmLoginPage(WebDriver d) {
		this.driver = d;
	}

	By email = By.name("username");
	By pws = By.name("password");
	By loginBtn = By.tagName("button");

	public void enterEmail() {

		driver.findElement(email).sendKeys("Admin");
	}

	public void enterpassword() {
		driver.findElement(pws).sendKeys("admin123");
	}

	public void ClickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}

}
