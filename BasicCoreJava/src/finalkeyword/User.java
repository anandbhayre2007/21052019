package finalkeyword;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class User {

	
	@Test
	public void test()
	{
		throw new SkipException("Skipping this test because of ......");
	}
	
	@Test
	public void test2()
	{
		System.out.println("anand");
	}
}
