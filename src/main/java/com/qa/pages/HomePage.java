package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

import io.qameta.allure.Step;

public class HomePage extends TestBase {
	// page factory or object repo

	@FindBy(xpath = "//input[@class='qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 b0eko5f3 r9fxt90l fwlpnqze nq2b4knc rh8vmnmv bz314a8p adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w']")
	WebElement Searchbox;

	@FindBy(xpath = "//span[starts-with(text(),'Add Picture')]")
	WebElement Addnewpicture;

	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

//Actions:
	@Step("Validating home page title step....")
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	@Step("Validating search box in home page step....")
	public boolean validatesearchbox() {
		return Searchbox.isDisplayed();
	}
	@Step("Validating add picture feature in home page step....")
	public boolean validateaddpicture() {
		return Addnewpicture.isDisplayed();
	}

}