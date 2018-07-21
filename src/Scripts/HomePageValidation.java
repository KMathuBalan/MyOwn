package Scripts;

import org.testng.annotations.Test;

import PomPage.HomePage;
import generic.BaseTest;
import generic.Lib;

public class HomePageValidation extends BaseTest  {
	@Test
	public void testHomepagevalidation() {
	HomePage page = new HomePage(driver);
String username = Lib.getCellValue("ValidLogin", 1, 0);
	page.setUsername(username);
	String password = Lib.getCellValue("ValidLogin", 1, 1);
	page.setPassword(password);
	page.clickLogin();
	page.clickHelp();
	page.clickactitime();
	page.getText();

	}
}