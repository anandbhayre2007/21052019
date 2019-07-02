package functions;

public class AccessModifires {

	public static void main(String[] args) 
	{
		AccessModifires ref= new AccessModifires();
		ref.publicMethod();
		ref.privateMethod();
		ref.noAccessModMethod();
		ref.protectedMethod();

	}
	
	//public 
	public void publicMethod()
	{
		System.out.println("Public Method");
	}
	
	//Private
	private void privateMethod()
	{
		System.out.println("Private Method");
	}
	
	//No Access Mod.
	void noAccessModMethod()
	{
		System.out.println("No Access Modifier method");
	}
	
	//Protectd Method
	protected void protectedMethod()
	{
		System.out.println("Protected Method");
	}

}
