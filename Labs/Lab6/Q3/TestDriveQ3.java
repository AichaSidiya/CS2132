package lab6q3;

public class TestDriveQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonQ3 person1 = new PersonQ3("Aicha Sidiya", "Jeddah", "1765123o950");
		Customer customer1 = new Customer("Hanin AlZaher", "Makkah", "12345678", "Cash");
		Manager manager1 = new Manager("Khadija Mohamed", "Beirut", "25262822", 550000);
		Waiter waiter1 = new Waiter("Mohamed Karim", "Damam", "55262230", 0.10);
		Chef chef1 = new Chef("Gordon Ramsy", "New York", "100506532", 105000, "Beef Wellington");
		
		System.out.println(person1 + "\n");
		System.out.println(customer1 + "\n");
		System.out.println(manager1 + "\n");
		System.out.println(waiter1 + "\n");
		System.out.println(chef1 + "\n");
	}

}
