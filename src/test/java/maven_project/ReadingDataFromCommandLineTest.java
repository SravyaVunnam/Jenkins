package maven_project;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest {
	
	
	@Test(groups = "smoke")
	public void readingDataFromCommandLineTest()
	{
		System.out.println("executing POL Scm");
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}
	
	@Test(groups = "regression")
	public void regressionTest() {
		System.out.println("regression testing");
	}

}
