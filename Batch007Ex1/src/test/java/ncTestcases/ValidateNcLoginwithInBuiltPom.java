package ncTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import inBuiltLogin.InBuiltNcLoginPage;
import nocPages.NcUtilities;

public class ValidateNcLoginwithInBuiltPom {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		NcUtilities ncu = new NcUtilities(driver);
		InBuiltNcLoginPage inlp = new InBuiltNcLoginPage(driver);

		ncu.setup();
		inlp.enterEmail();
		inlp.enterPassword();
		inlp.clickonLoginBtn();
		//ncu.doLogout();
		ncu.tearDown();

	}

}
