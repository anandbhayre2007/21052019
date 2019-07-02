package functions;

public class FunctionClass1 {

	public static void main(String[] args) 
	{
	
		int a=sum(10,20,30);
		int b=sum(30,40,50);
		System.out.println(a+b);
		
		System.out.println(sum(10,20,30)+sum(30,40,50));
		
		sum(10,30,20);
	}
	

	public static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
}
