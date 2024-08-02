package model;

public class Manager implements Observer{

	@Override
	public void update(Account account) {
		if(account.getBalance() == 0) {
			System.out.println("Gerente precisa contactar conta: " 
					+ account.getId());
		}
		
	}
	
}
