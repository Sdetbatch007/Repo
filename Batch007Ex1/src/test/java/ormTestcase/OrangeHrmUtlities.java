package ormTestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmUtlities {

	WebDriver driver;

	public OrangeHrmUtlities(WebDriver d) {
		this.driver = d;
	}

	By Admin = By.xpath("//span[text() = 'Admin']");
	By Dashboard = By.xpath("//h6[text() = 'Dashboard']");
	By PIM = By.xpath("(//span[.='PIM'])[1]");
	By Logout = By.xpath("//a[text()= 'Logout']");

	public void ClickOnAdmin() {
		driver.findElement(Admin).click();
	}

	public void ClickOnDashboard() {
		driver.findElement(Dashboard).click();
	}

	public void ClickOnPIM() {
		driver.findElement(PIM).click();
	}

	public void doLogout() {
		driver.findElement(Logout).click();
	}

	public void setup() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	public void tearDown() {
		driver.quit();
	}
}
