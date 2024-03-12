package ormpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmPIMPage {

	WebDriver driver;

	public OrangeHrmPIMPage(WebDriver d) {
		this.driver = d;
	}

//	By PIMpage = By.xpath("(//span[.='PIM'])[1]");
	// By AddBtn = By.xpath("(//button[@type = 'button'])[4]");
	By AddBtn = By.xpath("//button[text()=' Add ']");
	By EmpFirstName = By.name("firstName");
	By EmpLastName = By.name("lastName");
	By SaveBtn = By.xpath("//button[text() = ' Save ']");
	By EmpListBtn = By.xpath("//a[contains(text(),'Employee List')]");

	By EnterEmpNm = By.xpath("(//div[@class ='oxd-autocomplete-wrapper'])[1]");
	By SearchBtn = By.xpath("//button[contains(.,'Search')]");

	public void SelectAddBtn() {
		driver.findElement(AddBtn).click();
	}

	public void EnterEmpFirstNm() {
		driver.findElement(EmpFirstName).sendKeys("maruthi");
	}

	public void EnterEmpLastNm() {
		driver.findElement(EmpLastName).sendKeys("bandari");
	}

	public void ClickOnSaveBtn() {
		driver.findElement(SaveBtn).click();
	}

	public void ClickOnEmpListBtn() {
		driver.findElement(EmpListBtn).click();
	}

	public void ClickonEmpnm() {
		driver.findElement(EnterEmpNm).click();
	}

	public void EnterEmpNmList() {
		driver.findElement(EnterEmpNm).sendKeys("maruthi");
	}

	public void ClickOnSearchBtn() {
		driver.findElement(SearchBtn).click();
	}

}
