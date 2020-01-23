package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber.Framework.Base;

public class HomePage extends Base {

	@FindBy(xpath ="//input[@placeholder=\"Search for Vegetables and Fruits\"]")
	WebElement serach;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void enterSearch(String searchitem) {
		serach.sendKeys(searchitem);
	}
}
