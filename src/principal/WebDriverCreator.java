package principal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//creaciòn de los webdriver
public class WebDriverCreator {

	public static WebDriver  getChromeDriver()
	{
		// Estamos asignando al Driver la propiedad de ruta
		// webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Edward\\Documents\\AutomationTest\\Software\\Selenium\\chromedriver.exe");
		return new ChromeDriver();
	}
	
	public static WebDriver  getFirefoxDriver()
	{
		// Estamos asignando al Driver la propiedad de ruta
		// webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Edward\\Documents\\AutomationTest\\Software\\Selenium\\geckodriver.exe");
		return new FirefoxDriver();
	}
	
}
