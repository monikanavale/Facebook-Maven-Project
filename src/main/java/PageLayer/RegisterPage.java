package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.UtilsClass;

public class RegisterPage extends BaseClass {
	
	//1. create Object Repository by using @FindBy annotations
	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="reg_email__")
	WebElement uname;
	
	@FindBy(name="reg_passwd__")
	WebElement pass;
	
	@FindBy(name="birthday_day")
	WebElement day;
	
	@FindBy(name="birthday_month")
	WebElement month;
	
	@FindBy(name="birthday_year")
	WebElement year;
	
	@FindBys(@FindBy(xpath="//span[@class='_5k_3']//child::label"))
	private List<WebElement> gender;
	
	
	
	//2. initialize the Object Repository by using PageFactory.initElements() method in constructor
	public RegisterPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. create associated method for each and every object repository without entering test data.
	public void registerNewUser(String firstname,String lastname,String username,String password,
			String Date,String Month,String Year,String Gender)
		{
		UtilsClass.sendKeys(fname, firstname);
		UtilsClass.sendKeys(lname, lastname);
		UtilsClass.sendKeys(uname, username);
		UtilsClass.sendKeys(pass, password);
		
		HandleDropDown.selectByVisibleText(day, Date);
		HandleDropDown.selectByVisibleText(month, Month);
		HandleDropDown.selectByVisibleText(year, Year);
		
		UtilsClass.selectGender(gender, Gender);
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
			}
	
