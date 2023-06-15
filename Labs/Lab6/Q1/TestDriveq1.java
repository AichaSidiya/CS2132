package lab6q1;

public class TestDriveq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of Person, Employee, Student, Faculty,and Staff 
		Person person1 = new Person("Aicha Sidiya", "Jeddah", "0563542018", "aicha@gamil.com");
		Employee employee1 = new Employee("Jailan AlJizawi", "Riyadh", "0569358985", "jailan@gamil.com", "123", 55000, 2022, 4, 5);
		Student student1 = new Student("Hanin AlZaher", "Tabuk", "0597635421", "hanin@gamil.com", Student.SOPHOMORE);
		Faculty faculty1 = new Faculty("Hajer Abas", "Paris", "0521223546", "hajer@gamil.com", "324", 65000, 2022, 5, 4, "Professor", 12, 0, 2, 0);
		Staff staff1 = new Staff("Fatma Salem", "Moroco", "0525237866", "fatma@gamil.com", "255", 56000, 2011, 11, 9, "Manager");
		
		//Printing name of class and object name using toString method in each class
		System.out.println("\n" + person1 + "\n");
		System.out.println(employee1+ "\n");
		System.out.println(student1 + "\n");
		System.out.println(faculty1 + "\n");
		System.out.println(staff1 + "\n");
	}

}
