package Stepdefinition;

//import javax.management.MXBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobject {

WebDriver driver;

public Loginpageobject(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//input[@name='userName']")
	public static WebElement un;
	
	@FindBy(name="password")
	public static WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	public static WebElement ok;

	

}
