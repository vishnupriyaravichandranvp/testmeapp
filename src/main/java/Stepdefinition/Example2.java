package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example2 {
	WebDriver driver;
	@Given("user login")
	public void user_login() 
	{
		driver.findElement(By.name("Login")).click();
	   
	}

	@When("user selects product using category")
	public void user_selects_product_using_category() {
		
	   
	}

	@Then("verify the list of product And close application")
	public void verify_the_list_of_product_And_close_application() {
	 
	}

	@When("user selects product using sub-category")
	public void user_selects_product_using_sub_category() 
	{
		
	}

}
