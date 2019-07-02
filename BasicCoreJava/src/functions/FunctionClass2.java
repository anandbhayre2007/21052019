package functions;

public class FunctionClass2 {

	public static void main(String[] args) 
	{
		boolean res=validAge(50);
		System.out.println(res);

	}
	
	public static boolean validAge(int age)
	{
		if(age> 60 || age <8)
		{
			return true;
		}else
		{
			return false;
		}
		
	}

}
