package model;

public class Vendor implements Observer {

	@Override
	public void update(Account account) {
		if(account.getBalance() > 1000) {
			System.out.println("Oferecer seguro para conta: " + account.getId());
		}

	}

}
