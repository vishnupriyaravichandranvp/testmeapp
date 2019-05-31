package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example3 {
	WebDriver driver;
	@Given("user navigates to TestMeApp")
	public void user_navigates_to_TestMeApp() 
	
	{
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
	}

	@When("user enter username and passowrd")
	public void user_enter_username_and_passowrd() {
	  Loginpageobject.un.sendKeys("Lalitha");
	  Loginpageobject.pwd.sendKeys("password123");
		 
	}

	@Then("perform Login")
	public void perform_Login() {
		driver.findElement(By.name("Login")).click();
	    
	}

	

}
