package com.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.Login;
import com.qa.pages.SignupPage;

public class LoginTestcase extends TestBase {
	Login login;
	HomePage homePage;
	SignupPage signup;

	public LoginTestcase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		login = new Login();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = login.validateLoginPageTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}

	@Test(priority = 2)
	public void FBLogoTest() {
		boolean flag = login.validateFBImage();
		Assert.assertTrue(flag);
	}
	@Test(priority = 3)
	public void FBemailTest() {
		boolean flag = login.validateusername();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void loginTest() {
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority = 5)
	public void registerTest() {
	 signup = login.logintoregister();
   }
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
