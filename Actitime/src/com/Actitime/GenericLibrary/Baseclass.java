package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.LoginPage;

public class Baseclass {
	public WebDriver driver;
	FileLibrary f=new FileLibrary();
@BeforeSuite
public void databaseconnection() {
	Reporter.log("database connected");

}
@AfterSuite
public void databasedisconnected() {
	Reporter.log("database disconnected");
}
@BeforeClass
public void launchbrowser() throws IOException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url = f.readDataFromPropertyFile("url");
	driver.get(url);
	Reporter.log("browser open",true);

}
@AfterClass
public void closebrowser() {
	driver.close();
	Reporter.log("browser closed",true);
}
@BeforeMethod
public void login() throws IOException {
	String un = f.readDataFromPropertyFile("username");
	String pwd = f.readDataFromPropertyFile("password");
	LoginPage lp=new LoginPage(driver);
	lp.getUntxb().sendKeys(un);
	lp.getPwtxb().sendKeys(pwd);
	lp.getLgbtn().click();
	Reporter.log("logged in successfully",true);
	
}
@AfterMethod
public void logout() {
	driver.findElement(By.id("logoutLink"));
	Reporter.log("logout successfully",true);
}

}
