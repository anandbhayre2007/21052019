package oops.abstraction.Byinterface;

public class User {

	public static void main(String[] args) 
	{
		int a;
		
		a=10;
				a=20;
		a=30;
		
		RBI acc;
		
		acc= new HDFC();		
		acc.creditCard();
		acc.debitCard();
		acc.savingAccount();
		acc.currentAccount();
		
		System.out.println("************************");
		
		acc= new Axes();		
		acc.creditCard();
		acc.debitCard();
		acc.savingAccount();
		acc.currentAccount();
		
		System.out.println("************************");
		
		acc= new ICICI();		
		acc.creditCard();
		acc.debitCard();
		acc.savingAccount();
		acc.currentAccount();
		
	}

}
