package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass {

	private RegisterPage registerPage;
	
	@BeforeTest
	public void setUp() 
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateRegisterUserFunctionality() 
	{
		registerPage = new RegisterPage();
		registerPage.registerNewUser("Monika", "Navale", "monika@gmail.com", "Monika@123", "10", "Jan", "2000", "female");
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
