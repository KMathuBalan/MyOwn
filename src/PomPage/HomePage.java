package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// declaration of the element

	@FindBy(id = "username")
	WebElement unTB;
	@FindBy(name = "pwd")
	WebElement pwdTB;
	@FindBy(xpath = "//div[text()='Login ']")
	WebElement loginBtn;
	@FindBy(xpath = "(//*[@class='popup_menu_label'])[3]")
	WebElement helpArrow;
	@FindBy(partialLinkText="About your actiTIME")
	//@FindBy(xpath = "//*[text()='About your actiTIME']")
	WebElement ActitimeVersObj;
	@FindBy(className="productVersion")
	 
	WebElement popupObj;

	// initialisation the element
	public HomePage(WebDriver driver) {
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
		public void clickHelp()
		{
			helpArrow.click();
		}
		public void clickactitime()
		{
			ActitimeVersObj.click();
			
		}
		public void getText()
		{
			popupObj.getText();
		}
	
}
