package functions;

public class TestAccessModAtPackageLevel {

	public static void main(String[] args) 
	{
		AccessModifires obj= new AccessModifires();
		obj.publicMethod();
		obj.noAccessModMethod();
		obj.protectedMethod();
	}

}
