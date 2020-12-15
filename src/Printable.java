
public interface Printable {
	void print();

}

class A6 implements Printable {
	public void print() {
		System.out.println("printting");
	}

	public static void main(String[] args) {
		A6 s = new A6();
		s.print();

	}

}
