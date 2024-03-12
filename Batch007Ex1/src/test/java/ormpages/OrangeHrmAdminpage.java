package ormpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmAdminpage {

	WebDriver driver;

	public OrangeHrmAdminpage(WebDriver d) {
		this.driver = d;
	}

	By checkBox = By.xpath("(//div[@class = 'oxd-checkbox-wrapper'])[3]");
	By DeleteBtn = By.xpath("(//button[@type = 'button'])[6]");
	By YesDeleteBtn = By.xpath("(//button[@type = 'button'])[last()]");

	public void SelectCheckbox() {
		driver.findElement(checkBox).click();
	}

	public void ClickOndelete() {
		driver.findElement(DeleteBtn).click();
	}

	public void ClickOnYesBtn() {
		driver.findElement(YesDeleteBtn).click();
	}

}
