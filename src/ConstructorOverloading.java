
public class ConstructorOverloading {
	int id;
	String name;
	int age;

	// creating two arg constructor
	ConstructorOverloading(int i, String n) {
		id = i;
		name = n;

	}
	// creating three arg constructor

	ConstructorOverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age + " ");
	}

	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading(1, "sushmitha");
		ConstructorOverloading c2 = new ConstructorOverloading(1, "sushmitha", 2);

		c1.display();
		c2.display();
	}

}
