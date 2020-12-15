
public class NoCopyConstructor {

	int id;
	String name;

	NoCopyConstructor(int i, String n) {
		id = i;
		name = n;

	}

	NoCopyConstructor() {

	}

	void display() {
		System.out.println(id + " " + name);

	}

	public static void main(String[] args) {

		NoCopyConstructor c1 = new NoCopyConstructor(1, "sushmitha");
		NoCopyConstructor c2 = new NoCopyConstructor();

		c2.id = c1.id;
		c2.name = c2.name;

		c1.display();
		c2.display();

	}

}
