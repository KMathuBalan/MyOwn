package Scripts;

import org.testng.annotations.Test;

import PomPage.LoginPage;
import generic.BaseTest;
import generic.Lib;

public class TestValidLogin extends BaseTest {
		@Test
		public void testValidLogin() {
			LoginPage lp = new LoginPage(driver);
			String username = Lib.getCellValue("ValidLogin", 1, 0);
			lp.setUsername(username);
			String password = Lib.getCellValue("ValidLogin", 1, 1);
			lp.setPassword(password);
			lp.clickLogin();
			//Assert.fail();
		}

	}