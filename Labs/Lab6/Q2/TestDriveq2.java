package lab6q2;

public class TestDriveq2 {
	
	public static void main(String[] args) {
		
		//creating object of Account, SavingsAccount, CheckingAccount
		Account account1 = new Account("2552563221", 550000);
		SavingsAccount saving1 = new SavingsAccount("98747790344", 100000);
		CheckingAccount checking1 = new CheckingAccount("57585960", 20000);
		
		System.out.println("\n" + account1); //printing account info using overrided toString method
		System.out.println(saving1); //printing saving account balance using overrided toString method
		System.out.println(checking1); //printing checking account balance using overrided toString method
		
	}
}
