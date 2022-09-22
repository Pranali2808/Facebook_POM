package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Login;
import com.qa.pages.SignupPage;

public class SignupTestcase extends TestBase {
	Login login;
	SignupPage signup;

	public SignupTestcase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		signup = new SignupPage();
		driver.get("https://www.facebook.com/reg/");
	}

	@Test(priority = 1)
	public void SignupPageTitleTest() {
		String title = signup.validateSignupPageTitle();
		Assert.assertEquals(title, "Sign up for Facebook | Facebook");
	}

	@Test(priority = 2)
	public void FirstnameTest() {
		boolean flag = signup.validateFirstname();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void LastnameTest() {
		boolean flag = signup.validatelastname();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void EmailTest() {
		boolean flag = signup.validateemail();
		Assert.assertTrue(flag);
	}

	@Test(priority = 5)
	public void PasswordTest() {
		boolean flag = signup.validatepassword();
		Assert.assertTrue(flag);
	}

	@Test(priority = 6)
	public void SignupbuttonTest() {
		boolean flag = signup.validatesignupbutton();
		Assert.assertTrue(flag);
	}

	@Test(priority = 7)
	public void LoginpageTest() {
		login = signup.aftersignup();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
