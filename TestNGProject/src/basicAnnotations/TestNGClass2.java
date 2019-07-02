package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass2 {

	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void est2()
	{
		System.out.println("Test 2");
	}
	
	@BeforeMethod
	public void precondition()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void postcondition()
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
}
