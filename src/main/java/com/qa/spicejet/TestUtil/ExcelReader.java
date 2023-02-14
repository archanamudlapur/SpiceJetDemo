package com.qa.spicejet.TestUtil;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.qa.spicejet.TestBase.TestBase;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
     static String sheetname = "contacts";
     static Workbook book;
     static Sheet sheet;

   static FileInputStream file = null;

    public static Object[][] ReadData(String sheetname) {

        try {
            file = new FileInputStream("/Users/archanamudlapur/Documents/Practice1/src/main/java/com/qa/spicejet/TestData/Book1.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet=book.getSheet(sheetname);
        Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i=0; i<sheet.getLastRowNum(); i++){
        for(int k=0;k<sheet.getRow(0).getLastCellNum();k++){
            data[i][k]=sheet.getRow(1+i).getCell(k).toString();
        }

        }
        return data;
    }
}
