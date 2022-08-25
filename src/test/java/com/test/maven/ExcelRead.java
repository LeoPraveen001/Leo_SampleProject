package com.test.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\leo\\eclipse-workspace\\SnapdealOne\\src\\test\\resources\\Data\\Project.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Nimmi");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	               Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells() ; j++) {
				Cell cell = row.getCell(j);
				String text = cell.getStringCellValue();
				System.out.println(text);
			}	
		}
		}

	}
