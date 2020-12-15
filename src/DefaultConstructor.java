
public class DefaultConstructor {
	int id;
	String name;
	// method to display the value of id and name

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// creating objects
		DefaultConstructor D1 = new DefaultConstructor();
		// displaying values of the object
		D1.display();
		D1.display();
	}

}
