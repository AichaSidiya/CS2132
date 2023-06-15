package inheretance;

public class Employee extends Person{
	private double salary;
	
	public Employee() {
		super();
		salary = 0;
	}
	public Employee(String n, String id, double s) {
		super(n,id);
//		setName(n);
//		setNID(id);
		salary = s;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double s) {
		
		salary = s;
	}
	@Override 
	public String toString() {
		return super.toString() +"\nSalary: "+salary;
	}
}
