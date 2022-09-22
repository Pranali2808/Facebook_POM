package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.Login;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HomePageTest extends TestBase{
	HomePage homePage;
	Login login;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Login();
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1, description="Verifying homepage searchfield test")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify home page:Searchbox")
	@Story("Story name : To check search field in home page")
	public void SearchboxTest() {
		boolean flag = homePage.validatesearchbox();
		Assert.assertTrue(flag);
	}
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify home page: Add pictur feature")
	@Story("Story name : To check add picture feature in home page")
	@Test(priority = 2, description="Verifying add picture feature in homepage")
	public void addpictureTest() {
		boolean flag = homePage.validateaddpicture();
		Assert.assertTrue(flag);
	}
		
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
