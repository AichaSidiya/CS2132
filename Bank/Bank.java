package bank;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		Account a2 = new Account("1234567", 3000.0);
		//Account a3 = new Account("10203040");
		
		Address a = new Address("SA", "Jed", "Khozam");
		a1.setAddress(a);
		
		System.out.println(a1.getAddress().getCity());
		
		a1.setBalance(100);
		a1.deposit(100);
		a2.withdraw(200);
		
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		System.out.println(a1.getNumberOfAccounts());
		System.out.println(a2.getNumberOfAccounts());
		
		Account[] accounts = new Account[3];
		accounts[0] = new Account("1234567", 3000.0);
		accounts[1] = new Account("1204586", 4000.0);
		accounts[2] = new Account("1089486", 5000.0);
		
		System.out.println(accounts[1].getBalance());
	}

}
