package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	public static WebDriver getBrowser(String browser) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			return driver;
		}
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}
		if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			return driver;
		}
		if (browser.toLowerCase().contains("safari")) {
			driver = new SafariDriver();
			return driver;
		}
		return driver;
	}
}