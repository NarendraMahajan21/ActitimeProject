package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
@FindBy(xpath="//div[.='Tasks']")
private WebElement tasklnk;
@FindBy(xpath ="//div[.='Reports']" )
private WebElement reportlnk;
@FindBy(xpath = "//div[.='Users']")
private WebElement userlnk;
@FindBy(id="logoutLink")
private WebElement lgoutlnk;

//Initialization
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//Utilization

public WebElement getTasklnk() {
	return tasklnk;
}

public WebElement getReportlnk() {
	return reportlnk;
}

public WebElement getUserlnk() {
	return userlnk;
}

public WebElement getLgoutlnk() {
	return lgoutlnk;
}





}
