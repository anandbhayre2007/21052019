package basicAnnotations;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGClass1 
{
	@Test(dependsOnMethods= {"test1","test2"})
	public void test3()
	{
		System.out.println("Testing third testng method");
		Assert.fail("Testing failure");
	}	
	@Test(priority=1)
	public void test4()
	{
		System.out.println("Testing fourth testng method");		
		Assert.assertEquals("Anand", "Bhayre");
	}
	@Test(priority=2)
	public void test1()
	{
		System.out.println("Testing first testng method");
	}	
	@Test(priority=3)
	public void test2()
	{
		System.out.println("Testing second testng method");
		throw new SkipException("Testing");
	}
}
