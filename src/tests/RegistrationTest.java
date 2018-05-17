package tests;

import org.junit.Test;
import org.junit.Assert;
import principal.Endpoints;

public class RegistrationTest extends BaseTest{

	public RegistrationTest() {
		super(Endpoints.Registration,"chrome");
		// TODO Auto-generated constructor stub
	}

	@Test
	public void execute() 
	{
		page.RegistrationPage obj = new page.RegistrationPage(this.getDriver());
		Assert.assertTrue(obj.registration());
	}
}
