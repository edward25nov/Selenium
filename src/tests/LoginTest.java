package tests;

import org.junit.Test;

import principal.Endpoints;

import org.junit.Assert;


public class LoginTest extends BaseTest{

	public LoginTest() {
		super(Endpoints.login,"chrome");
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void executeLogin() 
	{
		page.LoginPage objeto = new page.LoginPage(this.getDriver());
		boolean res = objeto.login("edward", "1234567", "1234567");
		Assert.assertTrue(res);
	}

	
}