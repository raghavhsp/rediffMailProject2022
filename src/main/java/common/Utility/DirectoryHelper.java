package common.Utility;

import java.io.File;

/**
 * @author Raghav Agnihotri
 * @since 01302022
 * @description: contains funtions to help creation of driectories and files
 */

public class DirectoryHelper {
	 GenericHelper objGenricHelper = new GenericHelper();

	 /**
		 * @Description: "createDirectoryForTestResult" used to create test result folders
		 * create a logger
		 * 
		 * @since 01302022
		 * 
		 * @return String
		 * 
		 * @author Raghav Agnihotri
		 * 
		 */
	public  String createDirectoryForTestResult(String testCaseName) {
		String testResultFolderName=testCaseName+" "+objGenricHelper.convertDateTimeToString();
		String testResultFolderPath = objGenricHelper.testFolderPathGenerator(testResultFolderName);
		File file = new File(testResultFolderPath);
		file.mkdir();
	    System.out.println("Test Restult Folder Name :"+testResultFolderName);
	    System.out.println("Test Restult Folder Path :"+testResultFolderPath);
		return testResultFolderPath;
	}
}
