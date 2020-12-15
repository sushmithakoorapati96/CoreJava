
public class CopyConstructor {

	int id;
	String name;

	CopyConstructor(int i, String n) {
		id = i;
		name = n;
	}

	CopyConstructor(CopyConstructor C) {
		id = C.id;
		name = C.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor(1, "Sushmitha");
		CopyConstructor c2 = new CopyConstructor(c1);

		c1.display();
		c2.display();

	}

}
