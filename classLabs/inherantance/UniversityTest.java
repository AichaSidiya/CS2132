package inheretance;

public class UniversityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person("Hanin", "123456");
	
		
		Employee e1 = new Employee("Akila","12345",10000);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(e1.toString());
	}

}
