package Core;

public interface Printable {
	void print();

}

class abc implements Printable {
	public void print() {
		System.out.println("printing abc");

	}
}

class def implements Printable {
	public void print() {
		System.out.println("printing def");
	}
}

class ghi implements Printable {
	public void print() {
		System.out.println("printing ghi");
	}
}
