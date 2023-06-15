package inheretance;

public class Person {
		private String name;
		private String NID;
		
		public Person() {
			name = null;
			NID = null;
		}
		public Person(String n, String id) {
			name = n;
			NID = id;
		}
		public String getName() {
			return name;
		}
		public String getNID() {
			return NID;
		}
		public void setName(String n) {
			name = n;
		}
		public void setNID(String id) {
			NID = id;
		}
		public String toString() {
			return "Name: "+name+"\nNID: "+NID;
		}
}
