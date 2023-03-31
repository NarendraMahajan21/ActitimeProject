package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	/**
	 * This class contains all the generic methods of both property file as well as Excel file
	 * @author Narendra
	 *
	 */
	
	/**
	 * this method is used to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String readDataFromPropertyFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	}

/**
 * this method is used to read the data from excel file
 * @param sheet
 * @param row
 * @param col
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String readDataFromExcelFile(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./Testdata/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
