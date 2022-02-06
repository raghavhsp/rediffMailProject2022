package common.Utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author Raghav Agnihotri
 * @since 01/30/2022
 * @description: Contains function to help in logging
 */
public class LogHelper {
	GenericHelper objGenricHelper = new GenericHelper();
	Logger Log = getLogger(getClass());

	/**
	 * @Description: "getLogger" is a function used set properties for log4j to
	 *               create a logger
	 * 
	 * @since 01302022
	 * 
	 * @return Logger
	 * 
	 * @author Raghav Agnihotri
	 */

	public Logger getLogger(Class clas) {
		Properties properties = new Properties();
		String filePath = objGenricHelper.readFromPropertiesFile("log4JPropertiesFilePath");

		try {
			InputStream input;
			input = new FileInputStream(filePath);
			properties.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Logger.getLogger(clas);
	}

	/**
	 * @Description: "testCaseStartLogCreator" is a function used indicate start of
	 *               a test case logs to console and log file
	 * 
	 * @since 01302022
	 * 
	 * @return void
	 * 
	 * @author Raghav Agnihotri
	 */

	public void testCaseStartLogCreator(String testCaseName) {

		System.out.println(
				"*****************************************   Test Case: START   ****************************************************");
		System.out.println(
				"*******************************************************************************************************************");
		System.out.println("--------------------------------   " + testCaseName + "  --------------------------------");
		System.out.println(
				"*******************************************************************************************************************");
		System.out.println(
				"*******************************************************************************************************************");
	}

	/**
	 * @Description: "testCaseEndLogCreator" is a function used indicate END of a
	 *               test case logs to console and log file
	 * 
	 * @since 01302022
	 * 
	 * @return void
	 * 
	 * @author Raghav Agnihotri
	 */
	public void testCaseEndLogCreator(String testCaseName) {
		System.out.println(
				"********************************************************************************************************************");
		System.out.println(
				"********************************************************************************************************************");
		System.out.println("--------------------------------   " + testCaseName + "  --------------------------------");
		System.out.println(
				"******************************************____________________******************************************************");
		System.out.println(
				"******************************************   Test Case: END   ******************************************************");
		System.out.println(
				"XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXX--------------------xxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx");
	}
}
