/**
 * 
 */
package principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		findbyClass();
	}
	
	public static void findbyName() 
	{
		WebDriver _driver = WebDriverCreator.getChromeDriver();
		/// sirve para ir a una url en especifico
		_driver.navigate().to(Endpoints.byName);
		
		// buscar el elemento inpunt por name
		WebElement input =    _driver.findElement(By.name("myName"));
		/// con la instrucción sendKeys, se puede mandar a escribir texto
		input.sendKeys("Hola BDG!!");
		/// cerrar el driver
		try {
			Thread.sleep(2000); // importante .. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_driver.close();
		_driver.quit();
		
	}
	
	public static void findbyId() 
	{
		WebDriver _driver = WebDriverCreator.getChromeDriver();
		/// sirve para ir a una url en especifico
		_driver.navigate().to(Endpoints.byId);
		
		// buscar el elemento inpunt por name
		WebElement image =    _driver.findElement(By.id("testImadfaage"));
	
		/// cerrar el driver
		try {
			Thread.sleep(2000); // importante .. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_driver.close();
		_driver.quit();
		
	}
	

	public static void findbyXpath() 
	{
		WebDriver _driver = WebDriverCreator.getChromeDriver();
		/// sirve para ir a una url en especifico
		_driver.navigate().to(Endpoints.byXpath);
		
		// buscar el elemento inpunt por name
		WebElement image =    _driver.findElement(By.xpath("//*[@id=\"post-109\"]/div/figure/img"));
	
		/// cerrar el driver
		try {
			Thread.sleep(2000); // importante .. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_driver.close();
		_driver.quit();
		
	}
	
	public static void findbyCss() 
	{
		WebDriver _driver = WebDriverCreator.getChromeDriver();
		/// sirve para ir a una url en especifico
		_driver.navigate().to(Endpoints.byCss);
		
		// buscar el elemento inpunt por name
		WebElement image =    _driver.findElement(By.cssSelector("#post-108 > div > figure > img"));
	
		/// cerrar el driver
		try {
			Thread.sleep(2000); // importante .. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_driver.close();
		_driver.quit();
		
	}
	
	
	public static void findbyClass() 
	{
		
		WebDriver _driver = WebDriverCreator.getChromeDriver();
		/// sirve para ir a una url en especifico
		_driver.navigate().to(Endpoints.byClass);
		
		// buscar el elemento inpunt por name
		WebElement image =    _driver.findElement(By.className("testClass"));
	    System.out.println("TEXT VALUE: "+image.getText());
		/// cerrar el driver
		try {
			Thread.sleep(2000); // importante .. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_driver.close();
		_driver.quit();
	}
	
}
