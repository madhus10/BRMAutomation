package stepDefinations;

import Cucumber.Framework.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {

	@Before("@SmokeTest")
	public void beforeValidtion() {
		System.out.println("Before Validation for smoke test");
	}

	@After("@SmokeTest")
	public void afterValidtion() {
		System.out.println("After Validation for smoke test");
	}

	@Before("@RegressionTest")
	public void beforeValidtionRegression() {
		System.out.println("Before Validation for regression test");
	}

	@After("@RegressionTest")
	public void afterValidtionRegression() {
		System.out.println("After Validation for regression test");
	}

	@Before("@SeleniumTest")
	public void beforeValidtionSelenium() {
		System.out.println("Before Validation of Selenium test");
	}

	@After("@SeleniumTest")
	public void afterValidtionSelenium() {
		driver.quit();
		System.out.println("After Validation for Selenium test");
	}

	@Before("@SeleniumTest1")
	public void beforeValidtionSelenium1() {
		System.out.println("Before Validation of Selenium test1");
	}

	@After("@SeleniumTest1")
	public void afterValidtionSelenium1() {
		driver.quit();
		System.out.println("After Validation for Selenium test1");
	}

}
