package exceptionHandling;

public class Testing {

	public static void main(String[] args)
	{
		/*String name="anand";		
		System.out.println(name.charAt(5));*/
		
		String[] str=new String[1];		
		str[1]="anand";

	}

	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c) throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(a+b+c);
	}
}
