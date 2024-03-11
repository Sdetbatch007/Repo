package ncTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import nocPages.NcDashboardPage;
import nocPages.NcLoginPage;
import nocPages.NcProductPage;
import nocPages.NcUtilities;

public class ValidateDeleteFunctionalityInProductPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		NcUtilities ncu = new NcUtilities(driver);
		NcLoginPage nlp = new NcLoginPage(driver);
		NcDashboardPage ndp = new NcDashboardPage(driver);
		NcProductPage npp = new NcProductPage(driver);

		ncu.setup();
		nlp.enteremail();
		Thread.sleep(3000);
		nlp.enterpassword();
		Thread.sleep(3000);
		nlp.clickOnLoginBtn();
		Thread.sleep(3000);
		ndp.verifydashboard();
		Thread.sleep(3000);
		ncu.clickoncatalog();
		Thread.sleep(3000);
		ncu.clickonproducts();
		Thread.sleep(3000);
		npp.Selectproduct();
		Thread.sleep(3000);
		npp.ClickonDelete();
		Thread.sleep(3000);
		npp.Clickonyes();
		Thread.sleep(6000);
		ncu.doLogout();
		Thread.sleep(3000);
		ncu.tearDown();

	}

}
