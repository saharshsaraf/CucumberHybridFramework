package StepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login {
	static WebDriver driver;
	@Given("User has navigated to the login page")
	public void user_has_navigated_to_the_login_page() {
	    
		driver = DriverFactory.getDriver();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();
		homepage.selectLoginOption();
	}

	@When("User has enters valid email {string} into the email field")
	public void user_has_enters_valid_email_into_the_email_field(String emailText) {
	    
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailAddress(emailText);
	}

	@And("User has enters valid password {string}")
	public void user_has_enters_valid_password(String password) {
	   
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
	    ;
	}

	@Then("User should get successfully login")
	public void user_should_get_successfully_login() {
	   
	}

	@And("User has enters invalid email {string} into the email field")
	public void user_has_enters_invalid_email_into_the_email_field(String invalid_email) {
	    
	}

	@And("User has enters invalid password {string}")
	public void user_has_enters_invalid_password(String Invalid_password) {
	    
	}

	@Then("User should get a warning message")
	public void user_should_get_a_warning_message() {
	   
	}


}
