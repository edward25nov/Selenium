/**
 * 
 */
package principal;

import org.openqa.selenium.WebDriver;

/**
 * @author Edward
 *
 */
public class Training {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver _driver = WebDriverCreator.getChromeDriver();
		/// sirve para ir a una url en especifico
		_driver.navigate().to(Endpoints.url1);
		
		/// cerrar el driver
		
		_driver.close();
		_driver.quit();
	}

}
