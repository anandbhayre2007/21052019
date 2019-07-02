package functions;

public class NonStaticFunctions {

	public static void main(String[] args) 
	{
		NonStaticFunctions ref= new NonStaticFunctions();		
		ref.sum(10,30);
		//System.out.println(a);
		
		System.out.println(ref.sum(30, 40));
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}

}
