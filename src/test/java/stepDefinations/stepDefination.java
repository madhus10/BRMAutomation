package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("open browser");
	}

	@When("^browser triggered$")
	public void browser_triggered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("trigger browser");
	}

	@Then("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("validate browser");
	}

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("Given executed");

	}

	@When("^User login into applcation with username and password$")
	public void user_login_into_applcation_with_username_and_password() throws Throwable {
		System.out.println("When executed");
	}

	@Then("^Home Page is populated$")
	public void home_Page_is_populated() throws Throwable {
		System.out.println("Then executed");
	}

	@Then("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@When("^User login into applcation with \"([^\"]*)\" username and password \"([^\"]*)\"$")
	public void user_login_into_applcation_with_username_and_password(String arg1, String arg2) throws Throwable {
		System.out.println("Logged in with 2 parameters");
		System.out.println(arg1);
		System.out.println(arg2);

	}

	@When("^User signup  into applcation with following details$")
	public void user_signup_into_applcation_with_following_details(DataTable arg1) throws Throwable {
		List<List<String>> d1 = arg1.raw();
		System.out.println(d1.get(0).get(0));
		System.out.println(d1.get(0).get(1));
		System.out.println(d1.get(0).get(2));
		System.out.println(d1.get(0).get(3));
		System.out.println(d1.get(0).get(4));

	}

	@When("^User login in to applcation with parameter (.+) username and password (.+)$")
	public void user_login_in_to_applcation_with_parameter_username_and_password(String username, String password)
			throws Throwable {
		System.out.println(username);
		System.out.println(password);
	}

}