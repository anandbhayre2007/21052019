package oops.abstraction.Byinterface;

public class HDFC implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("Saving account in HDFC");
	}

	@Override
	public void currentAccount() {
		System.out.println("Current account in HDFC");
	}

	@Override
	public void debitCard() {
		System.out.println("Debit card from HDFC");
	}

	@Override
	public void creditCard() {
		System.out.println("Credit Card from HDFC");
	}

}
