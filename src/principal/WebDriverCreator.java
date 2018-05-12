package principal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
}
