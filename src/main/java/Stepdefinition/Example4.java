package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example4 {
	@Given("user login to TestMeApp")
	public void user_login_to_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user selects products as {string}")
	public void user_selects_products_as(String sn) {
		System.out.println();
	    
	}

	@When("user click on add to cart")
	public void user_click_on_add_to_cart() {
	    
	}

	@When("User clink in cart link")
	public void user_clink_in_cart_link() {
	 
	}

	@When("user provide quantity as {int}")
	public void user_provide_quantity_as(Integer int1) {
	    
	}

	@When("user proceed checkout")
	public void user_proceed_checkout() {
	 	}

	@Then("verify the review and payment page")
	public void verify_the_review_and_payment_page() {
	   
	}

}
