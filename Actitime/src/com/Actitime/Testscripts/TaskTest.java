package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

public class TaskTest extends Baseclass {
@Test
public void createcustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	HomePage hp=new HomePage(driver);
	hp.getTasklnk().click();
	
	TaskPage t=new TaskPage(driver);
	t.getAddnewbtn().click();
	t.getNewcust().click();
	FileLibrary fl=new FileLibrary();
	String name = fl.readDataFromExcelFile("Sheet1", 4, 1);
	t.getCustname().sendKeys(name);
	String description = fl.readDataFromExcelFile("Sheet1", 4, 2);
	t.getCustdesp().sendKeys(description);
	Thread.sleep(3000);
	t.getCreatecust().click();
}
}
