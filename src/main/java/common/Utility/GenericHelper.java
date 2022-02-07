package common.Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * @author Raghav Agnihotri
 * @since 01/29/2022
 * @Description: Contains generic function like convert date time format ,
 *               generate path
 */

public class GenericHelper {
	/*
	 * public LogHelper objLogHelper = new LogHelper(); public
	 * org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	 */
	
	
	/**
	 * @Description: "convertDateTimeToString" is a function used convert a current
	 *               date and time to a format ddMMMyy hhmmss and return as string
	 * 
	 * @since 01302022
	 * 
	 * @return String
	 * 
	 * @author Raghav Agnihotri
	 */
	public String convertDateTimeToString() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("ddMMMyy hhmmss");
		String currentDateTimeString = dateFormat.format(date);
		System.out.println("\nTC TIME_STAMP   :" + currentDateTimeString+"\n");

		return currentDateTimeString;
	}

	/**
	 * @Description: "testFolderPathGenerator" is a function used genrate path of a
	 *               test result folder
	 *
	 * @since 01302022
	 * 
	 * @return String
	 * 
	 * @author Raghav Agnihotri
	 */
	public String testFolderPathGenerator(String testResultFolderName) {
		if (testResultFolderName == null) {

			return null;
		} else {
			String TRFolderPath = readFromPropertiesFile("testOutputFileBasePath");
			TRFolderPath = TRFolderPath + "\\" + testResultFolderName;
			return TRFolderPath;
		}
	}

	/**
	 * @Description: "readFromPropertiesFile" is a function used read values for
	 *               config.properties file
	 * 
	 * @since 01302022
	 * 
	 * @return String
	 * 
	 * @author Raghav Agnihotri
	 */
	public String readFromPropertiesFile(String property) {
		Properties properties = new Properties();
		try {
			InputStream input = new FileInputStream("G:\\Automation_Projects\\src\\main\\resources\\config.properties");
			properties.load(input);
			return properties.getProperty(property);
		} catch (Exception e) {
			System.out.println("Exception Message :"+e.getMessage());
		}
		return null;
	}
	
	public int readIntFromPropertiesFile(String property) {
		Properties properties = new Properties();
		try {
			InputStream input = new FileInputStream("G:\\Automation_Projects\\src\\main\\resources\\config.properties");
			properties.load(input);
			int value;
			return value=Integer.parseInt(properties.getProperty(property));
		} catch (Exception e) {
			System.out.println("Exception Message :"+e.getMessage());
		}
		return (Integer) null;
	}

	/**
	 * @Description: "writeIntoPropertiesFile" is a function used write/update
	 *               values of properties in config.properties file
	 * 
	 * @since 01302022
	 * 
	 * @return String
	 * 
	 * @author Raghav Agnihotri
	 */
	public String writeIntoPropertiesFile(String key, String value) {
		Properties properties = new Properties();
		try {
			OutputStream output = new FileOutputStream("/RediffMail/src/main/resources/config.properties");
			properties.setProperty(key, value);
			properties.store(output, "Property added by code " + key + "=" + value);
			return properties.getProperty("BaseURL");
		} catch (Exception e) {
			System.out.println("Exception Message :"+e.getMessage());
		}
		return null;
	}
}
