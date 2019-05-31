package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example1 {
	
	WebDriver driver;


@Given("user launch chrome browser And enter TestMeApp URL")
public void user_launch_chrome_browser_And_enter_TestMeApp_URL() 
{
    System.out.println("user launch chrome and open the testMe app" );
    System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	
}

@When("user entered username in username field")
public void user_entered_username_in_username_field() 
{
	 System.out.println("Username entered is displayed" );
	 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Lalitha");
}

@When("user entered password in password field")
public void user_entered_password_in_password_field() 
{
	 System.out.println("Password entered is displayed");
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
}


@When("user clicks on OK Button")
public void user_clicks_on_OK_Button()
{
	 System.out.println("Click ok Button");
		driver.findElement(By.name("Login")).click();
	 
}

@Then("verify result")
public void verify_result() {
	 System.out.println("verified result" );
	// Assert.assertTrue(true);
}

}
