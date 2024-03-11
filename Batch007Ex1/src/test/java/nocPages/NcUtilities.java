package nocPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NcUtilities {

	WebDriver driver;

	By catalog = By.xpath("(//p[contains(text(), 'Catalog')])[1]");
	By products = By.xpath("//p[normalize-space(.) = 'Products']");
	By logout = By.linkText("Logout");

	public void clickoncatalog() {
		driver.findElement(catalog).click();
	}

	public void clickonproducts() {
		driver.findElement(products).click();
	}

	public void doLogout() {
		driver.findElement(logout).click();
	}

	public void setup() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F ");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	public void tearDown() {
		driver.quit();

	}

	public NcUtilities(WebDriver d) {
		this.driver = d;
	}
}
