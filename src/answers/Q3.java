package answers;

class Person{
	void nationality() {
		
	}
	void place() {
		
	}
}

class Emp extends Person{
	void organization() {
		
	}
	void place() {
		super.place();
	}
}

class Manager extends Emp{
	void subordinates() {
		
	}
	void place() {
		super.place();
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager1 = new Manager();
		manager1.nationality();
		manager1.organization();
		manager1.subordinates();
		manager1.place();

	}

}
