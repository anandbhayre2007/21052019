package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=20;
		
		try {
		System.out.println(b/a);
		
		String str="anand";
		System.out.println(str.charAt(5));
		
		}catch(Exception e)
		{
			System.out.println("Fail:"+e.getMessage());
		}finally
		{
			System.out.println("Finally");
		}
		
		System.out.println("anand");

	}

}