package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;



public class Login extends TestBase{
	//page factory or object repo
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement loginBtn;
	
	 @FindBy(xpath = "//a[contains(text(),'Create New Account')]")
	    WebElement CreatenewAccount;

	@FindBy(xpath="//img[contains(@alt,'Facebook')]")
	WebElement FBLogo;
	
	@FindBy(xpath="//a[contains(.,'Forgotten password?')]")
	WebElement Forgotpswd;
	//intializing page object
	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateFBImage(){
		return FBLogo.isDisplayed();
	}
	public boolean validateusername(){
		return email.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		email.sendKeys(un);
		pass.sendKeys(pwd);
		loginBtn.click();
		    	
		return new HomePage();
	}
	
	public SignupPage logintoregister() {
		CreatenewAccount.click();
		return new SignupPage();
	}
	
}
