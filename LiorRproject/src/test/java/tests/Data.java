package tests;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;

import freemarker.template.Configuration;
import utils.Utils;

public class Data {
	
	
	String goodPass = "secret_sauce";
	@DataProvider(name = "allValuesOk")
	public Object[][] allValuesOk()
	{
		
		return new Object[][] {
			{"standard_user", goodPass},
			{"problem_user", goodPass},
			{"performance_glitch_user", goodPass}};
		}
	

	@DataProvider(name = "wrongValuesNoEntry")
	public Object[][] wrongLogInInput()
	{
//		Properties props = new Properties();
//		props.load(new FileInputStream("Configuration.properties"));
//		String goodPass = props.getProperty("onlyGoodPass");
		
		String goodUserName = "standard_user";
		String lockedUser = "locked_out_user";
		String badUserName = "abc123";
		String goodPass = "secret_sauce";
		String badPass = "xyz123";
		
		return new Object[][] {
			{"", goodPass},
			{goodUserName, ""},
			{goodUserName, badPass},
			{badUserName,goodPass},
			{lockedUser, goodPass}
		};
			
		}
	}

