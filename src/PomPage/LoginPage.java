package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		// declaration of the element

		@FindBy(id = "username")
		WebElement unTB;
		@FindBy(name = "pwd")
		WebElement pwdTB;
		@FindBy(xpath = "//div[text()='Login ']")
		WebElement loginBtn;

		// initialisation the element
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// utillisation Webelements
		public void setUsername(String un) {
			unTB.sendKeys(un);
		}

		public void setPassword(String pw) {
			pwdTB.sendKeys(pw);
		}

		public void clickLogin() {
			loginBtn.click();
		}
}
