package nocPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NcDashboardPage {
	WebDriver driver;
	By dahboard = By.xpath("//h1[contains(text() , 'Dashboard')]");

	public void verifydashboard() {

		boolean val = driver.findElement(dahboard).isDisplayed();
		if (val == true) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login failed");
		}

	}

	public NcDashboardPage(WebDriver d) {
		this.driver = d;
	}

}
