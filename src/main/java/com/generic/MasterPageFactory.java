package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory(WebDriver driver){

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath=("//*[@id= 'name']"))
	private WebElement name;

	@FindBy(xpath=("//*[@id= 'password']"))
	private WebElement Password;

	@FindBy(xpath=("//*[@id= 'login']"))
	private WebElement Loginbut;


	@FindBy(xpath=("//*[@id='logout']"))
	private WebElement Logoutbut;


	public WebElement getName() {
		return name;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbut() {
		return Loginbut;
	}

	public WebElement getLogoutbut() {
		return Logoutbut;
	}


}
