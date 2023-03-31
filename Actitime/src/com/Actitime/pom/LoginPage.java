package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(id="username")
	private WebElement untxb;
	@FindBy(name="pwd")
	private WebElement pwtxb;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Utilization
	public WebElement getUntxb() {
		return untxb;
	}

	public WebElement getPwtxb() {
		return pwtxb;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
}
