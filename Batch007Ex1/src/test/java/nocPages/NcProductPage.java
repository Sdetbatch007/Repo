package nocPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NcProductPage {
	
	WebDriver driver;
	By productcheckbox = By.xpath("//table[@id = 'products-grid']/tbody/tr[1]/td[1]/input");
	
	By deleteBtn = By.id("delete-selected");
	By YesBtn = By.xpath("//button[contains(text(),'Yes')]");
	
	public void Selectproduct() {
		driver.findElement(productcheckbox).click();
		
	}
	public void ClickonDelete() {
		driver.findElement(deleteBtn).click();
	}
	public void Clickonyes() {
		driver.findElement(YesBtn).click();
	}
	public NcProductPage(WebDriver d) {
		this.driver = d;
	}
	
	
	
	
	
	
	

}
