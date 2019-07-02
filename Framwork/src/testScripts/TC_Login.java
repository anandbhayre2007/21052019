package testScripts;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.Config;
import libraries.ApplicationLibrary;
import pages.FlightFinder;
import pages.HomePage;

public class TC_Login 
{
	WebDriver dr;
	ApplicationLibrary lib;
	
	@BeforeMethod
	public void initialize()
	{
		lib= new ApplicationLibrary();
		
		//Launch Browser
		dr=lib.launchBrowser();		
		assertTrue(dr!=null);		
	}	
	
	@Test
	public void script()
	{		
		//Navigate to application
		String res=lib.navigate(dr, Config.applicationURL);
		assertTrue(res.contains("Mercury Tours"));
		
		//Login 
		HomePage page= new HomePage(dr);
		
		page.login("mercury", "mercury");
		
		FlightFinder page2=new FlightFinder(dr);
		assertTrue(lib.isElementPresent(dr, page2.oneway));
				
	}
	
	@AfterMethod
	public void teardown()
	{
		dr.quit();
	}

}
