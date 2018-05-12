package principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CasesVarious {

	
	public static void caseCombobox() 
	{
		WebDriver _driver = WebDriverCreator.getChromeDriver();
		// trasladarte a la url
		_driver.navigate().to(Endpoints.combobox);
		//new Select(_driver.findElement(By.name("DropDownTest"))).selectByVisibleText("Audi");
		new Select(_driver.findElement(By.name("DropDownTest"))).selectByVisibleText("Audi");
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
