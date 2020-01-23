package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Cucumber.Framework.*;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	public HomePage home;

	@Given("^User is on GreenKart landing page$")
	public void user_is_on_GreenKart_landing_page() throws Throwable {
		System.out.println("entering getdriver");
		driver = Base.getDriver();
	}

	@When("^User searched for \"([^\"]*)\" vegetable$")
	public void user_searched_for_vegetable(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		home = new HomePage();
		home.enterSearch(arg1);
		Thread.sleep(5000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) throws Throwable {
		String text1 = driver.findElement(By.xpath("//h4[@class=\"product-name\"]")).getText();
		Assert.assertTrue(text1.contains(arg1));
	}

	@When("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();

	}

	@When("^User proceeded to Checkout page for purchase$")
	public void user_proceeded_to_Checkout_page_for_purchase() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}

//	@Then("^verify selected \"([^\"]*)\" items are dislayed in Check out page$")
//	public void verify_selected_items_are_dislayed_in_Check_out_page(String arg1) throws Throwable {
//		String text1 = driver.findElement(By.xpath("//p[@class='product-name']")).getText();
//		Assert.assertTrue(text1.contains(arg1));
//		}

	@When("^User searched for (.+) vegetables$")
	public void user_searched_for_vegetables(String vegetable) throws Throwable {
		home = new HomePage();
		home.enterSearch(vegetable);
		Thread.sleep(5000);
	}

	@Then("^verify selected (.+) items are dislayed in Check out page$")
	public void verify_selected_items_are_dislayed_in_check_out_page(String vegetable) throws Throwable {
		String text1 = driver.findElement(By.xpath("//p[@class='product-name']")).getText();
		Assert.assertTrue(text1.contains(vegetable));
	}

}