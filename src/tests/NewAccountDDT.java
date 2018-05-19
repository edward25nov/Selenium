package tests;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Endpoints;
import entities.Account;

@RunWith(value = Parameterized.class)
public class NewAccountDDT extends BaseTest{

	Account cuenta;
	// El constructor le pasara los parametros al test method
	// Cada parámetro debe colocarse como un argumento aquí
	// Cada vez que el runner se dispara, pasará los argumentos
	// de los parámetros que definimos en el método getData()
	public NewAccountDDT(String name, String email, String phone, String gender, String password, String verifyPassword,
			String country, String weeklyEmail, String monthlyEmail, String occasionalEmail)
	{
		super(Endpoints.NewAccount,"chrome");
		cuenta = new Account();
		this.cuenta.setName(name);
		this.cuenta.setEmail(email);
		this.cuenta.setPhone(phone);
		this.cuenta.setGender(gender);
		this.cuenta.setPassword(password);
		this.cuenta.setVerifyPassword(verifyPassword);
		this.cuenta.setCountry(country);
		this.cuenta.setWeeklyEmail( (weeklyEmail.equalsIgnoreCase("TRUE") ? true:false) );
		this.cuenta.setMonthlyEmail( (monthlyEmail.equalsIgnoreCase("TRUE") ? true:false) );
		this.cuenta.setOccasionalEmail((occasionalEmail.equalsIgnoreCase("TRUE") ? true:false));
	}
	
	@Test
	public void newAccountTest()
	{
		//System.out.println(this.cuenta.print());
		page.AccountPage obj = new page.AccountPage(this.getDriver());
		obj.newAccount(this.cuenta);
	}
	
	// Este método es designado a pasar los parámetros dentro de la clase vía constructor
	@Parameters
	public static List<String[]> getData()
	{
		return app.DataReaders.getCsv("UserAccounts.csv");
	}
	
	
}
