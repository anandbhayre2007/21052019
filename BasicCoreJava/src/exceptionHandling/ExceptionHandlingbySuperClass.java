package exceptionHandling;

public class ExceptionHandlingbySuperClass {

	public static void main(String[] args) {
		int a=0;
		int b=20;
		
		try {
		System.out.println(b/a);
		
		String str="anand";
		System.out.println(str.charAt(5));
		
		}catch(Exception e)
		{
			System.out.println("Fail:"+e.getMessage());
		}
		
		System.out.println("anand");

	}

}
