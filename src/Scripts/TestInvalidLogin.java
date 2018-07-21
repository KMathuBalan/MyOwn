package Scripts;

import org.testng.annotations.Test;

import PomPage.LoginPage;
import generic.BaseTest;
import generic.Lib;

public class TestInvalidLogin extends BaseTest {
		@Test
		public void testInvalidLogin() {
			LoginPage lp = new LoginPage(driver);
			int rowCount = Lib.getRowCount("InvalidLogin");
			System.out.println(rowCount);
			for (int i = 1; i <= 7; i++) {
				String username = Lib.getCellValue("InvalidLogin", 1, 0);
				lp.setUsername(username);
				String password = Lib.getCellValue("InvalidLogin", 1, 1);
				lp.setPassword(password);
				lp.clickLogin();
			}
		}

	}
