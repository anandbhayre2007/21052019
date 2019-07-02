package oops.abstraction.Byinterface;

public class Axes implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("Saving account in Axes bank");
	}

	@Override
	public void currentAccount() {
		System.out.println("Current account in Axes bank");
	}

	@Override
	public void debitCard() {
		System.out.println("Debit card from Axes bank");
	}

	@Override
	public void creditCard() {
		System.out.println("Credit card from Axes bank");
	}

}
