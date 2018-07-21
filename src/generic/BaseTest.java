package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	// set the driver executable path
	static {
		System.setProperty(GECKO_KEY, GECKO_PATH);
		System.setProperty(CHROME_KEY, CHROME_PATH);
	}

	@BeforeMethod
	public void openApplication() {

		driver = new ChromeDriver();
		// String url = Lib.getPropertyValue("URL");
		driver.get("http://localhost/login.do");
		String Implicitwait = Lib.getPropertyValue("ImplicitWait");
		driver.manage().timeouts().implicitlyWait(Long.parseLong(Implicitwait), TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeApplication(ITestResult res) {
		if (ITestResult.FAILURE == res.getStatus()) {
			Lib.captureScreenshot(driver, res.getName());
		}
		//driver.close();

	}
}
