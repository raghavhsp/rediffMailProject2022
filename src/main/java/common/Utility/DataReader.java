package common.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataReader {
	public LogHelper objLogHelper = new LogHelper();
	public org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	public Properties properties = new Properties();
	public GenericHelper objGenericHelper = new GenericHelper();
	Object[][] data;
	Object[] datac;
	
	public void getTestCaseDatadraft(String testCaseName ) {

		XSSFSheet sheet;
		XSSFWorkbook workBook;
		XSSFRow row;
		XSSFCell cell;
		int rows, cols = 0, temp = 0;
		try {
			FileInputStream file = new FileInputStream(
					new File(objGenericHelper.readFromPropertiesFile("testDataFilePath")));
			workBook = new XSSFWorkbook(file);
			sheet = workBook.getSheet("Test_Data");
			rows = sheet.getPhysicalNumberOfRows();
			Log.info("Number OF Row in SHeet :" + rows);
			for (int i = 0; i < rows; i++) {
				row = sheet.getRow(i);
				if (row != null) {
					temp = sheet.getRow(i).getPhysicalNumberOfCells();
					if (temp > cols)
						cols = temp;
				}
			}
			data = new Object[rows][cols];
			datac = new Object[cols];
			Log.info("Number OF Row in SHeet :" + rows);
			Log.info("Number OF COLS in SHeet :" + cols);
			for (int r = 0; r < rows; r++) {
				row = sheet.getRow(r);
				for (int c = 0; c < cols; c++) {
					cell = row.getCell(c);

					if (cell.getCellType() == CellType.STRING) {
						data[r][c] = cell.getStringCellValue();
						Log.info("DATA STOED AT data[" + r + "][" + c+1 + "] is = " + data[r][c].toString());
					} else if (cell.getCellType() == CellType.NUMERIC) {
						data[r][c] = String.valueOf(cell.getNumericCellValue());
						Log.info("DATA STOED AT data[" + r + "][" + c+1 + "] is = " + data[r][c].toString());
					} else {
						data[r][c] = " ";
						Log.info("DATA STOED AT data[" + r + "][" + c+1 + "] is = " + data[r][c].toString() + " IS NULL");
					}
				}

			}
			for (int i = 0; i < rows; i++) {
				for (int c = 0; c < cols; c++) {
					if (data[i][c].toString().equalsIgnoreCase(testCaseName)) {
						for (int j = 0; j < cols; j++) {
							datac[j] = data[i][j];
							Log.info("Data Stored IS :" + datac[j].toString());
						}
					}
				}
			}
		} catch (Exception e) {
			Log.info(e.getMessage());

		}
	}

	
	
	@Test
	public  String getTestCaseData(String testCaseName , String columnName) {
		XSSFSheet sheet = null;
		XSSFWorkbook workBook;
		XSSFRow row;
		XSSFCell cell;
		int rows = 0, cols = 0, temp = 0;
		try {
			FileInputStream file = new FileInputStream(
					new File(objGenericHelper.readFromPropertiesFile("testDataFilePath")));
			workBook = new XSSFWorkbook(file);
			sheet = workBook.getSheet("Test_Data");
			rows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < rows; i++) {
				row = sheet.getRow(i);
				if (row != null) {
					temp = sheet.getRow(i).getPhysicalNumberOfCells();
					if (temp > cols)
						cols = temp;
				}
			}
			
			for (int r=0;r<rows;r++) {
				row =sheet.getRow(r);
				if(row.getCell(1).getStringCellValue().equalsIgnoreCase(testCaseName)) {
					rows=r;
					Log.info("Found TestCase: '"+testCaseName+"' in rowNum :"+rows);
					break;
				}
			}
			for (int c=1;c<cols;c++) {
				row =sheet.getRow(0);
				if(row.getCell(c).getStringCellValue().equalsIgnoreCase(columnName)) {
					cols=c;
					Log.info("Found Data: '"+columnName+"' in colNum :"+(cols+1));;//+1 to match exact column name in data sheet
					break;
				}
			}
			row = sheet.getRow(rows);
			cell=row.getCell(cols);
			
			
			if (cell.getCellType() == CellType.STRING) {
				Log.info("Data @ row["+rows+"]col["+(cols+1)+"] :"+cell.getStringCellValue());
			return cell.getStringCellValue();
				
			} else if (cell.getCellType() == CellType.NUMERIC) {
				Log.info("DATA IS "+String.valueOf(cell.getNumericCellValue()));
			return String.valueOf(cell.getNumericCellValue());
			
			} else {
				Log.info("DATA IS  IS NULL");
			return null;
			}
			
		} catch (Exception e) {
			
			Log.error(e.getMessage());
		}
		return null;
	}
}
