package Core;

public class Test {

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.setname("sushmitha");
		e.setname(1);
		e.setfloat(0.0f);

		System.out.println(e.getname());
		System.out.println(e.getid());
		System.out.println(e.getvalue());
	}

}
