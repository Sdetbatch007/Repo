package ormTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ormpages.OrangeHrmAdminpage;
import ormpages.OrangeHrmDashboardPage;
import ormpages.OrangeHrmLoginPage;
import ormpages.OrangeHrmPIMPage;

public class validatePIMpageFuntionalityEmp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		OrangeHrmUtlities ohrm = new OrangeHrmUtlities(driver);
		OrangeHrmAdminpage ohap = new OrangeHrmAdminpage(driver);
		OrangeHrmPIMPage ohpim = new OrangeHrmPIMPage(driver);
		OrangeHrmLoginPage ohlp = new OrangeHrmLoginPage(driver);
		OrangeHrmDashboardPage ohdp = new OrangeHrmDashboardPage(driver);

		ohrm.setup();
		Thread.sleep(3000);
		ohlp.enterEmail();
		Thread.sleep(3000);
		ohlp.enterpassword();
		Thread.sleep(3000);
		ohlp.ClickOnLoginBtn();
		Thread.sleep(3000);
		ohrm.ClickOnDashboard();
		ohdp.verifydashboard();
		Thread.sleep(3000);
		ohrm.ClickOnAdmin();
		Thread.sleep(3000);
		ohap.SelectCheckbox();
		Thread.sleep(3000);
		ohap.ClickOndelete();
		Thread.sleep(3000);
		ohap.ClickOnYesBtn();
		Thread.sleep(3000);
		ohrm.ClickOnPIM();
		Thread.sleep(6000);
		ohpim.SelectAddBtn();
		Thread.sleep(6000);
		ohpim.EnterEmpFirstNm();
		Thread.sleep(3000);
		ohpim.EnterEmpLastNm();
		Thread.sleep(3000);
		ohpim.ClickOnSaveBtn();
		Thread.sleep(3000);
		ohpim.ClickOnEmpListBtn();
		Thread.sleep(3000);
		ohpim.ClickonEmpnm();
		Thread.sleep(3000);
		ohpim.EnterEmpNmList();
		Thread.sleep(3000);
		ohpim.ClickOnSearchBtn();
		Thread.sleep(3000);
		ohrm.doLogout();
		Thread.sleep(3000);
		ohrm.tearDown();

	}

}
