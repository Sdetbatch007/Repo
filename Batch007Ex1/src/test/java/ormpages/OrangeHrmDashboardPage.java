package ormpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmDashboardPage {

	WebDriver driver;

	public OrangeHrmDashboardPage(WebDriver d) {
		this.driver = d;
	}

	By dashboard = By.xpath("//h6[text() = 'Dashboard']");

	public void verifydashboard() {

		boolean val = driver.findElement(dashboard).isDisplayed();
		if (val == true) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login failed");
		}

	}

}
