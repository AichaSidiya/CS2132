package lab7q2;

public class Lab7Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //create account object
		 AccountQ2 account = new AccountQ2("255266277", "Aicha Sidiya", 55000);
	        account.setAnnualInterest(1.5); // set annual interest
	        account.deposit(300, "Deposit for University Expenses"); //deposit
	        account.withdraw(500, "Withdraw for family expenses"); //withdraw
	        System.out.println(account);//print account info
	}

}
